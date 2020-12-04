package chart;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
public class Dot {

    private Number x;
    private Number y;


    @Override
    public String toString() {
        return "Dot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Dot(Number x, Number y) {
        this.x = x;
        this.y = y;
    }

    public Number getX() {
        return x;
    }

    public Number getY() {
        return y;
    }
}