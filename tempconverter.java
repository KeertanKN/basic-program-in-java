import java.util.Scanner; 
public class tempconverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temperature :");
        double temp = sc.nextDouble(); 
        System.out.print("Enter to convert Celcius(C) or fahrenheit(F)  : ");
        char unit = sc.next().trim().toUpperCase().charAt(0);
        if(unit == 'C'){
            double celcuis = (temp - 31)*5.0/9.0;
            System.out.printf("%.2f'F ---> %.2f'C", temp, celcuis);
            return;
        } else if(unit == 'F'){
            double fahrenheit = (temp)*9.0/5.0 + 32;
            System.out.printf("%.2f'C ----> %.2f'F", temp, fahrenheit);
        } else {
            System.out.println("INVALID UNIT!!!");
        }
        sc.close();
    }
}