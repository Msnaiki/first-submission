package lastfunctio;
import java.util.Scanner;
public class Lastfunctio {

	public static void main(String[] args) {
		String gender;
		int  age;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("give age and sex(female ou male)");
		
		gender = scan.next();
		if(gender=="male" || gender == "female") {
			age= scan.nextInt();
			if (age>0) {
			Ldafunction person = new Ldafunction (gender,age);
			if (person.getAge()<0) {
				System.out.println("vous etes: "+ person.getGender()+ "et vous etes mineur" );
			}
			else {
				System.out.println("vous etes: "+ person.getGender()+ "et vous etes majeur" );
			}
			
			}
			else {
				System.out.println("data invalide");
			}
		}
		else {System.out.println("data invalide");}
		
		
		
				
	
	

	}

}
/*ALGORITHM age_sex
 * les variables
 * gender:chaine de characteres
 * age:entier
 * debut
 * ecrire ("donnez le sex")
 * lire (gender)
 * si(gender egale "male' ou gender egale "female")alors
 * ecrire("donnez age")
 * lire (age)
 * si (age>0)alors
 * si(age<18)alors
 * ecrire ("vous etes"+gender+"et vous etes mineur")
 * sinon
 * ecrire ("vous etes"+gender+"et vous etes majeur")
 * fin si
 * sinon 
 * ecrire ("data invalid")
 * sinon ("data invalid")
 * fin si
 * fin
 */
