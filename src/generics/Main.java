package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*GENERICOS EN JAVA
        * Es un tipo de comodín que nos permite no indicar el tipo de dato
        * al definir una clase.
        * y hasta el momento que se vaya a instanciar determinada clase se indica el tipo de dato.
         BENEFICIOS:
        * Nos proporcionan una forma de reutiliziar el código con diferentes entradas.
        * Comprobaciones de tipo más fuertes en tiempo de compilación (Ya que al indicar el tipo de dato, se restringe)
        * Eliminación de casteo, ya que desde el comienzo se indica el tipo de dato
        * Implementación de algoritmos genéricos
        * Se pueden crear interfaces y clases genericas
        * Tener en cuenta el polimorfismo en cuanto a su función en las jerarquias en los tipos de datos
        *
        * Nomenclaturas:
        * Nombre tipo Genérico   --- Significado del tipo Genérico
        * E --> Element (Utilizado generalmente por el framework de colecciones en Java)
        * K --> Key (Llave, utilizado en mapas)
        * N --> Number(utilizado para números)
        * T --> Type (Representa un tipo, es decir, una clase)
        * V --> Value (Representa un valor, también se usa en mapas)
        * S,U,V etc --> Usado para representar otros tipos.
        *
        * Variable de tipo -> pueden ser
        * Cualquier tipo de clase
        * Cualquier tipo de interfaz
        * Cualquier tipo de matriz
        * Cualquier otra variable de tipo
        *
        * */

        //Ejemplo clase Generic
        //No se pueden usar tipos primitivos
        Generic<Integer> objectInteger = new Generic(15);
        objectInteger.showType();

        //Tener en cuenta el concepto de polimorfismo
        Generic<String> objectString = new Generic("Sergio");
        objectString.showType();

        //Genericos en colecciones
        //Se restringe a los datos que se ingresarán en myList
        //comprobaciones de tipo más fuertes en tiempo de compilación
        List<String> myList = new ArrayList<>();
        myList.add("Lunes");
        String s = myList.get(0); //Eliminación de casteo

        //Tener en cuenta el concepto de polimorfismo
        Integer num = 5;
        Double dou = 5.0;
        List<Number> numbers = new ArrayList<>();
        numbers.add(num);
        numbers.add(dou);

        // Argumento de tipo es diferente a Parámetro de tipo
        /* T en Foo<T> --> Es parámetro de tipo
        * String en Foo<String> f --> Argumento de tipo
        * */

        // Ejemplo con Clase que recibe 2 parámetros de tipo e implementa interfaz que a su vez recibe 2 parámetros de tipo
        // Argumentos de tipo -> Strin, Integer -- String, String
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

        //Tambien podemos pasar objetos de clases genericas
        // Al lado derecho del = podemos omitir el argumento de tipo dentro del <>, ya que se infiere
        // al ponerlo en el lado izquierdo en la clase OrderedPair<String, Generic<Integer>>
        OrderedPair<String, Generic<Integer>> p = new OrderedPair<>("primes", new Generic<Integer>(8));

        // Tipos sin procesar
        /* Al no pasar el tipo de dato en el <> al instanciar la clase genérica
        * Se considera a ese objeto instanciado como un tipo genérico en bruto
        *
        * Esto se puede hacer por cuestiones de compatibilidad antes de Java 5
        * Sin embargo, NO ES CONVENIENTE dejar sin tipo a las clases e interfaces genericas
        * */

        /*MÉTODOS GENÉRICOS
        Son métodos que introducen sus propios parámetros de tipo
        * El alcance de estos parámetros se limitan dentro del método
        Se permiten métodos genéricos estáticos y no estáticos
        *
         Sintaxis -> Método estático genérico
         Parámetros de tipo, se indican antes del tipo de retorno

         */


    }
}


