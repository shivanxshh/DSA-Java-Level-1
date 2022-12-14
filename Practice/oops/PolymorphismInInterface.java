package Practice.oops;

interface MyCamera2 {
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

interface WiFi2{
    String[] getnetWork();
    void connectToNetwork(String network);

}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class SmartPhone3 extends MyCellPhone implements WiFi2,MyCamera2{
    public  void takeSnap(){
        System.out.println("Taking Snap");

    }
    public  void recordVideo(){
        System.out.println("video is recording");

    }
    public String[] getnetWork() {
        System.out.println("Getting list of networks");
        String[] ss={"shiv","hans","vans","kans"};
        return ss;
    }
    public void connectToNetwork(String network){
        System.out.println("networking to "+network );
    }
}

public class PolymorphismInInterface {
    public static void main(String[] args) {
       //SmartPhone3 sp=new SmartPhone3();
       MyCamera2 cam1= new SmartPhone3();
       /*cam1.connectToNetwork(); //Can not access methods other than MyCamera2 methods
        cam1.getnetWork();*/
        cam1.recordVideo();
        cam1.record4kvideo();

        WiFi2 wifiee= new SmartPhone3();
        //wifiee.recordVideo();  Can not access methods other than WiFI2 methods
        wifiee.getnetWork();

    }
}

