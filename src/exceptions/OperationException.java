package exceptions;

//creación de nuestra propia clase de excepción
public class OperationException extends Exception{

    //Propagar el mensaje a mostrar hacia la clase padre
    public OperationException(String mn){
        //mensaje de la excepcion mn
        super(mn); //Se propaga hacia la superclase

    }
}
