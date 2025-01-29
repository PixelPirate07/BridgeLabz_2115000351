import java.util.*;
public class Guessing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100");
        System.out.println("Respond with 'higher' if the guess is too low,'lower' if it's too high,or 'correct' if I guess your number");
        int low=1;
        int high=100;
        String feedback;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            feedback=sc.nextLine().toLowerCase();
            if (feedback.equals("correct")) {
                System.out.println("Number guessed");
                break;
            } 
            else if(feedback.equals("higher")){
                low=guess+1;
            } 
            else if(feedback.equals("lower")){
                high=guess-1;
            } 
            else {
                System.out.println("Invalid feedback!Please respond with 'higher','lower',or 'correct'");
            }
        }
    }
    public static int generateGuess(int low,int high) {
        Random random=new Random();
        return random.nextInt(high-low+1)+low;
    }
}
