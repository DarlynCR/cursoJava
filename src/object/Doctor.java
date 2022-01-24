package object;

public class Doctor {

    // Propiedades
    static int id = 0; //Autoincrementable
    String name;
    String speciality;
    static int valor =0;
    //Método constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    // Métodos - comportamientos
    public void showName(){
        System.out.println(name);
    }

}
