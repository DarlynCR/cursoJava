package exceptions;

public class Arithmetic {
    //Posiblemente se genere una axcepción -
    //En el método se debe indicar esto -> mediante la palabra reservada "throws" y la clase de excepción
    public static int division(int numerator, int denominator) throws OperationException{
        //Si la clase de excepcion hereda de RunTimeException el compilador no obliga
        //a tratar este tipo de excepciones, por lo que no es necesario agregarlo a la firma del método

        if( denominator == 0){
            System.out.println("Ha ocurrido un error: ");
            // La palabra reservada indica que se debe lanzar un tipo de excepción
            //Se instancia la clase de excepción y se pasa el mensaje a mostrar que recibe el constructor
            throw new OperationException("División entre 0");
        }

        // valor de retorno, si el valor no es igual a 0
        return numerator/denominator;
    }
}
