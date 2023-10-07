package Exercise;

import java.util.Scanner;

/*

Create a program to read an array of N integers.
Then, display on the screen the arithmetic average of only the even numbers read, with one decimal place.
If no even number is entered, display the message "NO EVEN NUMBERS."
 */
public class AverageEven {
    Scanner sc = new Scanner(System.in);
    public AverageEven(){
        System.out.println("====== AVERAGE EVEN NUMBERS ======");
        System.out.print("how many numbers will be read: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        int[] array = new int[quantity];
        double evenQuantity = 0;
        double evenNumber = 0;

        for (int i=0; i < array.length; i++){
            System.out.printf("Inform number %d: ",(i+1));
            array[i] = sc.nextInt();
            if ((array[i] % 2) == 0) {
                evenNumber += array[i];
                evenQuantity++;
            }
        }
        if (evenNumber > 0){
            System.out.printf("Average even numbers = %.1f%n", evenNumber/evenQuantity);
        }else{
            System.out.println("NO EVEN NUMBERS.");
        }

    }
}
