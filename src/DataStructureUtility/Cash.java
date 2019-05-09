package DataStructureUtility;
import java.util.NoSuchElementException;

class Nodee
{
	int data;
	Nodee next;
	
	Nodee()
	{
		data = 0;
		next = null;
	}
	
	Nodee(int d, Nodee n)
	{
		data = d;
		next = n;
	}
	
	public void setNode(int d)
	{
		data = d;
	}
	
	public void setLink(Nodee n)
	{
		next = n;
	}
	
	public int getNode()
	{
		return data;
	}
	
	public Nodee getLink()
	{
		return next;
	}
}

public class Cash 
{

	
	public Nodee front, rear;
	public int size;
	
	public Cash() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return front == null && rear == null;
	}
	
	public int getSize() {
		
		return size;		
	}
	
	public void insert(int data) 
	{
		Nodee newnode = new Nodee(data,null);
		
		if(rear == null)
		{
			front = newnode;
			rear = newnode;
		}
		else
		{
			rear.setLink(newnode);
			rear = rear.getLink();
		}
		size++;
	}
	
	public void remove()
	{
		if (isEmpty())
		{
        	throw new NoSuchElementException("Underflow Exception");
		}
        Nodee ptr = front;
        front = ptr.getLink();        
        if (front == null)
		{
            rear =null;
			size-- ; 
		}       
        return;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Stack underflow");
		}
		
		int data = front.getNode();
		return data;
		
	}
	
	public void display()
	{
		int ptr1 = 0;
		
		if(size == 0)
		{
			System.out.println("Empty");
		}
		
		Nodee ptr = front;
		
		while(ptr != rear.getLink())
		{
			ptr1 = ptr1+ptr.getNode();
			System.out.println(ptr1);
			
			ptr = ptr.getLink();
		}
		System.out.println();
	}
}

