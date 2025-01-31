import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total cart amount: ");
        double totalCartAmount=sc.nextDouble();
        double discount=0;
        double finalAmount=0;
        if(totalCartAmount>5000){
            discount=totalCartAmount*0.20;
            finalAmount=totalCartAmount-discount;
        }
        else if(totalCartAmount>=3000 && totalCartAmount<=5000){
            discount=totalCartAmount*0.10;
            finalAmount=totalCartAmount-discount;
        }
        else{
            finalAmount=totalCartAmount;
        }
        System.out.printf("Discount: ₹%.1f\n", discount);
        System.out.printf("Final Amount: ₹%.1f\n", finalAmount);

    }
}
