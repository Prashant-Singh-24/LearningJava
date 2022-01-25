package chatting.applicationn;
import java.awt.Image;

import javax.swing.*;

public class Server extends JFrame{
	
	JPanel p1;
	
	
	Server(){
		
		ImageIcon i1 = new ImageIcon((Image) ClassLoader.getSystemResources("/icon/Lala"));
		
		
//		JLable l1 = new JLable (i1); 
		
		
		
		setSize(500 , 600);
		setLocation( 400 , 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Server().setVisible(true);
		

		
	}

}
