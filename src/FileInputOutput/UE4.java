package FileInputOutput;

import java.io.File;

public class UE4 {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\s53027\\IdeaProjects\\Programmieren3";

        File f = new File(directoryPath); //greifen auf das Verzeichniss zu
        System.out.println("Gibt es dieses file/ordner: " + f.exists()); //schauen hier ob diesen Order C gibt
        System.out.println("Ist eine Directory/Ordner/folder: " + f.isDirectory()); //Prüfen ob es eine Directory ist

        File[] myFilesInThisSpecialDirectory = f.listFiles();

//        if (myFilesInThisSpecialDirectory != null){
//            for (File file : myFilesInThisSpecialDirectory) {
//                if (file.isDirectory()){
//                    System.out.println("Dir: " + file.getAbsolutePath());
//                }
//                else{
//                    System.out.println("File: " + file.getAbsolutePath());
//                }
//            }
//        }


//        for (int i = 0; i < myFilesInThisSpecialDirectory.length; i++){
//            System.out.println("Eintrag " + i + " " + myFilesInThisSpecialDirectory[i]);
//        }

        printFilesofSpecificDirectory(myFilesInThisSpecialDirectory);


    }

    public static void printFilesofSpecificDirectory(File[] inputArray) {
        long totalsize = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].isFile()) {
                System.out.print("Eintrag " + i + " FILE: " + inputArray[i].getAbsolutePath());
                System.out.println("\t" + inputArray[i].length()); //Zeigen so die Größe des Files  an
                totalsize += inputArray[i].length();// Hier wollen wir die Größe von allen Files wissen
            }
        }
        System.out.println("The size of all Files together: " + totalsize);
    }

    //UNTERSCHIED:
    //File.list () = gibt uns ein Array von String zurück
    //File.listFiles() = gibt uns ein Array vom Objekt File zurück
}
