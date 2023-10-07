import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int qnt = sc.nextInt();
        sc.nextLine();

        List<Employee> vect = new ArrayList<>();
        System.out.println();
        for(int i = 0; i < qnt; i++){
            System.out.println("Employee #"+(i+1)+":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(vect, id)){
                System.out.println("ID already taken, please try again: ");
                System.out.print("Id: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            vect.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        //search for ID
        Employee name = vect.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(name != null){
            System.out.print("Enter the percentage:");
            name.salaryIncrease(sc.nextDouble());
        }else
            System.out.println("This id does not exist!");

        System.out.println();
        System.out.println("List of employees:");
        for (Employee x: vect)
            System.out.println(x.toString());
    }
    public static boolean hasId(List<Employee> list, int id){
        Employee ID = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return ID != null;
    }
}
