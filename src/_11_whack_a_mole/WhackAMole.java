package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	int ranNum;
	
	void run() {
		ranNum = ran.nextInt(24);
		frame.setVisible(true);
		frame.setSize(200, 200);
		drawButtons(ranNum);
		frame.add(panel);
	}
	
	void drawButtons(int ran) {
		for (int i = 0; i < 24; i++) {
			if (i == ran) {
				JButton mole = new JButton();
				mole.setText("mole!");
				panel.add(mole);
				mole.addActionListener(this);
			}
			else {
				JButton buttoni = new JButton();
				panel.add(buttoni);
				buttoni.addActionListener(this);
			}
		}
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(mole)) {
			
		}
		
	}
}
