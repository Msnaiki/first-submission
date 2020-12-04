package hello2;

class employee extends personne {
	private String cnss;
	public String cnss() {
		return cnss;
	}
	public employee( int cin, String nom, int age, String cnss) {
		this.cin = cin;
		this.nom = nom;
		this.age = age;
		this.cnss= cnss;	
	}


}
