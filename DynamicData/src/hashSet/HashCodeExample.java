package hashSet;

import java.util.HashSet;
import java.util.Iterator;


public class HashCodeExample {
	static AbeStrings name= new AbeStrings("ana");
	static AbeStrings name1= new AbeStrings("anaS");
	static AbeStrings name2= new AbeStrings("mama");
	
	public static void main(String[] args) {
		HashSet<AbeStrings> set=new HashSet<AbeStrings>();
		set.add(name);
		set.add(name1);
		set.add(name2);
		
		System.out.println("We have "+set.size()+" elements");
		
		Iterator<AbeStrings> iter=set.iterator();
		AbeStrings auxAbe;
		while(iter.hasNext()){
			auxAbe=iter.next();
			System.out.println(auxAbe.toString()+" hash--> "+auxAbe.hashCode());
		}
	}
}
