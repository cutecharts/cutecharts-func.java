package core;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */
@FunctionalInterface
public interface DataSetOptionFunction<T, R> extends Function<T, R> {

    @Override
    default <V> DataSetOptionFunction<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
}
