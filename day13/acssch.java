package day13;
import java.util.*;
import java.util.Scanner;
public class acssch {
    public static void main(String[] args){
        List<String>list=new ArrayList<>(Arrays.asList("a","b","i","i"));
        String n=list.get(0);
        System.out.println(n);
        int m=list.indexOf("i");
        System.out.println(m);
        int l=list.lastIndexOf("i");
        System.out.println(l);
        //search method
        //Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
        //boolean A=list.contains(str);
        //System.out.println(A);
        //boolean mt=list.isEmpty();
        //System.out.println(mt);
        int size=list.size();
        System.out.println(size);

    }
}
