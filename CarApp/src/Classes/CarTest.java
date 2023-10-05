package Classes;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.Test
    void getMake() {
    }

    @org.junit.jupiter.api.Test
    void setMake() {
    }

    @org.junit.jupiter.api.Test
    void getModel() {
        Car newCar = new Car("BMW","X3", Color.BLACK,TypeCar.SEDAN,4,TypeFuel.gasoline,TypeGearbox.AT,2.0f);
        assertEquals("X3",newCar.getModel());
    }

    @org.junit.jupiter.api.Test
    void setModel() {
    }

    @org.junit.jupiter.api.Test
    void getColor() {
    }

    @org.junit.jupiter.api.Test
    void setColor() {
    }

    @org.junit.jupiter.api.Test
    void getBodyType() {
    }

    @org.junit.jupiter.api.Test
    void setBodyType() {
    }

    @org.junit.jupiter.api.Test
    void getNumberWheels() {
    }

    @org.junit.jupiter.api.Test
    void setNumberWheels() {
    }

    @org.junit.jupiter.api.Test
    void getFuel() {
    }

    @org.junit.jupiter.api.Test
    void setFuel() {
    }

    @org.junit.jupiter.api.Test
    void getGearbox() {
    }

    @org.junit.jupiter.api.Test
    void setGearbox() {
    }

    @org.junit.jupiter.api.Test
    void getEngineCap() {
    }

    @org.junit.jupiter.api.Test
    void setEngineCap() {
    }

    @org.junit.jupiter.api.Test
    void movement() {
    }

    @org.junit.jupiter.api.Test
    void maintenance() {
    }


    @org.junit.jupiter.api.Test
    void turnLights() {
    }

    @org.junit.jupiter.api.Test
    void trnWprs() {
    }
}