package day5;
import java.util.Scanner;
public class maxminuser{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of elements:");
            int[] arr=new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int max;
            int min;
            max=min=arr[0];
            for(int j=0;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            System.out.println("Largest number:"+max);
            System.out.println("Smallest number:"+min);

        }
    }

