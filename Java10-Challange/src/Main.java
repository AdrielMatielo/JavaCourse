/*
The owner of a pension has ten rooms available for rent to students,
and these rooms are identified by numbers from 0 to 9.
Create a program that starts with all ten rooms empty.
Then, read a quantity N representing the number of students who will rent rooms (N can be from 1 to 10).
Next, record the rental of the N students.
For each rental record, provide the name and email of the student,
as well as which room they chose (from 0 to 9). Assume that a vacant room is chosen.
Finally, your program should print a report of all the pension's occupancies,
in room order, as shown in the example.
 */

import entities.Student;

import java.util.Scanner;

public class Main {
    public static final int MAX_ROOMS = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] pension = new Student[MAX_ROOMS];

        System.out.print("How many rooms will be rented: ");
        int rent = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<rent; i++){
            System.out.printf("Rent #%d:%n",i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            pension[room] = new Student(name, email);
        }
        System.out.println("Busy rooms:");
        for(int i=0; i< pension.length; i++){
            if(pension[i] != null) {
                System.out.printf("%d: %s%n",i, pension[i].toString());
            }
        }


        sc.close();
    }
}
