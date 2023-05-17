package UE12;

import java.io.*;

public class UE14 {
    public static void main(String[] args) throws IOException {
        File file = new File("test-output.txt");
        FileOutputStream fileOutputStream= new FileOutputStream(file);

        String outputText = "hallo File - first output";
        for (char c : outputText.toCharArray()) {
            System.out.println("Schreibe char " + (int) c + "in die Datei...");
           fileOutputStream.write(c);
        }

        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
