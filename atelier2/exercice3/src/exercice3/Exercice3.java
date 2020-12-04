package exercice3;

public class Exercice3 {

	public static void main(String[] args) {
		for (int i = 1; i<11 ;i++) {
			if(i== 10) {
				System.out.println(i);
			}
			else {
				System.out.print(i+",");
			}
			
		}
		for (int j=0; j<11;j++) {
			if (j<10) {
				System.out.print(j+",");
			}
			if (j==10) {
				System.out.print(j);
			}
			if (j<10) {
				System.out.print(100-j+",");
			}
			
		}

	}

}
/*
 *ALGORITHME affichage_2_suite
 *variables
 *i,j:entirer;
 *pour(i egale a 1 jusqu'a 10)faire:
 *si (i =10)
 *alors
 *ecrire(i)
 *sinon
 *ecrire(i",")
 *pour j= 0 jusqu'a 10faire
 *si j<10
 *alors ecrire (j+",")
 *fin si
 *si(j=10)alors
 *ecrire (j)
 *finsi
 *si j<10
 *ecrire (100-j+",")
 *fin si
 *finpour
 */
