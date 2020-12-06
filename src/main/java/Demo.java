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
        Chart line = Chart.newChart(ChartType.LINE)
                .setGlobalOptions(
                        GlobalOptions.setTitle("Demo-Line"),
                        GlobalOptions.setXLabel("X-axis Week"),
                        GlobalOptions.setYLabel("Y-axis Amount")
                ).setSeriesOptions(
                        SeriesOptions.setBackgroundColor("orange")
                )
                .setDataLabels(1, 2, 3, 4, 5, 6, 7)
                .setDataSeriesOptions(
                        DataSet.addDataSet("Beer", 1, 2, 3, 4, 2, 5, 4),
                        DataSet.addDataSet("Juice", 1, 4, 7, 4, 1, 3, 2)
                )
                .build();

        RenderExecutor.renderToPath("./").accept(line);
    }
}
