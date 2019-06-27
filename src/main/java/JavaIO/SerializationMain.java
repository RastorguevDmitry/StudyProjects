package JavaIO;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "dataForSerialization.txt"))) {

            ClasForSerializationExample clasForSerializationExample = new ClasForSerializationExample("Name", 5526, "1561");
outputStream.writeObject(clasForSerializationExample);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
