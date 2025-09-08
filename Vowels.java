// Write a program to input a string and count the number of vowels in it.
import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        try (Scanner sc = new Scanner(System.in)) {
            String vowl = sc.nextLine();
            
            int count = 0; // to store number of vowels
            
            for(int i = 0; i < vowl.length(); i++) {
                char ch = Character.toLowerCase(vowl.charAt(i));
                
                switch(ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> count++; // increase count when vowel found
                }
            }
            
            System.out.println("Number of vowels: " + count);
        }
    }
}
