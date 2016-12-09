package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import ie.gmit.rmiModels.StringService;
import ie.gmit.rmiModels.StringServiceImpl;

//This is the class that will be used to run the RMI server
public class Servant
{
	
//This is the Main method of the Servant class
public static void main(String[] args) throws Exception
{	
		//Making an instance of StringsService so I can use its methods
		StringsService newInstance = new StringServiceImpl();
		LocateRegistry.createRegistry(1099); //Obtaining a reference to a remote object registry on port 1099
		Naming.rebind("stringsService", newInstance);	//Associating this remote object with the name stringsService
	
		System.out.println("The Server is now ready for use.");	// the server is ready to use now		
	}
	
}
