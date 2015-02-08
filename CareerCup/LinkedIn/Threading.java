import java.util.ArrayDeque;
public class Threading
{
	public static void main(String args[])
	{
		Queue que = new Queue(10);
		Producer p1 = new Producer(que);
		Consumer c1 = new Consumer(que);
		Thread producer = new Thread(p1);
		Thread consumer = new Thread(c1);
		producer.start();
		consumer.start();	
	}

}

class Producer implements Runnable
{
	Queue que;
	public Producer(Queue que)
	{
		this.que = que;
	}
	public void run()
	{
		try
		{
		int i=0;
		while(true)
		{
			que.add(i);
			i++;
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException ie)
		{
			
		}
	}

}

class Consumer implements Runnable
{
	Queue que;
	public Consumer(Queue que)
	{
		this.que = que;
	}
	public void run()
	{
		try
		{
		while(true)
		{
			que.remove();
			Thread.sleep(3000);
			
		}
		}
		catch(Exception e)
		{

		}
	}

}

class Queue
{
	ArrayDeque<Integer> list = new ArrayDeque<Integer>();
	private int capacity;
	private int size;
	public Queue(int capacity)
	{
		this.capacity= capacity;
	}
	public synchronized void add(int a)
	{
		try
		{
		while(size==capacity)
		{
			wait();
		}
		System.out.println("Adding "+a);
		list.add(a);
		size++;
		notifyAll();
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public synchronized int remove()
	{
		try
		{
		while(size==0) wait();
		int i =list.remove();
		System.out.println("Removing "+i);
		size--;
		notifyAll();
		return i;
		}
		catch(Exception e)
		{
			return 0;
		}
		

	}

}
