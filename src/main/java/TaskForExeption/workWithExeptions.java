package TaskForExeption;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class workWithExeptions {

    public static void main(String[] args) throws DataNotFoundExeption, OutOfRangeExeption {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Float> floatArrayList = new ArrayList<>();
        try {
            stringArrayList = (ArrayList<String>) Files.readAllLines(Paths.get("src/main/resources/dataForExeptions.txt"), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (stringArrayList.isEmpty()) throw new DataNotFoundExeption("В файле нет данных");


        float elementOfFloatArrayList = 0;
        for (String elementOfStringArrayList :
                stringArrayList) {

            try {
                elementOfFloatArrayList = Float.parseFloat(elementOfStringArrayList);

            } catch (NumberFormatException numberFormatException) {
                System.out.println(elementOfStringArrayList);
            }

            if (elementOfFloatArrayList>250|| elementOfFloatArrayList<0) {
                throw new OutOfRangeExeption(elementOfFloatArrayList + " вне требуемого диапазона");
            }
            floatArrayList.add(elementOfFloatArrayList);
            elementOfFloatArrayList = 0;

        }


        Collections.sort(floatArrayList);
        System.out.println(floatArrayList);

    }


}
