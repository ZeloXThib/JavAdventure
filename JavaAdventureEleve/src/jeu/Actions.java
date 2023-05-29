package jeu;
import javax.swing.*;


public class Actions {
	private String piece;
	private String auTemple;
	private int nord=0;
	private int sud=0;
	public chasseTresor tresor;
	@SuppressWarnings("unused")
	private graphique G;

	public Actions(int i) {
		tresor = new chasseTresor();
		switch(i) {
		case 1:
			auTemple = "Moines";
			break;
		case 2:
			auTemple = "Marchands";
			break;
		case 3:
			auTemple = "Pirates";
			break;
		case 4:
			auTemple = "PiratesEnerves";
			break;
		case 5:
			auTemple = "Touristes";
			break;
		default:
			break;
		}
		
	}
	
	public void estAllonges() {
		System.out.println("Vous �tes allong�.. Il serait temps de se lever !");	
	}
	
	public String getTemple() {
		return this.auTemple;
	}
	
	
	public int valLigne(int y) {
		return 0;
	}

	
	public void seLever() {
		JTextArea text = new JTextArea("Arrrh Parfait !\nVous pouvez passer au niveau \nsuivant !");
		JLabel titreNiveau = new JLabel("Niveau 0 : Le r�veil");
		G  = new graphique("Niveau 0", "imageniveau0modifie.png",titreNiveau,text);

	}
	
	public String pileOuFace() {
		double n = Math.random();
		if(n>0.5) {
			this.piece = "Pile";
			return "Pile";}
		this.piece = "Face";
		return "Face";
	}
	
	public void allerAuSud() {
		sud = 1;
		if(nord == 1) {
			System.out.println("Nord ou Sud, il faut choisir ! Essayez de n'aller que dans une direction, �a serait domage de s'ecarteler..");
		}else if(piece != "Face"){
			System.out.println("Hmm.. C'est bien face, mais c'est la mauvaise direction, il faut �tre en accord avec soit-m�me !");
		}else{
			JTextArea text = new JTextArea("Soit, le Sud semble mieux,\n plus prom�teur, prenez votre sac\n et en route !\nVous pouvez passer\n au niveau suivant.");
			JLabel titreNiveau = new JLabel("Niveau 2 : PerdPasLaFace");
			G  = new graphique("Niveau 2", "face.png",titreNiveau,text);
					}
	}
	
	public void allerAuNord() {
		nord = 1;
		if(sud == 1) {
			System.out.println("Nord ou Sud, il faut choisir ! Essayez de n'aller que dans une direction, �a serait domage de s'ecarteler..");
		}else if(piece != "Pile"){
			System.out.println("Hmm.. C'est bien pile, mais c'est la mauvaise direction, il faut �tre en accord avec soit-m�me !");
		}else {
		JTextArea text = new JTextArea("                  Madame Chance intervient \n                  Pile � temps ! \n                  Le Nord vous appele, les\n                  oiseaux semblent plus\n                  joyeux par ici !\n                  Prenez vos clic et vos clac\n                  et en avant !\n                  Vous pouvez passer au \n                 niveau suivant.");
		JLabel titreNiveau = new JLabel("Niveau 2 : PilePoil");
		G  = new graphique("Niveau 2", "pile.png",titreNiveau,text);	
		}
	}
	
	public void chercherDeLAide() {
		//MOINE
		if(this.auTemple != "Moines") {
			System.out.println("Hmm Ces gens n'�taient pas des moines, ils se sont sentit insult�s et vous ont lapid�s... R��ssayez !");
		}else {
			JTextArea text = new JTextArea(" Les moines vous accueillent\n dans le silence. Vous leurs\n demandez de l'aide, et l'un\n d'entre eux vous pointe du\n doigt une direction dans\nlaquelle une route d�marre.\n Vous les remerciez profus�ment\n et continuez votre p�riple.\n");
			JLabel titreNiveau = new JLabel("Niveau 3 : Les moines");
			G  = new graphique("Niveau 3", "moine.png",titreNiveau,text);
		}
		
	}
	public void echanger() {
		//MAGICIEN
		if(this.auTemple != "Marchands") {
			System.out.println("Ces gens n'�taient pas des marchands, et votre �trange comportement leur a fait peur.. le coup est partit tout seul et vous �tes mort.. R��ssayez !");
		}else {
			JTextArea text = new JTextArea("C'est des magiciens! En �change\nde votre pi�ce ils vous rendent,\ntoute votre force, comblent\nvotre soif, donnent un sens �\nvotre vie, et vous permette\nde r�aliser un souhait !\nPris dans votre agitation,\nvous ne reflechissez pas et\ndemandez votre chemin, qu'ils\nvous indiquent d'une fl�che\npourpre dans le ciel..");
			JLabel titreNiveau = new JLabel("Niveau 3 : Des faux marchands");
			G  = new graphique("Niveau 3", "magicien.png",titreNiveau,text);

		}
		
	}
	
	public void fuir() {
		//le pirate vient de https://ascii.co.uk/art/pirate
		
		if(this.auTemple == "PiratesEnerves") {
			System.out.println("Fuir ne suffit pas, ces pirates l�, en furie apr�s avoir aper�u un intru, vous �parpillent fa�on puzzle.. R��ssayez !");
		}else if (this.auTemple != "Pirates") {
			System.out.println("Mais enfin, pourquoi avoir fuit?! Ces gens l� pouvaient vous aider � trouver votre chemin ! En fuyant comme un idiot vous tombez dans un puit... R��ssayez!");
		}else {
			JTextArea text = new JTextArea("Mince! Des pirates !\nEt pas des vieilles connaissances\navec qui vous allez souvent �\nla mer ensemble..\nHeureusement, vous arrivez � les\nEviter en pratiquant la fuite, et,\napr�s quelques minutes de marches,\nvous vous retrouvez sur une route\nprovidentielle.\nVous continuez votre chemin.");
			JLabel titreNiveau = new JLabel("Niveau 3 : Des pirates");
			G  = new graphique("Niveau 3", "imagepirates.png",titreNiveau,text);
		}
	}
	
	public void fuirEnEvitantLesBalles() {
		//https://www.asciiart.eu/weapons/guns
		if(this.auTemple == "Pirates") {
			System.out.println("Eviter les balles vous fait juste ressembler � un cretin, mais bon, au moins vous avez fuit.. Quel dommage qu'un tigre affam� se soit retrouv� sur votre chemin.. Vous �tes mort, reessayez !");
		}else if (this.auTemple != "PiratesEnerves") {
			System.out.println("Mais enfin, pourquoi avoir fuit?! Ces gens l� pouvaient vous aider � trouver votre chemin ! En fuyant comme un idiot vous tombez d'une falaise... R��ssayez!");
		}else {
			JTextArea text = new JTextArea("   Un groupe de personnes,d�guis�s\n   en pirates.Leur d�termination\n   � entrer dans le r�le les pousse\n   � vous tirer  dessus avec des balles\n   r�els. Maudissant votre stupidit�, vous\n   courrez comme vos centaines\n   d'heures de jeu sur Rust : En zigzag\n   Apr�s dix minutes, vous ne les entendez\n   plus, et vous voyez une route\n   au loin. Vous d�cidez de la suivre ");
			JLabel titreNiveau = new JLabel("Chapitre 3 : Des fous");
			G  = new graphique("Chapitre 3", "fuitepiratesenerv�.png",titreNiveau,text);
		}
		
	}
	
	public void demanderDirections() {
		//https://www.asciiart.eu/people/couples
		if(this.auTemple!="Touristes") {
			System.out.println("Honnetement, qu'est ce que vous pensiez en allant dire � des gens qu'ils sont des touristes. Personne n'aime �a, surtout les riverains. Ceux la devaient �tre de mauvaise humeur, parce qu'ils vous ont litteralement mang�.. Pas de chance, reessayez!");
		}else {
		
		JTextArea text = new JTextArea("Ces touristes, James et Emma,\nparlent un irlandais tellement\nprononc� que vos cours d'anglais\nne peuvent vous aider.\nIls arrivent finalement � vous\nexpliquer comment atteindre la\nroute � l'aide de Microsoft\nTranslator \nVous continuez votre chemin");
		JLabel titreNiveau = new JLabel("Niveau 3 : oH des touristes");
		G  = new graphique("Niveau 3", "touriste.png",titreNiveau,text);

		
		}
	}
}
