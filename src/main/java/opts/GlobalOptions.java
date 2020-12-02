package opts;

import chart.Chart;
import core.GlobalOptionFunction;
import core.enums.ChartType;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */

public class GlobalOptions {


    private ChartType chartType;
    private String title;
    private String xLabel;
    private String yLabel;


    public static GlobalOptionFunction<Chart, Chart> setTitle(String title) {
        return chart -> chart.setTitle(title);
    }


    public static GlobalOptionFunction<Chart, Chart> setXLabel(String xLabel) {
        return chart -> chart.setXLabel(xLabel);
    }


    public static GlobalOptionFunction<Chart, Chart> setYLabel(String yLabel) {
        return chart -> chart.setYLabel(yLabel);
    }
}
