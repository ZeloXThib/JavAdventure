package jeu;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Aventurier {
	public Sac sac;
	public Actions action;
	@SuppressWarnings("unused")
	private graphique G;
	
	public Aventurier() {
		int Temple = (int)(Math.random()*4)+1; //decision aleatoire des gens au temple
		sac = new Sac();
		action = new Actions(Temple);
	}
	
	public String quiSontIls() {
		return this.action.getTemple();
	}
	
	public void lirePanneau(char[] c) {
		char[] tab = new char[] {'A','t','t','e','n','t','i','o','n',',',' ','l','e',' ','c','h','e','m','i','n',' ','d','e',' ','d','r','o','i','t','e',' ','e','s','t',' ','m','i','n','é',' ','!'};
			if(java.util.Arrays.equals(c,tab)) {
				JTextArea text = new JTextArea("Attention,\nle chemin de droite est miné !\nOuuuf, heureusement que vous\navez décrypté le message,\nvous n'êtes pas passé loin de vous\néclater façon TNT..\nVous prenez donc joyeusement\nle chemin de gauche\net continuez votre route.\nPassez au niveau suivant.");
				JLabel titreNiveau = new JLabel("Niveau 4 : Oh César !!!");
				G  = new graphique("Niveau 4", "imageniveau1Bis.png",titreNiveau,text);
			}
			else {
				System.out.print("Hmmm.. Ce texte ne veux rien dire du tout !");
			}
		}
	
	public boolean nombreDeFruits(int nb) {
		int solution = sac.getNbOranges()+sac.getNbPoires()+sac.getNbPommes();
		if (nb == solution) {
			JTextArea text = new JTextArea("Oui en effet,\nil y a "+nb+" fruits dans ce sac..\nOn devrait pouvoir tenir un peu!\nPassez au niveau suivant.");
			JLabel titreNiveau = new JLabel("Niveau 1 : Découverte du sac");
			G  = new graphique("Niveau 1", "imageniveau1Bis.png",titreNiveau,text);
			return true;
		} else {
			System.out.println("Non, il n'y a pas "+nb+" fruits dans ce sac..");
		}
		return false;
	}
	
}
