package day11;
class bb{
    bb(){
        System.out.println("A FOR APPLE");
    }
    bb(int a){
        System.out.println("A FOR AMAZON");
    }
}
class aa extends bb{
    aa(){
        super(5);
        System.out.println("ADFGHJKL");
    }
}
public class exp3 {
    public static void main(String[] args){
        bb b1=new bb();
    }
}
