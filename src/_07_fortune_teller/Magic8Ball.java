package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int ranNum = new Random().nextInt(4);
	
	// 3. Print out this variable
	System.out.println(ranNum);

	// 4. Get the user to enter a question for the 8 ball
	String question = JOptionPane.showInputDialog("Enter a question for the 8 Ball:");

	// 5. If the random number is 0
	if (ranNum == 0) {
		JOptionPane.showMessageDialog(null, "8 Ball says: Yes!");
	}

	// -- tell the user "Yes"

	// 6. If the random number is 1
	else if (ranNum == 1) {
		JOptionPane.showMessageDialog(null, "8 Ball says: No");
	}

	// -- tell the user "No"

	// 7. If the random number is 2
	else if (ranNum == 2) {
		JOptionPane.showMessageDialog(null, "8 Ball says: Maybe you should ask Google?");
	}

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
	else if (ranNum == 3) {
		JOptionPane.showMessageDialog(null, "8 Ball says: Idk what to tell you, the future's complicated");
	}

	// -- write your own answer

	}
}
