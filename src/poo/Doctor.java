package poo;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    // Propiedades/Atributos
    private int id; // valor por defecto 0
    private String name; // Valor por defecto null
    private String speciality; // Valor por defecto null
    private String email;

    static int numberIncrement =0;
    //Método constructor
    Doctor(String name){
        this.name = name;
        System.out.println("Construyendo el objeto Doctor - constructor 1");
        id = ++numberIncrement;
    }
    //Método constructor que recibe 2 parámetros
    /*SOBRECARGA DE MÉTODOS O CONTRUCTORES
    * Métodos: Cuando se necesita que el método tenga el mismo nombre, con diferentes argumentos
    * diferente valor de retorno, diferente tipos de datos en los argumentos...
    * Constructores: Métodos por defecto que nos sirven para inicializar los objetos
    * */

    //Sobrecarga de método constructor
    Doctor(String name,String speciality){
        //this. hace referencia a todos los elementos que componen la clase - this.elementoRequerido
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

    // Métodos getter y setter de las propiedades de la clase
    //Get- Usado para acceder a la propiedad
    public int getId() {
        return id;
    }

    //Set - Usado para modificar la propiedad
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static int getNumberIncrement() {
        return numberIncrement;
    }

    public static void setNumberIncrement(int numberIncrement) {
        Doctor.numberIncrement = numberIncrement;
    }

    // Se instancia un objeto de tipo ArrayList para guardar los objetos de tipo AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Método que añade a la lista los objetos de tipo AvailableAppointment
    public void addAvailableAppointment(Date date, String time){
        //Se instancia un objeto de tipo AvailableAppointment
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Método que retorna la lista de objetos de tipo AvailableAppointment
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
