package niveaux;
import jeu.*;

public class niveau_3 {
	static Aventurier Moi = new Aventurier();
	public static void main (String[] args){

		 /**************
		 * Contrairement � ce que vous pensiez, la for�t semble s'eclaircir peu � peu. 
		 * Cette direction �tait donc la bonne ! Autour de vous, la dense for�t devient
		 * une for�t clairsem�, jusqu'� ce que vous atteigniez finalement une clairi�re.
		 * Au centre de celle ci se dresse le Candhi Barabudhur, un temple boudhiste b�tie 
		 * � l'�poque de la dynastie Sailendra. Vous apercevez une foule de personnes au loin. 
		 * Vous vous approchez pour chercher de l'aide. En fonction de qui ils sont, 
		 * vous allez devoir agir de differentes fa�ons...
		 * (D�couvrez qui ils sont avec Moi.quiSontIls() .)
		 * 
		 * Voici une liste des personnes et des actions � faire en fonction :
		 * Moines -> chercherDeLAide()
	 	 * Marchands -> echanger()
		 * Pirates -> fuir()
		 * PiratesEnerves -> fuirEnEvitantLesBalles()
		 * Touristes -> demanderDirections()
		 ***/
		System.out.println(Moi.quiSontIls());

	}
}