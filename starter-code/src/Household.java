/**
 * Created by charlie on 3/24/16.
 */
public abstract class Household {
    protected String surname;
    protected double wealth, lastYearsIncome;
    protected Pet pet;

    public Household(String surname, Pet pet) {
        this.surname = surname;
        this.pet = pet;
    }

    public abstract void gainIncome();

    public void payTaxes() {
        double taxAmt = 0.2 * lastYearsIncome;
        wealth -= taxAmt;
        String taxString = String.format("$%,.0f", taxAmt);
        System.out.println("The " + surname + " family paid " + taxString + " in taxes");
    }

    public String getSurname() { return surname; }
}
