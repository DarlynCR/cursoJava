package initializationblocks;

public class Person {

    private String name;
    private final int idPerson; // Se deben inicializar en bloques dinámicos
    private static int countPerson; //se deben inicializar en bloques estáticos

    // Cuando se declaran variables que no se inicializan en compilación
    // Se deben inicializar por medio de los bloques de inicialización
    //bloque se código de inicialización estático
    //Se ejecuta antes del constructor de la clase y que el bloque dinámico
    //Se ejecuta una sola vez -> en la primera instanciación de la clase
    static {
        System.out.println("Ejecución bloque estatic");
        //No se tienen acceso al operador "this"
        //No se pueden inicializar una variable no estática desde un bloque estático -> idPerson
        ++Person.countPerson;
    }

    //Se ejecuta antes del constructor de la clase y después del bloque estático
    // Se ejecuta cada vez que se instancie un objeto de la clase
    {
        System.out.println("Ejecución de bloque no estático/dinamico");
        //Aquí si tenemos acceso al operador "this"
        //Se pueden inicializar las variables no estáticas
        this.idPerson = Person.countPerson;
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Ejecución bloque constructor");
    }
}
