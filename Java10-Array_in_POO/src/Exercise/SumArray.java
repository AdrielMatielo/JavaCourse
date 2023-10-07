package Exercise;

import java.util.Scanner;

/*
Create a program that reads N real numbers and stores them in an array. Then:
Print all the elements of the array.
Display on the screen the sum and the average of the elements in the array.
 */
public class SumArray {
    public SumArray(){
        System.out.println("====== SUM ARRAY ======");
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers will be read: ");
        int quantity = sc.nextInt();
        double[] array = new double[quantity];

        for (int i=0; i < array.length; i++){
            System.out.printf("Inform number %d: ",(i+1));
            array[i] = sc.nextDouble();
        }
        System.out.println();
        double sum = 0;
        System.out.print("VALUES = ");
        for (double v : array) {
            System.out.printf("%.1f ", v);
            sum += v;
        }
        System.out.println();
        System.out.printf("SUM = %.2f%n", sum);
        double average = sum/quantity;
        System.out.printf("AVERAGE = %.2f%n", average);


        sc.close();
    }

}
