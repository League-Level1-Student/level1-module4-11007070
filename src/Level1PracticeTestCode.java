import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Level1PracticeTestCode implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton submitB = new JButton();
	JButton hintB = new JButton();
	JTextField textF = new JTextField();
	
	void run() {
		frame.setVisible(true);
		submitB.setText("Submit");
		hintB.setText("Hint");
		label.setText("What heavy seven letter word can you take two away from and be left with eight?");
		label.add(submitB);
		label.add(hintB);
		label.add(textF);
		frame.add(label);
		submitB.addActionListener(this);
		hintB.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
