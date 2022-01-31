package initializationblocks;

public class Main {
    public static void main(String[] args) {
        //El bloque estático solo se ejecuta en la primera instanciación
        Person person = new Person("Sergio");
        //El bloque dinámico se ejecuta primero que el constructor
        Person person1 = new Person("Darlyn");
        Person person2 = new Person("Andres");

    }
}
