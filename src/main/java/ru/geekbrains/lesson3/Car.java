package ru.geekbrains.lesson3;

import java.awt.*;

public abstract class Car {

    // region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    // endregion

    // region Public Methods

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadLights();

    // Включение дворников
    public abstract boolean switchWipers();

    // Подметать
    // public abstract void sweeping();

    //
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // endregion

    // region Private Fields

    // Марка автомобиля
    private String make;

    public String getMake() {
        return make;
    }

    // Модель
    private String model;

    public String getModel() {
        return model;
    }

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    protected FuelType fueltype;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;

    // endregion
}
