import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number table is required : ");
        int num = sc.nextInt();
        for(int i =1; i<11; i++){
            System.out.printf("%d * %d = %d \n", num, i, num*i);
        }
        sc.close();
    }
}