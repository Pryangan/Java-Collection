import java.util.*;

public class ListIteratorDemo
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<>();
		
		for(int i = 1;i <= 5;i++)
			al.add("Value "+i);
			
		ListIterator<String> listIterator = al.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.print(" [ "+listIterator.next()+" ] ");
		}
		
		System.out.println();
		
		while(listIterator.hasPrevious())
		{
			System.out.print(" [ "+listIterator.previous()+" ] ");
		}
	}
}