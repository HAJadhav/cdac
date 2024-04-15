import java.util.*;
import java.util.concurrent.*;
public class Fourth {
	
	/*add 5 numbers inside CopyOnWriteArrayList and show how can you add 
	 * one more number at the same time of traversal through its iterator.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new CopyOnWriteArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		Iterator itr = li.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			li.add(100);
		}
		
		System.out.println("after change");
		
		itr = li.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

	}

}
