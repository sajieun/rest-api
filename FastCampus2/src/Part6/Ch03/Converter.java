package Part6.Ch03;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
