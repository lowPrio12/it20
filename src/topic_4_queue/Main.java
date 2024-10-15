package topic_4_queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue customerQueue = new Queue();

        System.out.println("Welcome to the Customer Queue System!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            /* Adding customers to the queue
             customerQueue.enqueue(new Customer("Kent Coming"));
             customerQueue.enqueue(new Customer("Dexter Saldivar"));
             customerQueue.enqueue(new Customer("Joshua Gabitano"));
	     
             System.out.println();
             customerQueue.displayQueue();
	     
             // Serve 
             customerQueue.dequeue();
	     
             System.out.println();
             customerQueue.displayQueue();
             */
        }
    }
}
