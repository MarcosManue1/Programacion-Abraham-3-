package hashSet;

public class AbeStrings {
	String value;
	
	/*
	 * # We need
	 * Method to count 'a' or 'A'
	 * equals()
	 * hashCode()
	 */


	public AbeStrings() {
		super();
		this.value="Marcos";
	}
	

	
	public AbeStrings(String string) {
		value= string;
	}



	public int countingChar() {
		int count=0;
		if(value!=null) {
			
		
		for(int i=0;i<value.length();i++) {
			if(value.charAt(i)=='a' || value.charAt(i)=='A') 
				count++;
		}
		
		}else {
			count=-1;
		}
		return count;
	}
	
	@Override
	public int hashCode() {
		return countingChar();
	}


	@Override
	public String toString() {
		return value;
	}
	
	@Override
	public boolean equals(Object obj) {
		AbeStrings aux=(AbeStrings)obj;
		if(value.length()==aux.value.length())
			return true;
		else
			return false;
	}
	

}	

