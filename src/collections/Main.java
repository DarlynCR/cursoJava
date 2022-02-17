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
        Modela varias operaciones sobre contenedores de elementos

        Mapa -> Almacena un objeto con una clave asociada
        Interfaz Map -> es la interfaz raíz de esta categoria
        *
        SUBCATEGORIA:
        * QUEUE

        CATEGORIA SECUNDARIA:
        * ITERATOR
        Iterator es una interfaz que nos permite
         iterar sobre una colección de objetos
         Lo usamos como tipo de dato

         * LISTITERATOR - implementa iterator
         y le añade las siguientes caracteristicas:
         Puede iterar en orden descendente
         obtener el indice del elemento
         actualizar el ultimo elemento por next() o previous()
        * */

        System.out.println("Ejemplo iterator:");
        // Por polomorfismo, se indica el tipo de interfaz que implementa ArrayList
        List<String> list1 = new ArrayList<>();
        list1.add("Lunes");
        list1.add("Martes");
        list1.add("Miércoles");
        list1.add("Jueves");
        list1.add(null);
        // se declara un objeto de tipo Iterator
        Iterator<String> iterator = list1.iterator();
        // hasNext() me indica que en la colección existe un elemento sobre el cual iterar
        //retorna true - false
        System.out.println(list1);
        while (iterator.hasNext()){
            //next() hace referecia al elemento sobre el cual se está iterando
        /*    System.out.println(iterator.next());*/
            if(iterator.next() == null){
                //Si mientras analizo una lista quiero modificarla
                //Debo hacerlo mediante el iterator
                //list1.remove("Lunes"); ConcurrentModificationException
                iterator.remove();

            }
        }
        System.out.println("Iterator.remove");
        System.out.println(list1);

         /*Interfaz iterable - es la superInterfaz de Collection
        Un objeto que implementa Iterable, es un objeto que se puede iterar
        Para implemementar esta interfaz, se debe proporcionar una instancia de la Iterface Iterator
        * */


        /* Interfaz Collection
        * Caracteristicas:
        * Agrega o elimina elementos
        * Prueba la presencia de un elemento dado
        * Preguntar por el número de elementos que contiene
        * saber si está vacía
        * Borrar el contenido
        * Operaciones: unión, intersección y complemento
        * Formas de acceder a los elementos:
        * Mediante el uso de un iterator
        * Mediante una secuencia de estos elementos
        * */

        /*Interfaz LIST - implementa Collection
        * Caracteristicas que añade:
        * Recuerda en que orden se han agregado los elementos
        * Los elementos de la lista tienen un indice
        * - Por los indices se heredan operaciones asociadas a estos(Remove, add...)
        * Puede crecer dinámicamente, no es necesario indicar el tamaño
        * Clases que la implementan: ArrayList - LinkedList
        * LinkedList -> Si necesito recorrer la lista como pila(LIFO) o cola(FIFO)
        * ArrayList -> Si necesito acceder a los elementos mediante indice
        * */
        System.out.println("Ejemplo List:");
        //ArrayList -> Clase que implementa la Interfaz List
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
        System.out.println("Método .sublist()");
        List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));
        System.out.println(strings); //[0, 1, 2, 3, 4, 5]
        //Así almacene en una nueva lista la sublista de string
        // Las modificaciones que realice a la sublista se verán reflejadas en la lista principal
        List<String> listString = strings.subList(2, 5);
        System.out.println(listString); //[2, 3, 4]
        listString.clear();
        System.out.println("Método clear:");
        System.out.println(strings);//[0, 1, 5]
        System.out.println(listString); //[]




        /*Interaz Queue
        * Una colección FIFO - Primero en entrar primero en salir(Cola)
        *
        * */

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
        * Para poder ordenar los elementos se debe implementar:
        * 1.La interfaz Comparable (y sobreescribir el método compareTo()) a clase del elemento
        * 2. Si ya se ha hecho lo anterior, también puede implementar Comparator en el archivo
        * SortedSet - lo que permitirá ordenar en otra forma diferente, a la definida con Comparable
        * Caracteristicas que añade:
        * Obetener el elemen más bajo y más alto
        * Extraer el HeadSet y tailset de los elementos menores o mayores
        * iteración se hace del elemento más bajo y el más alto
        * Clases que la implementan : TreeSet
        * */

        /*Interfaz NavigableSet - Implementa SortedSed
        * Caracteristicas que añade:
        * Se pueden iterar en orden descendente
        * Clases que la implementan : TreeSet
        *  */

        /*Interfaz COMPARATOR
            Una clase que implementa esta interfaz, para realizar una comparación
            y ordenar una lista de una manera más personalizada, o de acuerdo a la lógica de negocio.


         * Al implementar la interfaz Comparator, y sobreescribir el método Compare()
         * El método Compare() recibe dos objetos que sean del mismo tipo que se indique en la implementación
         * de la interfaz (Comparator<TipoObjeto>), para poder ordenarlos.
         *
         * Retorna un entero: Negativo / 0 / Positivo
         * Negativo: El primer parámetro es el menor
         * Positivo: Es que el segundo parámetro es el menor
         * 0: Es que son iguales / se debe evitar que de 0

         Para utilizarlo, se debe usar el método estático sort() de la clase Collections,
         que recibe la lista y el objeto que implementa la interfaz Comparator

         Collections.sort()
         * */

        /*Interfaz Map -

        * HashMap - clase que implementa la interfaz
        * Un hashmap es una estructura capaz de almacenar pares clave-valor.
        * El valor es cualquier objeto que su aplicación necesita manejar,
        * y una clave es algo que puede representar este objeto.
        * Caracteristicas:
        * Por lo general, Clave-> es un objeto simple:  cadena de varios caracteres o un número.
        * Valor -> puede ser tan complejo como se necesite.
        * Una clave es única en un hashmap, un valor no tiene que ser único
        *
        * Para esto se han creado los hashmaps: puede manipular claves,
        * moverlas de una parte de su aplicación a otra,
        * transmitirlas a través de una red y, cuando necesite
        * el objeto completo, puede recuperarlo con su clave.
        *
        * Mapas inmutables -> Map.Of() (Sólo admite 10 pares)
        *  */
        System.out.println("Ejemplo Map:");
        Map myMap = new HashMap<>();
        myMap.put(1,"Lunes");
        myMap.put(2,"Martes");
        myMap.put(3,"Miércoles");

        //Mapa inmutable
        Map<Integer, String> map =
                Map.of(
                        1, "one",
                        2, "two",
                        3, "three"
                );


        String element = (String) myMap.get(1); //Regresa un tipo Object, por esto se debe castear
        System.out.println(element);
        //No se imprimirán en el orden de almacenado.
        //ya que values() retorna un set con los valores del mapa, puedo iterarlos con un forEach
        myMap.values().forEach(System.out::println);

        /*CREACIÓN DE COLECCIONES INMUTABLES
        * A partir de métodos de fábrica - desde Java 9
        * Llamando al método estático of() de List o de Set
        * - Estas estructuras no aceptan valores nulos
        * - Tanto Set como List serán inmutables
        * - Set no aceptará valores duplicados
        * - Si los objetos de estas estructuras son mutables, aún puede mutarlos.
        * */

        List<String> stringList = List.of("one", "two", "three");
        Set<String> stringSet = Set.of("one", "two", "three");

        /* Obtener una copia inmutable de una colección
        A partir de Java 10 - se pueden crear copias inmutables de una colección

        * */
        // Clase Array para manejar matrices - asList() -> convierte un array a una lista
        // En esta lista sólo se pueden modificar los elementos, más no agregar o eliminar
        Collection<String> strings2 = Arrays.asList("one", "two", "three");

        List<String> list = List.copyOf(strings2);
        Set<String> set = Set.copyOf(strings2); //Si hay elementos duplicados se conservará uno solo
        // Estas copias serán inmutables




    }
}
