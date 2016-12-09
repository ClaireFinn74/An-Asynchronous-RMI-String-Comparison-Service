package ie.gmit.RMIInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringsService extends Remote
{
	public Resultator compare(String s, String t, String algo) throws RemoteException;
}