package arrayLists;
import java.util.Arrays;
import java.util.Scanner;

public class Student {

	private String name;
	private String groupName;
	private int[] grades;
	
	public Student() {
		
		this.name="";
		this.groupName="";
		this.grades= new int[5];
		
	}
	
	public Student(String incomingName) {
		
		this.name=incomingName;
		this.groupName="";
		this.grades=new int [5];
	}
	
	public Student(String incomingName, String incomingGroupName) {
		
		this.name=incomingName;
		this.groupName=incomingGroupName;
		this.grades=new int [5];
	}
	
	public Student(String incomingName, String incomingGroupName,int[]incomingGrades) {
		
		this.name=incomingName;
		this.groupName=incomingGroupName;
		
		if(incomingGrades.length==5) {
			this.grades = incomingGrades;
		}else {
			this.grades = new int[5];
		}
	}
	
	public void requestData() {
	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Enter student name: ");
	    name = keyboard.nextLine();

	    System.out.print("Enter group: ");
	    groupName = keyboard.nextLine();

	    for (int i = 0; i < grades.length; i++) {
	        System.out.print("Enter grade " + (i + 1) + ": ");
	        grades[i]=keyboard.nextInt();
	    }
	}
	
	public double calculateAverage() {
	    int sum = 0;
	    for (int grade : grades) {
	        sum += grade;
	    }
	    return (double) sum / grades.length;
	}

	public int countFailures() {
	    int failures = 0;
	    for (int grade : grades) {
	        if (grade < 5) {
	            failures++;
	        }
	    }
	    return failures;
	}

	
	public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Group: " + groupName);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
	
	@Override
	public boolean equals(Object obj) {
		boolean auxBool;
		
		Student auxStu=(Student) obj;
		auxBool=this.name.equals(auxStu.name);
		return false;
	}

	@Override
	public int hashCode() {
		return name.length();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", groupName=" + groupName + "]";
	}
    
	
}
