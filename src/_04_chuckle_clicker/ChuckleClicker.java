package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();
		
	}
	
	void makeButtons() {		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed.equals(button1)) {
			JOptionPane.showMessageDialog(null, "I just swallowed a stack of Scrabble tiles by accident. My next poop could spell disaster!");
		}
		else if (buttonPressed.equals(button2)) {
			JOptionPane.showMessageDialog(null, "I bought a pen that can write underwater. It can write other words as well!");
		}
	}
}
