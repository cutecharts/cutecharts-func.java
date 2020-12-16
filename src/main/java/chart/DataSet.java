package chart;

import core.DataSetOptionFunction;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
@Getter
@ToString
public class DataSet implements Serializable {

    private String label;
    private List<?> data;

    public DataSet(String label, List<?> data) {
        this.label = label;
        this.data = data;
    }


    public DataSet(String label, Dot[] data) {
        this.label = label;
        this.data = Arrays.asList(data);
    }

    public static DataSetOptionFunction<Data, Data> addDataSet(String label, List<?> data) {
        return data0 -> {
            data0.appendDataSet.accept(new DataSet(label, data));
            return data0;
        };
    }

    public static DataSetOptionFunction<Data, Data> addDataSet(String label, String... data) {
        return data0 -> {
            data0.appendDataSet.accept(new DataSet(label, Arrays.asList(data)));
            return data0;
        };
    }

    public static DataSetOptionFunction<Data, Data> addDataSet(String label, Integer... data) {
        return data0 -> {
            data0.appendDataSet.accept(new DataSet(label, Arrays.asList(data)));
            return data0;
        };
    }

    public static DataSetOptionFunction<Data, Data> addDataSet(String label, Dot... data) {
        return data0 -> {
            data0.appendDataSet.accept(new DataSet(label, data));
            return data0;
        };
    }
}

