package Company;

import java.util.Scanner;

public class Employee extends Staff
{
    public Employee(Store store, String name, int id, String userName, String password) {
        super(store, name, id, userName, password);
    }

    @Override
    public void interact() {
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("----- Todo List -----");
            System.out.println("1. View Employee List.");
            System.out.println("2. Manage Store.");
            System.out.println("3. Quit.");

            System.out.println("Choose an option: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    store.printStaffList();
                    break;
                case 2:
                    manageStore();
                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Enter number between 1 and 2.");
            }
        }
    }

    @Override
    public void manageStore()
    {

    }
}
