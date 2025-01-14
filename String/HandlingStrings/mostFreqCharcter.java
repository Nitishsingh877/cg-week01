
import  java.util.*;
public  class mostFreqCharcter {
    public static char frequentCharacter(String s) {
        int[] frequency = new int[256];
        int maxCount= 0;
        char mostFrequent = '\0';

        //count the frequency
        for(char c : s.toCharArray()){
            frequency[c]++;
            if(frequency[c] > maxCount){
                maxCount = frequency[c];
                mostFrequent = c;
            }
        }
        return mostFrequent;

    }

    public static void main(String[] args) {
       String s = "success";

       //calling methods
        char mostFrequentCharacter = frequentCharacter(s);

        System.out.println("the most frequent char is : " + mostFrequentCharacter);
    }

}