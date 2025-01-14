import  java.util.*;

public class PrimeNumber {
    public static int getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
    }
    public static boolean PrimeCheck(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }return true; //no. is prime
    }

    public static void main(String[] args) {
        int num = getInput("enter your number");

        System.out.println("the number " + num+ " is prime " + PrimeCheck(num));
    }
}