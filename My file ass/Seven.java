import java.util.*;
import java.util.Map.Entry;

public class Seven {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> myMap = new HashMap<Integer,String>();
		int prn;
		String name;

		System.out.println("Enter PRN and Name of 4 Students");
		for (int i = 0; i<4; i++)
		{
			prn = sc.nextInt();
			name = sc.next();
			myMap.put(prn, name);
		}
		
		Set<Entry<Integer,String>> set = myMap.entrySet();
		
		Iterator itr = set.iterator();
		System.out.println("Output: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("The Map is: ");
		System.out.println(myMap);
	}

}
