import java.util.Scanner; 
public class simplequiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Simple Quiz");
        System.out.println("Answer the all question by typing A, B, or C.");

        System.out.println("1. which planet is called Red Planet: ");
        System.out.println("A.venus  B.mars  C.jupiter ");
        if(sc.nextLine().trim().equalsIgnoreCase("B")){
            score++;
        }
        System.out.println("2. What is 5 + 3 ");
        System.out.println("A.9  B.111. C.8");
        if(sc.nextLine().trim().equalsIgnoreCase("C")){
            score++;
        }
        System.out.println("3. what is 10 + 22. ");
        System.out.println(" A.123  B.32  C.234");
        if(sc.nextLine().trim().equalsIgnoreCase("B")){
            score++;
        }
        System.out.println("\n Quiz finishesd: your score: "+ score + " out of 3 ");
        sc.close();
    }
}