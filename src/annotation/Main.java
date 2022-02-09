package annotation;

import java.lang.annotation.*;

//Ejemplo de uso de anotación personalizada
// @ClassPreamble archivo
@ClassPreamble (
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class Main {

    public static void main(String[] args) {
        /*Anotaciones
        * Son una forma de metadados, que proporcionan datos sobre un programa, pero
        * no es parte del programa en sí. Estas anotaciones no tienen un efecto directo en el código
        * Usos:
        * Información para el compilador
        * Procesamiento en tiempo de compliación e implementación y algunas en ejecución
        *
        * Formato:
        * @NombreAnotación
        *
        * Pueden ser:
        * @Override
        * @SuppressWarnings(value = "unchecked") -> pueden contener elementos
        * Si sólo contiene un elemento -> se puede omitir el nombre del elemento -> ej value
        * Si no tiene elementos se pueden omitir los parentesis -> @Override
        * Se pueden usar varias anotaciones en la misma declaración
        * Anotación repetida -> cuando hay varias anotaciones del mismo tipo -> A partir de Java 8
        *
        * Donde se pueden usar:
        * Declaraciones de clases
        * campos
        * Métodos
        * otros elementos del programa
        * al lado de cualquier tipo de dato -> a partir de Java 8
        *
        * @Documented -> Para que aparezcan estas anotaciones en la documentación de JavaDoc
        * java.lang, tiene las siguientes anotaciones:
        * @Deprecate -> Elemento marcado en desuso
        * A partir de java 9 -> recibe un parámetro : forRemoval, que tiene valores true y false
        * true -> Se va a eliminar en una próxima versión
        * false -> No se va a eliminar en una próxima versión
        * @Override -> Anular un elemento declarado en una superclase
        * @SuppressWarnings -> Suprimir advertencias especificas que se podrían generar si no se suprimen
        * valores que recibe:
        * unchecked -> Cuando se interactua código legacy antes de los genéricos
        * deprecation -> Para utilizar un elemento deprecate
        *
        *
        * En JavaDoc -> las anotaciones dentro de los comentarios de javadoc comienzan en minuscula
        * Ej @deprecate -> si quiero documentar que el elemento está en desuso
        *
        * Otras anotaciones:
        * @SafeVarargs -> Se aplica a un método o constructor y afirma que el código no realiza operaciones
        * potencialmente inseguras en su parámetro varargs
        *
        * @FunctionalInterface -> indica que la declaración de tipo pretende ser una interfaz funcional
        *
         */




    }
}
