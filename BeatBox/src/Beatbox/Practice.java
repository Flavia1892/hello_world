package Beatbox;
import javax.jws.*;
import javax.swing.*;

import java.awt.*;
import java.lang.*;

public class Practice {
	JTextField field1=new JTextField(20);
	JTextField field=new JTextField("Your name");//Pun username
	public void field() {
		
		
		field1.setText("whatever");
		fied.setText("");//this clears the field
		
	}
	public static void main(String[]args) {
		JFrame frame=new JFrame();
		frame.setBackground(Color.RED);
		JPanel panel=new JPanel();
		panel.setBackground(Color.cyan);
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		JButton but=new JButton();
		but.setText("It is me");
		panel.add(but);
		panel.add(new JButton("aha"));
		panel.add(new JButton("aoleu"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}

}
