public class Employee {
    private static int num_of_Employees = 0;
    private final int ID;

    public Employee(){
        num_of_Employees++;
        ID = num_of_Employees;
    }
    //After running first time change to string return type and send reply message
    public String email(String s){
        System.out.println(ID + " has been emailed:\n" + s);
        return "I'll be there " + ID;
    }
}
