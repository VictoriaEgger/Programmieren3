package FileInputOutput;

import java.io.File;

public class UE2 {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\s53027\\IdeaProjects\\";

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
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].isDirectory()) {
                System.out.println("Eintrag " + i + " Dir: " + inputArray[i].getAbsolutePath());
            } else {
                System.out.println("Eintrag " + i + " File: " + inputArray[i].getAbsolutePath());
            }

        }

    }
}
