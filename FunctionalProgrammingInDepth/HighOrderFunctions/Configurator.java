package FunctionalProgrammingInDepth.HighOrderFunctions;

public interface Configurator<T,R> {
    R configure(T t);
}
