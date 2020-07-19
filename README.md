# RESTAPITestHarness

This Test Harness will be used to test the deployed rest API from repository https://github.com/vaneet392003/SampleTestAPI

We are using Junit Test Suite and Unirest Client to call the REST API.

1. Compile JUnit tests in command line

To compile test classes, the JUnit JAR file must be present in the classpath. Use the -cp option with javac command to specify JUnit JAR file:

javac -cp junit-4.12.jar;. InMemoryRestTest.java

Note that in this command, the classpath must include the dot to denote the current directory that contains Java source files. And the test classes are separated by spaces.

For example, the following command compiles test class InMemoryRestTest.java  with JUnit 4:

javac -cp junit-4.12.jar;. InMemoryRestTest.java

Here, the JUnit JAR file junit-4.12.jar is in the same directory as the test classes. You can download JUnit JAR file from https://mvnrepository.com/artifact/junit/junit/4.12.

 

2. Run JUnit tests in command line

To run the test classes in command line, you have to specify JUnit JAR file and Hamcrest library JAR file (JUnit depends on it) in the classpath. You can download Hamcrest JAR file here. In the options for java command, specify the main class is org.junit.runner.JUnitCore followed by the names of the test classes (without .java extension). Here’s the syntax:

java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore  InMemoryRestTest

For example, the following command runs test classes InMemoryRestTest.java:

java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore InMemoryRestTest

Or

Steps - Run JUnit tests by Maven in command line

Step 1 - If your Java project is Maven-based, you can execute tests in the command prompt by specifying the goal testwhen running Maven, for example:
        
         mvn test
         
         mvn clean test
         
         mvn clean compile test
         
Step 2 - make sure that you have JUnit dependency in the pom.xml file:
         <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.12</version>
          <scope>test</scope>
         </dependency>
