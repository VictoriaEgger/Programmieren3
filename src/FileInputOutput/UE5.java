package FileInputOutput;

import java.io.File;

public class UE5 {
    public static void main(String[] args) {
        File f = new File("C:\\campus02\\test\\demo4");


        if (f.mkdirs()) {
            System.out.println("Directory " + f.getAbsolutePath() + "created?: " + f.exists());
        } else {
            System.out.println("Directory " + f.getAbsolutePath() + " CANT BE created?: " + f.exists());
        }

    }

}
