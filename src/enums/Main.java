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
    };
}
