package day11;
abstract class abs {
    abstract void run();
    abstract void display();
    void display2() {
        System.out.println("heee");
    }
}
class acs extends abs {
    void run() {
        System.out.println("HELLO WORLD");
    }

    void display() {
        System.out.println("hello world");
    }
}
public class exp5 {
    public static void main(String[] args){
        acs a=new acs();
        a.run();
        a.display();
        a.display2();
    }
}
