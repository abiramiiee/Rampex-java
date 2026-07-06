package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        List<Object> fruits=new ArrayList<>();
        fruits.add("APPLE");
        fruits.add("POMESS");
        fruits.add("BANANA");
        fruits.add("PAPAYA");
        fruits.addFirst("DOG");
        System.out.println(fruits);
        fruits.addLast("CAT");
        System.out.println(fruits);
        List<Object>fruit= Arrays.asList("BAT","RAT","CAT");
        fruits.addAll(2,fruit);
        System.out.println(fruits);
        fruits.remove("POMESS");
        System.out.println(fruits);
        List<Object>fruitt=Arrays.asList("PAPAYA");
        fruits.removeAll(fruitt);
        System.out.println(fruits);
        List<Object>fru=Arrays.asList("CAT");
        fruits.retainAll(fruits);
        System.out.println(fruits);
        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        list2.removeIf(n->n%3==0);
        list2.clear();
        System.out.println(list2);
        List<String>list=new ArrayList<>(Arrays.asList("a","b","i","i"));
        String n=list.get(0);
        System.out.println(n);
        int m=list.indexOf("i");
        System.out.println(m);
        int l=list.lastIndexOf("i");
        System.out.println(l);
        //search method
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        String str=sc.nextLine();
        boolean A=list.contains(str);
        System.out.println(A);
        boolean mt=list.isEmpty();
        System.out.println(mt);
        int size=list.size();
        System.out.println(size);


    }
}
