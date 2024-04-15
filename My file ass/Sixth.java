import java.io.*;
import java.util.*;

class MyClass implements Serializable
{
	private int num;
	
	public MyClass(int num)
	{
		this.num = num;
	}

	@Override
	public String toString() {
		return "MyClass [num=" + num + "]";
	}
	
}
public class Sixth 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		MyClass []m = new MyClass[5];
		int z;
		System.out.println("Enter 5 items");
		for(int i=0;i<5;i++)
		{	 z=sc.nextInt();
			 m[i]=new MyClass(z);
		}
	
//		MyClass m1=new MyClass(10);
//		MyClass m2=new MyClass(20);
//		MyClass m3=new MyClass(30);
//		MyClass m4=new MyClass(40);
//		MyClass m5=new MyClass(50);
		
		List<MyClass> mylist = new ArrayList<MyClass>();
		for(int i=0;i<m.length;i++)
		{	 mylist.add(m[i]);
		}
		
//		mylist.add(m5);
//		mylist.add(m4);
//		mylist.add(m3);
//		mylist.add(m2);
//		mylist.add(m1);
		
		try(FileOutputStream fos = new FileOutputStream("D:\\Trial\\Assign.txt"))
		{
			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(mylist);
				System.out.println(" Written Succesfully in file");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		List<MyClass> mylist1= null; 
		
		try(FileInputStream fis = new FileInputStream("D:\\Trial\\Assign.txt"))
		{
			try(ObjectInputStream ois = new ObjectInputStream(fis))
			{
				mylist1 = (List<MyClass>)ois.readObject();
			} 
			
		} 
		catch(Exception e1) 
		{
			e1.printStackTrace();
		} 
		System.out.println(mylist1);
		
		ListIterator<MyClass> ltr = mylist1.listIterator();
		
		System.out.println("Read successfully from file");
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
	
	}
}
