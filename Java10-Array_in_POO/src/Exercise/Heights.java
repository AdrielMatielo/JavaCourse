package Exercise;

import Entities.Individual;

import java.util.Scanner;

/*
Create a program to read the name, age, and height of N individuals.
Then, display on the screen the average height of the individuals
and also show the percentage of individuals under 16 years old,
 along with the names of those individuals if they exist.
 */
public class Heights{
    public Heights(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== HEIGHTS ======");
        System.out.print("how many individuals will be informed: ");
        int quantity = 0;
        while (quantity < 1) {
            quantity = sc.nextInt();
            sc.nextLine();
        }
        Individual[] individuals = new Individual[quantity];

        for (int i=0; i < individuals.length; i++){
            System.out.printf("Individual %d:%n",(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            individuals[i] = new Individual(name, age, height);
        }
        System.out.println();

        //Average Height
        double sumHeights = 0;
        double underAge = 0;
        for (Individual value : individuals) {
            sumHeights += value.getHeight();
            if (value.getAge() < 16)
                underAge++;
        }
        double average = sumHeights/quantity;
        System.out.printf("Average height: %.2f%n",average);

        //Percent of under Age
        double percentUnderAge = (underAge/quantity)*100;
        System.out.printf("Individuals with less than 16yo: %.1f%%%n", percentUnderAge);
        //Names of UnderAge
        for (Individual individual : individuals)
            if(individual.getAge() < 16)
                System.out.println(individual.getName());

    }
}
