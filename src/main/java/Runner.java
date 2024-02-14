import Garage.land.Car;
import Garage.engine.CombustionEngine;
import Garage.engine.ElectricEngine;
import Garage.engine.IEngine;

public class Runner {

    public static void main(String[] args) {
        IEngine combustionEngine = new CombustionEngine(99, "01/01/2024");
        Car hondaJazz = new Car(1300, 100, "Hatchback",combustionEngine );
        System.out.println(hondaJazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(199, 100);
        hondaJazz.setEngine(electricEngine);
        System.out.println(hondaJazz.getHorsePower());
    }

}
