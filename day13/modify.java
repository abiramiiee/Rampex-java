package day13;
import java.util.*;
public class modify {
    public static void main(String[] args){
        List<String>list=new ArrayList<>(Arrays.asList("a","b","c","d"));
        //set
        list.set(2,"bb");
        list.add(1,"x");
        System.out.println(list);
        //to upper case
        list.replaceAll(s->s.toUpperCase());
        System.out.println(list);
        //to lower case
        list.replaceAll(s->s.toLowerCase());
        System.out.println(list);
        // reverse in collections
        Collections.reverse(list);
        System.out.println(list);
        //sorting in collections
        Collections.sort(list);
        System.out.println(list);
        //shuffle in collections
        Collections.shuffle(list);
        System.out.println(list);


    }
}
