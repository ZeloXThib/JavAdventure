package niveaux;
import jeu.*;

public class niveau_2 {
	static Aventurier Moi = new Aventurier();
	public static void main (String[] args){
		/**************
		 * Hmm Les fruits c'est bien, mais il s'agirait de ce sortir de ce bourbier.
		 * Autour de vous, partout la for�t, mais vous vous trouvez sur un genre de sentier.
		 * Au nord, il s'enfonce dans la for�t. Au sud, il s'enfonce dans la for�t.
		 * D�pit�, vous sortez une pi�ce de votre sac. Quitte � choisir une direction, 
		 * autant laisser Madame Chance s'en m�ler !
		 * Pour pile, allez au nord. Pour face, allez au sud !
		 * (Moi.action.pileOuFace() renvoie un String 'Pile' ou 'Face')		
		 **/
		System.out.println(Moi.action.pileOuFace());
		
	}
}
