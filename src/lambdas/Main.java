package lambdas;

import java.util.Random;

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
        * 2. Consumer<T> -> Acepta un argumento y no devuelve nada
        * BiConsumer<T,U> -> Acepta dos argumento y no devuelve nada
        * 3. Predicate<T> -> Su método abstracto recibe un objeto y devuelve un valor booleano
        * BiPredicate<T, U> -> Su método abstracto recibe dos objetos y devuelve un valor booleano
        * 4. Function<T,R> -> Recibe un objeto de cualquier tipo (T) y retorna otro de cualquier tipo (R)
        * UnaryOperator<T> -> Recibe un objeto con un tipo de dato y devuelve el mismo tipo de dato
        * BiFunction<T,U,R> -> T y U argumentos recibidos y R argumento devuelto
        *
        * Tener en cuenta que las intefaces al ser genéricas, trabajan con clases, si queremos trabajar con
        * tipos de datos primitivos revisar las versiones especializadas de cada interfaz: ej intConsumer(por el tipo de dato
        * que recibe) ToIntFunction (por el tipo de dato que retorna ) y IntToDoubleFunction(Por el tipo de dato que recibe y que retorna)
        *
        * A pesar de que la implementación que se le dé a los métodos abstractos de las interfaces funcionales, puedan
        * ser iguales, su uso dependerá de lo que necesite recibir y retornar.
        * */

    }
}
