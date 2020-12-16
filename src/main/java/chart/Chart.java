package chart;

import com.alibaba.fastjson.annotation.JSONField;
import core.DataSetOptionFunction;
import core.GlobalOptionFunction;
import core.SeriesOptionFunction;
import core.enums.ChartType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import opts.SeriesOptions;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Chart {
    private String title;
    private String xLabel;
    private String yLabel;
    private SeriesOptions options;
    private Data data = new Data();
    transient private String chartType;
    transient private String width = "1200px";
    transient private String height = "900px";
    transient private String chartId = UUID.randomUUID().toString().replace("-", "");

    private Chart(ChartType chartType) {
        this.chartType = chartType.getSymbol();
        this.options = new SeriesOptions();
    }

    public static Supplier<Chart> chartSupplier(ChartType chartType) {
        return () -> new Chart(chartType);
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

        @SafeVarargs
        public final newChart setDataSeriesOptions(DataSetOptionFunction<Data, Data>... dataSets) {
            Arrays.stream(dataSets).reduce(DataSetOptionFunction::andThen).get().apply(instance.data);
            return this;
        }

        public newChart setDataLabels(List<?> labels) {
            instance.data.setLabels.accept(labels);
            return this;
        }

        public final newChart setDataLabels(String... labels) {
            instance.data.setLabels.accept(Arrays.asList(labels));
            return this;
        }

        public final newChart setDataLabels(Integer... labels) {
            instance.data.setLabels.accept(Arrays.asList(labels));
            return this;
        }

        public final Chart build() {
            return instance;
        }
    }

}
