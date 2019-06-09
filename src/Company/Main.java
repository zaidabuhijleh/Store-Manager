package Company;

import static Company.Store.*;
import java.util.Scanner;

public class Main
{


    public static Staff logIn(Store s)
    {
        Scanner scan = new Scanner(System.in);
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
        Staff currUser = logIn(store);
        assert(currUser == null);
        currUser.interact();
//        if(currUser instanceof Administrator)
//        {
//            Administrator admin = (Administrator)currUser;
//            admin.interact();
//        }
    }
}
