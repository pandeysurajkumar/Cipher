
import java.util.*;
public class Question_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        int marks = sc.nextInt();
        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 80 && marks < 90) {
                System.out.println("Grade B");
            } else if (marks >= 70 && marks < 80) {
                System.out.println("Grade C");
            } else if (marks >= 60 && marks < 70) {
                System.out.println("Grade D");
            } else {
                System.out.println("Grade F");
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer between 0 and 100.");
        }
    }
}