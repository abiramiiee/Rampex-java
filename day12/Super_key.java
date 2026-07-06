package day12;
class n{
     void display() {
          System.out.println("Hello world");
     }
}
 class m extends n{
    void display(){
        super.display();
        System.out.println("Hello Abi");
    }
}
public class Super_key {
    public static void main(String[] args){
        m b=new m();
        b.display();
    }
}
