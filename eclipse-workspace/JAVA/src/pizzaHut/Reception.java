package pizzaHut;

import java.util.Date;
import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);	
        
        System.out.println("Enter order details:");
        System.out.print("Order Number: ");
        int orderNo = scanner.nextInt();

        Date orderDate = new Date();

        System.out.print("Cost: ");
        int cost = scanner.nextInt();
        System.out.print("Customer Name: ");
        String custName = scanner.next();
        System.out.print("Customer Address: ");
        String custAddress = scanner.next();
        System.out.print("Approximate Distance for Delivery (in km): ");
        float approxDistance = scanner.nextFloat();

        Order order = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);

        System.out.println("Order Delivery Status:");
        System.out.println("\n");
        if (order.delivery()) {
            System.out.println("Order is deliverable.");
        } else {
            System.out.println("Sorry, home delivery is not available for this distance.");
        }
        
        order.displayOrderDetails();
        scanner.close();
    }
}

