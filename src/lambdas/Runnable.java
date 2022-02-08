package lambdas;
@FunctionalInterface
//Esta anotación no es necesaria realizarla, sin embargo, si la ponemos, al declarar la interfaz
//Identificamos más rapido que es funcional
//Ejemplo de interfaz funcional
public interface Runnable {
    // contienen un solo método abstracto
    public abstract void run();

    // Puede contener más métodos ya sean default o estatic
    //Pero sólo puede tener uno abstracto
    public default void methDefault(){
        System.out.println("Método default de la interfaz Runnable");
    }
}