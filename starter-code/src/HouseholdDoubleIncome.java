/**
 * Created by charlie on 3/24/16.
 */
public class HouseholdDoubleIncome extends Household {
    private double annualIncome1, annualIncome2;

    public HouseholdDoubleIncome(String surname, Pet pet, double annualIncome1, double annualIncome2) {
        super(surname, pet);
        this.annualIncome1 = annualIncome1;
        this.annualIncome2 = annualIncome2;
    }

    @Override
    public void gainIncome() {
        double annualIncome = annualIncome1 + annualIncome2;
        this.wealth += annualIncome;
        this.lastYearsIncome = annualIncome;
        String incomeString = String.format("$%,.0f", annualIncome);
        System.out.println("The " + this.surname + " family earned " + incomeString + " from 2 earners");
    }
}
