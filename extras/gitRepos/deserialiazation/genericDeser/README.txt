CS542 Design Patterns
Fall-2016
Assignment 5

README FILE

Due Date: Thursday, December 15, 2016.
Submission Date: Thursday, December 15, 2016.
Author: Triveni Banpela
e-mail: tbanpel1@binghamton.edu

Assignment Goal: 
Counting objects using Java Reflection

FILES:
		---genericDeser
     ----- README.txt
     ----- build.xml
     ----- input.txt 
     ----- src
       ---genericDeser
     	   ----------driver
	        	   ----------Driver
           ----------util
	              ----------First.java
	              ----------Second.java
				  ----------InputInterface.java
	              ----------PopulateObjects.java
				  ----------Logger.java
           ----------fileOperations
	              ----------FileProcessor.java     
				  
SAMPLE OUTPUT:
***************************************************
Unique First Objects: 4952
Total First Objects: 4952
Unique Second Objects: 5018
Total Second Objects: 5048
***************************************************

TO COMPILE:
ant -buildfile build.xml all

NOTE: Please Place the Input file parallel to the src directory

TO RUN:
Navigate to directory where build.xml is present and run 

ant -buildfile build.xml run -Darg0=input.txt -Darg1=0

To CLEAN:
ant clean
 
TO UN-TAR:
tar xvzf banpela_triveni_assign5.tar.gz


Data Structure Used:
***************************************************
HashMap

Time Complexity is 0(1).			   
			   
***************************************************