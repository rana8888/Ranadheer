package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedLoginTest {
 
@Test(dataProvider = "parameterIntTestProvider")
 public void parameterIntTest(String UserName, String Password) {
 System.out.println("UserName " + UserName);
 System.out.println("Password " + Password);
 }
 
 //This function will provide the parameter data
 // Selenium framework - read the data from xls file and put it in Object array
 // rows - number of time test has to be repeated
 // cols - number of parameters in test data
 @DataProvider(name = "Data-Provider-Function")
 public Object[][] parameterIntTestProvider() {
 
 Object[][] data = new Object[3][2];
 
 data[0][0] = "UserName1";
 data[0][1] = "UserName1@123";
 
 data[1][0] = "UserName2";
 data[1][1] = "UserName2@123";
 
 data[2][0] = "UserName2";
 data[2][1] = "UserName2@123";
 
 return data;
 }
}