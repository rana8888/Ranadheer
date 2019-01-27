# Ranadheer
SELENIUM------------------------------------------------------------------------------
1) Created a basic browser launch script using JUnit framework
2) Created a parameterized test in TestNG using @dataprovider annotation - TestNG Framework)
3) Created a parameterizedlogin test- TestNNG
Added testing.xml file used for ParameterizedLoginTest-----------------------------------
create a testing.xml file---add the below new tag in testing.xml
<test name="test3">
 <classes>
 <class name="testWordpress.ParameterizedLoginTest" ></class>
 </classes>
</test>
 OUT PUT for-------------------ParameterizedLoginTest
 "Username1","UserName1@123"
  "Username2","UserName2@123"
   "Username3","UserName3@123"
   
   Talking about the 2nd one in selenium@dataprovider annotation - TestNG Framework
   OUTPUT of ParameterByMethodInDataprovider---------------------------------------------------------------
   testMethodA("Ranadheer"), ("India")
      testMethodA("Krishna"), ("UK")
         testMethodA("Bhupesh"), ("USA")
         testMethodB("Canada")
         testMethodB("Russia")
         testMethodB("Japan")
