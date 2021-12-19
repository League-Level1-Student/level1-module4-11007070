import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Level1PracticeTestCode implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton submitB = new JButton("Submit");
	JButton hintB = new JButton("Hint");
	JTextField textF = new JTextField(10);
	String answer = "weights";
	
	void run() {
		frame.setVisible(true);
		//submitB.setText("Submit");
		//hintB.setText("Hint");
		label.setText("What heavy seven letter word can you take two away from and be left with eight?");
		panel.add(label);
		panel.add(submitB);
		panel.add(hintB);
		panel.add(textF);
		frame.add(panel);
		submitB.addActionListener(this);
		hintB.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(hintB)) {
			JOptionPane.showMessageDialog(null, "Hint: You use this item in the gym.");
		}
		else if (arg0.getSource().equals(submitB)) {
			if (textF.getText().equalsIgnoreCase(answer)) {
				JOptionPane.showMessageDialog(null, "Correct Answer!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong! Guess again!");
			}
		}
	}
}
