package Dtr.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class myPanel extends JPanel {
	
	BufferedImage img ;
	
public myPanel() {
	
	setSize (600 ,400);
	setVisible (true);
	loadImage("/imgs/The pirates.png");
	
}
private void loadImage(String str) {
	try {
		img = ImageIO.read(myPanel.class.getResource(str));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}

protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(img , 0 , 0 , 600 , 400 , this);
	
}

	public static void main(String[] args) {
		

		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				JFrame frm = new JFrame();
				frm.setSize (600 , 400 ); 
				frm.setVisible(true);  
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.add(new myPanel());
				
			}
		});
		System.out.println("Hello Duniya");  ``
	}

}
