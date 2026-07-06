package day8;
import java.util.Scanner;
public class revword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int start = 0, end = s.length - 1;
        while (start < end) {
            String temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for (String word : s) {
            System.out.print(word + " ");
        }
    }
}
