package FileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatei {
    public static void main(String[] args) throws IOException, IOException {
        FileReader fr = new FileReader("test.txt"); //Können hier auch den absoluten Pfad verwenden
        BufferedReader br = new BufferedReader(fr); //Hier wird noch nicht gelesen

//        String zeile1 = br.readLine();
//        System.out.println(zeile1);
//        String zeile2 = br.readLine();
//        System.out.println(zeile2);
//        String zeile3 = br.readLine();
//        System.out.println(zeile3);
        String zeile = br.readLine(); //Hier liest es die Zeile
        while (zeile != null) {
            System.out.println(zeile);
            zeile = br.readLine();
        }

        br.close();
    }
}
