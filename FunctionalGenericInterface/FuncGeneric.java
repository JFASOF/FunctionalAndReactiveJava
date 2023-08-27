package FunctionalGenericInterface;

@FunctionalInterface
public interface FuncGeneric<T,R> {
    //T : consume , R : produce
    R execute(T t);
}
