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
        * SUPER - THIS
        * SUPER -> Accedo a los miembros de la superclase
        * THIS -> Accedo a los miembros de la subclase
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
        */


        /* INTERFACES CON IMPLEMENTACIONES PREDETERMINADAS PARA EL MISMO MÉTODO
        * Cuando una clase implemente dos interfaces que tengan métodos predetermiandos con la misma firma
        * Se podrá acceder a cualquiera de los métodos mediante:
        * 1. La clase debe anular/sobreescribir el método predeterminado en las interfaces
        * 2. Dentro del método que sobreescribe se accede: nombreInterfaz.super.metodoPredeterminado();
        *
        * EJEMPLO EN la clase FlyingCar.java
        * */

        /*MODIFICADORES JERARQUICOS EN SOBREESCRITURA DE MÉTODOS
        Se pueden usar modificadores en los métodos sobreescritos/anulados
        De arriba hacía abajo en la siguiente jerarquia -NO de abajo hacía arriba
        * private
        * protected
        * public
        * */


        /* POLIMORFISMO
        * En clases -> cuando existe una jerarquia por herencia, la superclase funciona
        * como un tipo de dato valido para las subclases
        * En métodos -> Cuando se desea sobreescribir métodos de la superclase, en el método
        * que anula se llama al método de la superclase con la palabra reservada "super" y
        * se le añade nueva implementación
        * Posibilidad de sobreescribir un método con implementaciones diferentes o añadidas
        *
        * OCULTAR CAMPOS
        * Si un subclase declara una variable con el mismo nombre de una variable de la superclase
        * este lo oculta, y para acceder a cada una, será con la palabra reservada SUPER -THIS
        * Se aconseja -> no poner nombres en la subclase que coincidan con los de la superclase
        *
        *
        * */


        /*ESCRITURA DE CLASES Y MÉTODOS FINALES
        "final" -> no es susceptible de modificaciones
        * Se pueden declarar algunos o todos los métodos con "final" en una clase
        * Los métodos llamados desde constructores deben declararse "Finales"
        * Una clase completa también puede declararse como "final"
        * */


        /*OBJECT COMO SUPERCLASE
        *
        * EN java cada clase es descendiente directa o interecta de OBJECT
        * Si necesito utilizar un método de instancia de la clase Object, lo más probable
        * es que se deva sobreescribir - ejemplo: equals() toString()
        * */

        //Ejemplo de OBJECT COMO SUPERCLASE - CLASE Book.java
        Book firstBook  = new Book("0201914670");
        Book secondBook = new Book("0201914672");

        if (firstBook.equals(secondBook)) {
            System.out.println("objects are equal");
        } else {
            System.out.println("objects are not equal");
        }

    }
}
