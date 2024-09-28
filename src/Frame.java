import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame() {
		this.setTitle("Frame Title"); // Sets the title.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the program on clicking on X
		this.setSize(420, 420); // Set width and height
		this.setResizable(false); // Can't be resized
		this.setVisible(true); // make frame visible
		ImageIcon image = new ImageIcon("logo.png"); //Create an Image Icon
		this.setIconImage(image.getImage()); //Sets the icon of application
		this.getContentPane().setBackground(new Color(0X660066)); //Change Color of background
	}

}
