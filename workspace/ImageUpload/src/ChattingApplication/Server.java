package ChattingApplication;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends JFrame{
	
	JPanel p1; 
	
	
	

Server(){
	
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("/imgs/The pirates.png"));
	Image i2 = i1.getImage().getScaledInstance(30 , 30 , Image.SCALE_DEFAULT);
	ImageIcon i3 = new ImageIcon(i2);
	JLabel l1 = new JLabel(i1);
	l1.setBounds(5,5,30,30);
	add(l1);
	
getContentPane().setBackground(Color.BLUE);	
        setLayout(null);	
		setSize(450,600); 
		setVisible(true);
		setLocation(400,200); 
		
	}


	public static void main(String[] args) { 
		new Server().setVisible(true);
		
	}
}
