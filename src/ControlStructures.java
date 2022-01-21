public class ControlStructures {

    public static void main(String[] args) {

        // ESTRUCTURAS CONDICIONALES

        /*SENTENCIA IF
        * if (condición) { instrucciones }
        * if (condición) {
            instrucciones
          }else{
          instrucciones}

        * Scope - alcance de la variable */

        boolean isBluetoothEnable = false; // Scope - limitado al método main

        // Ejemplo if simple
        if (isBluetoothEnable){
            int fileSended = 3; // Scope limitado a las {} de la sentencia if
            fileSended++;
            System.out.println("Archivo enviado");
        }

        // Ejemplo if con Else

        int fileSended1 = 3;

        if (isBluetoothEnable){
            fileSended1++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("No se pudo enviar el archivo");
        }

        /*OPERADORES DE EQUIDAD -> resultado booleano
        * == -> Igualdad -> a == b
        * != -> Desigualdad -> a != b

        * OPERADORES RELACIONALES
        * < -> Menor que -> a < b
        * > -> Mayor que -> a > b
        * <= -> Menor o igual que -> a <= b
        * >= -> Mayor o igual que -> a >= b

        * OPERADORES LÓGICOS
        * && -> AND -> a && b -> Resultado V : a y b son V -> Resultado F : a o b son F
        * || -> OR -> a || b -> Resultado F : a y b son F -> Resultado V : a o b son F o V
        * ! -> NOT -> !a -> Resultado F : si es V -> Resultado V : si es F
        */

        int a = 8;
        int b = 5;

        // Ejemplo operadores de equidad
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente a b? -> " + (a != b));

        // Ejemplo operadores relacionales
        System.out.println("a es menor a b? -> " + (a < b));
        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es menor o igual a b? -> " + (a <= b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));

        /*IF ANIDADOS
          if (condición) {
            instrucciones
          } else if (condición) {
            instrucciones
          } else {
            instrucciones
          }
        * */

        if (a == b){
            System.out.println("a es igual b");
        }else if (a != b){ // Si se cumple la condición, se sale de la sentencia y no sigue evaluando
            System.out.println("a es diferente de b ");
        }else if (a < b){
            System.out.println("a es menor que b ");
        }else if ( (a > b) && (a != b) ){ // Ejemplo con operadores lógicos Resultado V
            System.out.println("a es mayor que b y diferente de b");
        }


        /* SENTENCIA SWITCH hasta Versión 11 Java
            switch (a) {
                case valor1:
                    break;
                case valor2:
                    break;
                default:
                    break;
             }
        * */

        /* SENTENCIA SWITCH a partir de la Versión 12 Java
            switch (a) {
                case valor1 ->   ;
                case valor2 ->   ;
                case valor3 ->   ;
                case valor4 ->   ;
                default -> "N/A" ;
            };
            Está en Beta aún, deshabilitado por defecto
        * */

        String colorModeSelected = "Dark";

        switch (colorModeSelected){

            case "Light":
                System.out.println("Se seleccionó el modo Light");
                break;
            case "Night":
                System.out.println("Se seleccionó el modo Night");
                break;
            case "Dark":
                System.out.println("Se seleccionó el modo Dark");
                break;
            case "Blue Dark":
                System.out.println("Se seleccionó el modo Blue Dark");
                break;
            default:
                System.out.println("Selecciona una opción correcta");
        }



    }
}
