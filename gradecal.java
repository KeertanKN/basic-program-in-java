import java.util.Scanner;
public class gradecal {
    private static boolean isValid(double score) {
    return score >= 0 && score <= 100;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the score of A : ");
        double scoreA = sc.nextDouble();
        
        System.out.print("Enter the score of B : ");
        double scoreB = sc.nextDouble();

        System.out.print("Enter the score of C : ");
        double scoreC = sc.nextDouble();


        if( !isValid(scoreA) || !isValid(scoreB) || !isValid(scoreC)){
            System.out.println("Enter score is not valis it should between(0 -- 100) ");
            sc.close();
            return;
        }

        double avg = (scoreA + scoreB + scoreC)/3.0;
        char grade;
        if(avg >= 90){
            grade = 'A';

        } else if(avg >= 80){
            grade = 'B';

        } else if(avg >= 70){
            grade = 'C';
        } else if(avg >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.printf("average score : %.2f and grade is : %c\n", avg, grade);
        sc.close();
    }
}