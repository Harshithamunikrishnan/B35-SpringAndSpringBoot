package org.tnsif.dicollection;
import java.util.List;
import java.util.Map;
import java.util.Set;
//program to demonstrate DI in terms of Collection
public class CollectionDemo {

	//DI in terms of collection
	private List<String> fruits;
	private Set<String> cricketers;
	private Map<String, String> countryCapital;

	
	//DI using setters
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}

	public void setCountryCapital(Map<String, String> countryCapital) {
		this.countryCapital = countryCapital;
	}

	// business logic that uses the injected values...
	public void display() {

		System.out.println("Fruits...." + "");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("\nCricketers...." + "");

		for (String cricketer : cricketers) {
			System.out.println(cricketer);
		}

		System.out.println("\nCountry and Capital...." + "");

		Set<String> keys = countryCapital.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + countryCapital.get(key));
		}
	}
}