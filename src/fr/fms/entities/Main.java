package fr.fms.entities;

public class Main {

	public static void main(String[] args) {

		Employe bob = new EmployeSalary("Paris", "France",5000, "Leponge", "Bob", 36, "Elysee à Paris", "Atlantique", 999999.0);
		System.out.println(bob);
		
		Employe bill = new EmployeCommission("Washington", "USA", 7600000, "Gates", "Bill", 70, "USA", "Fondation B&M", 25);
		Employe elon = new EmployeCommission("Pretoria", "Afrique du Sud", 800000, "Musk", "Elon", 55, "Palo Alto", "Tesla", 45);
		
		System.out.println(bill);
		System.out.println(elon);
		
	}
	
}
