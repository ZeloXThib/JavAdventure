package niveaux;
import java.util.Arrays;

import jeu.*;
public class niveau_4 {
	
	/****************
	* Vous êtes maintenant sur une route de pierre. 
	* Sans être exempt de toutes herbes dans les interstices entre les blocs de pierres la composant, 
	* cette route semble bien entretenue. A intervalles réguliers, d'une dizaine de mètres, 
	* se trouvent des piliers ornés de petites statues taillés dans la même roche. 
	* Vous marchez pendant quelques centaines de mètres, sans trop savoir où vous allez, avant de tomber sur un pilier orné 
	* d'un pic. 
	* En vous approchant, vous remarquez que c'est en fait un panneau. 
    * L'écriture est cependant incompréhensible. L'alphabet est bien d'origine latine, mais les mots n'ont aucun sens. 
    * Le javanais est une bien étra..... Mais.. Mais.. Ce n'est pas du javanais! 
    * Vous reconnaissez ce type d'écriture, c'est du texte auquel on a appliqué un chiffrage en code César !
    * Il vous faudra déchiffrer ce panneau si vous voulez continuer...
    * Si vous ne connaissez pas le code césar, allez jeter un oeil sur la documentation du niveau 4, sur le site.
    * 
    * Attention ! Pour Cette partit, vous devrez faire la fonction décoder, mais ne pas toucher au Main !
	*****/
	
	/**decoder(char[] c) : Prend en entrée une chaine de caractère sous forme d'un tableau de caractères 
	 * chiffré par décalage (autrement appelé code césar), en sortit, vous devez mettre la version déchiffré.**/
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
	    char[] mt = new char[] {'C','v','v','g','p','v','k','q','p','.','"','n','g','"','e','j','g','o','k','p','"','f','g','"','f','t','q','k','v','g','"','g','u','v','"','o','k','p','ë','"','#'};
	    char[] c= c1.decoder(mt);
	    Moi.lirePanneau(c);
    }
}