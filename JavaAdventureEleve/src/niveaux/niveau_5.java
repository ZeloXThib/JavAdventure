package niveaux;
import jeu.*;

public class niveau_5 {
    static Aventurier Moi = new Aventurier();
    public static void main (String[] args){
       
    	/**************
         * Vous continuez sur la route, reflechissant � vos options, 
         * cherchant � trouver une solution au facheux probl�me qu'est votre situation, 
         * lorsque un bruit de frottement trouble votre attention. 
         * Quelqu'un a laiss� tomber une feuille de journal sur le sol. Les gens sont si sales.. 
         * Vous la ramassez, et quelque chose vous intrigues.. Ce morceau de parchemin attire votre attention, quelque chose est �trange.. 
         * Ce n'est pas un vulgaire papier, c'est une genre de carte, une grille cadri�e, dont les cases sont num�rott�, de mani�re al�atoire semble-t-il, 
         * mais l'inscription �crite en haut dit le contraire : "Tresor de Magnus l'Al�ateur. Le chemin m�ne � la fin."
         * Troubl�, vous regardez � nouveau le cadriage et... Les nombres ont tous chang�s! 
         * Vous r��ssayez, et � nouveau, les nombres ont chang�s completement.. 
         * Vous d�cidez de chercher le tr�sor, pr�t � le trouver, 
         * mais sans d�tourner le regard, o� il vous faudra recommencer..
         * 
         * INDICATION : 
         * *La carte est une matrice carr� de taille 6. 
         * *Le tr�sor se situe sur la case sur laquelle le nombre indiqu� est le m�me que le nombre en ordonn�e, 
         * multipli� par dix, plus le nombre en abscisse.
		 * *Pour trouver le tresor, suivez le chemin. Le chemin commence sur la case [1;1] (en haut a gauche !), prenez la valeur indiqu� 
		 * par cette case, le chiffre des dizaine indique l'ordonn�e de la prochaine case, le chiffre des unit�s 
		 * son abscisse.
		 * *Attention, une nouvelle carte, avec une chemin, des nombres et un tr�sor different, est g�n�r� � chaque execution du niveau. 
		 * Si vous cherchez le tresor durant plus de coups que la taille du chemin, vous clignerez � coup sur des yeux, et vous devrez recommencer.
		 * 
		 * Pour plus de d�tails, consultez la documentation sur le site. 
         **/
    	Moi.action.tresor.getCarte();
    	System.out.println(Moi.action.tresor.getValeurCarte(1,1));
    	Moi.action.tresor.leTresorEstLa(1,1);
    	
    }
}
