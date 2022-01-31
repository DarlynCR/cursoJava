package enums;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {


    public static void main(String[] args) {
        /*ENUMNS
        * Palabra reservada -> enum
        * Objetos con Valores constantes
        * Limitan la creación de objetos a los que se específican en la clase
        * Podemos agregar estados y comportamientos a cada objeto
        *
        *
        * */
        //Acceder a una constante del enum
        System.out.println(Days.MONDAY);
        dayWeek(Days.MONDAY);
        //acceder a los atributos de cada valor constante del enum
        System.out.println( Continents.AFRICA.getCountries());




        /*VARARGS
        * Argumentos variables -> cuando no sabemos cuantos argumentos se van a recibir en un método
        * El argumento variable debe ser el último argumento en el método -> si va a recibir más parámetros
        * Una vez recibido el vararg en el método, dentro del mismo, es tratado como un arreglo
        * sintaxis -> tipoDato... nombreVariable
         */
        //Al llamar al método se pueden pasar una cantidad de arg variables
        showNumbers(1,5,3,4);
        showNumbers(2,5);

        //Método que recibe un vararg y otro parámetro
        showVararg("Sergio", 1, 2, 3);
        showVararg("Darlyn", 1, 23);
    }



    public static void dayWeek(Days day){
        switch (day){
            //Puedo acceder al valor de las contantes definidas en el enum
            case SUNDAY:
                System.out.println("Primer día de la semana");
                break;
            case MONDAY:
                System.out.println("Segundo día de la semana");
        }
    }

    //Ejemplo de vararg
    public static void showNumbers(int... numbers){
        //Una vez recibido el argumento, es tratado como un arreglo
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemento: " + numbers[i]);
        }
    }

    //El parámetro vararg debe ser el último al recibir en el método
    public static void showVararg(String name, int... numbers){
        System.out.println("Nombre: " +  name);
        //Se imprimen los numeros con el método showNumbers
        showNumbers(numbers);
    }

}
