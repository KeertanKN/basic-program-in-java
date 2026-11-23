import java.util.Random;
import java.util.Scanner;
public class gussrandom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretnumber = rand.nextInt(100) + 1;
        int attempt = 0, guess = 0 ;

        System.out.println("I choose number between 1 to 100 ");
        while(guess != secretnumber){
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempt++;
            if(guess > secretnumber){
                System.out.println("number is too high");
            } else if(guess < secretnumber) {
                System.out.println("number is too Low");
            } else{
                System.out.println("Number is correct");
                System.out.println("You guess the number in " + attempt);
            }
        }
        sc.close();
    }
}