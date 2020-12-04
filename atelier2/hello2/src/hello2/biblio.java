package hello2;
import java.util.*;
public class biblio {
	public static void main(String []args) {
		
		//declaration des variables
		
		  int option=1;
		  
		//
		//creation des outils
		 Scanner scanner = new Scanner(System.in);
		
		//creation des array list et populations
		ArrayList <etudiant>  e = new ArrayList <etudiant>();
		e.add(new etudiant(1,"mehdi",27,345));
		e.add(new etudiant(2,"anas",20,241));
		e.add(new etudiant(3,"yassine",19,512));
		
		
		  
		ArrayList <livre>  l = new ArrayList <livre>();
		l.add(new livre("12","oregairu"));
		l.add(new livre("24","mahouka kouko no rettosei"));
		l.add(new livre("54","tate no yuusha no naniagare"));
		l.add(new livre("3","fate; heavan's feel"));
		l.add(new livre("13","fate; heavan's feel"));
		
	
		ArrayList <employee> emp =new ArrayList <employee>();
		
		emp.add(new employee(2,"reda",31,"sad3451"));
		emp.add(new employee(7,"kamal",31,"ezr097"));
		emp.add(new employee(9,"reda",31,"verg2334"));
		emp.add(new employee(14,"reda",31,"kjnsdfk67"));
		
		//message de reception
		System.out.println("choisissez la section:\n 0:etudiants.\n 1:employé\n 2:livres");
		
		if(option == 0) {
			System.out.println("choix bien recçu");
		}
		else {
			System.out.println("votre choix n'est pas valide");
		}
		
		
				
	}
}