import  java.util.*;

public  class replace {
    public static String ReplaceWords(String str, String old, String newWord){
        // Split the sentence into words using spaces as a delimiter
        String[] words = str.split("\\s+");
        StringBuilder newSentence = new StringBuilder();

        for(String word : words) {
            if(word.equals(old)) {
                newSentence.append(newWord);
            }else {
                newSentence.append(word);
            }
            newSentence.append(" ");
        }
        return newSentence.toString();  // Return the modified sentence
    }

    public static void main(String[] args) {
        String str = "The cat sat on the mat";
        String old = "cat";
        String newWord = "dog";

        // Call the replaceWordInSentence method
        String result = ReplaceWords(str, old, newWord);

        // Output the modified sentence
        System.out.println("Modified sentence: " + result);
    }
    }
