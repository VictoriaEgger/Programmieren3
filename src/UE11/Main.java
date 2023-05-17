package UE11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ProductManager manager = new ProductManager();
        Product p1 = new Product("Eis", 100, "Essen");
        Product p2 = new Product("Salat", 200, "Essen");

        manager.add(p1);
        manager.add(p2);

        manager.saveToFile("products.txt");
        manager.readFromFile("products.txt");
    }

}
