package DataStructureUtility;

public class Queue<T> 
{
	
	int cap = 5;
	private Object q[] = new Object[cap];
	private int f = -1;
	int r;
    int size;
    
    public String toString()
    {
    	String s = "{";
    	for(int i=f+1;i<r;i++)
    	{
    		s =s+ q[i]+ ",";
    	}
    	s =s +"}";
    	return s;
    }
    
    public int size()
    {
    	return size;
    }
    
    public boolean isEmpty()
    {
    	return size==0;
    }
    
   public  void enqueue(T item)
    {
    	if(size == cap)
    	{
    		expand();
    	}
    	q[r++]= item;
    	size++;
    }
    
    public void dequeue()
    {
    	if(size>0)
    	{
    		if(size<cap/2)
    		{
    			shrink();
    		}
    		q[++f]=null;
    		size--;
    	}
    }
    
    void expand()
    {
    	Object[] neww = new Object[cap*2];
    	cap *= 2;
    	
    	for(int i= f+1;i<r;i++)
    	{
    		neww[i]=q[i];
    	}
    	q=neww;
    }
    
    void shrink()
    {
    	Object neww[] = new Object[(cap*3)/4];
    	cap = (cap*3)/4;
    	int j = 0;
    	for(int i=f+1;i<r;i++)
    	{
    		neww[j++]=q[i];
    	}
    	f=-1;
    	r=size;
    	q=neww;
    	
    }
    
    
    
   
    
    

}
