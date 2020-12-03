package render;

import chart.Chart;
import com.alibaba.fastjson.JSONObject;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
public class RenderExecutor {

    private static final String DEFAULT_PATH = "render.html";
    private static final String DEFAULT_SUFFIX = "HTML";
    private static final String CHART_INSTANCE = "chart";
    private static final String JSON_DATA = "data";


    public static Consumer<Chart> renderToPath(String src) {
        return chart -> doRender.accept(chart, new File(src));
    }

    private static BiConsumer<Chart, File> doRender = (chart, path) -> {
        String src = path.getPath();
        int index = src.lastIndexOf('.');
        if (index == -1) {
            RenderExecutor.doRender.accept(chart, new File(src + '/' + DEFAULT_PATH));
            return;
        }
        String suffix = src.substring(index + 1);
        if (!suffix.equalsIgnoreCase(DEFAULT_SUFFIX)) {
            RenderExecutor.parser.accept(chart, new File(DEFAULT_PATH));
            return;
        }
        RenderExecutor.parser.accept(chart, path);
    };
    
    private static BiConsumer<Chart, File> parser = (chart, targetFile) -> {
        Template template = TemplateInstance.BASIC.getTemplate();

        String data = JSONObject.toJSONString(chart);

        HashMap<String, Object> root = new HashMap<>(2);
        root.put(CHART_INSTANCE, chart);
        root.put(JSON_DATA, data);

        try (FileWriter out = new FileWriter(targetFile)) {
            template.process(root, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
