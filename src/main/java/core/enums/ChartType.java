package core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
@AllArgsConstructor
@Getter
public enum ChartType {
    LINE("Line"),
    BAR("Bar"),
    STACKED_BAR("StackedBar"),
    RADAR("Radar"),
    SCATTER("XY"),
    PIE("Pie");

    private String symbol;
}
