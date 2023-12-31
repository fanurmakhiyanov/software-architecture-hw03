package ru.geekbrains.lesson3;

import javax.sound.midi.Soundbank;
import java.awt.*;

import static ru.geekbrains.lesson3.FuelType.Diesel;

public class Program {

    /**
     *  1. Спроектировать абстрактный класс "Car" у которого должны быть свойства: марка, модель, цвет, тип кузова,
     *  число колес, тип топлива, тип коробки передач, объем двигателя; методы: движение, осбслуживание,
     *  переключение передач, включение фар, включение дворников.
     *
     *  2. Создать конкретный автомобиль путём наследования от класса Car
     *
     *  3. Расширить абстрактный класс Car, добавить метод: подметать улицу. Создать конкретный автомобиль
     *  путем наследования класса Car. Провести проверку принципа SRP.
     *
     *  4. Расширить абстрактный класс Car, добавить метод: включение противотуманных фар, перевозка груза.
     *  Провести проверку принципа OCP.
     *
     *  5. Создать конкретный автомобиль путем наследования класса
     *  Car, определить число колес = 3. Провести проверку принципа LCP.
     *
     *  6. Создать конкретный автомобиль путем наследования класса
     *  Car, определить метод "движение" - "полёт". Провести проверку принципа LSP.
     *
     *  7. Создать интерфейс "Заправочная станция", создать метод: заправка топливом.
     *
     *  8. Имплементировать метод интерфейса "Заправочная станция" в конкретный класс Car.
     *
     *  9. Добавить в интерфейс "Заправочная станция"методы: протирка
     *  лобового стекла, протирка фар, протирка зеркал.
     *
     *  10. Имплементировать все методы интерфейса "Заправочная
     *  станция" в конкретный класс "Car". Провести проверку
     *  принципа ISP. Создать дополнительный/е интерфейсы и
     *  имплементировать их в конкретный класс "Car". Провести проверку
     *  принципа ISP.
     *
     *  11. Создать путём наследования класса "Car" два
     *  автомобиля: с бензиновым и дизельным двигателями,
     *  имплементировать метод "Заправка топливом" интерфейса
     *  "Заправочная станция". Реализовать заправку каждого
     *  автомобиля подходящим топливом. Провести проверку приципа DIP.
     *
     * @param args
     */
    public static void main(String[] args) {

        Harvester harvester = new Harvester("MAN", "Bruder", Color.white);
        SportCar sportCar = new SportCar("Porsche", "911 GT2", Color.DARK_GRAY);
        RefuelingStation refuelingStation = new RefuelingStation();
        CarWashStation carWashStation = new CarWashStation();
        harvester.setRefuelingStation(refuelingStation);
        harvester.setCarWashStation(carWashStation);
        sportCar.setRefuelingStation(refuelingStation);
        sportCar.setCarWashStation(carWashStation);
        System.out.printf(harvester.getMake() + " " + harvester.getModel() + "\n");
        harvester.fuel();
        harvester.wash();
        System.out.printf("\n" + sportCar.getMake() + " " + sportCar.getModel() + "\n");
        sportCar.fuel();
        sportCar.wash();
    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500*6;
        }
        else {
            return 1000*4;
        }
    }
}