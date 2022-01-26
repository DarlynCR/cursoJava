package poo.ui;


import poo.Patient;

import java.util.Scanner;

import static poo.Main.getPatients;

public class uiMenu {

    //final: constante, su valor no puede cambiar, si se intenta hacer dará un error en tiempo de compilación.
    //Convención - NOMBRE_MAYUSCULA
    public static final String[] MONTHS ={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenuGeneral(){

        int response = 0;

        do{
            System.out.println("Bienvenido a su EPS");
            System.out.println("Por favor seleccione un rol:");
            System.out.println("1.Paciente");
            System.out.println("2.Doctor");
            System.out.println("3.Administrativo");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Menú del Paciente:");
                    showMenuPatient();
                    break;
                case 2:
                    System.out.println("Doctor");
                    break;
                case 3:
                    System.out.println("Administrador");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while (response != 0);

    }

    public static void showMenuPatient(){
        int response = 0;

        do{
            System.out.println("Por favor seleccione la opción:");
            System.out.println("1.Solicitar cita");
            System.out.println("2.Modificar número telefónico");
            System.out.println("3.Regresar");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Seleccione el mes requerido:");
                    for (int i = 0; i < MONTHS.length; i++) {
                        System.out.println(i+1 + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("Selecione el nombre del paciente:");
                    for (Patient p : getPatients()) {
                        System.out.println(p.getName() + "\n");
                    }


                    break;

                case 3:
                    showMenuGeneral();
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while (response != 0);

    }
}
