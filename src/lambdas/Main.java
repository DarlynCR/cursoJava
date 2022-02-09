package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        /*LAMBDAS
        * Se introdujo desde Java SE 8
        * Pasos para escribir una expresión lambda:
        * 1. -> Identificar el tipo de expresión lambda que se quiere escribir
        * 2. -> Encontrar el método correcto para implementar
        * 3. -> Implementar el método
        *
        * 1. El tipo de una expresión lambda, tiene que ser -> UNA INTERFAZ FUNCIONAL
        * Interfaz funcional (tiene un sólo método abstracto, sin importar que otros tenga(default,estatic)
        * 2. Identificar el método abstracto dentro de la interface funcional
        * 3. Una vez identificado el método abstracto, le damos implementación con la expresión lambda
        *
        * Ejemplo interfaz funcional : Runnable.java
        *
        * */
        //Ejemplo de lambda:
        //El tipo de la expresión lambda a realizar, que se almacenará en la variable predicate
        //Será del tipo  Predicate<String> de la interfaz genérica funcional
        Predicate<String> predicate =
                //(String s) -> son los parámetros que recibe el método abstracto de la interfaz
                (String s) -> {
                    //Implementación que se le da al método
                    return s.length() == 3;
                };
        /*La sintasxis anterior se puede simplificar:
        * (String s) -> se puede dejar solo "s", si es más de un parámetro si se deben poner "()"
        * Y si no hay parámetros los "()" van vacíos.
        * return y {} -> cómo la implementación es una sola línea se puede eliminar el return y las {}
        * */
        //Es recomendable una sintaxis corta y legile
        Predicate<String> predicate2 = s -> s.length() == 3;
        //Ejemplo con interfaz que no retorna
        Runnable runnable = () -> System.out.println("I am running");
        //Con la variable ahora puedo llamar al método al cual se le dió implementación con la expresión lambda
        runnable.run();
        //También se puede llamar a los demás métodos definidos en la interfaz funcional (default o estatic)
        runnable.methDefault();

        /*CAPTURA DE VALORES LOCALES
        * Las expresiones lambdas en su implementación no pueden capturar valores que definidos
        * fuera de su cuerpo, sólo capturará valores de las varianles definidas como finales o efectivamente finales
        * Sólo se puede acceder a variables definidas dentro de su cuerpo
        * Efectivamente finales -> son variables a las cuales accedo en su valor en la implementación lambda
        * y no las modifico. El compilador por debajo las convierte en final
        * */

        //Ejemplo
        Predicate<Integer> predicate3 = number -> {
            Integer suma = number + number;
            return suma > 10;
        };

        System.out.println( predicate3.test(5));

        /*Serialización de lambdas
        * Teniendo en cuenta que las expresiones lambdas se pueden almacenar en una variable
        * Los objetos en su estado podrían tener expresiones lambdas
        * Con la finalidad de reservar la compatibilidad entre versiones, estas expresiones
        * se pueden serializar        *
        * */



        /*java.util.function
        * Organizado entorno a 4 interfaces principales:
        * 1. Supplier<T> -> Interfaz para proveer un objeto del tipo que se implemente/ sin recibir argumentos
        * Método abstracto:  T get();
        * 2. Consumer<T> -> Acepta un argumento y no devuelve nada
        * Método abstracto: void accept(T t);
        * BiConsumer<T,U> -> Acepta dos argumento y no devuelve nada
        * Método abstracto: void accept(T t, U u);
        * 3. Predicate<T> -> Su método abstracto recibe un objeto y devuelve un valor booleano
        * Método abstracto:  boolean test(T t);
        * BiPredicate<T, U> -> Su método abstracto recibe dos objetos y devuelve un valor booleano
        * Método abstracto: boolean test(T t, U u);
        * 4. Function<T,R> -> Recibe un objeto de cualquier tipo (T) y retorna otro de cualquier tipo (R)
        * Método abstracto:  R apply(T t);
        * UnaryOperator<T> -> Recibe un objeto con un tipo de dato y devuelve el mismo tipo de dato
        * BiFunction<T,U,R> -> T y U argumentos recibidos y R argumento devuelto
        * Método abstracto: R apply(T t, U u);
        * Tener en cuenta que las intefaces al ser genéricas, trabajan con clases, si queremos trabajar con
        * tipos de datos primitivos revisar las versiones especializadas de cada interfaz: ej intConsumer(por el tipo de dato
        * que recibe) ToIntFunction (por el tipo de dato que retorna ) y IntToDoubleFunction(Por el tipo de dato que recibe y que retorna)
        *
        * A pesar de que la implementación que se le dé a los métodos abstractos de las interfaces funcionales, puedan
        * ser iguales, su uso dependerá de lo que necesite recibir y retornar.
        * */

        /*ESCRIBIR EXPRESIONES LAMBDAS COMO REFERENCIAS DE MÉTODOS
        * Esto es cuando una expresión lambda, en su implementación, es sólo
        * una referencia (llamado) a un método existente en otra clase.
        * Existen diferentes 4 categorias de llamados a métodos:
        * sintaxis: :: -> Para hacer referencia a un método
        * 1. Referencia a métodos estáticos:
        * RefType::staticMethod -> Sería lo mismo que: (args) -> RefType.staticMethod(args)
        * 2. Referencia de métodos enlazados:
        * expr::instanceMethod -> Sería lo mismo que: (args) -> expr.instanceMethod(args)
        * 3. Referencia de métodos independientes:
        * RefType::instanceMethod -> Sería lo mismo que: (arg0, rest) -> arg0.instanceMethod(rest)
        * 4. Referencia de métodos de contructores:
        * ClassName::new -> Sería lo mismo que: (args) -> new ClassName(args)
        *
        * */
        System.out.println("Referencia de métodos:");
        System.out.println("Ejemplo Referencia a métodos estáticos: ");
        //Ejemplo 1. Referencia de métodos estáticos
        /* DoubleUnaryOperator sqrt = a -> Math.sqrt(a);*/
        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println(sqrt.applyAsDouble(25.6));

        System.out.println("Ejemplo Referencia a métodos enlazados: ");
        //Consumer<String> printer = s -> System.out.println(s);
        Consumer<String> printer = System.out::println;
        //Se llama al método abstracto de la interfaz funcional y genérica "accept"
        //Y se ejecuta la implementación descrita en la variable printer.
        printer.accept("a");

        System.out.println("Ejemplo Referencia a métodos independientes: ");
        //Function<String, Integer> toLength = s -> s.length();
        Function<String, Integer> toLength = String::length;
        int nameLength = toLength.apply("Sergio"); //Se puede asignar a un tipo de dato int, porque int hereda de Integer
        System.out.println(nameLength);

        System.out.println("Ejemplo Referencia a métodos contructores: ");
        //Supplier<List<String>> newListOfStrings = () -> new ArrayList<>();
        Supplier<List<String>> newListOfStrings = ArrayList::new;
        List<String> listArratList = newListOfStrings.get(); //No recibe argumentos, retorna un arrayList
        listArratList.add("Sergio");
        listArratList.add("Darlyn");
        listArratList.forEach(System.out::println);

        /*

        *
        * */
    }

}
