package opts;

import chart.Chart;
import core.SeriesOptionFunction;
import core.enums.ChartType;
import core.enums.Position;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */
@Getter
public class SeriesOptions implements Serializable {

    private int xTickCount = 3;
    private int yTickCount = 3;
    private boolean showLabels = false;
    private boolean showLegend = true;
    private Position legendPosition = Position.UP_LEFT;
    private String[] dataColors;
    // set the color by default for bar.
    private boolean fillColor;
    private boolean unxkcdify = false;
    private String strokeColor = "black";
    private String backgroundColor = "white";
    private String fontFamily;


    public static SeriesOptionFunction<Chart, Chart> setXTickCount(int xTickCount) {
        return chart -> {
            chart.getSeriesOptions().xTickCount = xTickCount;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setYTickCount(int yTickCount) {

        return chart -> {
            chart.getSeriesOptions().yTickCount = yTickCount;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setShowLabels(boolean showLabels) {
        return chart -> {
            chart.getSeriesOptions().showLabels = showLabels;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setShowLegend(boolean showLegend) {
        return chart -> {
            chart.getSeriesOptions().showLegend = showLegend;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setLegendPosition(Position legendPosition) {
        return chart -> {
            chart.getSeriesOptions().legendPosition = legendPosition;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setDataColors(String... dataColors) {
        return chart -> {
            chart.getSeriesOptions().dataColors = dataColors;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setUnxkcdify(boolean unxkcdify) {
        return chart -> {
            chart.getSeriesOptions().unxkcdify = unxkcdify;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setStrokeColor(String strokeColor) {
        return chart -> {
            chart.getSeriesOptions().strokeColor = strokeColor;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setBackgroundColor(String backgroundColor) {
        return chart -> {
            chart.getSeriesOptions().backgroundColor = backgroundColor;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setFontFamily(String fontFamily) {
        return chart -> {
            chart.getSeriesOptions().fontFamily = fontFamily;
            return chart;
        };
    }

    public static SeriesOptionFunction<Chart, Chart> setFillColor(boolean isFillColor) {
        return chart -> {
            if(chart.getChartType().equalsIgnoreCase(ChartType.BAR.getSymbol())){
                chart.getSeriesOptions().fillColor = isFillColor;
            }
            return chart;
        };
    }
}

