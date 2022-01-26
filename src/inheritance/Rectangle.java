package inheritance;
//Subclase que hereda de la clase abstracta
class Rectangle extends GraphicObject {

    //se le da la implementación a los métodos abstractos de la clase abstracta
    void draw() {
        System.out.println("Método sobreescrito draw de la clase abstracta");
    }
    void resize() {
        System.out.println("Método sobreescrito resize de la clase abstracta");
    }
}