package Company;

import java.util.Scanner;

import static Company.Store.*;
import static Company.Employee.*;

public class Administrator extends Staff {
    public Administrator(Store store, String name, int id, String userName, String password) {
        super(store, name, id, userName, password);
    }

    @Override
    public void interact() {
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("----- Admin Options -----");
            System.out.print("");
            System.out.println("User: "+ this.name);
            System.out.println("1. Add Admin.");
            System.out.println("2. Remove Admin.");
            System.out.println("3. Add Employee.");
            System.out.println("4. Remove Employee.");
            System.out.println("5. View List of Employees.");
            System.out.println("6. Manage Store.");
            System.out.println("7. Quit.");

            System.out.println("Choose an option: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    store.addAdmin();
                    break;
                case 2:
                    store.removeAdmin();
                    break;
                case 3:
                    System.out.println("Enter Employee");
                    store.addEmployee();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                case 5:
                    store.printStaffList();
                    break;
                case 6:
                    manageStore();
                    break;
                case 7:
                    System.out.println("Goodbye!");

                default:
                    System.out.println("Enter number between 1 and 3.");
            }
        }
    }

    @Override
    public void manageStore() {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("----- Admin Manage Store -----");
            System.out.print("");
            System.out.println("User: "+ this.name);
            System.out.println("1. Add item.");
            System.out.println("2. Remove item.");
            System.out.println("3. Check Store Stock.");
            System.out.println("4. Quit.");

            System.out.println("Choose an option: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    store.addToStore();
                    break;
                case 2:
                    store.removeFromStore();
                    break;
                case 3:
                    store.printStoreInventory();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Enter number between 1 and 3.");
                    break;
            }
        }
    }
}

//    public void addAdmin()
//    {
//        Scanner scan = new Scanner(System.in);
//        scan.nextLine();
//        System.out.println("Enter administrator name: ");
//        String name = scan.nextLine();
//        System.out.println("Enter administrator id number: ");
//        int id = scan.nextInt();
//        System.out.println("Enter username: ");
//        String uName = scan.nextLine();
//        System.out.println("Enter password: ");
//        String pWord = scan.nextLine();
//
//        store.addAdmin(name, id, uName, pWord);
//    }

