package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);
        System.out.println("Hello there!");
        
        while (true) {
            System.out.println("Choose what you want to do: "
                    + " 1. Size"
                    + " 2. Push"
                    + " 3. Pop"
                    + " 4. Exit");
            int choice = sc.nextInt();
        }

    }
}