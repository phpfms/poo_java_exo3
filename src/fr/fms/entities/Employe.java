package fr.fms.entities;

public abstract class Employe extends Personne {
	
	private String entreprise;
	protected static final double CA = 500000;
	
	public Employe(City city, String name, String first_name, int age, String adress, String entreprise)
	{
        super(city, name, first_name, age, adress);
        this.setEntreprise(entreprise);
    }
	
	public Employe(String city, String country, String name, String first_name, int age, String adress,
			String entreprise) {

		super(new City(city, country), name, first_name, age, adress);

		this.setEntreprise(entreprise);
	}
	
	public Employe(String city, String country, int nb_people, String name, String first_name, int age, String adress,
			String entreprise) {

		super(new City(city, country, nb_people), name, first_name, age, adress);

		this.setEntreprise(entreprise);
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	public abstract double getmoney();

	
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
	       // + " nb hab=" + get_city().get_people()
	        + " ]"
	        + " [entreprise=" + entreprise
	        + " ]";
	}
	
	public abstract double calculerSalaire(double valeur);

}
