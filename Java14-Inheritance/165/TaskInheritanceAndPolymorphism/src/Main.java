import entities.Legal;
import entities.Natural;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<taxPayers; i++) {
            System.out.print("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company(i / c)?");
            char typeTax = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if(typeTax == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                Natural natural = new Natural(name, anualIncome, healthExpenditures);
                persons.add(natural);
            }
            if(typeTax == 'c'){
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                sc.nextLine();

                Legal legal = new Legal(name, anualIncome, numberEmployees);
                persons.add(legal);
            }
        }
        System.out.println("TAXES PAID:");
        Double totalTax = 0.0;
        for(Person p: persons){
            System.out.println(p.getName()+ ": $"+ String.format("%.2f", p.tax()));
            totalTax += p.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $"+ String.format("%.2f",totalTax));
    }
}