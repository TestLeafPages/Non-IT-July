package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation {
  @Test
  public void Test1() {
	  System.out.println("Executing Test1 testcase");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Executing test2 testcase");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfetClass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");

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
