import java.util.*;
public class HashSetProg
{
	public static void main(String args[])
	{
		HashSet<String> number = new HashSet<String>();
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		number.add("five");
		System.out.println(number);
		
		for(String s : number)
		{
			System.out.println(s);
		}
		
		Iterator<String> iter = number.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}