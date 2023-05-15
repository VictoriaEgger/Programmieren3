package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class UE1 {
    public static void main(String[] args) throws IOException {
        //    Create a method, which has a file as parameter
//    The method should print the following information of a file on the console:
//            - Does this file exist?
//            - Name of the File
//- Parent Directory of the File
//- Path to this File
//- Is this a directory?
//            - Is this a file?
//            - Is this file readable?
//            - Is this File writeable
//- File Size
        File file = new File("test.txt"); //mit maus halten dann File Klasse impoertieren
        // File file = new File("C:\Users\s53027\IdeaProjects\test.txt");

        System.out.println("Does this file exist? " + file.exists()); //exists. gibt boolean zurück
        System.out.println("Full path to file " + file.getAbsolutePath());

        System.out.println("Name of the file: " + file.getName());
        System.out.println("Parent Directory of the File: " + file.getParentFile());
        System.out.println("Path to this File: " + file.getAbsolutePath());
        System.out.println("Is this a directory: " + file.isDirectory());
        System.out.println("Is this a file: " + file.isFile());
        System.out.println("Is this file readable: " + file.canRead());
        System.out.println("Is this file writeable: " + file.canWrite());
        System.out.println("File is hidden: " + file.isHidden());
        System.out.println("File Size in Bytes is: " + file.length()); //gibt in Bytes grösse zurück
        System.out.println("File Size in KiloBytes is: " + file.length() / 1024.0);


        //Legen so eine neue Datei an
        File file2 = new File("k.txt");

        try {file2.createNewFile(); }
        catch (Exception e) {
        }

    }
}
