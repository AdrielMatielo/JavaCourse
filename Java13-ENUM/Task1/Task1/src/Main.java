import Entities.Client;
import Entities.Enums.OrderStatus;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt_DD_MM_YYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birth = LocalDate.parse(sc.nextLine(),fmt_DD_MM_YYYY);

        Client client = new Client(name,email,birth);

        System.out.println("---------------");
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine().toUpperCase();
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int itemsQnt = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < itemsQnt; i++){
            System.out.println("Enter #"+(i+1)+" item data:");
            System.out.print("Product name: ");
            String product = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQnt = sc.nextInt();
            sc.nextLine();
            Product productObj = new Product(product, productPrice);
            OrderItem orderItem = new OrderItem(productQnt, productPrice, productObj);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);
        System.out.println(client);
        System.out.println(order.toStringItems());
        System.out.println("Total price: $"+String.format("%.2f",order.total()));

    }
}