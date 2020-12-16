import chart.Chart;
import chart.DataSet;
import core.enums.ChartType;
import opts.DataSetOptions;
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


        Chart chart = GlobalOptions.setTitle("Demo-Line")
                .andThen(GlobalOptions.setXLabel("X-axis Week"))
                .andThen(GlobalOptions.setYLabel("Y-axis Amount"))
                .andThen(SeriesOptions.setBackgroundColor("orange"))
                .andThen(DataSetOptions.addDataSet("Beer", 1, 2, 3, 4, 2, 5, 4))
                .andThen(DataSetOptions.addDataSet("Juice", 1, 4, 7, 4, 1, 3, 2))
                .andThen(DataSetOptions.setDataLabels(1, 2, 3, 4, 5, 6, 7))
                .apply(Chart.chartSupplier(ChartType.LINE).get());

        RenderExecutor.renderToPath("./render01.html").accept(chart);

    }
}
