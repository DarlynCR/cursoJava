package basic;

public class Variables {

    public static void main(String[] args) {
        /* Convensiones:
         - Java es sensible a mayúsculas y minúsculas
         - Se deben comenzar los nombres de las variables con una letra, $ "_"
         - Usar Lower Camel Case para su declaración
         - Letras posteriores pueden ser $ "_"
         - Las constantes se escriben en mayúscula y contienen "_" como separación*/

       /*Declaración: tipoDato nombreVariable = valor; se inicializa la variable
        A partir de Java 10, se infieren los tipos de datos, se imite el keyWord   de tipo de dato y se utiliza var, el cual
        se puede utilizar sólo para métodos, contructores y bloques de inicialización.
        */

        int number = 15;
        // Java 10 en adelante
        var number2 = 20;

        // Declaración: Tipo de dato nombreVariable; se inicializa posteriormente

        String name;
        name = "Sergio";

        System.out.println(number + " " + name);

        /* Tipos de datos y bytes en memoria:
        - byte: 1 byte
        - short: 2 bytes
        - long: 8 bytes - L al final
        - int: 4 bytes
        Datos con punto decimal:
        - float: 4 bytes - F al final
        - double: 8 bytes Cuando queremos más presición
        Datos de texto:
        - char: 2 bytes 'a'
        Datos lógicos:
        - boolean: 2 bytes
        */


        /*OPERADORES ASIGNACIÓN
         - += -> a += b -> a = a + b
         - -= -> a -= b -> a = a - b
         - *= -> a *= b -> a = a * b
         - /= -> a /= b -> a = a / b
         - %= -> a %= b -> a = a % b

         OPERADORES INCREMENTO / DECREMENTO

         ++ -> incremento -> i++ -> i = i + 1
         -- -> decremento -> i-- -> i = i - 1

         PREFIJO Y POSTFIJO
         ++i ->
         i++ ->
         */

        int lives = 5;
        lives--; // 4 Decremento Postfijo
        lives++; // 5 Incremento Postfijo

        int gift = 100 + lives++; // 105 postfijo, se accede primero al valor de la variable y después la incrementa
        int gift2 = 100 + ++lives; //107 prefijo, se incrementa primero y luego se accede al valor de la variable

        System.out.println(gift);
        System.out.println(gift2);


        /*Casteo de variables*/

        int a = 10;
        int b = 30;
        System.out.println((double) a/b); //casteo forzado

        double c = a/b; // casteo automático
        char n = '1';
        int nI = n; // casteo automático

        System.out.println(nI);

        //PASO DE ARGUMENTOS
        //
        // Paso por valor -> Sólo se da en tipos de datos primitivos
        /* En el paso de valores en los métodos, se recibe en el método una copia del valor
        * Ya dentro del método estaremos trabajando con una copia del valor del arg recibido
        *
        * Paso por referencia -> Se da en objetos
        * Las variables de tipo object -> almacenan la referencia
        * En el paso de objetos en los métodos se pasa la referencia del mismo
        * En este caso, ya dentro del método si se podrán modificar los valores del objeto
        *
        * */

    }
}
