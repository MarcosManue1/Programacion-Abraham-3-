package hashSet;

import java.util.HashSet;
import java.util.Set;

import arrayLists.Student;

/*
 * write a program that treats the students of DAW1 and DAW2 as sets. The only
data of interest of the students is their name, and a file to know if they have some pending
modules​

View the list of all students in the DAW Cycle. ​

Displays a list of DAW2 students with any pending DAW1 modules.​

Displays a list of DAW1 students who do not have 2nd modules.​

 */

public class Exercice8 {

	public static void main(String[] args) {
		
		HashSet daw1 = new HashSet();
		HashSet daw2 = new HashSet();
		// DAW1 students
        
        daw1.add(new Student("Ana"));
        daw1.add(new Student("Luis"));
        daw1.add(new Student("Carlos"));
        daw1.add(new Student ("Marta"));
        daw1.add(new Student ("Elena"));
        daw1.add(new Student ("Pablo"));

        // DAW2 students
      
        daw2.add(new SeniorStudent("Luis",true));
        daw2.add("Carlos");
        daw2.add("Sofia");
        daw2.add("Diego");
        daw2.add("Elena");

        
        Set<String> pending = new HashSet<>();
        
        
	}
}