import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Compare lengths
        if (str1.length() > str2.length()) {
            System.out.println("The first string is longer.");
        } else if (str2.length() > str1.length()) {
            System.out.println("The second string is longer.");
        } else {
            System.out.println("Both strings are of equal length.");
        }

        sc.close();
    }
    }
}
