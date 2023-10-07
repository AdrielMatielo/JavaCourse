import java.util.Scanner;

import Exercise.Negatives;
import Exercise.SumArray;

public class Main {
    public static void main(String[] args){
        int alternative;
        if(args.length ==0){
            Scanner sc = new Scanner(System.in);
            System.out.println("List of exercises: ");
            System.out.println("1 - negatives");
            System.out.println("2 - sum array");

            System.out.print("inform the exercise: ");
            alternative = sc.nextInt();
        }
        else alternative = Integer.parseInt(args[0]);
        switch (alternative) {
            case 1 ->new Negatives();
            case 2 -> new SumArray();
            default -> System.out.println("Error!!");
        }
    }
}
