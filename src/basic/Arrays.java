package basic;

public class Arrays {

    public static void main(String[] args) {

        //Array -> Agrupación de variables
        //Su uso se da de acuerdo a la lógica de negocio.

        String[] androidVersions = new String[17];//Se deberá definir el tamaño del arreglo
        String days[] = new String[7];// No es variable su tamaño. Arreglo de 1 dimensión


        /* Arreglo de dos dimensiones
        +--------------------+
        |Country | city      |
        ----------------------
        |México   | México   |
        |Colombia | Bogotá   |
        |Chile    | Santiago |
        |Brazil   | Brasilia |
        ----------------------
        * */

        String[][] cities = new String[4][2]; //dimensión de 8 elementos 4*2=8


        /* Arreglo de 3 dimensiones, en términos prácticos estos elementos deben tratarse desde una BD
        * Los arreglos al ser colecciones de datos, la convención de los nombre debe ser en plural
        * Índice -> Manera de identificar la posición de un elemento en el arreglo, inician en 0 hasta n-1
        * unidad de medica de un índice -> n-1
        * Arreglo 5 elementos: inicia en 0 hasta n-1 -> n=5 -> 5-1 -> inicia en 0 hasta 4.
        * */

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers2 = new int [2][2][2][2]; //Arreglo de 4 dimensiones

        /*Asignación de valores en basic.Arrays
        * nombreVariable[indice] = valor;
        * */
        System.out.println("Arreglo bidimensional:");

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]); // acceder a un dato del array

        cities[0][0] = "México";
        cities[0][1] = "México";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "Chile";
        cities[2][1] = "Santiago";

        System.out.println("Arreglo bidimensional:");

        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);

        String[][][][] animals = new String[2][3][2][2];

        animals[1][0][0][1] = "Changuito";

        System.out.println("Arreglo de 4 dimensiones:");

        System.out.println(animals[1][0][0][1]);

        // Recorrer un Array con un bucle FOR

        System.out.println("Impresión de arreglo con bucle FOR:");
        for (int i = 0; i < androidVersions.length ; i++) {
            System.out.println(androidVersions[i]);
            // IMPRIME null en las posiciones que no tienen asignado valor -> null es el valor por defecto para String
            // Para int -> valor por defecto 0
        }

        System.out.println("Impresión de arreglo bidimensional con bucle FOR:");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println("Impresión de arreglo de 4 dimensiones con bucle FOR:");
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        System.out.println("Impresión arreglo de 2 dimensiones con FOREACH:");
        for (String[] pair: cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }



    }
}
