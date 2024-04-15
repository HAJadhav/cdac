
import java.util.*;
import java.lang.*;

public class First
{
	public static void main(String[]args)
	{
		List<Object>li = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nos:");
		int z;
		for(int i=0;i<7;i++)
		{	z=sc.nextInt();
		    li.add(z);
		}
		ListIterator ltr=li.listIterator();
		
		System.out.println("Display:");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("Previous:");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}
}
