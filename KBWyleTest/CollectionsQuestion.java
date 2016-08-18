import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CollectionsQuestion 
{
	public static void main (String[] args)
	{
		//initialize 2 ArrayLists
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		//Put all numbers between 1 and 10 in ArrayList 1, and all numbers between 6 and 15 in ArrayList 2
		for (int i = 1; i <= 15; i++)
		{
			if (i <= 10)
				al1.add(i);
			if (i >= 6)
				al2.add(i);
		}
		
		//Randomly Shuffle the ArrayLists
		Collections.shuffle(al1);
		Collections.shuffle(al2);
		
		//Print the size and contents of the ArrayLists
		System.out.println("Contents of ArrayList 1 (size " + al1.size() + "): " + Arrays.toString(al1.toArray()));
		System.out.println("Contents of ArrayList 2 (size " + al2.size() + "): " + Arrays.toString(al2.toArray()));
		
		//Create new ArrayList with the numbers 1 through 15, sorted, using the previous 2 ArrayLists
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		for(Integer i : al1)
		{
			al3.add(i);
		}
		
		for(Integer i : al2)
		{
			if(!al3.contains(i))
				al3.add(i);
		}
		
		//Sort the new Arraylist in ascending order
		Collections.sort(al3);
		
		//Remove the middle element
		al3.remove(al3.size()/2);
		
		//Print size and contents of ArrayList 3 in reverse order
		Collections.reverse(al3);
		System.out.println("Contents of ArrayList 3 (size " + al3.size() + "): " + Arrays.toString((al3).toArray()) + "\n");
		
		//Create a Hashmap. Using Hashmap because it is fast and the problem requires no ordering
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
		//Checks if the key is there, adds if not, prints preexisting key/value pair if it exists
		if(map.containsKey("Three"))
				System.out.println("Key \"Three\" already exists mapped to the value " + map.get("Three"));
		else
			map.put("Three", 3);
		
		//Print the size and  the key value pairs in the HashMap
		System.out.println("Contents of HashMap (size " + map.size() + "): ");
		for (String k : map.keySet())
		{
			System.out.println("[" + k +", " + map.get(k) + "]");
		}
	}
}
