package generics;

public class Util {
    // método estático enérico que compara que los atributos de los objetos sean iguales
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    // método no estático genérico sintaxis de <>
    // La clase no debe indicar que recibe parámetros de tipo genérico
    public  <K, V> boolean compare2(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
