package mrChibuzor.vacation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        getDetails();
    }

    public static double getCompoundInterest(double initialInvestment, double monthlyContribution, int lengthOfTimeInYears, double estimatedInterestRate, int compoundFrequency) {
        estimatedInterestRate = estimatedInterestRate / 100;
        double compoundInterest = initialInvestment * Math.pow((1 + estimatedInterestRate / compoundFrequency), (compoundFrequency * lengthOfTimeInYears)) + monthlyContribution * (((Math.pow((1 + estimatedInterestRate / compoundFrequency), (compoundFrequency * lengthOfTimeInYears)) - 1) / (estimatedInterestRate / compoundFrequency)));
        return compoundInterest;
    }


    public static void getDetails() {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                System.out.println("Enter initial investment: ");
                double initialInvestment = input.nextDouble();
                System.out.println("Enter monthly contribution: ");
                double monthlyContribution = input.nextDouble();
                System.out.println("Enter length of time in years: ");
                int lengthOfTimeInYears = input.nextInt();
                System.out.println("enter estimated interest rate: ");
                double estimatedInterestRate = input.nextDouble();
                System.out.println("Enter compound frequency: ");
                int compoundFrequency = input.nextInt();
                double compoundInterest = getCompoundInterest(initialInvestment, monthlyContribution, lengthOfTimeInYears, estimatedInterestRate, compoundFrequency);
                System.out.printf("\nCompound Interest: %f\n", compoundInterest);
                continueLoop = false;
            }
            catch (InputMismatchException e) {
                System.err.printf("\nException: %s\n", e);
                input.nextLine();
                System.out.print("you must enter valid input");
            }
        } while (continueLoop);
    }
}
