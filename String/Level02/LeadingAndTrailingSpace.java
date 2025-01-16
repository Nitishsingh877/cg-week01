import  java.util.Scanner;

public class LeadingAndTrailingSpace {
    public static int[] indexes(String s){
        int start = 0;
        int end = s.length()-1;
        while(s.charAt(start)== ' ')
            start++;
        while(s.charAt(end) == ' ')
            end--;
        return new int[]{start,end};
    }
    public static String constructSubstring(String s, int start, int end){
        String ans = "";
        for(int i = start;i<=end;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the words");
        String s = sc.nextLine();
        String trimmedString = s.trim();
        int[] indexes = indexes(s);
        String manuallyTrimmedString = constructSubstring(s,indexes[0],indexes[1]);
        System.out.println("Trimmed  using builtin function = "+trimmedString);
        System.out.println("Trimmed using user defined function = "+manuallyTrimmedString);
        if(trimmedString.equals(manuallyTrimmedString))
            System.out.println("YES both are equal ");
        else
            System.out.println("NO both are not equal");
    }
}
