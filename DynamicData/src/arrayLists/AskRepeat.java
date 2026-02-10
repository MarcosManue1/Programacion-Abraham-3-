package arrayLists;

import java.util.Scanner;

public class AskRepeat {

	public static boolean askRepeat() {
	    System.out.println("Do you want to add another name? (y/n)");
	    Scanner keyboard = new Scanner(System.in);
	    String answer = keyboard.nextLine();
	    return answer.equalsIgnoreCase("y");
	}
}
