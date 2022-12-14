package Practice.oops;
class Employee1{
    private int salary;
    private String name;
    public int getSalary(){
        return this.salary;
    }
    void setSalary(int sal){
        this.salary=sal;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name=n;
    }


}

public class getset {
    public static void main(String[] args) {
        Employee1 shivi=new Employee1();
        //shivi.name="shshs";
        //System.out.println(shivi.name);
       shivi.setName("Shivansh");
       shivi.setSalary(299);
       System.out.println(shivi.getName());
       System.out.println(shivi.getSalary());


    }
}
