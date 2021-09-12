package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton but1 = new JButton();
	JButton but2 = new JButton();
	//
	
	public void run() {
		but1.setText("Trick");
		but2.setText("Treat");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(but1);
		panel.add(but2);
		frame.pack();
		but1.addActionListener(this);
		but2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked.equals(but1)) {
			showPictureFromTheInternet("https://www.thesprucepets.com/thmb/5UZ-9FkAL6so-r_nMJp60KzyiLI=/450x0/filters:no_upscale():max_bytes(150000):strip_icc()/GoldenPuppy185743593-56a9c1f23df78cf772aa4a33.jpg");
		}
		else if (buttonClicked.equals(but2)) {
			showPictureFromTheInternet("https://pbs.twimg.com/media/EUsoqutXQAY2Di_.jpg:large");
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}
