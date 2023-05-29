package niveaux;
import jeu.*;

public class niveau_5 {
    static Aventurier Moi = new Aventurier();
    public static void main (String[] args){
       
    	/**************
         * Vous continuez sur la route, reflechissant à vos options, 
         * cherchant à trouver une solution au facheux problème qu'est votre situation, 
         * lorsque un bruit de frottement trouble votre attention. 
         * Quelqu'un a laissé tomber une feuille de journal sur le sol. Les gens sont si sales.. 
         * Vous la ramassez, et quelque chose vous intrigues.. Ce morceau de parchemin attire votre attention, quelque chose est étrange.. 
         * Ce n'est pas un vulgaire papier, c'est une genre de carte, une grille cadriée, dont les cases sont numérotté, de manière aléatoire semble-t-il, 
         * mais l'inscription écrite en haut dit le contraire : "Tresor de Magnus l'Aléateur. Le chemin mène à la fin."
         * Troublé, vous regardez à nouveau le cadriage et... Les nombres ont tous changés! 
         * Vous rééssayez, et à nouveau, les nombres ont changés completement.. 
         * Vous décidez de chercher le trésor, prêt à le trouver, 
         * mais sans détourner le regard, où il vous faudra recommencer..
         * 
         * INDICATION : 
         * *La carte est une matrice carré de taille 6. 
         * *Le trésor se situe sur la case sur laquelle le nombre indiqué est le même que le nombre en ordonnée, 
         * multiplié par dix, plus le nombre en abscisse.
		 * *Pour trouver le tresor, suivez le chemin. Le chemin commence sur la case [1;1] (en haut a gauche !), prenez la valeur indiqué 
		 * par cette case, le chiffre des dizaine indique l'ordonnée de la prochaine case, le chiffre des unités 
		 * son abscisse.
		 * *Attention, une nouvelle carte, avec une chemin, des nombres et un trésor different, est généré à chaque execution du niveau. 
		 * Si vous cherchez le tresor durant plus de coups que la taille du chemin, vous clignerez à coup sur des yeux, et vous devrez recommencer.
		 * 
		 * Pour plus de détails, consultez la documentation sur le site. 
         **/
    	Moi.action.tresor.getCarte();
    	System.out.println(Moi.action.tresor.getValeurCarte(1,1));
    	Moi.action.tresor.leTresorEstLa(1,1);
    	
    }
}
