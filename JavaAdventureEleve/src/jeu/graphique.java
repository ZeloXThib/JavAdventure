package jeu;

import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class graphique extends JFrame { 
	
	public graphique(String titre,String image,JLabel titreNiveau, JTextArea text) {
		
		// fenêtre principale 
		
		JFrame fenetre = new JFrame();
		fenetre.setTitle(titre);
		Dimension tailleFenetre = Toolkit.getDefaultToolkit().getScreenSize();
		int longueur = tailleFenetre.width * 2/3;
		int hauteur = tailleFenetre.height * 2/3;
		fenetre.setSize(longueur, hauteur);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		
		// Nos JPanel
		
		
		JPanel fond = new JPanel();
		JPanel supFond = new JPanel();
		supFond.setBackground(Color.white);
		supFond.setBounds(longueur-250, 80, 200,200);
		//supFond.setLayout(new GridLayout(2,1));
		text.setEditable(false);
		text.setOpaque(false);
		// Notre Image
		
		int longueur2 = tailleFenetre.width * 2/3;
		int hauteur2 = tailleFenetre.height * 3/5;
		ImageIcon icon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(longueur2,hauteur2, Image.SCALE_FAST));
		JLabel Label1 = new JLabel();
		Label1.setIcon(icon);
		
		// Add 
		fond.add(Label1);
		supFond.add(titreNiveau,BorderLayout.NORTH);
		supFond.add(text);
		Label1.add(supFond);
		
		fenetre.add(fond);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		fenetre.setVisible(true);
	
	}
}
