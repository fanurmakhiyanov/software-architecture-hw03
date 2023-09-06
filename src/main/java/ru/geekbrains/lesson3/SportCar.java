package ru.geekbrains.lesson3;


import java.awt.*;

public class SportCar extends Car implements Fueling, Wiping, Washing{

    private CarWashStation carWashStation;
    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wash() {

    }
}
