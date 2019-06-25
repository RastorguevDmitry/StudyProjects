package JavaIO;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("src" + File.separator +
                "main" + File.separator +
                "resources" + File.separator +
                "textForFileMain.txt");
        if (file.exists() && file.isFile()) {
            System.out.println("Path " + file.getPath());
            System.out.println("Absolut Path " + file.getAbsolutePath());
            System.out.println("Size " + file.length());
            System.out.println("Dir " + file.getParent());
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File dir = new File("src" + File.separator +
                "main" + File.separator +
                "resources");
        if (dir.exists() && dir.isDirectory()) {
            for (File currentFile : dir.listFiles()) {
                long millis = currentFile.lastModified();
                LocalDateTime date = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDateTime();
                System.out.println(currentFile.getPath() + "\t" + currentFile.length() + "\t" + date);
            }
            File root = File.listRoots()[0];
            System.out.printf("\n%s %,d from %,d free bytes", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
        }

    }
}
