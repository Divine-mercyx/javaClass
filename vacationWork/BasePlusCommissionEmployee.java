public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;
    
    
    public BasePlusCommissionEmployee(String first, String last, String ssn, double commisionRates, double grossSales, double salary) {
        super(first, last, ssn, commisionRates, grossSales);
        setBaseSalary(salary);
    }

    
    public void setBaseSalary(double salary) {
        if (salary >= 0.0) {
            baseSalary = salary;
        } else {
            throw new IllegalArgumentException("salary should be >= 0.0");
        }
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
    public double earning() {
        return getBaseSalary() + super.earning();
    }
    
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried", super.toString() , "base salary", getBaseSalary());
    }
}
