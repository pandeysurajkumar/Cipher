
import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value: ");
        int integer=sc.nextInt();
        System.out.println("Enter the double value: ");
        double doubleValue=sc.nextDouble();
        System.out.println("Enter the character value: ");
        char charValue=sc.next().charAt(0);
        System.out.println("Enter the boolean value: ");
        boolean booleanValue=sc.nextBoolean();
        System.out.println("Before conversion: ");
        System.out.println("Integer value: "+integer);  
        System.out.println("Double value: "+doubleValue);
        System.out.println("Character value: "+charValue);
        System.out.println("Boolean value: "+booleanValue);
        double convertedInt=(double)integer;
        int convertedChar=(int)charValue;
        System.out.println("After conversion: ");
        System.out.println("Integer value: "+convertedInt);
        System.out.println("Character value: "+convertedChar);

    }
}
