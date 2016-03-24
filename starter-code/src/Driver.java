import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		//Create households and add to list or array
		ArrayList<Household> households = new ArrayList<Household>(3);
		households.add(new HouseholdSingleIncome("Smith", new Dog("Fido"), 50000));
		households.add(new HouseholdDoubleIncome("Jones", new Cat("Fluffy"), 45000, 40000));
		households.add(new HouseholdSingleIncome("Johnson", new Fish("Nemo"), 65000));
		
		//iterate through list or array and perform required actions
		for (Household household : households) {
			System.out.println("\nThe " + household.getSurname() + " household:");
			household.gainIncome();
			household.payTaxes();
			household.pet.feed();
			household.pet.groom();
			household.pet.playWith();
		}
	}

}
