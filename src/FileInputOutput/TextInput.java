package FileInputOutput;

import java.io.*;

public class TextInput {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String zeile = br.readLine(); //Hier liest es die Zeile
        while (zeile != null) {
            if (zeile.toLowerCase().equals("stop")) { //If gehört hier oben weil es sonst die Zeile wieder druckt
                break;
            }
            System.out.println(zeile);
            zeile = br.readLine();

        }

        br.close();
    }
}
