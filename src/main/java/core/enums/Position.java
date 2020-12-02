package core.enums;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
public enum Position {
    UP_LEFT(1),
    UP_RIGHT(2),
    BOTTOM_LEFT(3),
    BOTTOM_RIGHT(4);

    private int config;

    Position(int config) {
        this.config = config;
    }

    public int getConfig() {
        return config;
    }
}
