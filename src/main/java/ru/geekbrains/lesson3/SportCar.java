package ru.geekbrains.lesson3;


import java.awt.*;

public class SportCar extends Car implements Fueling, Wiping, Washing{

    private Refueling refueling;
    private CarWashStation carWashStation;
    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }
    public void setRefuelingStation(RefuelingStation refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setCarWashStation(CarWashStation carWashStation) {
        this.carWashStation = carWashStation;
    }

    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(FuelType.Gasoline);
        }
    }

    @Override
    public void wash() {
        if (carWashStation != null){
            carWashStation.wash();
        }
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
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

}
