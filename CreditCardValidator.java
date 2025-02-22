import java.util.regex.*;
import java.util.*;
public class CreditCardValidator{
    public static boolean isValidCreditCard(String cardNumber){
        String visaPattern = "^4\\d{15}$";
        String masterCardPattern = "^5[1-5]\\d{14}$";
        return cardNumber.matches(visaPattern) || cardNumber.matches(masterCardPattern);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNumber=sc.nextLine();
        if (isValidCreditCard(cardNumber)) {
            System.out.println("Valid credit card number.");
        } 
        else{
            System.out.println("Invalid credit card number.");
        }
    }
}
