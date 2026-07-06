package day5;
import java.util.Scanner;
public class arrmaxmin {
    public static void main(String[] args){
        int[] arr=new int[]{10,35,45,97,67,57};
        int max;
        int min;
        max=min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Largest number:"+max);
        System.out.println("Smallest number:"+min);

    }
}
