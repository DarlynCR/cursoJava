package object;

import java.util.ArrayList;
import java.util.Date;

public class Patient {

    // Private. Acceso sólo al nivel de la clase
    private String name;
    private String email;
    private String address;
    private String blood;
    private double weigth;
    private double heigth;
    private String phoneNumber;
    //Expresión regular para validar el número teléfonico
    //Se puede acceder a esta variable desde la clase local, debido a que esta está declarada como "static"
    static String regularExpression = "[^0-9]";


    //Encapsulamiento
    /*Nivel de acceso a las variables
    * Modificadores de acceso: niveles de acceso
    * public - clase, package, subclase, otros
    * protected - clase, package, subclase
    * default - clase, package
    * private - clase
    * */

    //Constructor
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    //Acceso a los atributos sin tocarlos directamente
    /* GETTERS Y SETTERS
    Permiten la visulización y modificación de las propiedades encapsuladas
    GETTER- Obtener dato de la variable -convención - getNombreVariable()
    SETTER- Modificar dato de la variable - convención - setNombreVariable()
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    // Puedo modificar los getters y los setters dependiendo de la lógica de negocio
    public String getWeigth() {
        return weigth + " Kg.";
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getHeigth() {
        return heigth + " Mts.";
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    //Seteo del número teléfonico, y ejemplo de clase anidada local
    public void setPhoneNumber(String phoneNumber) {
        //Variable local al método declarado
        final int numberLength = 10;
        //Valido desde JDK 8 y posteriores

        //Clase local
        class PhoneNumber{
            //Variable declarada para retornar el número telefónico formateado
            String formattedPhoneNumber = null;

            //Método constructor de la clase local
            PhoneNumber(String phoneNumber){
                //Variable donde se alamacena el número sin caracteres especiales
                //Al ser phoneNumber un tipo de dato String, se puede acceder al método repleaceAll de la clase String
                // el cual recibe una expresión regular declarada en la clase exterior
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                //Se puede acceder a la variable numberLength declarada en el método envolvente
                // ya que esta está declarada como "final"
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
        } //finaliza la clase local

        //Se instancia la clase local dentro del método y se pasa al contructor el parámetro
        //phoneNumber recibido en el método setPhoneNUmber
        PhoneNumber myNumber = new PhoneNumber(phoneNumber);

        //Se valida el objeto MyNumber
        if (myNumber.getNumber() == null)
            System.out.println("El número ingresado es invalido");
        else
            //Se asigna el número validado en la clase Patient
            this.phoneNumber = myNumber.getNumber();
            System.out.println("El número ingresado es: " + myNumber.getNumber());

    } //Finaliza el método




}
