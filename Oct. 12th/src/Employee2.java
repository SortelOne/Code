public class Employee2 {
    private static int num_of_Employees = 0;
    private final int ID;
    private Company2 boss;

    public Employee2(Company2 c){
        num_of_Employees++;
        ID = num_of_Employees;
        boss = c;
    }
    //After running first time change to string return type and send reply message
    public void email(String s){
        System.out.println(ID + " has been emailed:\n" + s);
    }

    public void reply(){
        boss.email("I'll be there. " + ID);
    }
}
