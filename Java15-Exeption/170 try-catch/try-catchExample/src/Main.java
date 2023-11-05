import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();

            System.out.println(vect[position]);
        }
        //if value of position is out of vect
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position!");
        }
        //if value of position is different of natural number
        catch (InputMismatchException e){
            System.out.println("Input error!");
        }
        catch (Exception e){
            System.out.println("Uncategorized error");
        }
        System.out.println("Fim do Programa!");
        sc.close();
    }
}