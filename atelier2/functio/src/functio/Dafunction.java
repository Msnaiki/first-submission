package functio;

public class Dafunction {
private String nom;
private String prenom;
private int age;
public Dafunction(String nom,String prenom,int age) {
	this.nom=nom;
	this.prenom=prenom;
	this.age=age;
};
public String getNom() {
	return this.nom;
}
public String getPrenom() {
	return this.prenom;
}
public int getAge() {
	return this.age;
}

}
