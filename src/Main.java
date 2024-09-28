import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
	public static void main(String [] args) {
		JFrame frame = new JFrame(); // Instance of JFrame
		frame.setTitle("Frame Title"); // Sets the title.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the program on clicking on X
		frame.setSize(420, 420); // Set width and height
		frame.setResizable(false); // Can't be resized
		frame.setVisible(true); // make frame visible
		ImageIcon image = new ImageIcon("logo.png"); //Create an Image Icon
		frame.setIconImage(image.getImage()); //Sets the icon of application
		frame.getContentPane().setBackground(Color.green); 
	}
}
