package FunctionalProgrammingInDepth.HighOrderFunctions;

public interface Factory<T> {
    //processing of generating or producing the item and then configurating the item.
    T create();
}
