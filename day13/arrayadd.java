package day13;
import java.util.*;
public class arrayadd {
    public static void main(String[] args){
        List<Object> fruits=new ArrayList<>();
        fruits.add("APPLE");
        fruits.add("POMESS");
        fruits.add("BANANA");
        fruits.add("Chick");
        fruits.remove(2);
        fruits.addFirst("BANANA");
        List<Object>fruit=Arrays.asList("abi","samm");
        fruits.addAll(2,fruit);
        System.out.println(fruits);

    }
}

