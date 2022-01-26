package inheritance;

// Para el método clone() de la clase Object -> 1. la clase debe implementar la interface Cloneable
public class Book implements Cloneable {
    //Se declara la variable de código para el libro
    public String ISBN;
    //Se declara el contructor
    public Book(String ISBN) {
        this.ISBN = ISBN;
    }
    //Getter de la variable ISBN
    public String getISBN() {
            return ISBN;
    }
    //Se sobreescribe el método iquals de la clase Object
    public boolean equals(Object obj) {
        //Como no sé que tipo de objeto voy a recibir para comparar, por eso se usa Object
        if (obj instanceof Book) //instanceOf valida si el objeto que se recibe es una instancia de Book
            //Comparación como tal del objeto en sus propiedades -> equals - de la clase String
            //Como ya sé que es una instancia de Book, primero casteo el objeto, para poder acceder al getter
            return ISBN.equals(  ( (Book) obj ).getISBN() );//Si la clase tiene más propiedades, se debe
            // hacer la validación por cada propiedad que desee confirmar para comparar los objetos- dependiendo de la lógica de negocio
        else
            return false;
    }

    //Después de implementar la interface Cloneable en la clase, -> 2. se debe sobreescribir el método clone()
    // de la siguiente manera:
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
