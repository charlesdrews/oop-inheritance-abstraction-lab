/**
 * Created by charlie on 3/24/16.
 */
public class HouseholdSingleIncome extends Household {
    private double annualIncome;

    public HouseholdSingleIncome(String surname, Pet pet, double annualIncome) {
        super(surname, pet);
        this.annualIncome = annualIncome;
    }

    @Override
    public void gainIncome() {
        this.wealth += annualIncome;
        this.lastYearsIncome = annualIncome;
        String incomeString = String.format("$%,.0f", annualIncome);
        System.out.println("The " + this.surname + " family earned " + incomeString + " from 1 earner");
    }
}
