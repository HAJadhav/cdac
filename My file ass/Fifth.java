import java.util.*;
import java.io.Serializable;
import java.io.*;

class MyNum implements Serializable
{
	private int num;
	public MyNum(int num)
	{
		this.num=num;
	}
	@Override
	public String toString() {
		return "MyNum [num=" + num + "]";
	}
	
}
public class Fifth implements Serializable
{
  public static void main(String[] args) 
 {
	MyNum m1 = new MyNum(1);
	MyNum m2 = new MyNum(2);
	MyNum m3 = new MyNum(3);
	MyNum m4 = new MyNum(4);
	
	List<MyNum> li=new ArrayList<MyNum>();
	li.add(m1);
	li.add(m2);
	li.add(m3);
	li.add(m4);
	
	System.out.println("Initial array: "+li);
	
	try(FileOutputStream fos=new FileOutputStream("d://Trial//ass5.txt"))
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			oos.writeObject(li);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	List<MyNum> l1=null;
	try(FileInputStream fis = new FileInputStream("d://Trial//ass5.txt"))
	{
  	   try(ObjectInputStream ois = new ObjectInputStream(fis))
  	   {
  		  l1 = (ArrayList)ois.readObject();
           }
       }
	catch(Exception ee) {
    	  ee.printStackTrace();
      }

      Iterator itr = l1.iterator();
  		  
  	System.out.println("Output array");
  	 while(itr.hasNext())
  	 {
  	  System.out.println(itr.next());
  	 }

   
 }
}
