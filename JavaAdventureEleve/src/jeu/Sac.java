package jeu;

public class Sac {
	private int pommes;
	private int oranges;
	private int poires;
	
	public Sac() {
		this.pommes = (int) (Math.random()*10)+3;
		this.poires = (int) (Math.random()*10)+3;
		this.oranges = (int) (Math.random()*10)+3;
	}
	
	public int getNbPommes(){
		return this.pommes;
	}
	public int getNbPoires(){
		return this.poires;
	}
	public int getNbOranges(){
		return this.oranges;
	}
	
	
	


}
