class pen{
    String color;
    String type; //ball point//gel pen

    public void write(){
        System.out.print("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class OOPS {
    public static void main(String args[]){
        pen pen1 = new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.printColor();
        pen1.write();

    }
    
}
