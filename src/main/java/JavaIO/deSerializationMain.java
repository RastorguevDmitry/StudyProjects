package JavaIO;

import java.io.*;

public class deSerializationMain {
    public static void main(String[] args) {
        try (ObjectInput inputStream = new ObjectInputStream(new FileInputStream(
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "dataForSerialization.txt"))) {

            ClasForSerializationExample clasForSerializationExample = (ClasForSerializationExample) inputStream.readObject();
            System.out.println(clasForSerializationExample);
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
