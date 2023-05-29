package jeu;

import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class chasseTresor {
	/**Min + (int)(Math.random() * ((Max - Min) + 1))* Between 5 and 10*/
    
    private int [][] carteTresor;
    private int [] cheminTresor;
    public int tailleCarte;
    public int tailleCheminTresor;
    private int nbDemandeValeur;
    private int nbEssais;
    @SuppressWarnings("unused")
	private graphique G;
    
    public chasseTresor(){
    	this.tailleCarte = 5; //CETTE VALEUR DOIT ETRE STRICTEMENT INFERIEUR A 10
    	this.tailleCheminTresor = 5;
        carteTresor= this.generateMap();
        nbDemandeValeur = 0;
        this.nbEssais = 0;
    }
    
    public int getValeurCarte(int x, int y){
    	if(this.nbDemandeValeur <= this.tailleCheminTresor) {
	    	this.nbDemandeValeur++;
	    	return carteTresor[x][y];}
    	else {
    		System.out.println("Après trop d'essais, vous clignez des yeux, et les nombres changent à nouveau..");
    		return 55;
    	}
    }
    
    public boolean leTresorEstLa(int x, int y) {
    	if(this.nbEssais == 0) {
    		this.nbEssais ++;
	    	if(carteTresor[x][y] == (x+1)*10+y+1) {
	    		JTextArea text = new JTextArea("Oui en effet,\nle tresor est bien ici !\nIl vous attendais en ["+x+";"+y+"]\nIl y a au moins une tonne d'or...\nAssez d'argent pour vivre la vida loca\n Bien joué, tu es désormais \nun AVENTURIER, aguérri !!!!\nThe ennnnd ");
				JLabel titreNiveau = new JLabel("Niveau 5 : Découverte du coffre");
				G  = new graphique("Niveau 5", "imageniveau1Bis.png",titreNiveau,text);
	    		return true;	
	    	}else {
		    	System.out.println("Hmmm.. Vous appuyez sur cette case mais il ne se passe rien.. Etes vous sûr de vous?");
		    	return false;
	    	}
    	}else {
    		System.out.println("Vous avez déja fait un essai, la carte ne réagira pas plus !");
    		return false;
    	}
    }
    
    public void getCarte() {
    	System.out.println("Chemin du Trésor : "+Arrays.toString(this.cheminTresor));
    	for(int i=0;i<tailleCarte;i++)
    		System.out.println("Carte : "+Arrays.toString(this.carteTresor[i]));
    }
    
    /**genere une carte au tresor de manière Aleatoire**/
    public int[][] generateMap(){
    	//initialisation des valeurs
    	int pathMap[] = generateValues(tailleCheminTresor);
    	int outMap[][] = generate0Map(tailleCarte);
    	outMap[0][0] = pathMap[0];
    	int currentValue,currentX,currentY;
    	
    	//met dans la carte le chemin d'accès au tresor
    	for(int i = 1; i<tailleCheminTresor;i++) {
    		currentValue=pathMap[i-1];
    		currentX=(currentValue/10)-1;
    		currentY=(currentValue%10)-1;
    		outMap[currentX][currentY]=pathMap[i];
    	}
    	
    	//met sur la carte la valeur du tresor égale aux valeurs de ses coordonnes.
		currentValue=pathMap[tailleCheminTresor-1];
		currentX=(currentValue/10)-1;
		currentY=(currentValue%10)-1;
		outMap[currentX][currentY]=currentValue;
    	
		//remplace le reste des 0 par des valeurs aleatoires
    	for(int i=0;i<tailleCarte;i++) {
    		for(int j=0;j<tailleCarte;j++) {
    			if(outMap[i][j]==0) {
    				//le do-while evite que la valeur soit egale a celle de ses coordonnées, et soit donc un tresor
	    			do {
	    				currentValue = randVal();
	    				outMap[i][j]=currentValue;
	    			}while(currentValue==((i+1)*10+j+1));
    			}
    		}
    	}
    	return outMap;
    }
    
    /**genere un tableau de taille nb x nb rempli de 0**/
    private int[][] generate0Map(int nb){
    	int [][] result = new int[nb][nb];
    	for(int i=0;i<nb;i++)
    		for(int j=0;j<nb;j++)
    			result[i][j]=0;
    	return result;
    }
    
    /**genere nb valeurs differentes respectant la forme du tableau**/
    private int [] generateValues(int nb) {
    	int [] result = new int[nb];
    	do {
	    	for(int i=0; i<nb;i++) {
	    		result[i] = randVal();
	    	}
    	} while(isArrayDuped(result));
    	
    	this.cheminTresor = result;
    	return result;
    }
    
    /**Genere une valeure aleatoire respectant la taille du tableau**/
    private int randVal() {
		int tempVal1 = 1+(int)(Math.random() * tailleCarte);
		int tempVal2 = 1+(int)(Math.random() * tailleCarte);
		return tempVal1*10+tempVal2;
    }
    
    /**Renvoie Vrai si le tableau contient 2 valeurs pareil ou contient un 11**/
    public boolean isArrayDuped(int [] array) {
    	for(int i=0;i<array.length;i++) {
    		for(int j=0;j<array.length;j++) {
    			if(i!=j && array[i]==array[j]) {
    				return true;
    			}
    		}
    		if(array[i]==11)
    			return true;
    	}
    	return false;
    }
    
}
