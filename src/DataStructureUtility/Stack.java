package DataStructureUtility;

public class Stack<T>
{
	int size = 20;
    private Object[] stack = new Object[size];
    private int top = 0;
    
    //******************PUSH******************************//
    
    public void push(T data)
    { 
    	if(top == size)
    	{
    		expand();
    	}
    	stack[top]=data;
    	top++;
    }
    //*****************POP*********************************//
    public T pop()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack is Empty");
    		return null;
    	}
    	else
    	{
    		T data = (T) stack[--top];
    		stack[top]=null;
    		return data;
    	}
    	
    }
    
    //**********************peek***************************//
    
    public T peek()
    {
    	return (T) stack[top];
    }
    
    //********************IsEmpty***************************//
    
    public boolean isEmpty()
    {
    	return top==0;
    }
    
    //**********************sIZE***************************//
    
    public int  size()
    {
    	return top;
    }
    
    //***********************expand*************************//
    
    public void expand()
    {
    	Object[] newStack = new Object[size*2];
    	System.arraycopy(stack,0,newStack,0,top);
    	size *=2;
    	stack = newStack;
    }
    
    
}
