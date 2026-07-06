package day10;
class dude1{
    void display(){
        System.out.println("hello");
    }
}
class dude2 extends dude1{
    void display(){
        System.out.println("world");
    }
}
class dude3 extends dude2{
    void display(){
        System.out.println("arul");
    }
}
public class multilevel {
    public static void main(String[] args){
        dude1 n1=new dude1();
        dude2 n2=new dude2();
        n2.display();
    }
}



