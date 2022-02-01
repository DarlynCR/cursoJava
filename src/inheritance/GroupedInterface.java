package inheritance;

//Extends para heredar de otras interfaces, si son varias se separan con ","
public interface GroupedInterface { //extends Interface1, Interface1, Interface3 // antes del {

        // Declaraciones de contantes
        // No se pueden dejar atributos sin valores

        // todos son por defecto public, static y final, por lo cual se pueden omitir estos modificadores
        double E = 2.718282;

        //Asignación de métodos abstractos -> sin implementación
        // Puede contener métodos abstractos (abstract/sinModificador, predeterminados (default) y estáticos (static)
        // Todos son por defecto public y abstract
        void doSomething (int i, double x);
        int doSomethingElse(String s);

        // para implementar se usa la palabra reservada -> "implements"
        // Las clases que implementen la interface, están obligados a darle implementación
        // a todos los métodos de la interface -> @override
        // Las clases abstractas no están obligadas a darle implementación
}
