package entities;

public class Natural extends Person{

    private Double healthExpenditures;

    public Natural(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    private Double healthRebate(){
        return getHealthExpenditures()*0.5;
    }
    @Override
    public Double tax(){
        if(getAnnualIncome() < 20000) {
            return getAnnualIncome() * 0.15 - healthRebate();
        }
        else {
            return getAnnualIncome() * 0.25 - healthRebate();
        }
    }

}
