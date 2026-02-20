package hashSet;

import arrayLists.Student;

public class SeniorStudent extends Student{
	boolean pendingModules;

	public SeniorStudent() {
		super();
		pendingModules=false;
	}

	public SeniorStudent(String incomingName, String incomingGroupName, int[] incomingGrades) {
		
		super(incomingName, incomingGroupName, incomingGrades);
		String modules[]= {"DAES","DAEC","DI","DAW","IPE"};
		pendingModules=false;
		this.setModules(modules);
	}

	private void setModules(String[] modules) {
		// TODO Auto-generated method stub
		
	}

	public SeniorStudent(String incomingName, boolean b) {
		super(incomingName, b);
		pendingModules=false;
	}

	public SeniorStudent(String incomingName) {
		super(incomingName);
		pendingModules=false;
	}
	
	public boolean isPending
	
}
