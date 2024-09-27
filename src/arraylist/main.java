package arraylist;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ItemManager list = new ItemManager();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Choose: ");
            System.out.println("1. Insert a name ");
            System.out.println("2. Display all name ");
            System.out.println("3. Update name ");
            System.out.println("4. Find names ");
            System.out.println("5. Delete a name ");
            System.out.println("6. Exit ");

            String action = scan.nextLine();
        }
    }
}
