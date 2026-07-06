package day11;
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
}
public class exp1 {
    public static void main(String[] args){
        B b=new B();
    }
}
