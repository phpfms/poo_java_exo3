package fr.fms.entities;

public class Employe extends Personne {
	
	private String entreprise;
	private Double salaire;
	
	public Employe(City city, String name, String first_name, int age, String adress, String entreprise, Double salaire)
	{
        super(city, name, first_name, age, adress);
        this.setEntreprise(entreprise);
        this.setSalaire(salaire);
    }
	
	public Employe(String city, String country, String name, String first_name, int age, String adress,
			String entreprise, double salaire) {

		super(new City(city, country), name, first_name, age, adress);

		this.setEntreprise(entreprise);
		this.setSalaire(salaire);
	}
	
	public Employe(String city, String country, int nb_people, String name, String first_name, int age, String adress,
			String entreprise, double salaire) {

		super(new City(city, country, nb_people), name, first_name, age, adress);

		this.setEntreprise(entreprise);
		this.setSalaire(salaire);
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
	    return "Person "
	        + "[ lastName=" + get_name_p()
	        + ", FirstName=" + get_first_name()
	        + ", age=" + get_age()
	        + ", adress=" + get_adress()
	        + " ]"
	        + " BornCity ["
	        + get_city().get_name()
	        + " stat=" + get_city().get_country()
	        + " nb hab=" + get_city().get_people()
	        + " ]"
	        + " [entreprise=" + entreprise
	        + " salaire=" + salaire
	        + " ]";
	}

}
