package JavaIO.HomeTask;

import java.io.*;
import java.util.ArrayList;

//Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.

public class ChangeFirstLastWordsInLine {

    public static void main(String[] args) {

        ArrayList<String> linesAfterChange = new ArrayList<>();

        try (FileReader fileReader = new FileReader("src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ChangeFirstLastWordsInLine.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            ArrayList<String> linesFromFile = new ArrayList<>();
            bufferedReader.lines().forEach(linesFromFile::add);

            linesAfterChange.addAll(ChangeFirstLastWordsInLine(linesFromFile));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ChangeFirstLastWordsInLine.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (String lineAfterChange :
                    linesAfterChange) {
                bufferedWriter.write(lineAfterChange);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<String> ChangeFirstLastWordsInLine(ArrayList<String> linesForChange) {
        ArrayList<String> linesWithChangedFirstLastWords = new ArrayList<>();
        String allWordsInLineAfterChange;
        for (String allWordsInLineBeforChange :
                linesForChange) {
            allWordsInLineAfterChange =
                    allWordsInLineBeforChange.split(" ")[allWordsInLineBeforChange.split(" ").length - 1] + " ";
            if (allWordsInLineBeforChange.split(" ").length > 1) {
                for (int i = 1; i < allWordsInLineBeforChange.split(" ").length - 1; i++) {
                    allWordsInLineAfterChange += allWordsInLineBeforChange.split(" ")[i] + " ";
                }
                allWordsInLineAfterChange += allWordsInLineBeforChange.split(" ")[0];
            }
            linesWithChangedFirstLastWords.add(allWordsInLineAfterChange);
        }
        return linesWithChangedFirstLastWords;
    }

}
