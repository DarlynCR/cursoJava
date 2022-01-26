package inheritance;
//Ejemplo de clase abstracta
abstract class GraphicObject {
    int x, y;

    //Método con implementación que comparten las subclases si no se sobreescribe
    void moveTo(int newX, int newY) {
        System.out.println(newX + newY);
    }

    //métodos abstractos definidos, a los cuales se les deberá dar implementación
    //En las subclases de la clase abstracta
    abstract void draw();
    abstract void resize();
}