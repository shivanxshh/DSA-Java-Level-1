package Practice.oops;
class MainEmployee{
    int salary;
    String name;

    public MainEmployee(){ //constructor  //called by default //canstructor is of same name as of class name.
        salary=500;
        name="Shivansh";

    }

    public MainEmployee(String name, int a){ //constructor
        this.name=name;
        salary=a;


    }

    public MainEmployee(String myname){ //constructor
        this.name=myname;

    }

}
public class SameFuncDiffPara {
    public static void main(String[] args) {
        MainEmployee adi=new MainEmployee();
        MainEmployee shivi=new MainEmployee("sagar",12);
        MainEmployee vi=new MainEmployee("Akshat");
        //shivi.name="shshs";
        //System.out.println(shivi.name);
        //shivi.setName("Shivansh");
        //shivi.setSalary(299);
        System.out.println(adi.salary);
        System.out.println(adi.name);
        System.out.println(shivi.salary);
        System.out.println(shivi.name);

        System.out.println(vi.name);
    }
}
