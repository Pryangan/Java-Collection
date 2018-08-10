import java.util.LinkedList;

public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("ABC");
		ll.add("BCD");
		ll.add("CDE");
		ll.add("DEF");
		ll.addFirst("First");// It insert Value at First in LinkedList
		ll.addLast("Last");// It Insert Value at Last in LinkedList
		
		System.out.println(ll);// Print value directly with LinkedList Reference Variable
		
		for(String s : ll)
			System.out.print(s+" ");	//Print value by loop
			
		ll.set(2,"New Value");// Modify value by Index
		System.out.println(ll);
		
		ll.removeFirst();// remove element from First
		ll.removeLast();// remove element from last
		System.out.println(ll);
		
		ll.remove(3);// remove element from list by index
		System.out.println(ll);
		
		ll.clear();// Delete all record from LinkedList
		
		System.out.println("Size of LinkedList is - "+ll.size());
	}
}