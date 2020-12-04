package hello2;

 class etudiant extends personne{
	private String CNE;
	public String get_CNE() {
		return CNE;
	}
public etudiant( int cin, String nom, int age, int CNE) {
	this.cin = cin;
	this.nom = nom;
	this.age = age;
	this.CNE= CNE;
}
}
