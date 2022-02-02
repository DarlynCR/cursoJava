package generics;

import java.util.List;

//Clase que recibe un atributo de tipo genérico - T
// <T1, T2, .... Tn> -> Variables de tipo
// Una clase puede tener varios parametros de tipo

public class Generic<T> {

   private T object;


    public Generic(T object) {
        this.object = object;
    }

    public void showType(){
        //Se muestra el nombre del tipo de la clase que recibe el constructor
        // al instanciarse la clase Generic
        System.out.println("El tipo T es: " + object.getClass().getSimpleName());
    }

}
