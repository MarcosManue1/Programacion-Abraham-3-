package arrayLists;

/*
 * Create a stack with the days of the week. 
 * Display the items on the screen as you enter them. 
 * Then, unstack and display again on the screen.
 * Without using LinkedList
 */

import java.util.ArrayList;

public class Stack {

	public static void main(String[] args) {
		ArrayList stack = new ArrayList();
		ArrayList queue = new ArrayList();
		
		add(stack,"Mon");
		add(stack,"Tue");
		add(stack,"Wen");
		add(stack,"Thu");
		add(stack,"Fri");
		add(stack,"Sat");
		add(stack,"Sun");
		add(stack,"Mon");
		add(stack,"Tue");
		add(stack,"Wen");
		add(stack,"Thu");
		add(stack,"Fri");
		add(stack,"Sat");
		add(stack,"Sun");
		
		queue=(ArrayList) stack.clone();
		
		useQueue(queue);
		useQueue(queue);
		useQueue(queue);
		useQueue(queue);
		System.out.println(queue.toString());
		
		useStack(stack);
		useStack(stack);
		useStack(stack);
		useStack(stack);
		System.out.println(stack.toString());
	}
	
	public static void useStack(ArrayList stack) {
		int lastPos=stack.size()-1;
		System.out.println(stack.get(lastPos));
		stack.remove(lastPos);
	}
	
	public static void useQueue(ArrayList stack) {
		System.out.println(stack.get(0));
		stack.remove(0);
	}
	
	public static void add(ArrayList stack, String auxStr) {
		stack.add(auxStr);
	}

}
