package opts;

import chart.Chart;
import chart.DataSet;
import chart.Dot;
import core.DataSetOptionFunction;

import java.util.Arrays;
import java.util.List;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */

public class DataSetOptions {

    public static DataSetOptionFunction<Chart, Chart> addDataSet(String label, Integer... data) {
        return chart -> {
            chart.getData().appendDataSet.accept(new DataSet(label, Arrays.asList(data)));
            return chart;
        };
    }

    public static DataSetOptionFunction<Chart, Chart> addDataSet(String label, Dot... data) {
        return chart -> {
            chart.getData().appendDataSet.accept(new DataSet(label, data));
            return chart;
        };
    }

    public static DataSetOptionFunction<Chart, Chart> setDataLabels(Integer... labels) {
        return chart -> {
            chart.getData().setLabels.accept(Arrays.asList(labels));
            return chart;
        };
    }

    public static DataSetOptionFunction<Chart, Chart> setDataLabels(List<?> labels) {
        return chart -> {
            chart.getData().setLabels.accept(labels);
            return chart;
        };
    }

    public static DataSetOptionFunction<Chart, Chart> setDataLabels(String... labels) {
        return chart -> {
            chart.getData().setLabels.accept(Arrays.asList(labels));
            return chart;
        };
    }
}
