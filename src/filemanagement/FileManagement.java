package filemanagement;

import java.io.File;
import java.io.*;
//Se importa la clase para la creación de archivos
// io -> paquete de input Output en java "*" importa to do

public class FileManagement {
    //Dependiendo de la acción que s evaya a realizar con el archivo, se crean los métodos
    //Método para crear un archivo en el disco duro
    //Recibe el archivo a crear
    public static void createFile(String nameFile) {
        //Se crea un objeto de tipo File en memoria
        //Se pasa el nombre del archivo que se recibe en el método
        File file = new File(nameFile);
        //Para guardarlo en el disco duro se debe hacer lo siguiente
        //En caso de que no se pueda crear el archivo se va lanzar una excepción
        try {
            //se pasa el objeto file creado
            // el contructor de la clase PrintWriter genera una excepción
            // de tipo checkException
            PrintWriter out = new PrintWriter(file);
            //fileNotFoundException -> tipo de excepción que se genera en el try
            //para guardar el archivo en memoria se debe cerrar el flujo que se abrio
            //se crea el archivo en el disco duro
            out.close();
            System.out.println("Se ha creado el archivo " + nameFile);
        } catch (FileNotFoundException ex) {
            //se imprime en la consola la pila de excepciones
            ex.printStackTrace(System.out);
        }
    }

    //Método para escribir en el archivo
    //Recibe el nombre del archivo y el contenido del mismo
    public static void writerFile(String nameFile, String content) {
        // se crea el objeto de file
        File file = new File(nameFile); //Si detecte que ya existe el archivo, usa el existente, sino no lo crea
        try {
            PrintWriter out = new PrintWriter(file);
            // se llama la función println y se pasa el contenido
            out.println(content);
            out.close();
            System.out.println("Se ha escrito el mensaje en el archivo " + nameFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Método que abre el archivo se posiciona en la última línea y copia el contenido que se le pase
    public static void appendFile(String nameFile, String content) {

        File file = new File(nameFile);

        try {
            // Se crea el objeto FileWriter que recibe el nombre del archivo y si se anexa la información o no -> true
            // la creación de este objeto genera una nueva excepción por lo cual se debe añadir otro catch
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            // se llama la función println y se pasa el contenido
            out.println(content);
            out.close();
            System.out.println("Se ha anexado nueva en el archivo " + nameFile);
        } catch (FileNotFoundException ex) { // Excepción de la clase PrintWriter
            ex.printStackTrace(System.out);
        } catch (IOException ex) { //Excepción de la clase FileWriter
            ex.printStackTrace(System.out);
        }
    }

    //Método para leer información del archivo
    public static void readFile(String nameFile) {
        //abrimos el archivo+
        // se puede declarar con var , y se infiere el tipo de dato de File
        File file1 = new File(nameFile);
        // Leer información de un archivo -> con la declaración de la variable BufferedReader
        // Podemos leer lineas completas del archivo, al ir almacenando caracter por caracter
        // FileReader no lee lineas completas
        // Se envuelve el objeto FileReader en BufferedReader que si puede leer lineas completas
        try {
            BufferedReader input = new BufferedReader(new FileReader(file1));
            //Variable que almacena cada linea que se va leyendo
            var read = input.readLine();
            //Mientras que read sea diferente de null ejecutese
            while (read != null) {
                //Se muestra en consola el contenido de la linea que se almacena en la variable
                System.out.println("Lectura: " + read);
                // continue leyendo la siguiente linea y asigne el valor a la variable read
                read = input.readLine();
            }
            //Se cierra el archivo
            input.close();
        } catch (FileNotFoundException ex) { //Excepción de la clase BufferedReader
            ex.printStackTrace();
        } catch (IOException e) { //Excepción del método readLine
            e.printStackTrace();
        }

    }

}


