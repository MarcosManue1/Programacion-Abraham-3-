package hashMaps.students;

import java.util.HashMap;
import java.util.Map.Entry;

public class MainApp2 {

	public static void main(String[] args) {
		
		HashMap<String, Student> student = new HashMap<>();
		float[] marks= {1,2,3,4,5};
		
		student.put("STU0001", new Student("STU001", "Anacleto", "DAW",marks));
		student.put("STU0002", new Student("STU002", "Bernardo", "DAW",marks));
		student.put("STU0003", new Student("STU003", "Celestina", "DAM", marks));
		
		Student auxStudent = new Student("STU0004", "Debetria","DAW", marks);
		student.put(auxStudent.getCode(), auxStudent);
		System.out.println("You have "+student.size()+" students");
		
		printUsingForEach(student);
		System.out.println("--------------------------------------->");
		System.out.println(student.get("STU0004"));
		System.out.println(student.get("STU0004").averageMark());
	}
	
	public static void printUsingForEach(HashMap<String, Student> student) {
		System.out.println("(key ---> Value: ");
		
		for (Entry<String, Student> element : student.entrySet()) {
			System.out.println(element.getKey()+" --->"+element.getValue());
		}
	}
}
