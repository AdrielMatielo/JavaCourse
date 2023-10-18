import Entities.Department;
import Entities.Enums.WorkLevel;
import Entities.HourContract;
import Entities.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt_dd_MM_yyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.print("Enter worker data: \n");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine().toUpperCase();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkLevel.valueOf(level), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int manyContracts = sc.nextInt();
        sc.nextLine();

        for (int i =0 ; i < manyContracts; i++){
            System.out.printf("Enter contract #%d data: %n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt_dd_MM_yyyy);
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
            System.out.println();
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String income = sc.nextLine();
        LocalDate calculateIncome = LocalDate.parse("01/"+income, fmt_dd_MM_yyyy);
        System.out.println("Name: "+ worker.getName());
        System.out.println("Department: "+ worker.getDepartment().getName());
        System.out.println("Income for "+ income+ ": "+ worker.income(calculateIncome.getYear(), calculateIncome.getMonthValue()));

        sc.close();
    }
}