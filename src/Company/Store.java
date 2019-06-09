package Company;
import java.util.Scanner;
import java.util.*;

public class Store
{
    Scanner scan = new Scanner(System.in);
//    private boolean running;
    private List<Staff> staffList = new ArrayList<>();
    private List<StoreItem> storeList = new ArrayList<>();

//    private Map<StoreItem, Integer> storeList = new HashMap<>();
    public Store() {

    }

    public void addEmployee()
    {
        System.out.println("Enter Employee name: ");
        String name = scan.nextLine();
        System.out.println("Enter employee id: ");
        int id = scan.nextInt();
        System.out.println("Enter employee username: ");
        scan.nextLine();
        String userN = scan.nextLine();
        System.out.println("Enter employee password: ");
        String pWord = scan.nextLine();
        Employee e = new Employee(this, name, id, userN, pWord);
        staffList.add(e);
    }

    public void addAdmin()
    {
        System.out.println("Enter admin name: ");
        String name = scan.nextLine();
        System.out.println("Enter admin id: ");
        int id = scan.nextInt();
        System.out.println("Enter admin username: ");
        scan.nextLine();
        String userN = scan.nextLine();
        System.out.println("Enter admin password: ");
        String pWord = scan.nextLine();
        Administrator a = new Administrator(this, name, id, userN, pWord);
        staffList.add(a);
    }

    public void removeAdmin()
    {

    }

    public List<Staff> getStaffList() {
        return this.staffList;
    }


    public void addToStore()
    {
        System.out.println("Enter product name: ");
        String name = scan.nextLine();
        System.out.println("Please enter quantity: ");
        int quantity =  scan.nextInt();
        System.out.println("Please enter product id #: ");
        int id = scan.nextInt();
        scan.nextLine();

        StoreItem item = new StoreItem();
        item.itemName = name;
        item.itemQuantity = quantity;
        item.itemId = id;

        storeList.add(item);


    }

    public void removeFromStore()
    {
        System.out.println("Enter product name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Please eneter product id #: ");
        int id = scan.nextInt();
        System.out.println("Please enter quantity to be removed: ");
        int quantity =  scan.nextInt();

        for(StoreItem s: storeList)
        {
            if(name.equals(s.itemName) && id == s.itemId)
            {
                s.itemQuantity -= quantity;
                System.out.println("Items removed. New quantity for" + s.itemName + " is : " + s.itemQuantity);
            }
        }


    }

    public void printStoreInventory()
    {
        int size = storeList.size();
        for(int i = 0; i < size; i++)
        {
            System.out.println("====== Item #"+ (i+1) +" ======");
            System.out.println("Item Name: "+ storeList.get(i).itemName);
            System.out.println("Item id: "+ storeList.get(i).itemId);
            System.out.println("Item Quantity: "+ storeList.get(i).itemQuantity);
        }
    }

    public void printStaffList()
    {
        int i = 0;
        for(Staff s: getStaffList())
        {
            System.out.println("====== Staff Member #"+ (i+1) +" ======");
            System.out.println("Name: "+ s.name);
            System.out.println("ID: "+ s.id);
            System.out.println("============================");
            System.out.println();
            i++;
        }
    }

}
