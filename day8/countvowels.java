package day8;

public class countvowels {
    public static void main(String[] args){
        String s="hello world";
        String lower=s.toLowerCase();
        int vowels=0;
        int cnsts=0;
        for(char ch:lower.toCharArray()){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vowels++;
            }
            else{
                cnsts++;
            }
        }
        System.out.println("count of vowels:"+vowels);
        System.out.println("count of consonants:"+cnsts);

    }
}
