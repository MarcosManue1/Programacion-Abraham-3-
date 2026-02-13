package arrayLists;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashExample1 {

	public static void main(String[] args) {
		HashSet daw = new HashSet();
		
		daw.add(new Student());
		daw.add(new Student());
		
		for(Iterator iterator = daw.iterator(); iterator.hasNext();) {
			Object object=(Object) iterator.next();
			System.out.println(object);
		}

	}

}
