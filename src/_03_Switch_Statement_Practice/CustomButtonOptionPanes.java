package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("It's Sunday.");
			break;
		case "Monday":
			System.out.println("It's Should-Be-A-Break-Day.");
			break;
		case "Tuesday":
			System.out.println("It's Tuesday.");
			break;
		case "Wednesday":
			System.out.println("It's Wednesday.");
			break;
		case "Thursday":
			System.out.println("It's Thursday.");
			break;
		case "Friday":
			System.out.println("IT'S FRIDAY FRIDAY GOTTA GET DOWN ON FRIDAY!!!1!!!!11!!");
			break;
		case "Saturday":
			System.out.println("It's Saturday.");
			break;
		}
	}
}
