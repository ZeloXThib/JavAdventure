package niveaux;
import java.util.Arrays;

import jeu.*;
public class niveau_4 {
	
	/****************
	* Vous �tes maintenant sur une route de pierre. 
	* Sans �tre exempt de toutes herbes dans les interstices entre les blocs de pierres la composant, 
	* cette route semble bien entretenue. A intervalles r�guliers, d'une dizaine de m�tres, 
	* se trouvent des piliers orn�s de petites statues taill�s dans la m�me roche. 
	* Vous marchez pendant quelques centaines de m�tres, sans trop savoir o� vous allez, avant de tomber sur un pilier orn� 
	* d'un pic. 
	* En vous approchant, vous remarquez que c'est en fait un panneau. 
    * L'�criture est cependant incompr�hensible. L'alphabet est bien d'origine latine, mais les mots n'ont aucun sens. 
    * Le javanais est une bien �tra..... Mais.. Mais.. Ce n'est pas du javanais! 
    * Vous reconnaissez ce type d'�criture, c'est du texte auquel on a appliqu� un chiffrage en code C�sar !
    * Il vous faudra d�chiffrer ce panneau si vous voulez continuer...
    * Si vous ne connaissez pas le code c�sar, allez jeter un oeil sur la documentation du niveau 4, sur le site.
    * 
    * Attention ! Pour Cette partit, vous devrez faire la fonction d�coder, mais ne pas toucher au Main !
	*****/
	
	/**decoder(char[] c) : Prend en entr�e une chaine de caract�re sous forme d'un tableau de caract�res 
	 * chiffr� par d�calage (autrement appel� code c�sar), en sortit, vous devez mettre la version d�chiffr�.**/
    public char[] decoder(char[] c) {
		System.out.println(Arrays.toString(c));
		return null;
    }

    
    
    /*
     * **NE PAS MODIFIER
     * *
     */
    
    public static void main(String[] args) {
	    Aventurier Moi = new Aventurier();
	    niveau_4 c1 = new niveau_4();
	    char[] mt = new char[] {'C','v','v','g','p','v','k','q','p','.','"','n','g','"','e','j','g','o','k','p','"','f','g','"','f','t','q','k','v','g','"','g','u','v','"','o','k','p','�','"','#'};
	    char[] c= c1.decoder(mt);
	    Moi.lirePanneau(c);
    }
}