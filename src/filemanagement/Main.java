package filemanagement;

import static filemanagement.FileManagement.createFile;
import static filemanagement.FileManagement.*;
// se importan todos los métodos estáticos definidos en la clase FileManagement

public class Main {

    public static void main(String[] args) {
        /*Manejo de archivos en Java
        * Implica operaciones como, crear, guardar información en el archivo, eliminar información
        * eliminar el archivo...
        * */
        // se crea en la raíz del proyecto
        // se puede específicar una ruta en la variable
        // var nameFile = "ruta\nombrearchivo.extensión
        // C:\Users\iodac\IdeaProjects\cursoJava\prueba.txt
        var nameFile = "prueba.txt";
        //createFile(nameFile); ahora trabajamos los demás métodos sobre el archivo ya creado
        writerFile(nameFile, "Hola desde Java");
        //si queremos escribir más información, se vuelve a llamar al archivo
        writerFile(nameFile, "Nueva información con el método writerFile"); // Está sobreescribiendo la información anterior
        //Para anexar nueva información se crea otro método
        // Se usa el método appendFile para anexar información
        appendFile(nameFile, "Nueva información con el método appendFile");

        readFile(nameFile);
    }
}
