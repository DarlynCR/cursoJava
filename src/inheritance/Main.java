package inheritance;

public class Main {

    public static void main(String[] args) {

        /*HERENCIA
        * "Don't Repeat Yourself
        * Promueve la reducción de duplicación en programación
        * Las piezas de información nuca deben duplicarse
        * Disminuye la dificultad en los cambios y evolución
        * Se crean nuevas clases a partir de otras
        * Se establece una relación padre - hijo
        * Superclase - clase padre . clase con un nivel de abstración más elevado
        * Si todas las subclases comparten un conjunto de estados y comportamientos,
        * estos irán en la superclase
        * Subclase - clase hijo
        * Hereda los estados y comportamientos de la superclase
        * No acepta herencia multiple de estado y de comportamiento
        *
        *
        * */

        /*HERENCIA MULTIPLE DE TIPO
        * Se admite este tipo de herencia, la cual hace referencia a:
        * Cuando se implementa más de una interfaz en un clase, esta interfaz puede
        * pasar a ser usada como "tipo de dato" al momento de instanciar el objeto
        * que implementa la clase
        *
        * NombreInterfazImplementada NombreobjetoInstanciado = new ClaseQueImplementaLaInterfaz();
        * */


        /*MÉTODO DE INSTANCIA
        * Se pueden sobreescribir los métodos de instancia pertenecientes a una subclase
        * que tengan la misma firma y tipo de retorno de la superclase
        * @override -> Para anular el método de la superclase*/

        /*METODOS ESTATICOS
        * Si una subclase define un método estático con la misma firma que un método en la superclase
        * este se oculta
        * OCULTAR -> No me anula el método de la superclase, sino me da la opción de usar el método de la
        * superclase o el de subclase, accediendo desde la clase que desee
        *
        * */

        /*MÉTODOS DE INTERFAZ
        * los métodos de interfaz pueden contener métodos predeterminados, métodos abstractos
        * Métodos abstractos -> métodos sin implementación
        * Métodos predeterminados tienen la palabra reservada "default" su declaración y  "return" en su implementación

            public interface Flyer {
                //Método predeterminado
                default public String identifyMyself() {
                return "I am able to fly.";
                }
            }
        *Cuando una clase  implementa interfaces, y la clase
        * y las interfaces contienen métodos con la misma firma, se sigue la siguiente regla de herencia
        * 1 -> Se prefieren los métodos de instancia a los métodos predeterminados de la interfaz
        * Los métodos de instancia -> Son los métodos de la clase en sí.
        * 2 -> Los métodos que ya están anulados por otros se ignoran
        * Cuando se aplica herencia entre interfaces, y los métodos de la subinterfaz sobreecribe el método
        * de la superInterfaz, Java le da preferencia a el método sobreescrito
        * EJEMPLO PRÁCTICO EN la Clase Dragon.java
        * */


    }
}
