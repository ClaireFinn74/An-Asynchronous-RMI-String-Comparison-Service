package ie.gmit.sw;
//Using this import to deal with binding names
import java.rmi.Naming;
//Using this import to deal with using the registry
import java.rmi.registry.LocateRegistry;
// Using this import to deal with referencing my StringService class within the RMIInterface folder
import ie.gmit.RMInterface.StringService;
// Using this import to deal with my StringServiceImpl class within the RMIInterface folder
import ie.gmit.RMInterface.StringServiceImpl;

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
