package FileInputOutput;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class UE6 {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\s53027\\Desktop\\Files\\Cheda");


     createFiles(dir);
    }
    public static void createFiles (File dir){

        for (int i = 0; i < 10; i++){
            String filename = ThreadLocalRandom.current().nextInt() + ".mp3";
            File fileToCreate = new File(dir.getAbsolutePath()+filename);
            System.out.println("File " + i + " : " + fileToCreate.getAbsolutePath());
            try {
                fileToCreate.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void renameFiles (File dir){
        for (File currentFile : dir.listFiles()) {
            if (currentFile.isFile()){
                File destFile = new File (dir.getAbsolutePath() +
                        File.separator + "1_ " + currentFile.getName());
                if (currentFile.renameTo(destFile))
                {
                    System.out.println("Erfolg: File " + currentFile.getAbsolutePath() +
                            " was renamed to " + destFile.getAbsolutePath());
                }
            }

        }

    }

}
