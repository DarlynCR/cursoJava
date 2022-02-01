package exceptions;

public class Main {

    public static void main(String[] args) {
        /*Excepciones en Java
        * Existen diferentes tipos de excepciones que lanza Java
        * cuando hay errores de programación.
        * Estos errores se deben tratar con Try/Catch para que el programa no se detenga
        * de manera abrupta y podamos controlar el flujo
        * Una excepción puede encadenar otra excepción ->  a esto se le llama pila de excepciones
        *
        * */
        int resultado = 0;
        //La división por 0 genera un error
        //Se realiza try para que intente realizar las instrucciones
        try{
            resultado = Arithmetic.division(10,0); //ArithmeticException
            // Exception es el tipo de excepción - clase Exception - ex nombre de la variable
        }catch (Exception ex){
            //Catch recibe la excepción que ocurre en el try
            // y printStackTrace es un método de la clase Exception
            //Que muestra la pila de excepciones
            //system.out para mandarlo a imprimir a la consola
            System.out.println("Ocurrió un error: ");
            ex.printStackTrace(System.out);
            //ex.message() -> muestra el mensaje de la excepción
        }finally {
            System.out.println("Se ejecuta el bloque finally");
        }

        //Se imprime el valor iniciar de la variable local, se puede ver que
        //manejando la excepción el programa sigue su flujo
        System.out.println("Continúa la ejecución del programa");
        System.out.println(resultado);
    }


    /*TIPOS DE EXCEPCIONES
    * EXCEPTION -> A partir de esta clase podemos crear nuestras propias clases de excepciones
    *       Si la exception hereda de la clase Exception -> Se conocen como CheckException
    *       Es necesario usar try/catch
    * RunTimeException -> Hereda de EXCEPTION
    *       Excepciones que ocurren en tiempo de ejecución
    *       Si la exception hereda de la clase RunTimeException -> se conocen como uncheckException
    *       No es necesario reportar el error -> usar try/catch ya que en tiempo de compilación no muestra la obligatoriedad
    *       Sin embargo, el error ocurre en tiempo de ejecución y se detiene el programa
    * SQLException -> Hereda de EXCEPTION
    * NullPointerException -> Hereda de RunTimeException
    *       Excepciones en tiempo de ejecución
    *
    * CUANDO USARLAS:
    * EXCEPTION ->
    *
    * RUNTIMEEXCEPTION -> Si no estamos seguros de que se arroje una excepción
    * Para que nuestro código esté más limpio
    *
    * Finally -> en el bloque de try y catch
    * independientemente de la ejecución del try y catch siempre se va a ejecutar el bloque
    * finally
    * lo podemos utilizar para cerrar recursos
    * Try -> se pueden generar más de una 1 excepción
    * Catch -> crear un bloque catch por cada excepción que se genere el el try o
    * una generica que imprima toda la pila -> es recomendable que el primer catch reciba la excepción
    * de menor jerarquia (es decir, las clases hijas) y así en adelante hasta la clase padre al final
    * */


}
