package day10;
class node1{
    void displayinfo(){
        System.out.println("hello");
    }
}
class node2 extends node1{
    void display(){
        System.out.println("world");
    }
}
public class node {
    public static void main(String[] args){
        node1 n1=new node1();
        node2 n2=new node2();
        n2.display();
    }
}
