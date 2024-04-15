import java.lang.*;
import java.util.*;

public class Third {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int z;
		
		System.out.println("Enter 7 nos:");
		for(int i=0;i<7;i++)
		{
			z=sc.nextInt();
			l.add(z);
		}
				
		System.out.println("the contents are  : ");
		System.out.print(l);
				
		l.addFirst(500);
		l.add(1,400);
		
		l.addLast(1000);
		
		System.out.println("the changed list: "+l);

	}

}

