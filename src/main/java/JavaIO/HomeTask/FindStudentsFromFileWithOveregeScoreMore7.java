package JavaIO.HomeTask;

// В файле, содержащем фамилии студентов и их оценки,
// записать прописными буквами фамилии тех студентов, которые имеют средний балл более 7

import java.io.*;
import java.util.ArrayList;

public class FindStudentsFromFileWithOveregeScoreMore7 {

    public static void main(String[] args) {


        ArrayList<String> listOfStudentsWithOveregeScoreMore7UpperCase = new ArrayList<>();

        try (FileReader fileReader = new FileReader("src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "dataForFindStudentsFromFileWithOveregeScore.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            ArrayList<String> linesFromFileWithStudentsAndScore = new ArrayList<>();
            bufferedReader.lines().forEach(linesFromFileWithStudentsAndScore::add);

            listOfStudentsWithOveregeScoreMore7UpperCase.addAll(
                    ChangeStudentsNameWithOveregeScoreMore7ToUpperCase(linesFromFileWithStudentsAndScore));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "dataForFindStudentsFromFileWithOveregeScore.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (String lineAfterChange :
                    listOfStudentsWithOveregeScoreMore7UpperCase) {
                bufferedWriter.write(lineAfterChange);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static ArrayList<String> ChangeStudentsNameWithOveregeScoreMore7ToUpperCase(ArrayList<String> linesFromFileWithStudentsAndScore) {
        ArrayList<String> listOfStudentsWithOveregeScoreMore7UpperCase = new ArrayList<>();
        String allWordsInLineAfterChange = null;
        for (String allWordsInLineBeforChange :
                linesFromFileWithStudentsAndScore) {

            float overegeScore;
            int sumOfScore = 0;
            for (int i = 1; i < allWordsInLineBeforChange.split(" ").length; i++) {
                sumOfScore += Integer.parseInt(allWordsInLineBeforChange.split(" ")[i]);
            }
            overegeScore = (float) sumOfScore / (allWordsInLineBeforChange.split(" ").length - 1);


            if (overegeScore > 7)
                allWordsInLineAfterChange = allWordsInLineBeforChange.split(" ")[0].toUpperCase() + " ";
            else
                allWordsInLineAfterChange = allWordsInLineBeforChange.split(" ")[0] + " ";

            for (int i = 1; i < allWordsInLineBeforChange.split(" ").length; i++) {
                allWordsInLineAfterChange += allWordsInLineBeforChange.split(" ")[i] + " ";
            }

            listOfStudentsWithOveregeScoreMore7UpperCase.add(allWordsInLineAfterChange);
            allWordsInLineAfterChange = null;
        }
        return listOfStudentsWithOveregeScoreMore7UpperCase;
    }

}
