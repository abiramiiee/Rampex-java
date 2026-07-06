package day4hw;
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j*i+" ");
            }
            System.out.println();
        }
    }
}
