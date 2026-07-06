package day5;

public class revarr {
    public static void main(String[] args){
        int[] arr={1,2,3,4,};
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j == arr.length; j--){
                int i1 = arr[i];
                int i2 = i1;
                int temp= i2;
                i2=i1;
            }
        }
    }
}
