package fr.fms.entities;

public class EmployeSalary extends Employe{
	
	private double salaire;

    public EmployeSalary(City city, String name, String first_name,
                       int age, String adress, String entreprise,
                       double salaire) {

        super(city, name, first_name, age, adress, entreprise);
        this.salaire = salaire;
    }
    
	public EmployeSalary(String city, String country, int nb_people, String name, String first_name, int age,
			String adress, String entreprise, double salaire) {

		super(city, country, nb_people, name, first_name, age, adress, entreprise);
		this.salaire = salaire;
	}
	
	public double getmoney() {
		return salaire;
	}

    
    @Override
    public String toString() {
        return super.toString()
            + " [salaire fixe=" + salaire + "]";
    }

    @Override
    public double calculerSalaire(double salaire) {
    	
    	if (salaire < 0) {
    		System.out.println("Erreur : le salaire ne peut pas être négatif, je mets 0.");
    		salaire = 0.0;
    	}	

        return salaire * 0.8;
    }
   
}
