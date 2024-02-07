package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product p1 = new Product("Product1", 40000);
        Product p2 = new Product("Product2", 45000);
        Product p3 = new Product("Product3", 60000);
        Set<Product> p = new HashSet<>();
        p.add(p3);
        p.add(p2);
        p.add(p1);
        System.out.println("----------Product------------");
        for (Product product : p) {
            System.out.println(product.getName() + "-" + product.getPrice() + " VND");
        }
        System.out.println("----------********------------");

        do {
            System.out.print("Enter name product need search: ");
            String search = input.nextLine();
            for (Product product : p) {
                if (product.getName().contains(search)) {
                    System.out.println("Product existed");
                    break;
                }
            }

        } while (true);
    }
}