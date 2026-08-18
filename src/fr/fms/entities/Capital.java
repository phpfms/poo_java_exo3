package fr.fms.entities;

public class Capital extends City{
	
	private String monument;
	
	 public Capital(String name, String country, int nb_people, String monument) {
	        super(name, country, nb_people);
	        this.monument = monument;
	    }
	 
	 public String getMonument() {
	        return monument;
	    }

	public void setMonument(String monument) {
	    this.monument = monument;
	}
	
	@Override
	public String toString() {
	    return "capitale de " + get_name() + " en "
	        + get_country() + " ayant " + get_people()
	        + " habitants, monument : " + monument;
	}
	

}
