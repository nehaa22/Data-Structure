package DataStructureUtility;
import DataStructureUtility.UnorderedList;

public class Dequeue<T>
{
	UnorderedList<T> d = new UnorderedList <>();
	private int f=-1;
	private int r=-1;
	int size;
	
	//*******************Add-Rear***************************//
	
	public void addRear(T data)
	{
		if(r == -1)
		{
			f=0;
			r=0;
		}
		d.add(data);
		r++;
	}
	
	//*******************ADD-FRONT****************************//
	
	
	public void addFront(T data)
	{
		if(f == -1)
		{
			f=0;
			r=0;
		}
		d.add(data);
		r++;
	}
	
	//**********************REMOVE-REAR**************************//
	
	public T removeRear()
	{
		if(r==-1)
		{
			System.out.println("Empty");
		    return null;
		}
		else
		{
			r--;
			return d.pop();
		}
	}
	
	//************************REMOVE-FRONT*********************//
	
	public T removeFront()
	{
		return d.pop(0);
	}
	
	//***********************IS-EMPTY**************************//
	
	public boolean isEmpty() 
	{
		return size==0;
	}
	
	//*************************SIZE****************************//
	
	public int size()
	{
		return d.size();
	}
	
	//****************************To=String********************//
	
	public String toString() 
	{
		return d.toString();
	}
}
