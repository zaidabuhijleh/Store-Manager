package Company;



public abstract class Staff
{
    protected Store store;
    protected String name;
    protected  int id;
    protected String userName;
    protected String passowrd;

    public Staff(Store store, String name, int id, String userName, String password)
    {
        this.store = store;
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.passowrd = password;
    }

    public abstract void interact();
    public abstract void manageStore();




}
