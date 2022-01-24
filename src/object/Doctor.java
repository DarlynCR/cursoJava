package object;

public class Doctor {

    // Propiedades
    int id;
    String name;
    String speciality;
    static int numberIncrement =0;
    //Método constructor
    Doctor(String name){
        this.name = name;
        System.out.println("Construyendo el objeto Doctor - constructor 1");
        id = ++numberIncrement;
    }
    //Método constructor que recibe 2 parámetros
    Doctor(String name,String speciality){
        this.name = name;
        this.speciality = speciality;
        System.out.println("Construyendo el objeto Doctor - constructor 2");
        id = ++numberIncrement;
    }

    // Métodos - comportamientos
    public void showName(){
        System.out.println("Nombre del Doctor: " + this.name);
    }

    public void showId(){
        System.out.println("Id: " + this.id);
    }

}
