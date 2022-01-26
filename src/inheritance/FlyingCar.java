package inheritance;

interface OperateCar {
    //Método predeterminado de la interfaz OperateCar
    default public int startEngine(Object key) {
        return 0;
    }
}

interface FlyCar {
    //Método predeterminado de la interfaz FlyCar
    default public int startEngine(Object key) {
        return 1;
    }
}

public class FlyingCar implements OperateCar, FlyCar {
        //Método que sobreescribe el método predeterminado de las interfaces
        public int startEngine(Object key) {
            //Llamado del método de cada una de las interfaces
            FlyCar.super.startEngine(key);
            OperateCar.super.startEngine(key);
            return 2;
        }
    }

