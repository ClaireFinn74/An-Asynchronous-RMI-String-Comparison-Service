# An-Asynchronous-RMI-String-Comparison-Service

First I:

1. Downloaded Java 8 SDK (Software Development Kit)
2. Downloaded Eclipse Java EE IDE  (Integrated Development Environment)
3. Downloaded & Installed Tomcat 9
4. Configured Eclipse to use Java 8 as the Runtime
5. Configured Eclipse to use Tomcat 9
6. Created a Java Project called *RMIInterface* with these classes for computing the edit distance:
                                  
                                  
                                  * Levenshtein
                                  * Hamming Distance
                                  * DamerauLevenshtein
                                  
7. Created a WEB EE Dynamic Project called *StringService* with the class *ServiceHandler* like so:
[![javaee.png](https://s11.postimg.org/jh81lmjqr/javaee.png)](https://postimg.org/image/9woeyquen/)

8. Added a reference to the *Servlet.api* file within the *lib* folder of my *tomcat* by right-clicking on my project and selecting the otion *Add external JAR*
9. To create the *Index.jsp* file I started apache tomcat and then while it was running I dragged and dropped my *WAR* file *(Comparator.war)* into the *webapps folder of tomcat* and then a folder called *Comparator* was created with the Index.jsp file within it.

## Using CMD prompt to set up JAVA_HOME and CATALINA_HOME:
1. Fist I went into *Advanced System Settings* on my machine.
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
1. I added in the *ServiceHandler* class into my *String Service* project within the

				* Web Content =====> WEB-INF ====> Java Code ===> ie ==> gmit => sw directory.
2. Then, I set up my Interface StringsService within that same *String Service* project like so:

                                * StringService=====> src ====> ie ===> gmit==> sw => StringsService
3. As *Resultator* was referenced within StringsService I then went about setting up the Interface *Resultator* with the following methods within the same directory as point two:

	````    
		public String getResult() throws RemoteException;
		public void setResult(String result) throws RemoteException;
		public boolean isProcessed() throws RemoteException;
		public void setProcessed() throws RemoteException; 
	````
4. I then went about exposing the interface *Resultator* by setting up the class *ResultatorImpl*.
5. Next, I added in the *web.xml* and the created *Index.jsp* file within:

				 * StringService ===> Web Content ==> WEB-INF => lib
6. Then, I added in the 3 edit distance algorithms into my RMI Interface project within the directory:

			       	 * src ===> ie ==> gmit => sw
