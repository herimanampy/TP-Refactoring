package iut.bad;

public class Femme extends Humain{
	

public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
		
	}

public static void main(String[]args) {
	Femme soa = new Femme("soa","faly",14);
	Homme rabe = new Homme("rabe","ndrina",15);
	
	soa.ami(rabe, 100);
  }
}