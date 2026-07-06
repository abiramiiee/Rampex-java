package day10;
import java.util.Scanner;
class B{
    public int a;
    public int b;
    public int getA(int a){
        return a;
    }
    public int getB(int b){
        return b;
    }
    public void setA(int a){
        if(a>10){
            this.a=a;
        }
        else{
            System.out.println("invalid input");
        }
    }
    public void setB(int b){
        this.b=b;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
public class encapsuser{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        B a1=new B();
        int x=sc.nextInt();
        int y=sc.nextInt();
        a1.setA(x);
        a1.setB(y);
        a1.display();
    }
}


