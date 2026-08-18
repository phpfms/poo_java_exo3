package fr.fms.entities;

import java.util.Arrays;
import java.util.List;

public class TestEntities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe[] team = new Employe[5];
		
		
		team[0] = new EmployeSalary("Paris", "France",5000, "Leponge", "Bob", 36, "Elysee à Paris", "Atlantique", 999999.0);		
		team[1] = new EmployeCommission("Washington", "USA", 7600000, "Gates", "Bill", 70, "USA", "Fondation B&M", 30);
		team[2] = new EmployeCommission("Pretoria", "Afrique du Sud", 800000, "Musk", "Elon", 55, "Palo Alto", "Tesla", 45);
		team[3] = new EmployeSalary("Pau", "France du Sud", 100000, "Cabanne", "Olivier", 25, "Pau", "Total", 50000);
		team[4] = new EmployeSalary("Tarbes", "France du Sud", 45000, "Laborde", "Colline", 30, "Tarbes", "Alstom", 30000);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(team[i]);
		}
		
		List<Employe> teamList = Arrays.asList(team);
		
		for(Employe element : team) {
			System.out.println(element);
		}
		
		System.out.println("\n");
		
		for(Employe element : team) {
			System.out.println( " salaire annuel de " + element.get_name_p() + element.get_first_name()
			+":" + Math.round( element.calculerSalaire ( element.getmoney() ) ) );
		}
		
		
	}

}
