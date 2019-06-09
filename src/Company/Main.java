package Company;

import static Company.Store.*;
import java.util.Scanner;

public class Main
{
    private static Scanner scan = new Scanner(System.in);

    public static Staff logIn(Store s)
    {
        System.out.println("Enter Username: ");
        String uName = scan.nextLine();
        System.out.println("Enter password: ");
        String pWord = scan.nextLine();

        for(int i = 0; i < s.getStaffList().size(); i++)
        {
            Staff staff = s.getStaffList().get(i);
            if(staff.userName.equals(uName) && staff.passowrd.equals(pWord))
            {
                return staff;
            }
        }
        System.out.println("User not found, please try again. ");

        return logIn(s);
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addAdmin();

        int choice = 0;
        while(choice != 2)
        {
            System.out.println("===== THE STORE =====");
            System.out.println("1. Login.");
            System.out.println("2. Quit.");
            System.out.println("=====================");
            System.out.println();
            System.out.println("Enter your option: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice)
            {
                case 1:
                    Staff currUser = logIn(store);
                    assert(currUser == null);
                    currUser.interact();
                    break;
                case 2:
                    System.out.println("Goodbye!");
            }
        }
    }
}
