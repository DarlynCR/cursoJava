package poo;

public class Bicycle {

    // Variables conocidas como variables de instancia
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    // Variable conocida como variable de clase
    // En este caso se utiliza static para volver la variable de clase
    // Para acceder a ella se recomienda mediante un método estatic
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // Incrementa el número de bicicletas
        // y se adigan un ID
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    // Los métodos de instancia pueden acceder a variables de clase y métodos de clase
    public int getID() {
        return id;
    }
    // Desde el método estatico no se puede acceder a métodos o variables de instancia
    // Para acceder a variables estaticas o de clase, se debe hacer mediante método estático o de clase
    public static int getNumberOfBicycles(){
        //Sólo se puede acceder desde los métodos de clase a los métodos o variables de instancia
        //Mediante una referencia a un objeto, ejemplo:
        //No se puede usar "this" ya que no existe una referencia.
        Bicycle myBicycle = new Bicycle(52,25,45);
        myBicycle.getID();
        return numberOfBicycles;
    }
}
