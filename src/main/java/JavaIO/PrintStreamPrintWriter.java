package JavaIO;

import java.io.*;

public class PrintStreamPrintWriter {

    public static void main(String[] args) {
        File file = new File("src/main/resources/textForPrintStreamPrintWriter.txt");
        double[] values = {1.10, 1.2, 1.401, 5.05, 6.09};
        try (PrintStream stream = new PrintStream(new FileOutputStream(file))){
            for (double value : values) {
                stream.printf("Java %.2g%n", value);
                System.setOut(stream);
                System.out.printf("%.2g%n", value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
//            for (double value : values) {
//                writer.printf("Java %.2g%n", value);
//                System.out.printf("%.2g%n", value);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
