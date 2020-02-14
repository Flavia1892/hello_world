package Beatbox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Guitest implements ActionListener {
	JButton button;
public static void main(String[] args) {
	
	Guitest gui=new Guitest();
	gui.go();
}
	
	public void go() {
			
		JFrame frame=new JFrame();
		JButton button=new JButton("Click me");
		button.setBackground(Color.green);
		button.addActionListener(this);
		
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes program quit as soon as you close the window
		
		frame.setSize(500,500);
		frame.setBackground(Color.magenta);
		frame.setVisible(true);
		
			}


public void actionPerformed(ActionEvent event) {   
	button.setText("I have been clicked");
	}
}


