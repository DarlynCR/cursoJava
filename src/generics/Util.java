package generics;


import java.util.List;

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

    //Ejemplo de inferencia de tipos en métodos genéricos
    //Se puede recibir varios parámetros de tipo que hagan referencia a diferentes clases con la misma letra de convención
    static <T> T pick(T a1, T a2, T a3) { return a2; }

    //El método recibirá cualquier tipo de lista, usando el comodín ilimitado <?>
    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
    // Código de comodin ilimitado - en un método genérico
    /*public static <T>void printList(List<T> list) {
        for (T elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }*/
}
