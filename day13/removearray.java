package day13;
import java.util.*;
public class removearray {
    public static void main(String[] args) {
        List<Object> rem = new ArrayList<>();
        rem.add("abi");
        rem.add(19);
        rem.add("kalpana");
        rem.add(24);
        rem.add("anjyuu");
        rem.add(22);
        rem.add("krithi");
        rem.add(20);
        rem.add("kalai");
        rem.add(21);
        rem.remove(9);
        rem.remove(8);
        List<Object> rems = Arrays.asList("anjyuu", 22, "krithi", 20);
        rem.removeAll(rems);
        System.out.println(rem);
    }
}
