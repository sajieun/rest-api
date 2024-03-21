package Part6.Ch03.model;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
