package inheritance;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*HERENCIA
        * "Don't Repeat Yourself"
        * Promueve la reducción de duplicación en programación
        * Las piezas de información nunca deben duplicarse
        * Disminuye la dificultad en los cambios y evolución
        * Se crean nuevas clases a partir de otras
        * Se establece una relación padre - hijo
        * Superclase - clase padre . clase con un nivel de abstración más elevado
        * Si todas las subclases comparten un conjunto de estados y comportamientos,
        * estos irán en la superclase
        * Subclase - clase hijo, hereda estados y comportamientos de la superclase -
        * palabra reservada "extends"
        * Hereda los estados y comportamientos de la superclase
        * No acepta herencia multiple de estado y de comportamiento
        *Una subclase no hereda los miembros privados de su clase principal.
        * Sin embargo, si la superclase tiene métodos públicos o protegidos para acceder
        * a sus campos privados, la subclase también puede utilizarlos.
        *
        * SUPER - THIS
        * SUPER -> Accedo a los miembros de la superclase
        * THIS -> Accedo a los miembros de la subclase
        *
        * */

        /*INSTANCE OF
        * Nos permite preguntar de que tipo es la referencia a la cual apunta cierta variable
        * es decir, al tipo de la variable que apunta en memoria
        * Es recomendable, que se implemente de las clases hijas hacia la clase padre hasta llegar a object
        * de ser necesario
        *
        * */

        /*HERENCIA MULTIPLE DE TIPO
        * Se admite este tipo de herencia, la cual hace referencia a:
        * Cuando se implementa más de una interfaz en un clase, esta interfaz puede
        * pasar a ser usada como "tipo de dato" al momento de instanciar el objeto
        * que implementa la clase
        * el objeto instanciado tendrá acceso a los métodos de sobreescritos de la clase
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
        * EN java cada clase es descendiente directa o indirecta de OBJECT
        * Si necesito utilizar un método de instancia de la clase Object, lo más probable
        * es que se deba sobreescribir - ejemplo: equals() toString()
        * Si se sobreescribe el método hashCode(), se debe hacer también con el método equals()
        *
        * */

        //Ejemplo de OBJECT COMO SUPERCLASE - CLASE Book.java
        Book firstBook  = new Book("0201914670");
        Book secondBook = new Book("0201914672");

        if (firstBook.equals(secondBook)) {
            System.out.println("objects are equal");
        } else {
            System.out.println("objects are not equal");
        }

        //Método getClass de la clase Object
        System.out.println(firstBook.getClass());
        //Este método getClass con la notación "." me deja llamar más métodos
        System.out.println(firstBook.getClass().getSimpleName());//Trae el nombre solo de la clase

        //Método clone() de la clase Object -> clase Book.java
        // Se clona un objeto igual a firstBook y se almacena en la variable myClone
        Book myClone = (Book) firstBook.clone();
        //Se comprueba con la pripoedad ISBN que sean el mismo valor clonado
        System.out.println(myClone.getISBN());

        /*CLASES Y MÉTODOS ABSTRACTOS --Ejemplo ->clases GraphicObject.java - Circle.java - Rectangle.java
        * Se declara como "abstract"
        * Puede o no incluit métodos abastractos
        * No se pueden instanciar, pero si se pueden heredar
        * Método abstracto -> método sin implmentación, sin cuerpo -> declaración abstract void método();
        * Si una clase incluye al menos un método abstract, la clase debe ser declarada como abstract
        * Las subclases deben darle implementación a los métodos abstractos -> si esta no le da implementación tambien debe
        * declararse abstract
        * Cuando una clase abstracta implmenta una interface -> no tiene la obligación de dar implementación
        * a todos los métodos de la interface, sólo los que necesite
        * Puede tener propiedades y métodos estáticos y para su acceso, se accede como cualquier clase estática
        *
        * CUANDO USARLAS:
        * Para compartir código entre clases estrechamente relacionadas
        * Cuando se espera que las subclases tengan muchos métodos o propiedades comunes
        * o si requieren modificadores de acceso que no sean public sino protected - private
        * Se desea declarar campos no estaticos y no finales
        *-> Se piensa más en objetos en su creación nombres ej: sustantivos
        *
        *
        * CUANDO USAR INTERFACES:
        * Cuando necesita que clases no relacionadas implementen su interface ej: Cloneable
        * Cuando se desea específicar un comportamiento(método) en específico, que tienen en común
        * varías clases que no estén relacionadas
        * Se desea aprovechar la herencia multiple de tipo (implementar muchas interfaces en una clase)
        *-> Se piensa más en acciones/comportamientos en su creación - nombres ej: Drawable, Runnable, Callable, Visualizable
        *
        * */


        /*INTERFACES
        *
        * Tipo de referencia, similar a una clase -> solo puede contener constantes y frimas de métodos
        * Métodos predeterminados, estáticos y tipos anidados
        * Métodos predeterminados y estáticos -> únicos que pueden tener cuerpo
        * No se pueden instanciar
        * Sólo se pueden implementar mediante clases (implements) o ampliar mediante otras interfaces (extends)
        * Las interfaces pueden extender a cualquier número de interfaces (una clase sólo puede extender de una clase)
        * Para las clases que implementen la interfaz, es obligatorio darle implementación a cada método de la interfaz
        * DECLARACIÓN:
        * public interface nombreInterface{}
        * Si no se especifica public en la interfaz, sólo la podrá acceder las clases declaradas en el mismo archivo
        * EJEMPLO interface GroupedInterface.java
        * Si se implementa una interfaz que hereda de otra interfaz,  la clase que la implementa
        * sólo está obligada a dar implementación a los métodos de la interfaz que implementa, los métodos
        * de la interfaz que hereda la interfaz que implementa, serán opcionales
        *
        * Si quiero modificar una interfaz para añadirle nuevos métodos, se puede hacer los siguiente:
        * 1. Crear otra interfaz que extienda de esta y añadir los nuevos métodos
        * 2. Crear los nuevos métodos que se necesitan como predeterminados (default) o estáticos (static)
        * En este caso, los métodos estáticos son considerados como métodos de útilidad y no ensenciales como los demás
        * Y los predeterminados permiten agregar estas nuevas funciones y garantizan la compatibilidad binaria con la versión anterior
        *
        * AMPLIACIÓN DE INTERFACES QUE CONTIENEN MÉTODOS PREDETERMINADOS
        *
        * Al ser predeterminado es opcional en su uso
        * Si se vuelve a declarar, el mismo se vuelve abstracto
        * Se puede sobreescribir
        *
        * USO DE UNA INTERFAZ COMO TIPO
        * Cuando se define una interfaz, se está definiendo un nuevo tipo de dato de referencia
        * Esto quiere decir, que se puede usar nombres de interfaz en cualquier otro lugar donde pueda usar
        * cualquier otro nombre de tipo de dato.
        * Para que pueda ser usada como tipo, la clase debe implementar la interfaz
        *
        *
        * */
    }
}
