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

8. Added a reference to the Servlet.api file within the *lib* folder of my *tomcat* by right-clicking on my project and selecting the otion *Add external JAR*

## Using CMD prompt to set up JAVA_HOME and CATALINA_HOME:
1. Fist I went into *Advanced System Settings* on my machine.
2. I went into *Environment Variables* and then I added two new ones like so:
[![J2EESETUP.png](https://s14.postimg.org/4f0lhocbl/J2_EESETUP.png)](https://postimg.org/image/cxa1m0iu5/)
3. I just had to point at where my *Java home* was (in my *Program Files* in a folder called *Java*) and then point to where I had *Catalina* on my machine (within my downloaded Tomcat folder)
4. I could then just ECHO my *JAVA_HOME* and *CATALINA_HOME* to double-check things were set up correctly like so:
[![CMDECHOHOME.png](https://s13.postimg.org/f1po3xepz/CMDECHOHOME.png)](https://postimg.org/image/uaflhp8eb/)
5. Now I just had to start up my Tomcat Server by navigating inside my *bin* folder within my downloaded Tomcat folder and using the command *startup.bat*.

