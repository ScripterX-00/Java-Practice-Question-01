// Write a Java program to input age and check if the user is eligible to vote (age ≥ 18)
import java.util.*;
public class Eligible {
    public static void main(String[] args) {
        System.out.println("Enter the age");
       try( Scanner sc = new Scanner(System.in)){
        int age=sc.nextInt();
        if(age>=18){
            System.err.println("user is eligible to vote");

        }
        else{
            System.err.println("user is not eligible to vote");
        }
    }
    
}
}
