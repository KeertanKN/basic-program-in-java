import java.util.Scanner;
public class basicCalculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = sc.nextDouble();
        System.out.println("Enter the operater(+, -, *, /) : ");
        char operater = sc.next().charAt(0);
        System.out.println("Enter the second number : ");
        double secondNumber = sc.nextDouble();
        switch(operater){
            case '+':
                System.out.println("Result : " + (firstNumber + secondNumber));
                break;
            case '-' :
                System.out.println("Result : " + (firstNumber - secondNumber));
                break ;
            case '*':
                System.out.println("Result : " + (firstNumber * secondNumber));
                break;
            case '/' :
                System.out.println("Result : " + ( firstNumber / secondNumber));
                break;
            default :
                System.out.println("Invalid operater !! ");
        }
    }
    
}
