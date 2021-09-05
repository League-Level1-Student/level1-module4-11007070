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
			showPictureFromTheInternet("https://www.google.com/url?sa=i&url=https%3A%2F%2Fuptownpuppies.com%2Fbreeds%2Fgolden-retriever%2Fsan-francisco%2F&psig=AOvVaw2kuIL1et3CIP3vDGZrqa12&ust=1630957088899000&source=images&cd=vfe&ved=0CAYQjRxqFwoTCOjTxuLK6PICFQAAAAAdAAAAABAD");
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
