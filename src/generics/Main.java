package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
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
        * No se pueden crear campos estáticos en clases/interfaces genéricas
        * En la declaración de las clases/metodos/interfaces genéricas no puedo manejar try/catch
        * Una clase genérica no puede heredar de Exception ni de Throwable
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
        System.out.println("Ejemplo instanciación clase genérica:");
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
        * Tipo parametrízado -> es Foo<Integer> indicarle a la clase que tipo va a recibir
        * Los tipos parámetrizados no pueden usar cast ni instanceOF -> por el borrado de tipo (Ver más adelante)
        * */

        // Ejemplo con Clase que recibe 2 parámetros de tipo e implementa interfaz que a su vez recibe 2 parámetros de tipo
        // Argumentos de tipo -> Strin, Integer -- String, String
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
        Pair<String, String>  p3 = new OrderedPair<String, String>("hello", "world");

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
        * El alcance de estos parámetros se limitan al método que los declara
        Se permiten métodos genéricos estáticos y no estáticos
        Se permiten constructores genéricos
        *
         Sintaxis -> Método estático genérico
         Parámetros de tipo, se indican antes del tipo de retorno

           EJEMPLO
           public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {...}
           public static <K, V> boolean compare(K p1, V p2) {...}

         Método no estático génerico


         */
        System.out.println();
        System.out.println("Ejemplo implementación de métodos genéricos estático");
        //Se llama al método que compara si los objetos son iguales en sus atributos genéricos
        boolean same = Util.<String, String>compare(p3, p2);
        //se imprime la variable que almacena el valor retornado por el método
        System.out.println(same);

        System.out.println();
        System.out.println("Ejemplo implementación de métodos genéricos no estático");
        Util objectUtil = new Util();
        boolean same1 = objectUtil.<String, String>compare2(p3, p2);
        System.out.println(same1);

        /*PARÁMETROS DE TIPO ACOTADO
        * Se usan para restringir los tipos que se pueden usar como argumento de un tipo parametrizado
        * Sintaxis:
        * Entre el pico parentesis se indica que extiende "extends" del tipo de la clase a la cual se va a restringir
        * <U extends Number> --> Esto quiere decir que la clase o el método genérico ahora recibirá parámetros de tipo
        * Que sean sólo de la clase Number o de las clases que extiendan de ella
        *
        * Beneficios:
        * Limita los parámetros de tipo que se recibe en la clase o método genérico
        * Estando en el scope de la clase o el método genérico podemos acceder a los métodos definidos para cada clase limitada
        * Ej. <T extends Integer> --> en el scope de la clase o método genérico podremos acceder a los métooos de Integer
        *
        * LIMITES MULTIPLES
        * Además de limitarlo como se vió anteriormente, nos permite limitarlo con múltiples tipos (pueden ser clases / interfaces)
        * En su sintaxis las clases deben indicarse primero para que no de un error en tiempo de compilación
        * Estas restricciones deben separarse con la notación "&"
        * Ejemplo:
        * Class A {...}
        * Interface B {...]
        * Interface C {...}
        *
        * Class D <T extends A & B & C> {...}
        *
        * En caso de que se extienda de una interfaz, debemos tener en cuenta que el objeto que se vaya
        * a recibir en la clase/método genérico, haya implementado dicha interfaz, si vamos a utilizar los métodos de la intefaz
        *
        * GENÉRICOS , HERENCIA Y SUBTIPOS
        * En su implementación al ser Integer y Double subclases de Number, se puede hacer lo siguiente:
        * Tener en cuenta jerarquia en clases
        *       Box<Number> box = new Box<Number>();
                box.add(new Integer(10));   // OK
                box.add(new Double(10.1));  // OK

        * Al usar Box<Number> -> Como tipo de dato, pasa lo mismo que con cualquier tipo de dato
        * Si el método boxTest recibiera un String, no va a recibir un int
        * public void boxTest(Box<Number> n) {...}
        *
        *
        * CLASES GENÉRICAS Y SUBTIPIFICACIÓN
        * Una clase o interfaz pueden heredar de clases genéricas
        * Los parámetros de tipo de la interfaz/clase que extienda de una interfaz/clase generica
        * estarán determinados por la clausula extends
        * Ejemplo:
        * interface PayloadList<E,P> extends List<E> {
              void setPayload(int index, P val);
              ...
          }
        *La interfaz PayLoadList que recibe dos parámetros de tipo E y P
        * extiende de la interfaz List que recibe un parámetro de tipo E
        * E -> será el parámetro de tipo que conecta la clase con la interfaz implementada
        * P -> es un parámetro de tipo que recibe la clase PayLoadList
        *
        * Se podrían manejar de la siguiente manera como tipo de dato:
        *   PayloadList<String,String>
            PayloadList<String,Integer>
            PayloadList<String,Exception>
        *Siendo el primer parámetro de tipo : String -> E
        * Y estas parametrizaciones serían subtipos de List<String>
        * */


        /*INFERENCIA DE TIPOS Y MÉTODOS GENÉRICOS
        La inferencia de tipo, me permite no poner el <> e indicar el tipo de dato que
        recibirá el método genérico, permitiendo pasar cualquier tipo de dato
        *Ejemplo:
        * */
        // En este caso s1 sería de tipo ArrayList
        System.out.println("Ejemplos -> Inferencia de tipos y métodos genéricos: ");
        //Por la jerarquia, al método retornar un ArrayList, se puede indicar que la variable sea de tipo Serializable
        // Ya que ArrayList implementa la interfaz Serializable
        Serializable s1 = Util.pick("d", new ArrayList<String>(), 8.0);
        System.out.println("s1 es de tipo: " + s1.getClass().getSimpleName());
        //Sin embargo, es recomendable por buenas prácticas, dejar el <> e indicar
        //El tipo de dato que va a recibir el método
        System.out.println("Llamando al método pick con <String>: tipo de dato: " + Util.<String>pick("s", "d", "f").getClass().getSimpleName());
        /*Si se va a recibir diferentes tipos de datos en el método
        * Es preferible indicarle al método otra variable de tipo, para en el llamado del
        * Método poder indicar los tipos de datos que recibirá
        * <T, T1> --- <T, S> */


        /*Inferencia de tipos en constructores genéricos y clases genéricas
        * class MyClass<X> {
              <T> MyClass(T t) {
                // ...
              }
           }
        *La clase genérica puede recibir un parámetro de tipo y en el contructor genérico
        * también se puede recibir un parámetro de otro tipo diferente
        * El tipo de la clase se puede inferir en este sentido:
        * MyClass<Integer> myObject = new MyClass<>("");
        * <> -> se infiere el tipo de la clase al relacionarlo en el lado izquierdo
        * de la instanciación
        *
        * El tipo del constructor se puede inferir de la siguiente manera:
        * new MyClass<Integer>("") -> <> Hace referencia al tipo de la clase (" ") -> hace referencia al tipo del contructor
        *
        *
        * */


        /*wildcard - comodines
        * Cuando voy a usar clases/interfaces genéricas como tipo de dato, para que no sea tan restrictivo
        * como usar List<T> en su implementación, es decir, -> List<Number> -> que sólo me admitiria un objeto
        * de tipo  List<Number>.
        * Puedo usar los wildcard para indicar la clase superior y que me admita usar como tipo de dato, esta
        * o sus subclases -> su sintanxis sería así: List<? extends Number>
        * De esta manera, puedo usar List<Number> , List<Integer>, List<Double>
        *
        * Cómodin ilimitado ClaseGenérica<?>
        * */
        //Ejemplo comodín limitado
        System.out.println("Comodines: ");
        //usando el comodín ilimitado como tipo de dato
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        //Se llama al método que recibe el comodín ilimitado List<?>
        Util.printList(li);
        Util.printList(ls);
        /* En los wildcard se delimitan los tipos de datos a usar:
        * <? extends Number> -> se limitará a la clase Number y sus subclases - específicando límite inferior
        * <? super Integer> -> Se limitará a la clase Integer y sus superclases- específicando límite superior
        * */
        // La variable listNumber podrá recibir cualquier tipo de lista de la clase List y sus subclases
        List<? extends Number> listNumber = li;


        /*BORRADO DE TIPOS GENÉRICOS
        *Para implementar genéricos el compilador de Java aplica el borrado de tipo
        * Esto quiere decir, que el compilador reemplaza todos los parámetros de tipo en tipos
        * genéricos con sus limítes o en Object si los parámetros de tipo no tienen limite
        *<T> -> Reemplaza T con Object
        * <T extends Comparable<T>> -> Reemplaza T con Comparable
        * Debido a esto en los tipos paramétrizados (Clase<Integer>) no se puede usar cast ni instanceOf
        * */

        /*tipos parámetrizados: para poder usar instanceOf lo máximo que se podrá hacer será usar un comodin
        * Clase<?>
        No se pueden crear matrices de tipo parámetrizado
        * No se pueden crear , atrapar o lanzar tipos parámetrizados
        * Un parámetro de tipo puede ser usar en la clausula Throws, ejemplo:
        * class Parser<T extends Exception> {
                public void parse(File file) throws T {     // OK
                    // ...
                }
          }
          *
          * Una clase no puede tener dos métodos sobrecargados que pueden quedar con la
          * misma firma después del borrado de tipo (ya que el compilador asignará Object al tipo genérico)
        * */

        /*CREAR INSTANCIAS DE PARÁMETROS DE TIPO DENTRO DEL MISMO MÉTODO/CLASE/INTERFAZ GENÉRICO
        *Cuando dentro del MÉTODO/CLASE/INTERFAZ GENÉRICO queremos crear una instancia, esto no
        * está permitido, pero lo podemoa hacer de la siguiente manera:        *
        *
        * public static <E> void append(List<E> list, Class<E> cls) throws Exception {
                E elem = cls.newInstance();   // OK
                list.add(elem);
          }
          *
          * List<String> ls = new ArrayList<>();
            append(ls, String.class);
        * */
        System.out.println(String.class);




    }



}


