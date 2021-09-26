package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	String letterText;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		
		currentLetter = generateRandomLetter();
		letterText = Character.toString(currentLetter);
		
		label.setText(letterText);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel.add(label);
		frame.add(panel);
		frame.pack();
		
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		char letterTyped = arg0.getKeyChar();
		System.out.println("you typed: " + letterTyped);
		if (letterTyped == currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
		}
		else {
			System.out.println("incorrect");
			panel.setBackground(Color.RED);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		currentLetter = generateRandomLetter();
		letterText = Character.toString(currentLetter);
		label.setText(letterText);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
