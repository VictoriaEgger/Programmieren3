package FileInputOutput;


import java.io.*;

public class TextOutput {
    public static void main(String[] args) throws IOException {
        //File f = new File ();
        FileWriter fileWriter = new FileWriter("text.txt", true); //Hier wird die Datei erst erstellt //Ohne dem true löscht er alles, so hängt er es an
        PrintWriter printWriter = new PrintWriter(fileWriter);


 printWriter.println("Hallo!!!");
 printWriter.println("Mein Name ist Cheda");
 printWriter.println("Geht das jetzt während die Datei offen ist?");

 printWriter.flush(); //Keine Ahnung wofür??? Eif machen!!!
 printWriter.close();

    }
}
