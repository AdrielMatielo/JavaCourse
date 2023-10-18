package Entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate localDate;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(LocalDate contractDate, Double valuePerHour, Integer hours) {
        this.localDate = contractDate;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue(){
        return getValuePerHour() * getHours();
    }
}
