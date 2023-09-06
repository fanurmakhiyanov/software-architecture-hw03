package ru.geekbrains.lesson3;

public class RefuelingStation implements Refueling{
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Автомобиль заправляется дизельным топливом");
            case Gasoline -> System.out.println("Автомобиль заправляется бензином");
        }

    }
}
