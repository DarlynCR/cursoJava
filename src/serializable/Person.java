package serializable;

// se importa la interfaz a implementar
import java.io.Serializable;

//Se implementa la interfaz
public class Person implements Serializable {

    //Requerido -> Deben ser atributos privados
    private String name, apellido;

    //Requerido -> Se agrega constructor vacio - publico
    public Person() {
    }

    // opcional - se sobrecarga el contructor, recibiendo los atributos paa su inicialización
    public Person(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    //Requerido -> agregar los getter y setter de los estados
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // OPCIONAL -
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
