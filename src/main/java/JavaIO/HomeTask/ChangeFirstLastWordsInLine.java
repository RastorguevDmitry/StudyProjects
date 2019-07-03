package JavaIO.HomeTask;

import java.io.*;
import java.util.ArrayList;


//Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.

public class ChangeFirstLastWordsInLine {

    public static void main(String[] args) {


        try (FileReader fileReader = new FileReader("src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ChangeFirstLastWordsInLine.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            ArrayList<String> linesFromFile = new ArrayList<>();
            bufferedReader.lines().forEach(linesFromFile::add);

            ArrayList<String> linesAfterChange = new ArrayList<>();
            linesAfterChange.addAll(ChangeFirstLastWordsInLine(linesFromFile)) ;

            System.out.println(linesAfterChange);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static ArrayList<String> ChangeFirstLastWordsInLine(ArrayList<String> linesForChange) {
        ArrayList<String> linesWithChangedFirstLastWords = new ArrayList<>();

        for (String allWordsInLineBeforChange :
                linesForChange) {
            String allWordsInLineAfterChange = null;

            if (allWordsInLineBeforChange.split(" ").length > 1) {
                String firstWordInLine = allWordsInLineBeforChange.split(" ")[0];
                String lastWordInLine = allWordsInLineBeforChange.split(" ")[allWordsInLineBeforChange.split(" ").length - 1];
                allWordsInLineAfterChange = lastWordInLine + " ";
                for (int i = 1; i < allWordsInLineBeforChange.split(" ").length - 1; i++) {
                    allWordsInLineAfterChange += allWordsInLineBeforChange.split(" ")[i] + " ";
                }
                allWordsInLineAfterChange += firstWordInLine;
            }
            linesWithChangedFirstLastWords.add(allWordsInLineAfterChange);
        }


        return linesWithChangedFirstLastWords;
    }


}
