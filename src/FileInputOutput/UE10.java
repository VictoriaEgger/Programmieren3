package FileInputOutput;

import java.io.*;

public class UE10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        File file1 = new File("C:\\Users\\s53027\\IdeaProjects\\Programmieren3\\Uebung10.txt");
        FileWriter fileWriter = new FileWriter(file1); //Hier wird die Datei erst erstellt //Ohne dem true löscht er alles, so hängt er es an
        PrintWriter print = new PrintWriter(file1);

        String zeile = br.readLine(); //Hier liest es die Zeile
        while (zeile != null) {
            if (zeile.toLowerCase().equals("stop")) { //If gehört hier oben weil es sonst die Zeile wieder druckt
                break;
            }
            System.out.println(zeile);
           // fileWriter.write(zeile); //um den Text in der Datei anzeigen zu lassen. Können hier auch mit dem printWriter.println machen
            print.println(zeile);
            print.flush();
            zeile = br.readLine();

        }

//        fileWriter.flush();
//        fileWriter.close();


    }

}
