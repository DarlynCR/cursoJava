package serializable;

public class Main {
    public static void main(String[] args) {
        //Serialización en java / JavaBeans
        /*Transformar un objeto en bits para ser guardado en un archivo para posteriormente ser leidos
        * Los tipos primitivos son serializable por defecto
        * String -> tambien es serializable por defecto
        * La clase que implementa la interfaz "Serializable", se vuelve de tipo serializable
        * siempre y cuando todos sus estados/atributos también sean de tipo "serializable"
        *
        * Caracteristicas
        * Constructor vacio
        * Atributos privados - con get y set asociados
        * implementar la interfaz serializable
        * ->
        * */

        //Ejemplo javaBeans
        // Para su instanciación lo común es que se cree con el constructor vacío
        Person person = new Person();
        //Para asignar los valores a los atributos, lo haremos con métodos set
        person.setName("Sergio");
        person.setApellido("Rodríguez");

        System.out.println(person.toString());

    }
}
