package core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
@Getter
@AllArgsConstructor
public enum Position {
    UP_LEFT(1),
    UP_RIGHT(2),
    BOTTOM_LEFT(3),
    BOTTOM_RIGHT(4);

    private int config;
}
