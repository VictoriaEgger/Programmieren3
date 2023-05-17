package UE11;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    ArrayList<Product> productslist = new ArrayList<>();

    public void add(Product p) {
        productslist.add(p);
        System.out.println("Hat " + p.getProductName() + " hinzugefügt");
    }

    public void saveToFile(String filepath) throws IOException {
        System.out.println("Die Datei wurde erfolgreich erstellt!");
        File f = new File(filepath);
        FileWriter fw = new FileWriter(f); //erstellt die neue Datei
        BufferedWriter  bw = new BufferedWriter(fw);
        for (Product p : productslist){
            System.out.println("ProductManger: saveToFile saving Product " + p.toString());
            bw.write(p.toString());
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }

    public void readFromFile (String filepath) throws IOException {
        File f =  new File(filepath);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        for (Product p : productslist){

            String line = br.readLine();
            System.out.println(line);


        }
        br.close();

    }




}
