package day13;
import java.util.*;
public class remif {
    public static void main(String[] args){
        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        list2.removeIf(n->n%3==0);
        list2.clear();
        System.out.println(list2);

    }
}
