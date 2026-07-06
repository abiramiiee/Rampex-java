package day8;
import java.util.Scanner;
public class longword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s1=sc.nextLine();
        System.out.println(longword(s1));
    }
    public static String longword(String s1){
        String longest="";
        String[] s2=s1.split(" ");
        for(String word:s2){
            if(word.length()>longest.length()){
                longest=word;

            }
        }
      return longest;
    }
}
