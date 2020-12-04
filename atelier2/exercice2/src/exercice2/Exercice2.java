package exercice2;
import java.util.Scanner;
public class Exercice2 {

	public static void main(String[] args) {
		float ht,tva,n,ttc;
		Scanner scan = new Scanner(System.in);
		System.out.println(" donnez le :HT,TVA en poucentage, et le nombre d'articles ");
		ht= scan.nextFloat();
		tva= scan.nextFloat();
		n= scan.nextFloat();
		ttc= n*(ht*(1+(tva/100)));
		System.out.println("le ttc est egale a:" + ttc);
		
	}

}
/*ALGORITHME calc_TTC
 *variables
 *
 *Debut
 *ht,tva,n,ttc:reels
 *ecrire("donnez le :HT,TVA en poucentage, et le nombre d'articles ") 
 *lire(ht,tva,n,ttc);
 *ttc <-n*(1+(tva/100)))
 *ecrire("le ttc est"+ttc) 
 * Fin
 * 
 * 
 * 
 * 
 * 
 */