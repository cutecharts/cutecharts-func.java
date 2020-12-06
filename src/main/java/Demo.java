import chart.Chart;
import chart.DataSet;
import core.enums.ChartType;
import opts.GlobalOptions;
import opts.SeriesOptions;
import render.RenderExecutor;


/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */

public class Demo {
    public static void main(String[] args) {
        Chart line = Chart.newChart(ChartType.STACKED_BAR)
                .setGlobalOptions(
                        GlobalOptions.setTitle("Demo"),
                        GlobalOptions.setXLabel("x"),
                        GlobalOptions.setYLabel("y")
                ).setSeriesOptions(
                        SeriesOptions.setBackgroundColor("yellow")
                )
                .setDataLabels("Mon", "Tue", "Wed", "Thu")
                .setDataSeriesOptions(
                        DataSet.addDataSet("apple", 1, 2, 3, 4),
                        DataSet.addDataSet("banana", 11, 2, 6, 4),
                        DataSet.addDataSet("peal", 3, 6, 2, 7)
                )
                .build();

        RenderExecutor.renderToPath("./").accept(line);
    }
}
