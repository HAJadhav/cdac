import java.lang.*;
import java.util.*;

class Demo<T>
{
	private T num;
	public void setter(T num)
	{
		this.num=num;
	}
	public T getter()
	{
		return num;
	}
	@Override
	public String toString() {
		return "Demo [num=" + num + "]";
	}
	
}

public class Second 
{
	public static void main(String[] args) {
		Demo<String> ob = new Demo<>();
		 ob.setter("hello");
		 System.out.println(ob.getter());
	
		 Demo<Integer> ob1 = new Demo<>();
		 ob1.setter(100);
		 System.out.println(ob1.getter());

	}
}
