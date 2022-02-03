package generics;

import java.util.List;

//Clase que recibe un atributo de tipo genérico - T
// <T1, T2, .... Tn> -> Variables de tipo
// Una clase puede tener varios parametros de tipo

public class Generic<T> {
    //Cuando es la clase la que indica que recibe parámetros de tipo genérico
    // Estos parámetros se pueden usar dentro de los miembros de la clase

   private T object;

    // Este no es un constructor genérico, simplemente recibe el parámetro de tipo que implementa la clase
    public Generic(T object) {
        this.object = object;
    }

    public void showType(){
        //Se muestra el nombre del tipo de la clase que recibe el constructor
        // al instanciarse la clase Generic
        System.out.println("El tipo T es: " + object.getClass().getSimpleName());
    }

    //Que un método retorne un genérico no convierte al método en genérico, se debe indicar en el método que lo es
    //Ejemplo en la clase Util.java
    public T getObject() {
        return object;
    }
    //Que un método reciba como parámetro un genérico no convierte al método en genérico, se debe indicar en el método que lo es
    //Ejemplo en la clase Util.java
    public void setObject(T object) {
        this.object = object;
    }
}
