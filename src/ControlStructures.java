public class ControlStructures {

    public static void main(String[] args) {
        /*Sentencia if
        * if (condición) { instrucciones }
        * if (condición) {
            instrucciones
          }else{
          instrucciones}

        * Scope - alcance de la variable */

        boolean isBluetoothEnable = true;


        if (isBluetoothEnable){
            int fileSended = 3; // Scope limitado a las {}
            fileSended++;
            System.out.println("Archivo enviado");
        }

        // Ejemplo con Else

        int fileSended1 = 3;

        if (isBluetoothEnable){
            fileSended1++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("No se pudo enviar el archivo");
        }

        /*OPERADORES DE EQUIDAD
        * == -> Igualdad
        * != -> Desigualdad*/


    }
}
