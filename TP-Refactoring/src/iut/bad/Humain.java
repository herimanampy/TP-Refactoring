package iut.bad;

public class Humain {

	private String nom;
	private String prenom;
	private int age;
	public String getNom() {
		return nom;
	}
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void seTAge(int age) {
		this.age = age;
	}
   public void details() {
	  System.out.println ("Nom : " + nom + "\nPrenom : " + prenom + "\nAge : " + age);
    }
   public void ami(Humain h, int dur�e) {
      System.out.println(this.nom + " " + this.prenom + " est ami avec " + h.nom + " dur�e :" + dur�e);
 }
}
	
