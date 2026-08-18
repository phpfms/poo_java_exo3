package fr.fms.entities;

public class City {
	
	
	private String name;
	private String country;
	private int nb_people;
	
	public City(String name, String country, int nb_people) {
		this.name = name;
		this.country = country;
		
		if (nb_people >= 0) {
	        this.nb_people = nb_people;
	    } else {
	        this.nb_people = 0;
	        System.out.println("Erreur : le nombre d'habitants ne peut pas être négatif, je mets zero.");
	    }
	}
	
	public City(String name, int nb_people) {
		this.name = name;
		this.country = "inconnu";
		
		if (nb_people >= 0) {
	        this.nb_people = nb_people;
	    } else {
	        this.nb_people = 0;
	        System.out.println("Erreur : le nombre d'habitants ne peut pas être négatif, je mets zero.");
	    }
	}
	
	public City(String name, String country) {
		this.name = name;
		this.country = country;
		this.nb_people = 0;
	}

	public void f_show_city () {
		System.out.println("Nom de la ville:" + name);
		System.out.println("Pays de la ville:" + country);
		System.out.println("Nb d'habitants:" + nb_people);
	}
	
	public int f_add_people (int x) {	
		nb_people = nb_people + x;
		return nb_people;
	}
	
	public int f_minus_people (int x) {	
		
		if (nb_people -x >= 0) {
	        this.nb_people = nb_people - x;
	        
	        if ( (nb_people - x) / nb_people < 0.9) {
	        	System.out.println("vous avez enlevé plus de 10%");
	        }
  
	    } else {
	        System.out.println("Erreur : le nombre d'habitants ne peut pas être négatif.");
	    }
		
		return nb_people;
	}
	
	public String get_name() {
		return name;		
	}
	
	public String get_country() {
		return country;		
	}
	
	public int get_people() {
		return nb_people;		
	}
	
	public void set_name(String name) {
		this.name = name;		
	}
	
	public void set_country(String country) {
		this.country = country;	
	}
	
	public void set_people(int people) {
		this.nb_people = people;		
	}
	
	public void get_city() {
	System.out.println(" [ville : " + get_name() + "] [pays : "
	+ get_country() + "] [nombre d'habitants : " +  get_people()+ "]");
	}
	
	public void display() {
		System.out.println(" ville de " + get_name() + " en "
		+ get_country() + " ayant " +  get_people()+ " habitants");
		}
	
	public String toString() {
		return " ville de " + get_name() + " en "
		+ get_country() + " ayant " +  get_people()+ " habitants";
		}
 
	
}
