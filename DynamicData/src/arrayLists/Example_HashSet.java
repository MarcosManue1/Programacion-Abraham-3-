package arrayLists;

import java.util.HashSet;
import java.util.Iterator;

public class Example_HashSet {

	public static void main(String[] args) {
		HashSet <String> hash = new HashSet<String>();
		
		hash.add("Mon");
		hash.add("Tue");
		hash.add("Wen");
		hash.add("Thu");
		hash.add("Fri");
		hash.add("Sat");
		hash.add("Sun");
		
		System.out.println(">>Size= "+hash.size());
		
		
/*
 * Using a for each you can traverse the colecion but losing function
 */
		
//		for(String element : hash) {
// 		if(element.equals("Mon")
//				element="Anacleto";
//			System.out.println(element);
//		}
//	
	
		Iterator<String> iter=hash.iterator();
		
		while(iter.hasNext()) {
			String element = (String) iter.next();
			if(element.equals("Mon")) {
				iter.remove();
			}
			System.out.println(element);
		}
		
		print(hash);
	
	}
	
	public static void print(HashSet<String> hash) {
		System.out.println("----------------------    "+hash.size()+"    ---------------------");
		
	}
}
