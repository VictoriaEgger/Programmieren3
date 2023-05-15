package FileInputOutput;

import java.io.File;

public class UE3 {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\s53027\\IdeaProjects\\Programmieren3";
        File f = new File(directoryPath);

        System.out.println("Gibt es dieses file/ordner: " + f.exists()); //schauen hier ob diesen Order C gibt
        System.out.println("Ist eine Directory/Ordner/folder: " + f.isDirectory()); //Prüfen ob es eine Directory ist

        File[] myFilesInThisSpecialDirectory = f.listFiles();


        printFilesofSpecificDirectory(myFilesInThisSpecialDirectory);
    }


    public static void printFilesofSpecificDirectory(File[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].isDirectory()) {
                System.out.println("Eintrag " + i + " Dir: " + inputArray[i].getAbsolutePath());
                System.out.println("\nWeil das ein DIR ist, hier der Inhalt: ");

                File[] subDirectory = inputArray[i].listFiles(); //legen neues Array an
                printFilesofSpecificDirectory(subDirectory); //Wenn isDirectory == true dann ruft die Methode sich wieder selber auf

            } else { //current FILE is a FILE
                System.out.println("Eintrag " + i + " File: " + inputArray[i].getAbsolutePath());
            }

        }
    }
}


