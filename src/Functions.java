public class Functions {

    // La declaración de las funciones deben realizarse a nivel de la clase

    public static void main(String[] args) {

        double y = 3;
        System.out.println("Área de un círculo: " + circleArea(y));

    }
    //Para documentar en javadoc me posiciono en en la línea superior de código que quiero documentar
    //
    /**
     * Descripción: Función que cácula el área de un círculo.
     * @param r Radio del círculo.
     * @return Devuelve el área del círculo.
     * */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /*Javadoc
    * Nos ayuda a comprender que hace el código
    * Genera documentación en HTML
    * COMENTARIOS
    * // Comentario 1 sóla línea -> es ignorado por javadoc
    * /* comentario multiples líneas*/  /*->es ignorado por javadoc
    * /** */ /*-> comentario de javadoc
    * */
}

