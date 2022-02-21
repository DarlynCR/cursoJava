package streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Streams
        A partir de Java 8
        * Permite realizar operaciones sobre una fuente de datos
        * Pasos:
        * 1. Se debe envolver la fuente de datos en un Stream
        Ya sea usando el método Stream de la Clase (Arrays, List, cualquier Colección)
        o usando directamente el Api de Stream con InStream.Of(fuenteDatos)
        *
        * Stream pipeline
        * Operaciones intermedias -> Producen un nuevo flujo, no se ejecutan hasta que se
        * indica una operación terminal.
        * Operaciones terminales -> Dan inicio a las operaciones intermedias, y
        * no devuelven un flujo. Deben pasar por todas las operaciones intermedias
        * para devolver un resultado. Una vez llamada la operación terminal, no se
        * pueden llamar más operaciones.
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
        * sorted() -> ordena de manera ascendente , tiene una sobrecarga que recibe un comparator
        *
        * OPERACIONES TERMINALES (Algunas)
        *   anyMatch()
            allMatch()
            noneMatch()
            findAny()
            findFirst()
            min()
            max()
            reduce()
            count()
            toArray()
            collect()

        * count() -> cuenta la cantidad de los elementos
        * sum() -> suma los valores de los elementos
        * forEach() -> itera sobre todos los elementos del fujo, les realiza una operación
        * colect(Colectors.tolist()) -> para convertir el stream a una lista - operación
        de reducción mutable - lo que antes no se podía mutar(stream), ahora se puede(colección)

        * Manejo de fuente de datos con Stream
        * Arrays.asList(lista) -> Método estático de Arrays que convierte un array en una
        * lista inmutable.
        Arrys.stream(FuenteDatos) -> se envuelve en Stream para poder acceder a las operaciones
        de la Api Stream
        *
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
