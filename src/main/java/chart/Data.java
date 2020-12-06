package chart;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Data implements Serializable {

    private List<?> labels;

    private List<DataSet> datasets = new ArrayList<>();

    transient public Consumer<DataSet> appendDataSet = dataSet -> {
        this.datasets.add(dataSet);
    };

    transient public Consumer<List<?>> setLabels = labels -> {
        this.labels = labels;
    };

}
