package lambdas;
@FunctionalInterface
//Interfaz funcional y genérica
public interface Predicate<T> {
    //Método abstracto de la interfaz
    boolean test(T t);
}
