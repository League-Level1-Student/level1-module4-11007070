package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinB = new JButton();
	JLabel cherries;
	JLabel grapes;
	JLabel oranges;
	JLabel cherries1;
	JLabel grapes1;
	JLabel oranges1;
	JLabel cherries2;
	JLabel grapes2;
	JLabel oranges2;
	String slot1;
	String slot2;
	String slot3;
	
	Random ran = new Random();
	int ranNum;
	
	void run() throws MalformedURLException {
		frame.setVisible(true);
		frame.setSize(800, 200);
		spinB.setText("SPIN");
		panel.add(spinB);
		spinB.addActionListener(this);
		cherries = createLabelImage("cherries.jpg");
		grapes = createLabelImage("grapes.jpg");
		oranges = createLabelImage("oranges.jpg");
		cherries1 = createLabelImage("cherries.jpg");
		grapes1 = createLabelImage("grapes.jpg");
		oranges1 = createLabelImage("oranges.jpg");
		cherries2 = createLabelImage("cherries.jpg");
		grapes2 = createLabelImage("grapes.jpg");
		oranges2 = createLabelImage("oranges.jpg");
		//panel.add(cherries);
		//panel.add(grapes);
		//panel.add(oranges);
		frame.add(panel);
		frame.pack();
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
	void spin() {
		ranNum = ran.nextInt(3);
		if (ranNum == 0) {
			panel.add(cherries);
			slot1 = "cherries";
		}
		else if (ranNum == 1) {
			panel.add(grapes);
			slot1 = "grapes";
		}
		else if (ranNum == 2) {
			panel.add(oranges);
			slot1 = "oranges";
		}
		
		ranNum = ran.nextInt(3);
		if (ranNum == 0) {
			panel.add(cherries1);
			slot2 = "cherries";
		}
		else if (ranNum == 1) {
			panel.add(grapes1);
			slot2 = "grapes";
		}
		else if (ranNum == 2) {
			panel.add(oranges1);
			slot2 = "oranges";
		}
		
		ranNum = ran.nextInt(3);
		if (ranNum == 0) {
			panel.add(cherries2);
			slot3 = "cherries";
		}
		else if (ranNum == 1) {
			panel.add(grapes2);
			slot3 = "grapes";
		}
		else if (ranNum == 2) {
			panel.add(oranges2);
			slot3 = "oranges";
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(spinB)) {
			spin();
			
			frame.add(panel);
			
			if (slot1.equals("cherries") && slot2.equals("cherries") && slot3.equals("cherries")) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}
			else if (slot1.equals("grapes") && slot2.equals("grapes") && slot3.equals("grapes")) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}
			else if (slot1.equals("oranges") && slot2.equals("oranges") && slot3.equals("oranges")) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}
		}
		
	}
}
