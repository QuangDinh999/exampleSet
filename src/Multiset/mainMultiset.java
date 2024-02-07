package Multiset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainMultiset {
    private static int getElementCount(Map<Product, Integer> multiset, Product element) {
        return multiset.getOrDefault(element, 0);
    }

    public static void addElement(Map<Product, Integer> multiset, Product element) {
        multiset.put(element, multiset.getOrDefault(element, 0) + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multiset.Product p1 = new Multiset.Product("Product1", 40000);
        Multiset.Product p2 = new Multiset.Product("Product2", 45000);
        Multiset.Product p3 = new Multiset.Product("Product3", 60000);
        Product[] arr = new Product[3];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        Map<Multiset.Product, Integer> mp = new HashMap<>();
        addElement(mp, p1);
        addElement(mp, p2);
        addElement(mp, p2);
        addElement(mp, p3);
        addElement(mp, p3);

        do {
            System.out.println("---------Cart----------");
            for (Product p: arr) {
                System.out.println(p.getName()+ " - " + p.getPrice() + " VND");
            }
            System.out.println("-----------------------");
            System.out.println("Cart have : "+ getElementCount(mp, p1)+ " Product1");
            System.out.println("Cart have: "+ getElementCount(mp, p2)+ " Product2");
            System.out.println("Cart have: "+ getElementCount(mp, p3)+ " Product3");

            System.out.print("Choose product to add cart: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    addElement(mp, p1);
                    break;
                case 2:
                    addElement(mp, p2);
                    break;
                case 3:
                    addElement(mp, p3);
                    break;
            }
        }while (true);
    }
}
