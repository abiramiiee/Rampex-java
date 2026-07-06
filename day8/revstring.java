package day8;

public class revstring {
    public static void main(String[] args) {
        String s = new String("sam");
        char[] arr = s.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String s1=new String(arr);
        System.out.println(s1);
    }
}
