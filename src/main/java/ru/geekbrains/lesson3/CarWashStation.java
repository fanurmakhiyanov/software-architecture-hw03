package ru.geekbrains.lesson3;

public class CarWashStation implements Washing{
    @Override
    public void wash() {
        System.out.println("Автомобиль на мойке");
    }
}
