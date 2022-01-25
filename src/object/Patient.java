package object;

public class Patient {

    // Private. Acceso sólo al nivel de la clase
    private String name;
    private String email;
    private String address;
    private String blood;
    private double weigth;
    private double heigth;

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
}
