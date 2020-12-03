package chart;

import com.alibaba.fastjson.annotation.JSONField;
import core.GlobalOptionFunction;
import core.SeriesOptionFunction;
import core.enums.ChartType;
import opts.SeriesOptions;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */

public class Chart {
    private String title;
    private String xLabel;
    private String yLabel;
    private SeriesOptions options;
    private Data data = new Data();
    transient private ChartType chartType;
    transient private String width = "1200px";
    transient private String height = "900px";
    transient private String chartId = UUID.randomUUID().toString().replace("-", "");

    private Chart() {
    }

    private Chart(ChartType chartType) {
        this.chartType = chartType;
        this.options = new SeriesOptions();
    }

    public Chart setTitle(String title) {
        this.title = title;
        return this;
    }

    public Chart setXLabel(String xLabel) {
        this.xLabel = xLabel;
        return this;
    }

    public Chart setYLabel(String YLabel) {
        this.yLabel = YLabel;
        return this;
    }

    @JSONField(name = "options")
    public SeriesOptions getSeriesOptions() {
        return this.options;
    }

    public static newChart newChart(ChartType chartType) {
        return new newChart(chartType);
    }

    public static class newChart {
        private Chart instance;

        public newChart(ChartType chartType) {
            this.instance = new Chart(chartType);
        }

        @SafeVarargs
        public final newChart setGlobalOptions(GlobalOptionFunction<Chart, Chart>... options) {
            Arrays.stream(options).reduce(GlobalOptionFunction::andThen).get().apply(instance);
            return this;
        }

        @SafeVarargs
        public final newChart setSeriesOptions(SeriesOptionFunction<Chart, Chart>... options) {
            Arrays.stream(options).reduce(SeriesOptionFunction::andThen).get().apply(instance);
            return this;
        }

        public final Chart build() {
            return instance;
        }


    }

    public ChartType getChartType() {
        return chartType;
    }

    public String getTitle() {
        return title;
    }

    public String getxLabel() {
        return xLabel;
    }

    public String getyLabel() {
        return yLabel;
    }

    public String getChartId() {
        return chartId;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public SeriesOptions getOptions() {
        return options;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
