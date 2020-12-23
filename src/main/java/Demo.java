import chart.Chart;
import chart.DataSet;
import core.enums.ChartType;
import render.RenderExecutor;

import static chart.Chart.chartSupplier;
import static opts.DataSetOptions.*;
import static opts.GlobalOptions.*;
import static opts.SeriesOptions.*;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */

public class Demo {
    public static void main(String[] args) {
        Chart line = Chart.newChart(ChartType.LINE)
                .setGlobalOptions(
                        setTitle("Demo-Line"),
                        setXLabel("X-axis Week"),
                        setYLabel("Y-axis Amount")
                ).setSeriesOptions(
                        setBackgroundColor("orange")
                )
                .setDataLabels(1, 2, 3, 4, 5, 6, 7)
                .setDataSeriesOptions(
                        DataSet.addDataSet("Beer", 1, 2, 3, 4, 2, 5, 4),
                        DataSet.addDataSet("Juice", 1, 4, 7, 4, 1, 3, 2)
                )
                .build();

        RenderExecutor.renderToPath("./").accept(line);


        Chart line1 = setTitle("Demo-Line")
                .and(setXLabel("X-axis Week"))
                .and(setYLabel("Y-axis Amount"))
                .and(setBackgroundColor("orange"))
                .and(addDataSet("Beer", 1, 2, 3, 4, 2, 5, 4))
                .and(addDataSet("Juice", 1, 4, 7, 4, 1, 3, 2))
                .and(setDataLabels(1, 2, 3, 4, 5, 6, 7))
                .apply(chartSupplier(ChartType.LINE).get());

        RenderExecutor.renderToPath("./render01.html").accept(line1);

    }
}
