package arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<Comparable> c= new ArrayList<Comparable>();
		  c.add(3);
		  c.add(9.5);
		  c.add(1, "Hello Majo!!");
		  c.add(35);
		  System.out.println("Display the collection");
		  displayCollection(c);
		//substitute
		  c.set(1, "taaaaaaaa");
		  System.out.println("Display the collection");
		  displayCollection(c);
		//deleted
		  System.out.println("Let's delete the content of position 1");
		  c.remove(1);
		  displayCollection(c);
		  c.remove("taaaaaaaa");
		  displayCollection(c);


	}
	
	public static void displayCollection(List<Comparable> arrayList) {
		  System.out.println("Display the collection");
		  //create the iterator 
		  ListIterator<Comparable> iterator;
		  //invoking the listIterator method we relate the iterator with the list to rerun it
		  iterator=arrayList.listIterator();
		  String string;
		  //Recorrecting the list using the iterator
		  while (iterator.hasNext()) {
		    System.out.println("The following value from the collection: ");
		    System.out.println("This is the position: "+iterator.nextIndex());
		  //Convert the value read to a string
		    string=String.valueOf(iterator.next());
		    System.out.println("The value it contains is: "+string);
		  
		  }
		}


}
