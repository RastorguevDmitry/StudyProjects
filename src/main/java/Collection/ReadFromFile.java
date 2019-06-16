package Collection;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;


public class ReadFromFile {
//    Ввести строки из файла, записать в список ArrayList.
//    Выполнить сортировку строк, используя метод sort() из класса Collections.

//    16. Задан файл с текстом на английском языке. Выделить все различные слова.
//    Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
                lines = (ArrayList<String>) Files.readAllLines(Paths.get("src/main/resources/resourcesForReadFromFile.txt"), Charset.defaultCharset());
            } catch (IOException e) {
                e.printStackTrace();
            }

        Collections.sort(lines);
        System.out.println(lines);

    }





}
