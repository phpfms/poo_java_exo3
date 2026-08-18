package fr.fms.entities;

public abstract class Personne {
	
	private City city;
	private String name;
	private String first_name;
	private int age;
	private String adress;
	
	public Personne(City city, String name, String first_name, int age, String adress) {
		
		this.city = city;
		this.name = name;
		this.first_name = first_name;
		this.adress = adress;
		
		
		if (age >= 0) {
	        this.age = age;
	    } else {
	        this.age = 0;
	        System.out.println("Erreur : age ne peut pas être négatif, je mets zero.");
	    }
	}
	
	public City get_city() {
	    return city;
	}
	
	public String get_city_name() {
		return city.get_name();		
	}
	
	public String get_country_name() {
		return city.get_country();		
	}
	
	public String get_name_p() {
		return name;		
	}
	
	public String get_first_name() {
		return first_name;		
	}
	
	public int get_age() {
		return age;		
	}
	
	public String get_adress() {
		return adress;		
	}
	
	
	
	public String toString() {
		return"Person " +
		"[ lastName=" + get_name_p() + ", FirstName="
		+ get_first_name() + ", age= " +  get_age()+ ", adress=" + get_adress() + "]"
				+ " BornCity [" + city.get_name() + " stat=" + city.get_country() +  " nb hab=" + city.get_people() + "]";
	}

}

