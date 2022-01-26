package inheritance;

//Ejemplo de MÉTODOS DE INTERFAZ
public class Dragon implements EggLayer, FireBreather {
    public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }

    @Override
    public String identifyMyself() {
        return EggLayer.super.identifyMyself();
    }
}

//Interfaz padre/supertipo
interface Animal {
    //Método predeterminado
    default public String identifyMyself() {
        return "I am an animal.";
    }
}

//Interfaz que hereda de la interfaz supertipo Animal
interface EggLayer extends Animal {
    //Tiene prioridad el método predeterminado sobreescrito
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}

interface FireBreather extends Animal {
    public String identifyMyself();
    //No se puede implementar dos o más interfaces que hayan sobreescrito el método
    // Predeterminado de la interfaz padre/supertipo
   /*default public String identifyMyself() {
        return "I am able to lay eggs.";
    }*/
}
