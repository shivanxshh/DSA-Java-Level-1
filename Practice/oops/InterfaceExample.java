package Practice.oops;
interface MyCamera {
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording");
    }

}

interface WiFi{
    String[] getnetWork();
    void connectToNetwork(String network);


}

class MyCellPhone{


    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class SmartPhone2 extends MyCellPhone implements WiFi,MyCamera{
   public  void takeSnap(){
        System.out.println("Taking Snap");

    }
    public  void recordVideo(){
        System.out.println("video is recording");

    }
    public String[] getnetWork() {
        System.out.println("Getting lidst of networks");
        String[] ss={"shiv","hans","vans","kans"};
        return ss;
    }
    public void connectToNetwork(String network){
        System.out.println("networking to "+network );
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
       /* MyCellPhone ss=new MyCellPhone();
        ss.pickCall();*/

        SmartPhone2 ss = new SmartPhone2();
        ss.recordVideo();
        ss.takeSnap();
        ss.record4kvideo();
        ss.callNumber(43795734);
        String[] ar= ss.getnetWork();
        for(String item : ar){
            System.out.println(item);
        }


    }
}
