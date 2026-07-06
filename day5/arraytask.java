package day5;

public class arraytask {
    public static void main(String[] args){
        int[] arr=new int[]{10,20,30,40,50};
        int sum=0;
        float avg;
        for(int num:arr){
            sum=sum+num;
        }
        avg=sum/arr.length;
        System.out.println(sum+" ");
        System.out.println(avg+"");

    }
}
