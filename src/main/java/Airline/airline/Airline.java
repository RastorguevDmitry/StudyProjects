package Airline.airline;

import Airline.aircraft.Aircraft;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Airline {
    public String name;
    public ArrayList<Aircraft> listAircraft = new ArrayList<Aircraft>();

    public Airline(String name) {
        this.name = name;
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/listAircraft.txt"), Charset.defaultCharset());

            for (String line : lines) {
                String allAboutAircraft[] = line.split(":");
                Aircraft aircraft = new Aircraft(Integer.parseInt(allAboutAircraft[0]),
                        allAboutAircraft[1],
                        allAboutAircraft[2],
                        Integer.parseInt(allAboutAircraft[3]),
                        Integer.parseInt(allAboutAircraft[4]),
                        Integer.parseInt(allAboutAircraft[5]),
                        Integer.parseInt(allAboutAircraft[6]));
                listAircraft.add(aircraft);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int totalCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft :
                listAircraft) {
            totalCapacity += aircraft.capacity;
        }
        return totalCapacity;
    }

    public int totalCargoCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft :
                listAircraft) {
            totalCapacity += aircraft.cargoCapacity;
        }
        return totalCapacity;
    }

//    public ArrayList<Aircraft> sort() {
//
//
//
//    }




}
