public class CommissionEmployee {

    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double commisionRate;
    protected double grossSales;
    
    public CommissionEmployee(String first, String last, String ssn, double commisionRates, double grossSales) {
        firstName = first;
        lastName = last;
        setSocialSecurityNumber(ssn);
        setCommisionRate(commisionRates);
        setGrossSale(grossSales);
    }
    
    
    public void setFirstName(String first) {
        firstName = first;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String last) {
        lastName = last;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    private void setSocialSecurityNumber(String ssn) {
        if (ssn.matches("\\d{3}-\\d{3}--\\d{3}")) {
            socialSecurityNumber = ssn;
        } else {
            throw new IllegalArgumentException("ssn is not valid, length less than 9");
        }
    }
    
    private void setSocialSecurityNumber(String ssn) {
        if (ssn.matches("\\d{9}")) {
            socialSecurityNumber = ssn;
        } else {
            throw new IllegalArgumentException("ssn is not valid, length less than 9");
        }
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public void setCommisionRate(double rates) {
        if (rates > 0 && rates < 1.0) {
            commisionRate = rates;
        }
        else {
            throw new IllegalArgumentException("commision rate must be > 0 and < 1.0");
        }
    }
    
    public double getCommisionRate() {
        return commisionRate;
    }
    
    public void setGrossSale(double gross) {
        if (gross >= 0) {
            grossSales = gross;
        } else {
            throw new IllegalArgumentException("gross sales must be >= zero");
        }
    }
    
    public double getGrossSale() {
        return grossSales;
    }
    
    public double earning() {
        return getCommisionRate() * getGrossSale();
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commision employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sale", grossSales, "commission rate", commisionRate);
    }
}
