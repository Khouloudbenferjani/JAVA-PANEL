package panelProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

	
		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("rabbit.png");//afficher l'icon
		
		
		//..................................................
		Image img = icon.getImage(); // create e variable type Image and calls img that contain icon
		img = img.getScaledInstance(50, 50, 0); // identify the size of the new image
		icon = new ImageIcon(img);// afficher la nouvelle valeur de img 
		//...................................................

		
		
		//Label cad le contenu icon, text , img........
			
		JLabel label = new JLabel();
		label.setText("HEY");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER); // TOP,CENTER, BOTTOM 
		label.setHorizontalAlignment(JLabel.CENTER); // LEFT,CENTER, RIGHT 
//		label.setBounds(100, 100, 75, 75);
		label.setFont(new Font("MV Boli",Font.PLAIN,100)); // STYLE of text
		
		
		//Panel cad la cellule 
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout()); 
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);	
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}