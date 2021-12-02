package com.scuba.testng;


	import org.testng.annotations.Test;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	 

public class Annotations 
{

	 @Test
	 public void testCase1() {
	   System.out.println("this is @test annotation"); 
	 }

	 @BeforeMethod
	 public void beforeMethod() {
	   System.out.println("@before method execute before every Method");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	   System.out.println("@aftermethod execute after every Method");
	 }
	 
	 @BeforeClass
	 public void beforeClass() {
	   System.out.println("@beforeclass execute before the Class");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("@afterclass execute after the Class");
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println("@beforetest execute before the Test");
	 }
	 
	 @AfterTest
	 public void afterTest() {
	   System.out.println("@aftertest  execute after the Test");
	 }
	 
	 @BeforeSuite
	 public void beforeSuite() {
	   System.out.println("@beforesuite execute before the Test Suite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("@aftersuite execute after the Test Suite");
	 }
	}
	 
	 
	 
	 


