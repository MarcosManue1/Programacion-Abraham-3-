package arrayLists;

import java.util.ArrayList;
import utility.AskUser;

/*
 * Write a program that asks for names by keyboard and adds them to a list. 
 * After completion, the program will display the list on the screen.
 */

public class Exercice2 {

	public static void main(String[] args) {
		boolean repeat=true;
		String auxName;
		ArrayList <String>namesList= new ArrayList<String>();
		
		while (true) {
		    auxName = AskUser.askString("Give one name");
		    namesList.add(auxName);

		    String answer = AskUser.askString("Repeat? (y/n)");
		    if (!answer.equalsIgnoreCase("y")) {
		        break;
		    }
		}

		namesList.add("Anacleto");
		namesList.add("Anafasto");
		namesList.add("Astolfo");
		namesList.add("Clementino");
		
		for(int i=0;i<namesList.size();i++) {
			System.out.println(namesList.get(i));
		}
		
		System.out.println("BYE");
	}

}
