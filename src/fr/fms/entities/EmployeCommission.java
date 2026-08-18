package fr.fms.entities;

public class EmployeCommission extends Employe{
	
	private double pourcentage;

    public EmployeCommission(City city, String name, String first_name,
                              int age, String adress, String entreprise,
                              double pourcentage) {

        super(city, name, first_name, age, adress, entreprise);
        this.pourcentage = pourcentage;
    }
    
    public EmployeCommission(String city, String country, int nb_people, String name, String first_name, int age,
			String adress, String entreprise, double pourcentage) {

		super(city, country, nb_people, name, first_name, age, adress, entreprise);
		this.pourcentage = pourcentage;
	}
    
    @Override
    public String toString() {
        return super.toString()
            + " [pourcentage=" + pourcentage + "%]";
    }

    @Override
    public double calculerSalaire(double chiffreAffaires) {
        return chiffreAffaires * pourcentage / 100;
    }

}
