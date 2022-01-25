package swing;
//import java.awt.Graphics;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowCreation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JButton north = new JButton("NORTH");
		JButton south = new JButton("SOUTH");
		JButton west  = new JButton("WEST");
		JButton east  = new JButton("EAST");
		JButton centre = new JButton("CENTRE");
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.CENTER, centre);
		frame.setSize(800,800);
		frame.setVisible(true);
		
		
	}

}
