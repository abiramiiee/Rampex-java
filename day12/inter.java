package day12;
abstract class animal{
    abstract void eat();
}
class dog extends animal{
    void eat() {
        System.out.println("dog is eating ");
    }
}
interface pet{
    void eat();
}
class cow extends animal implements pet{
    public void eat(){
        System.out.println("cow is eating");
    }
}
public class inter{
    public static void main(String[] args){
        animal a=new dog();
        a.eat();
    }
}