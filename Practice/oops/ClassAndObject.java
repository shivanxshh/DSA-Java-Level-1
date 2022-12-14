package Practice.oops;
class Employee{
    int age;
    String name; //attributes
    int salary;
    public void printDetails(){ //properties or methods
        System.out.println("my id is " + age);
        System.out.println("my name is " + name);
        System.out.println("my salary is " + salary);

    }
     int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
        }

public class ClassAndObject {
   public static void main(String[] args){
       System.out.println("This is our custom class");
       Employee john=new Employee(); //instantiating a new employee object
       john.age=23;
       john.name="john";  //setting attributes
       john.salary=20000;
       //System.out.println("my age is " + john.age);
       //System.out.println("my name is " + john.name);
       int jage=john.getAge();
       System.out.println(jage);


       String jname=john.getName();
       System.out.println(jname);


       //john.printDetails();   //calling methods or properties



   }

}
