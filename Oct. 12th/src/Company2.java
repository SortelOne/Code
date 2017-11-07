public class Company2 {
    private Employee2 a, b, c;

    public Company2(){
        a = new Employee2(this);
        b = new Employee2(this);
        c = new Employee2(this);
    }

    public void email (String s){
        System.out.println("RSVP " + s);
    }

    public void dailyEmail(){
        a.email("Scrum meeting at 9:00am. RSVP");
        b.email("Scrum meeting at 9:00am. RSVP");
        c.email("Scrum meeting at 9:00am. RSVP" );
    }

    public static void main(String[]args){
        Company sean = new Company();
        sean.dailyEmail();
    }
}
