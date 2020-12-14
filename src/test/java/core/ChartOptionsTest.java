package core;

import chart.Chart;
import core.enums.ChartType;
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

}
