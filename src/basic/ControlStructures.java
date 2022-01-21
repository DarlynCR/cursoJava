package basic;

import java.util.Scanner;

public class ControlStructures {

    // variable global para el ejemplo de la sentencia while
    static boolean isTurnOnLight = false;

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


        // ESTRUCTURAS REPETITIVAS - BUCLES

        /*BUCLE WHILE

        Estructura do-while:
        *Se ejecutan primero las instrucciones, hasta que la condición no se cumpla,
        la diferencia con el while, es que sus instrucciones se ejecutan al menos 1 vez.

        do {
            //instrucciones
        } while (condición);

        Estructura while:
        *Mientras que la condición se cumpla, se ejecutan las instrucciones

        while (condición) {
            //instrucciones
        }

        * */

        // Ejemplo do-while

        int response = 0;

        do {
            System.out.println("Selecciona la opción deseada:");
            System.out.println("1.Movies");
            System.out.println("2.Series");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while (response != 0);

        System.out.println("Se terminó el programa");


        //Ejemplo while
        turnOnOffLight();

        /*if (isTurnOnLight) {
            printSOS();
        }*/

        int i = 1;
        System.out.println("Impresión bucle WHILE:");
        while (isTurnOnLight && i <=10){
            printSOS();
            i++; // Se ejecutará 10 veces, se pone contador dependiendo del escenario
        }

      /*BUCLE FOR
        for (inicialización; condición; incremento){
            //instrucciones
        }
       Mientras la condición se cumpla el for seguirá iterando.
       Una forma más sencilla de hacer el while
      **/
        System.out.println("Impresión bucle FOR:");
        for (int j = 1; j <= 10; j++) {
            printSOS();
        }

        /*SENTENCIA FOREACH
        *Estructura:
            for (tipoDato Elemento : colección){
                //instruccciones
            }

        *No se tiene control de i, el for itera y asigna el valor del elemento
        * */

        String[] androidVersions = new String[17];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println("impresión BUCLE FOREACH");

        for (String k: androidVersions) {
            System.out.println(k);
        }

    }

    public static void printSOS(){ // Función para el ejemplo de la sentencia While
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
      /*  if (isTurnOnLight){
            isTurnOnLight = false;
        }else{
            isTurnOnLight = true;
        }*/

        // OPERADOR TERNEARIO -> en vez del if anterior
        // Cuando a una misma variable se le realizan varias asignaciones en un IF
        //  variable = (condición)?valorRegresoIF:valordeRegresoELSE;

        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;

    }


}
