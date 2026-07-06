package day11;
class x{
    void display(){
        System.out.println("display the outer class");
    }
    class y{
        void display(){
            System.out.println("display the inner class");
        }
    }

}

public class exp4 {
    public static void main(String[] args){
        x obj=new x();
        //obj.display();
        x.y obj2=obj.new y();
        obj2.display();

    }
}
