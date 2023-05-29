package niveaux;
import jeu.*;

public class niveau_3 {
	static Aventurier Moi = new Aventurier();
	public static void main (String[] args){

		 /**************
		 * Contrairement à ce que vous pensiez, la forêt semble s'eclaircir peu à peu. 
		 * Cette direction était donc la bonne ! Autour de vous, la dense forêt devient
		 * une forêt clairsemé, jusqu'à ce que vous atteigniez finalement une clairière.
		 * Au centre de celle ci se dresse le Candhi Barabudhur, un temple boudhiste bâtie 
		 * à l'époque de la dynastie Sailendra. Vous apercevez une foule de personnes au loin. 
		 * Vous vous approchez pour chercher de l'aide. En fonction de qui ils sont, 
		 * vous allez devoir agir de differentes façons...
		 * (Découvrez qui ils sont avec Moi.quiSontIls() .)
		 * 
		 * Voici une liste des personnes et des actions à faire en fonction :
		 * Moines -> chercherDeLAide()
	 	 * Marchands -> echanger()
		 * Pirates -> fuir()
		 * PiratesEnerves -> fuirEnEvitantLesBalles()
		 * Touristes -> demanderDirections()
		 ***/
		System.out.println(Moi.quiSontIls());

	}
}