package hashMaps.students;

import java.util.Arrays;

import utility.AskUser;

public class Student {

	final int SIZE=5;
	private String code,name, group;
	private float marks[]; 
	
	
	public Student(String code, String name, String group, float[] marks) {
		super();
		this.code=code;
		this.name=name;
		this.group=group;
		this.marks=marks;
	}
	
	
	public Student(String code, String name, String group) {
		super();
		this.code = code;
		this.name = name;
		this.group = group;
	}

	
	public void askData() {
		name = AskUser.askString("Give me the name");
		group = AskUser.askString("GROUP");
		askMarks();

	}

	public int changeMark(int pos, float newMark) {
		if (pos < 0 || pos >= SIZE) {
			return -1;
		} else if (newMark < 0 || newMark > 11) {
			return -2;
		} else {
			marks[pos] = newMark;
			return 0;
		}

	}

	public void askMarks() {
		float auxMark;
		for (int i = 0; i < marks.length; i++) {
			do {
				auxMark = AskUser.askFloat("Give me " + (1 + i) + " first mark");
			} while (auxMark >= 0 && auxMark < 11);
			marks[i] = auxMark;
		}

	}

	public float averageMark() {
		float total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}

		return total / SIZE;

	}

	public int failNumber() {
		int count = 0;
		for (float value : marks) {
			if (value < 5)
				count++;
		}
		return count;

	}
	
	@Override
	public String toString() {
		return "Student [SIZE=" + SIZE + ", code=" + code + ", name=" + name + ", group=" + group + ", marks="
				+ Arrays.toString(marks) + "]";
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return the marks
	 */
	public float[] getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(float[] marks) {
		this.marks = marks;
	}

	/**
	 * @return the sIZE
	 */
	public int getSIZE() {
		return SIZE;
	}
	
	
}
