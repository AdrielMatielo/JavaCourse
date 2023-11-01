package entities;

public class Legal extends Person{
    private int quantityEmployee;

    public Legal(String name, Double annualIncome, int quantityEmployee) {
        super(name, annualIncome);
        this.quantityEmployee = quantityEmployee;
    }

    public int getQuantityEmployee() {
        return quantityEmployee;
    }

    public void setQuantityEmployee(int quantityEmployee) {
        this.quantityEmployee = quantityEmployee;
    }

    @Override
    public Double tax() {
        if(getQuantityEmployee() <= 10){
            return getAnnualIncome()*0.16;
        }
        else{
            return getAnnualIncome()*0.14;
        }
    }
}
