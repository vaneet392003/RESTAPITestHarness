# RESTAPITestHarness

This Test Harness will be used to test the deployed rest API from repository https://github.com/vaneet392003/SampleTestAPI

We are using Junit Test Suite and Unirest Client to call the REST API.

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
