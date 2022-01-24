package object;

public class Main {

    public static void main(String[] args) {

        //Instanciando la clase Doctor
        // Clase nombreObjeto = new NombreMétodoConstructor();
        /*El método constructor:
        * Nos ayuda a crear nuevas instancias
        * Tiene el mismo nombre de la clase que se está instanciando
        * Se usa la palabra reservada new para invocarlo
        * Puede tener cero o más argumentos
        * No regresa un valor */
        Doctor myDoctor = new Doctor();

        myDoctor.name = "Sergio Rodríguez";

        //
        myDoctor.showName();

        // Segundo método constructor de la clase Doctor
        Doctor my2Doctor = new Doctor("Darlyn Caicedo");
      /*Métodos / Variable estaticos
        *Se pueden usar en toda la clase
        *Están definidos por la palabra reservada "static"
        *Se acceden indicando el nombre de la clase, la notación "." y el nombre
        del método o el nombre de la variable, para no indicar de la clase puedo importar la clase
        y los miembros que necesite utilizar
        * Se invoca en una clase que no tiene instancia de la clase
        * Scope: Donde se esté invocando el método o la variable
        * Variable static: una de sus caracteristicas es que sirve como variable de clase, es decir, que
        su valor es indiferente a los objetos que se creen de la clase */

        //Scope
        System.out.println(Doctor.valor);
        System.out.println(Doctor.valor = 1);
        System.out.println(Doctor.valor);

        Bicycle bicycle1 = new Bicycle(12,25,25);
        Bicycle bicycle2 = new Bicycle(12,25,25);
        Bicycle bicycle3 = new Bicycle(12,25,25);

        System.out.println("Ejemplo Bicycle:");
        System.out.println(bicycle1.getID());
        System.out.println(bicycle2.getID());
        System.out.println(bicycle3.getID());


    }
}
