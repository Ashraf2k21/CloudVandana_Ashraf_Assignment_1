import java.util.Scanner;
import java.util.Arrays;

public class RomanToIntegerAndPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        int intValue = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + intValue);

        
        System.out.print("Enter a sentence to check if it's a pangram: ");
        String sentence = sc.nextLine();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

   
    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = 0;

            if (c == 'I') {
                value = 1;
            } else if (c == 'V') {
                value = 5;
            } else if (c == 'X') {
                value = 10;
            } else if (c == 'L') {
                value = 50;
            } else if (c == 'C') {
                value = 100;
            } else if (c == 'D') {
                value = 500;
            } else if (c == 'M') {
                value = 1000;
            }

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    
    public static boolean isPangram(String sentence) {
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll(" ", "");
        char[] sentenceArray = sentence.toCharArray();
        Arrays.sort(sentenceArray);
        String sortedSentence = new String(sentenceArray);
        String uniqueSentence = "";

        for (int i = 0; i < sortedSentence.length(); i++) {
            if (i == 0 || sortedSentence.charAt(i) != sortedSentence.charAt(i - 1)) {
                uniqueSentence += sortedSentence.charAt(i);
            }
        }

        return uniqueSentence.equals(alphaString);
    }
}
