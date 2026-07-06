package day13;
import java.util.ArrayList;
import java.util.List;
public class arraylist {
    public static void main(String[] args){
        List<Object>num=new ArrayList<>();
        num.add(29.07);
        num.add("abi");
        num.add("2811");
        for(Object o:num)
        {
            System.out.println(num);
        }
    }
}
