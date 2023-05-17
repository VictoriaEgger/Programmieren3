package FileInputOutput;

import java.io.*;

public class ReadDateiBisEnde {
    public static void main(String[] args) throws IOException {

        File f = new File("test.txt");
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String zeile = br.readLine(); //Hier liest es die Zeile
        while (zeile != null) {
            System.out.println(zeile);
            zeile = br.readLine();
        }

        br.close();
    }
}
