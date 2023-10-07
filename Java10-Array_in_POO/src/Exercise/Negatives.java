package Exercise;

import java.util.Scanner;

/*
Create a program that reads a positive integer number N (maximum = 10) and then N integer numbers and stores them in an array.
Then, display on the screen all the negative numbers that were read.
 */
public class Negatives {
    Scanner sc = new Scanner(System.in);

    public Negatives(){
        System.out.println("====== NEGATIVE NUMBERS ======");
        System.out.print("how many numbers will be read: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        int[] array = new int[quantity];

        for (int i=0; i < array.length; i++){
            System.out.printf("Inform number %d: ",(i+1));
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NEGATIVE NUMBERS:");
        for (int i=0; i < array.length; i++){
            if (array[i] < 0)
                System.out.println(array[i]);
        }



    }

}
