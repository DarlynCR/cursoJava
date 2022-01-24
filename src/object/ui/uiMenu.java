package object.ui;


import java.util.Scanner;

public class uiMenu {

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
            System.out.println("1.Consultar Doctor");
            System.out.println("2.Regresar");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Consultar");
                    break;
                case 2:
                    showMenuGeneral();
            }
        }while (response != 0);

    }
}
