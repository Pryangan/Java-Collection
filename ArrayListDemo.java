import java.util.*;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();// we can also give size of ArrayList like (5)
		al.add(1);
		al.add(2);
		al.add(10);
		al.add(6);
		
		System.out.println(al);
		
		for(Integer x : al)
		{
			System.out.println(x);
		}
		
		System.out.println("Size of ArrayList is - "+al.size());
	
		al.remove(2);// 2 is Index of ArrayList
		
		for(Integer x : al)
			System.out.println(x);
			
		al.set(0,100);//we can modify the content of ArrayList with the help of Index 
		for(Integer x : al)
		System.out.println(x);
		
		al.clear();// delete all element from list
		
     	System.out.println("Size of ArrayList is - "+al.size());
	}
}