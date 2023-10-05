package Classes;

import java.awt.*;

public class Pickup extends Car implements iRefueling {
    @Override
    public void fuel() {

    }

    private int loadCapacity;

    public Pickup(String make,
                  String model,
                  Color color,
                  int numberWheels,
                  TypeFuel fuel,
                  TypeGearbox gearbox,
                  float engineCap,
                  int loadCapacity) {
        super(make, model, color, TypeCar.PICKUP, numberWheels, fuel, gearbox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


}
