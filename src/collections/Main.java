package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* API Collections Framework
        Conjunto de interfaces que modelan diferentes formas de almacenar datos
        en diferentes tipos de contenedores.
        * Implementación de los conceptos sobre como almacenar,
        * oganizar y acceder a datos en la memoria.
        *
        CATEGORIAS PRINCIPALES:
        * COLECCIONES - Y MAPAS
        Colecciones -> Consiste en almacenar objetos e iterar sobre ellos
        Interfaz Collection -> implementa la interfaz Iterable, es la raíz de esta categoria
        Mapa -> Almacena un objeto con una clave asociada
        Interfaz Map -> es la interfaz raíz de esta categoria
        *
        SUBCATEGORIA:
        * QUEUE

        CATEGORIA SECUNDARIA:
        * ITERATOR
        Es un objeto que puede iterar sobre una colección de objetos
        - vendría siendo el element de foreach
        * */


        /*Interfaz iterable
        Un objeto que implementa Iterable, es un objeto que se puede iterar
        * */

        /* Interfaz Collection
        * Caracteristicas:
        * Agrega o elimina elementos
        * Prueba la presencia de un elemento dado
        * Preguntar por el número de elementos que contiene
        * saber si está vacía
        * Borrar el contenido
        * Operaciones: unión, intersección y complemento
        * */

        /*Interfaz LIST - implementa Collection
        * Caracteristicas que añade:
        * Recuerda en que orden se han agregado los elementos
        * Los elementos de la lista tienen un indice
        * - Por los indices se heredan operaciones asociadas a estos(Remove, add...)
        * Puede crecer dinámicamente, no es necesario indicar el tamaño
        * */
        System.out.println("Ejemplo List:");
        List<String> myList = new ArrayList<>();
        //Método add de Collection
        myList.add("Lunes");
        myList.add("Martes");
        myList.add("Miércoles");
        myList.add("Jueves");
        myList.add("Viernes");
        myList.add("Viernes");
        //En su impresión se observa que respeta el orden en la que se agregaron los elementos
        myList.forEach(System.out::println);
        //Método foreach de Collection



        /*Interfaz SET - implementa Collection
        * Caracteristicas que añade:
        * No permite tener elementos duplicados
        *
        * */
        System.out.println("Ejemplo Set:");
        Set<String> mySet = new HashSet<>();
        //Método add de Collection
        mySet.add("Lunes");
        mySet.add("Martes");
        mySet.add("Miércoles");
        mySet.add("Jueves");
        mySet.add("Viernes");
        mySet.add("Viernes"); //No duplica el elemento
        //Método foreach de Collection
        mySet.forEach(System.out::println);


        /*Interfaz SortedSet - Implementa SET
        * Mantiene sus elmentos ordenados en orden ascendente
        * por el valor del elemento
        * Se puede obtener el elemento más bajo y el más alto
        *
        * */

        /*Interfaz Map - */
        System.out.println("Ejemplo Map:");
        Map myMap = new HashMap<>();
        myMap.put(1,"Lunes");
        myMap.put(2,"Martes");
        myMap.put(3,"Miércoles");

        String element = (String) myMap.get(1); //Regresa un tipo Object, por esto se debe castear
        System.out.println(element);
        //No se imprimirán en el orden de almacenado.
        //ya que values() retorna un set con los valores del mapa, puedo iterarlos con un forEach
        myMap.values().forEach(System.out::println);


    }
}
