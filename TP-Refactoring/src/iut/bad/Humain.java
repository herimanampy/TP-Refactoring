package iut.bad;

public class Humain {

	private String nom;
	private String prenom;
	private int age;
	public String getNom() {
		return nom;
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
	public void seTAge(String Age) {
		this.age = age;
	}
   public void details() {
	  System.out.println ("Nom : " + nom + "\nPrenom : " + prenom + "\nAge : " + age);
    }
   static void manger() {
	  System.out.println("manger");
   }
   static void boire() {
	 System.out.println("boire");
   }
}
	
