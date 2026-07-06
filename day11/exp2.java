package day11;
class AB{
    AB(){
        System.out.println("A IS AA");
    }
    AB(int a){
        System.out.println("AAAAAA");
    }
}
class BA extends AB{
    BA(){
        super(5);
        System.out.println("B IS BB");
    }
}
public class exp2 {
    public static void main(String[] args){
    BA b=new BA();
    }
}