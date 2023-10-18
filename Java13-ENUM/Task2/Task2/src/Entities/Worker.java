package Entities;

import Entities.Enums.WorkLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double BaseSalary;

    private Department department;
    private List<HourContract> contracts;

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        BaseSalary = baseSalary;
        this.department = department;
        contracts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = getBaseSalary();
        for (HourContract c : contracts){
            int c_year = c.getLocalDate().getYear();
            int c_month = c.getLocalDate().getMonthValue();
            if ((year == c_year) && (month == c_month)){
                sum += c.totalValue();
            }
        }
        return sum;
    }


}
