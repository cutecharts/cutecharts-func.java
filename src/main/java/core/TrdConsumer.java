package core;

/**
 * @author Koy  https://github.com/Koooooo-7
 * @Description
 */
@FunctionalInterface
public interface TrdConsumer<T, U, G> {
    void accept(T t, U u, G g);
}
