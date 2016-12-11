# An-Asynchronous-RMI-String-Comparison-Service

First I:

1. Downloaded Java 8 SDK (Software Development Kit)
2. Downloaded Eclipse Java EE IDE  (Integrated Development Environment)
3. Downloaded & Installed Tomcat 9
4. Configured Eclipse to use Java 8 as the Runtime
5. Configured Eclipse to use Tomcat 9
6. Created a Dynamic Web Project called *An Asynchronous RMI String Comparison Service* with 3 folders, *ie*, *gmit*, and *sw* like so:
[![DynamicWeb.png](https://s29.postimg.org/6kkqhpzuv/Dynamic_Web.png)](https://postimg.org/image/clifesmgz/)

7. Added a reference to my *Service Handler* class within my *web.xml* file.
8. Added a reference to the *Servlet.api* file within the *lib* folder of my *tomcat* by right-clicking on my project and selecting the option *Add external JAR*
9. To create the *Index.jsp* file I started apache tomcat and then while it was running I dragged and dropped my *WAR* file *(Comparator.war)* into the *webapps folder of tomcat* and then a folder called *Comparator* was created with the Index.jsp file within it.

## Using CMD prompt to set up JAVA_HOME and CATALINA_HOME:
1. First I went into *Advanced System Settings* on my machine.
2. I went into *Environment Variables* and then I added two new ones like so:
[![J2EESETUP.png](https://s14.postimg.org/4f0lhocbl/J2_EESETUP.png)](https://postimg.org/image/cxa1m0iu5/)

3. I just had to point at where my *Java home* was (in my *Program Files* in a folder called *Java*) and then point to where I had *Catalina* on my machine (within my downloaded Tomcat folder)

4. I could then just ECHO my *JAVA_HOME* and *CATALINA_HOME* to double-check things were set up correctly like so:
[![CMDECHOHOME.png](https://s13.postimg.org/f1po3xepz/CMDECHOHOME.png)](https://postimg.org/image/uaflhp8eb/)

5. Now I just had to start up my Tomcat Server by navigating inside my *bin* folder within my downloaded Tomcat folder and using the command *startup.bat*.

## Adding authentication for Tomcat:

1. When you navigate to port 8080 and choose 'Manager-App' Tomcat will promp you for a __Username__ and __Password__.
[![timkaht.png](https://s11.postimg.org/3vl0z0yub/timkaht.png)](https://postimg.org/image/yd0vqkm73/)

2. Within my downloaded Tomcat folder is an *xml file* called *users.xml*.
3. To add yourself into the file as a user just add this text to the bottom of the file in a text editor (or whatever username and password you want yourself) :
```
<user username="claire" password="Claire123" roles="manager-gui" /> 
```

4. Now enter these credentials in when asked for!

## How I set my code up in Eclipse:
1. Within my *gmit* folder, I created 3 folders to split up my code; One called *RMIInterface* to store my RMI classes, One called *ServiceHandler* to store my *ServiceHandler* class, and One called *String Algos* to store these classes for computing the edit distance:
                                  
                                  
                                  * Levenshtein
                                  * Hamming Distance
                                  * DamerauLevenshtein

2. As *Resultator* was referenced within StringsService I then went about setting up the Interface *Resultator* with the following methods within the *RMIInterface* folder:

	````    
		public String getResult() throws RemoteException;
		public void setResult(String result) throws RemoteException;
		public boolean isProcessed() throws RemoteException;
		public void setProcessed() throws RemoteException; 
	````
3. I then went about exposing the interface *Resultator* by setting up the class *ResultatorImpl*.
4. Then, within the *sw* folder I added a *Servant* class.
5. Next, I added in the *web.xml* and the created *Index.jsp* file within:

				 * StringService ===> Web Content ==> WEB-INF => lib			 


# How to run the project:

## Before you run anything remember to grab my *Comparator* folder within my *project* folder and drop it into your *Tomcat Server*.


1. I've made a JAR file out of my main classes and pointed the main class to run as my *servant.java* (Server class)
2. Run the Jar using the following command:

			```
			java -cp ./string-service.jar ie.gmit.sw.Servant
			``` 
 3. Now, run your  __Tomcat Server__ by navigating on the *command line* to the *bin* folder and using:

		```
		startup.bat
		```
4. Go to localhost8080 and a Tomcat webpage should be displayed, go to *Manager App*.
5. Enter in any Username and Password authentication that appears (see above if you aren't already set up as a user on Tomcat)
6. Now, scroll down to the Deploy WAR file button like so and choose my Comparator folder:
[![Comparator.png](https://s28.postimg.org/orugtfpkt/Comparator.png)](https://postimg.org/image/p4luzm7uh/)

7. You should then scroll up to *Applications* and click on the *comparator* link:
[![run.png](https://s18.postimg.org/6tbdno7jd/run.png)](https://postimg.org/image/4bzmgenmt/)

8. You should now see your webpage:
[![comparatorpage1.png](https://s29.postimg.org/5ptew6twn/comparatorpage1.png)](https://postimg.org/image/8wnyftecj/)


## References
1. http://stackoverflow.com/questions/1842734/how-to-asynchronously-call-a-method-in-java Async calls in Java
2. http://stackoverflow.com/questions/10044079/display-messesge-wait-as-background-processing-happening JSP
3. http://javarevisited.blogspot.ie/2012/12/blocking-queue-in-java-example-ArrayBlockingQueue-LinkedBlockingQueue.html BlockingQueues
4. http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html BlockingQueues
5. https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html HashMaps
6. http://docs.oracle.com/javase/7/docs/technotes/guides/rmi/hello/hello-world.html RMIGetStarted
