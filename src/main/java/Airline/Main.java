package Airline;

//Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
//
//        Каждый класс должен иметь отражающее смысл название и информативный состав.
//        Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//        Наследование должно применяться только тогда, когда это имеет смысл.
//        При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//        Классы должны быть грамотно разложены по пакетам
//        Консольное меню должно быть минимальным.
//        Для хранения параметров инициализации можно использовать файлы.
//
//          Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
//          Посчитать общую вместимость и грузоподъемность.
//          Провести сортировку самолетов компании по дальности полета.
//          Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.


import Airline.aircraft.Aircraft;
import Airline.airline.Airline;

import java.util.*;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Данные об авиакомпании");
        Airline airline = new Airline("Аэрофлот");
        printMainText();
        System.out.println("Общая вместимость пассажиров: " + airline.totalCapacity());
        System.out.println("Общая вместимость грузов: " + airline.totalCargoCapacity());


        ArrayList<Aircraft> listAircraft = (ArrayList<Aircraft>) airline.listAircraft.clone();

//сортировка самолетов по пасажирам
        Collections.sort(listAircraft, Aircraft.capacityComparator);

//сортировка самолетов по дальности полетов
        Collections.sort(listAircraft, Aircraft.rangeComparator);
        for (Aircraft aircraft : listAircraft) {
            System.out.println(aircraft.range);
        }

//сортировка самолетов по потреблению топлива
        Collections.sort(listAircraft, new Comparator<Aircraft>() {
            public int compare(Aircraft o1, Aircraft o2) {
                return o1.compareTo(o2);
            }
        });

//        Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
        for (Aircraft aircraft : listAircraft) {
            if (aircraft.fuelConsumption > 100 && aircraft.fuelConsumption <= 300)
                aircraft.printAircraft();
        }

//        while (true) {
//            int input_numder = scanner.nextInt();
//
//            ReadFromTable readFromTable = new ReadFromTable();
//            switch (input_numder) {
//                case 0:
//                    System.out.println("Выход...");
//                    ReadFromTable.dropAllTable();
//                    System.exit(0);
//                    break;
//                case 1:
//                    System.out.println("Проект - Пользователь - Запись об ошибке");
//                    int returnValue = ReadFromTable.printReport();
//                    break;
//                case 2:
//                    System.out.println("Список проектов(из БД):");
//                    readFromTable.ReadFromTable(ReadFromTable.TABLE.Project);
//                    break;
//                case 3:
//                    System.out.println("Список пользователей(из БД):");
//                    readFromTable.ReadFromTable(ReadFromTable.TABLE.User);
//                    break;
//                case 4:
//                    System.out.println("Список ошибок (из БД):");
//                    readFromTable.ReadFromTable(ReadFromTable.TABLE.Issue);
//                    break;
//                case 5:
//                    //вызвать меню работы с запросом данных по Ошибкам по Пользователь+Проект
//                    ReportMenuWorkWithDB();
//                    break;
//            }
//            printMainText();
//        }

    }


    public static void printMainText() {
        System.out.print("Для отображения данных введите соответствующее число:\n" +
                "--> общая вместимость и грузоподъемность                             - 1\n" +
                "--> сортировка самолетов компании по дальности полета                - 2\n" +
                "--> Найти самолет в компании, соответствующий заданному\n" +
                "    диапазону параметров потребления горючего                        - 3\n" +
                "--> выйти из программы   - 0\n");
    }

}
