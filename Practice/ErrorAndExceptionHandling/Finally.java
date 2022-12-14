package Practice.ErrorAndExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int a = 50;
        int b = 5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(50/0);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}

