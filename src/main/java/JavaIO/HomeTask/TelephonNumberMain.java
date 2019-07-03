package JavaIO.HomeTask;
//Сохранить в файл, связанный с выходным потоком, записи о телефонах и их вла-дельцах.
// Вывести в файл записи, телефоны в которых начинаются на k и на j.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TelephonNumberMain {

    public static void main(String[] args) {
        List<TelephonNumber> telephonNumberFromFile = new ArrayList<>();

        List<TelephonNumber> telephonNumber = new ArrayList<>();
        telephonNumber.add(new TelephonNumber("51651611", "Vasya"));
        telephonNumber.add(new TelephonNumber("4", "Petya4"));
        telephonNumber.add(new TelephonNumber("5", "Petya5"));
        telephonNumber.add(new TelephonNumber("6", "Petya6"));
        telephonNumber.add(new TelephonNumber("7", "Petya7"));
        telephonNumber.add(new TelephonNumber("8", "Petya8"));

        try (ObjectOutputStream outputStreamToTelephonNumberFile = new ObjectOutputStream(new FileOutputStream(
                "src" + File.separator + "main" + File.separator + "resources" + File.separator + "telephonNumberFileForFind.txt"))) {

            outputStreamToTelephonNumberFile.writeObject(telephonNumber);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputFromTelephonNumberFile = new ObjectInputStream(new FileInputStream(
                "src" + File.separator + "main" + File.separator + "resources" + File.separator + "telephonNumberFileForFind.txt"))) {


            telephonNumberFromFile = ((ArrayList) inputFromTelephonNumberFile.readObject());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (TelephonNumber oneTelephonNumberFromFile :
                telephonNumberFromFile) {
            if (Character.getNumericValue(oneTelephonNumberFromFile.number.charAt(0)) == 5) {
                oneTelephonNumberFromFile.print();
            }


        }

    }

}
