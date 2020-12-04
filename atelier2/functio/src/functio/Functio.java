package functio;
import java.util.Scanner;

public class Functio {

	public static void main(String[] args) {
		String nom,prenom;
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez le nom le prenom et age");
		nom = scan.next();
		prenom = scan.next();
		age = scan.nextInt();
		
		Dafunction me = new Dafunction(nom,prenom,age);
		System.out.print("Bonjour "+ me.getNom()+ " "+ me.getPrenom()+" votre age est "+ me.getAge());
	

	}

}
/*ALGORITHME nom_age
 * variables
 * nom,prenom:chaine de charactere;
 * age:entier
 * Debut
 * ecrire("entrez le nom le prenom et age")
 * lire(nom,prenom,age)
 * ecrire ("bonjour"+nom+prenom "votre age est"+ age)
Fin*/


