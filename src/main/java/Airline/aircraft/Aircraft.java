package Airline.aircraft;

import java.util.Comparator;

public class Aircraft implements Comparable<Aircraft>{
    public int id;
    public String aircraftManufacturer; //производитель
    public String type; //тип
    public  int capacity;  //вместимость пассажиров
    public float cargoCapacity; //грузопобьемность
    public float range; //дальность полета
    public float fuelConsumption; // потребление горючего на 100 км

    public Aircraft(int id, String aircraftManufacturer, String type, int capacity, float cargoCapacity, float range, float fuelConsumption) {
        this.id = id;
        this.aircraftManufacturer = aircraftManufacturer;
        this.type = type;
        this.capacity = capacity;
        this.cargoCapacity = cargoCapacity;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public int compareTo(Aircraft o) {

        return (int) (this.fuelConsumption - o.fuelConsumption)*10000;
    }

    // компаратор сортирует список или массив объектов по грузопобьемность
    public static Comparator<Aircraft> cargoCapacityComparator = new Comparator<Aircraft>() {

        @Override
        public int compare(Aircraft e1, Aircraft e2) {
            return (int) (e1.cargoCapacity - e2.cargoCapacity);
        }
    };

    // компаратор сортирует список или массив объектов по пассажировместимости
    public static Comparator<Aircraft> capacityComparator = new Comparator<Aircraft>() {

        @Override
        public int compare(Aircraft e1, Aircraft e2) {
            return (int) (e1.capacity - e2.capacity);
        }
    };

    // компаратор сортирует список или массив объектов по дальности полета
    public static Comparator<Aircraft> rangeComparator = new Comparator<Aircraft>() {

        @Override
        public int compare(Aircraft e1, Aircraft e2) {
            return (int) (e1.range - e2.range);
        }
    };




}
