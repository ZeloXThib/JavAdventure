package niveaux;
import jeu.*;

public class niveau_2 {
	static Aventurier Moi = new Aventurier();
	public static void main (String[] args){
		/**************
		 * Hmm Les fruits c'est bien, mais il s'agirait de ce sortir de ce bourbier.
		 * Autour de vous, partout la forêt, mais vous vous trouvez sur un genre de sentier.
		 * Au nord, il s'enfonce dans la forêt. Au sud, il s'enfonce dans la forêt.
		 * Dépité, vous sortez une pièce de votre sac. Quitte à choisir une direction, 
		 * autant laisser Madame Chance s'en mêler !
		 * Pour pile, allez au nord. Pour face, allez au sud !
		 * (Moi.action.pileOuFace() renvoie un String 'Pile' ou 'Face')		
		 **/
		System.out.println(Moi.action.pileOuFace());
		
	}
}
