package ie.gmit.RMIInterface;

import java.rmi.RemoteException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Algos implements Runnable
{
	
	public static void main(String[] args) throws RemoteException
	{
		jobAssignment jobAssignment = new jobAssignment();
		StringServiceImpl SSI = new StringServiceImpl();
		try
		{
			SSI = new StringServiceImpl();
		} catch (RemoteException e1)
		{
			e1.printStackTrace();
		}
		BlockingQueue<StringServiceImpl> linkedBQueue = new LinkedBlockingQueue<StringServiceImpl>();
		try
		{
			linkedBQueue.put(SSI);
		}
		catch (InterruptedException e)
		{
				e.printStackTrace();
		} 
		System.out.println("size of BlockingQueue before peek : " + linkedBQueue.size());       
		System.out.println("example of peek() in BlockingQueue: " + linkedBQueue.peek());
		System.out.println("size of BlockingQueue after peek : " + linkedBQueue.size());
		System.out.println("calling poll() on BlockingQueue: " + linkedBQueue.poll());
		System.out.println("size of BlockingQueue after poll : " + linkedBQueue.size());
		
		//Adding in the Job Assignment here
		System.out.println("Adding Job Number:" + jobAssignment.getJobNumber());
	}

	@Override
	public void run()
	{
		
	}

	public MatchingStringable getNewInstance()
	{
		return null;
	}

}
