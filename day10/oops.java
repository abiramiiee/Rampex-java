package day10;
class calculator {
    int a;
    int b;

    public calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int add = a + b;
        System.out.println("Add:" + add);
    }

    public void sub() {
        int sub = a - b;
        System.out.println("sub:" + sub);
    }
}
public class oops {
    public static void main(String[] args) {
        calculator cals1 = new calculator(5, 3);
        calculator cals2 = new calculator(10, 6);
        cals1.add();
        cals1.sub();
        cals2.add();
        cals2.sub();
    }
}


