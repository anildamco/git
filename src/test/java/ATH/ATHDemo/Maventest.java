package ATH.ATHDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Maventest {
	  @Test
	  public void login() {
		  System.out.println("NewTest");
	  }
	  @Test
	  public void logout()
	  {
		  System.out.println("logout");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("afterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite"); 
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite");
	  }

	}

