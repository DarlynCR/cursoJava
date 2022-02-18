package streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Streams
        *
        * A partir de Java 8
        * Stream pipeline
        * Operaciones intermedias -> Producen un nuevo flujo
        * Operaciones terminales -> Dan inicio a las operaciones intermedias, y
        * no devuelven un flujo.
        *
        * Tener en cuenta que los métodos del API Stream, reciben como argumentos
        * objetos de tipo de interfaces funcionales, es decir, se deben implementar
        * las lambdas dentro del método.
        *
        * MÉTODOS DE API STREAM
        * OPERACIONES INTERMEDIO
        * map() -> toma los valores de la lista uno a uno, y los transforma
        * filter() -> Descarta algunos elementos teniendo en cuenta el filtrado
        * flatMap() -> convierte a un sólo flujo - ej ingresar a una lista dentro de otra lista
        *
        *
        * OPERACIONES TERMINALES
        * count() -> cuenta la cantidad de los elementos
        * sum() -> suma los valores de los elementos
        * */

        //Ejemplo
        List<String> strings = List.of("one", "two", "three", "four");
        long count = strings.stream()
                .map(String::length)
                .filter(length -> length == 3)
                .count();
        System.out.println("count = " + count);
    }
}
