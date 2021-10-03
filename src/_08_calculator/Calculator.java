package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addB = new JButton();
	JButton subB = new JButton();
	JButton mulB = new JButton();
	JButton divB = new JButton();
	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	String text01 = input1.getText();
	String text02 = input2.getText();
	int text1 = Integer.parseInt(text01);
	int text2 = Integer.parseInt(text02);
	int answer;

	
	public void run() {
		frame.setVisible(true);
		frame.setSize(300, 200);
		panel.add(input1);
		panel.add(input2);
		panel.add(addB);
		panel.add(subB);
		panel.add(mulB);
		panel.add(divB);
		frame.add(panel);
		
		addB.setText("Add");
		subB.setText("Subtract");
		mulB.setText("Multiply");
		divB.setText("Divide");
		addB.addActionListener(this);
		subB.addActionListener(this);
		mulB.addActionListener(this);
		divB.addActionListener(this);
		
	}
	
	public int add() {
		answer = text1 + text2;
		return answer;
	}
	
	public int subtract() {
		answer = text1 - text2;
		return answer;
	}
	
	public int multiply() {
		answer = text1 * text2;
		return answer;
	}
	
	public int divide() {
		answer = text1 / text2;
		return answer;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object bc = e.getSource();
		
		if (bc.equals(addB)) {
			add();
		}
		else if (bc.equals(subB)) {
			subtract();
		}
		else if (bc.equals(mulB)) {
			multiply();
		}
		else if (bc.equals(divB)) {
			divide();
		}
		
		
	} 
}
