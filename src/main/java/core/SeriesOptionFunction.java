package core;

import java.util.Objects;
import java.util.function.Function;

/**
 * @Auther Koy  https://github.com/Koooooo-7
 * @Description
 */
@FunctionalInterface
public interface SeriesOptionFunction<T, R> extends Function<T, R> {
    default <V> SeriesOptionFunction<T, V> and(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

}
