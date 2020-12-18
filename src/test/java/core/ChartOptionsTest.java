package core;

import chart.Chart;
import core.enums.ChartType;
import opts.GlobalOptions;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */

public class ChartOptionsTest {

    @Test
    public void testChartType() {
        Chart chart = Chart.newChart(ChartType.BAR)
                .build();

        Assert.assertEquals("change the mapping chart type", "Bar", chart.getChartType());
    }

    @Test
    public void testChartGlobalOptions() {
        Chart chart = GlobalOptions.setTitle("Test")
                .andThen(GlobalOptions.setYLabel("Y"))
                .andThen(GlobalOptions.setXLabel("X"))
                .apply(Chart.chartSupplier(ChartType.LINE).get());

        Assert.assertEquals("title", "Test", chart.getTitle());
        Assert.assertEquals("XLabel", "X", chart.getXLabel());
        Assert.assertEquals("YLabel", "Y", chart.getYLabel());
    }
}
