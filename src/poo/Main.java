package poo;
import java.util.ArrayList;
import java.util.Date;

import static poo.ui.uiMenu.*;

public class Main {

    public static void main(String[] args) {

        /*ESTADO Y COMPORTAMIENTO DE OBJETOS
        * ESTADO -> Hace referencia a las variables o propiedades
        * COMPORTAMIENTO -> Hace referencia a los métodos*/


        //Instanciando la clase Doctor
        // Clase nombreObjeto = new NombreMétodoConstructor();
        /*El método constructor:
        * Nos ayuda a crear nuevas instancias
        * Tiene el mismo nombre de la clase que se está instanciando
        * Se usa la palabra reservada new para invocarlo
        * Puede tener cero o más argumentos
        * No regresa un valor */


        Doctor myDoctor = new Doctor("Sergio Rodríguez");

        myDoctor.showName();
        myDoctor.showId();

        // Segundo método constructor de la clase Doctor
        Doctor my2Doctor = new Doctor("Darlyn Caicedo", "Medicina General");
        my2Doctor.showId();
        my2Doctor.showName();
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

        // Se instancia la clase Bicycle para validar el incremento de la variable de clase numberOfBicycles
        Bicycle bicycle1 = new Bicycle(12,25,25);
        Bicycle bicycle2 = new Bicycle(12,25,25);
        Bicycle bicycle3 = new Bicycle(12,25,25);

        System.out.println("Ejemplo Bicycle:");
        System.out.println(bicycle1.getID());
        System.out.println(bicycle2.getID());
        System.out.println(bicycle3.getID());

        System.out.println("Ejemplo EPS:");
        System.out.println("------------------------");
        // Se accede al método showMenuGeneral de la clase uiMenu importada del paquete ui
        showMenuGeneral();

        // Construcción de objetos de la clase Patient
        /*OBJETO - VARIABLE
        * Objeto - ubicación: en el stack se almacena la ubicación en memoria (heap) donde se encuentran los datos del objeto
        * La asignación - hace referencia es a la ubicación en memoria del objeto
        * Compuesta de un Conjunto de variables y métodos
        * Variable - ubicación: se almacena el valor del dato directamente en el stack
        * La asignación de valores entre variables es directa
        * Compuesta de un valor como : char, double, int ... No tiene métodos*/

        /*Clases Wrapper / objeto primitivo
        * Manejar un dato primitivo como un objeto
        * Byte
        * Short
        * Integer
        * Long
        * Float
        * Double
        * Character
        * Boolean
        * String*/

        Patient patient = new Patient("Alejandra", "aleja@gmail.com");
        Patient patient2 = new Patient("Emma", "emma@gmail.com");
        Patient patient3 = new Patient("Matias", "matias@gmail.com");
        Patient patient4 = new Patient("Alejandra", "aleja@gmail.com");
        patient = patient2; // Ambos objetos apuntarán a la misma localidad de memoría

        /*CLASES ANIDADAS
        * Una clase que vive dentro de otra clase
        * Clase exterior/outer - La clase de afuera -
        * Para acceder a las propiedades o métodos de la clase interna, se debe instanciar la misma
        * dentro de la clase externa
        * Clase interior/inner - La lógica de su comportamiento esta vínculada con la clase exterior
        * Desde la clase interna se puede acceder a los miembros de la clase externa, así estos esten
        * encapsulados - private
        * No puede definir miembros estaticos
        *
        * TIPOS DE CLASES ANIDADAS
        *** CLASES INTERNAS/ANIDADA-NESTED ----- CLASES ESTÁTICAS ANIDADAS-NESTED/INTERNAS
        *  Estas clases se pueden encapsular
        *
         ** CLASES INTERNAS/ANIDADA-NESTED -> Tienen acceso a los miembros(propiedades/métodos) de la clase externa
        *  No puede definir miembros estaticos
        *  Para instanciar una clase interna, primero se debe instanciar la clase externa
        *  No pueden definir miembros estáticos
        *  Ejemplo:
        *  OuterClass outerObject = new OuterClass();
        *  OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        *
        ** CLASES ESTÁTICAS ANIDADAS-NESTED/INTERNAS -> No tienen acceso a los miembros de la clase externa, a no ser que sean estaticos
        * Para tener acceso a los demas miembros de la clase externa - se necesita una referencia de objeto (se recibe el objeto como parametro en un método
        * de la clase estatica anidada)
        * Para instanciar la clase estatica no es necesario la instanciación de la clase externa.
        * Ejemplo:
        * StaticNestedClass staticNestedObject = new StaticNestedClass();
        * staticNestedObject.accessMembers(outerObject); //referencia de objeto
        *
        **** CLASES INTERNAS/ANIDADA-NESTED -> SE DIVIDEN EN DOS
        *
        *** CLASES LOCALES A UN MÉTODO ----- CLASES INTERNAS ANÓNIMAS
        *
        ** CLASES LOCALES A UN MÉTODO -> Clases definidas dentro de un método
        * Se puede definir una clase local, detro de un método, un blucle FOR o una cláusula IF
        * Para que una clase local pueda acceder a las variables declaradas en los métodos,bucle o cláusula,
        * estas variables deben ser declaradas con la palabra reservada "final"
        * A partir de Java 8, se pueden acceder a los parámetros del método
        * No pueden definir ni declarar miembros estáticos
        * Sólo puede declarar variables estáticas, si también son final
        * Para acceder a un miembro de la clase externa el miembro debe ser estático y el método donde se encuentra
        * la clase también debe ser estático.
        * No se pueden declarar interfaces, porque estas son estáticas
        *
        *
        ** CLASES INTERNAS ANÓNIMAS ->
        * Permiten hacer el código más conciso, es decir, declarar e instanciar una clase al mismo tiempo
        * Son iguales a las clases locales, excepto que no tienen nombre
        * Usar -> cuándo sólo se necesita usar una vez
        *
        *
        * PORQUE USAR CLASES ANIDADAS:
        * Forma de agrupar lógicamente clases que tienen relación
        * Aumenta la encapsulación
        * Hace el código más legible y mantenible
        *
        * TOP-LEVEL-CLASS
        * Se puede acceder desde otra clase diferente a los miembros de la clase Outer
        * Recibiendo una referencia de objeto
        * public class TopLevelClass {

            void accessMembers(OuterClass outer) {
                // Compiler error: Cannot make a static reference to the non-static
                //     field OuterClass.outerField
                // System.out.println(OuterClass.outerField);
                System.out.println(outer.outerField);
                System.out.println(OuterClass.staticOuterField);
            }}
            *
         */

        // Ejemplo clases anidadas en la Clase Doctor

        // Se añade al objeto myDoctor, los elementos de la lista de tipo AvailableAppointment
        myDoctor.addAvailableAppointment(new Date(), "4:00 pm");
        myDoctor.addAvailableAppointment(new Date(), "5:00 pm");
        myDoctor.addAvailableAppointment(new Date(), "6:00 pm");

        //Para imprimir los datos de la lista que corresponden al objeto myDoctor
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        //Ejemplo de clase local en la clase Patient
        //Se añaden los objetos patient a la lista de patient
        addPatient(patient2);
        addPatient(patient3);
        addPatient(patient4);

        for (Patient p : getPatients()) {
            System.out.println(p.getName() + "\n");
        }

        patient2.setPhoneNumber("645-254-5260");


    }

    //Se crea lista para almacenar los pacientes
    public static ArrayList<Patient> patients = new ArrayList<>();
    // Método que añade a la lista los pacientes
    public static void addPatient(Patient patient){
        //Se instancia un objeto de tipo Patient y se añade a la lista
        patients.add(new Patient(patient.getName(),patient.getEmail()));
    }

    //Método que retorna la lista de objetos de tipo Patient
    public static ArrayList<Patient> getPatients(){
        return patients;
    }
}
