package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {

    //static variables so it can be accessible within this class.
    public static LinkedList list = new LinkedList();
    public static Scanner sc = new Scanner(System.in);

    //This is a block of methods
    public static void adding() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("What element would you like to add?");
            System.out.print("Element: ");
            String elemt = sc.next();
            list.add(elemt);
            System.out.println("Element ' " + elemt + " ' added successfully");
            System.out.println("Would you like to add more?" + "\nPress 1 for YES \nPress 2 for NO");
            int resp = sc.nextInt();

            if (resp == 1) {
                repeat = true;
            } else if (resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
                sc.close();
                break;
            }

        }

    }
    
     public static void move() {
        System.out.println("Enter the first index you want to swap: ");
        int element1 = sc.nextInt();
        System.out.println("Enter the second index you want to swap: ");
        int element2 = sc.nextInt();

        list.moveNodePointer(element1, element2);
        list.printList();
    }

}
