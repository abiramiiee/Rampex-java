package day13;
import java.util.List;
import java.util.ArrayList;
public class fstlst {
    public static void main(String[] args){
        List<Object>fruits=new ArrayList<>();
        fruits.add("APPLE");
        fruits.add("POMESS");
        fruits.add("BANANA");
        fruits.add("Chick");
        fruits.remove(2);
        fruits.addFirst("BANANA");
        fruits.add(3,"APPLE");
        System.out.println(fruits);

    }
}
