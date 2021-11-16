package com.crm.main;

import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.FileLib;
import com.crm.pages.Homepage;
import com.crm.pages.SignInPage;

     @Test
   public class Runner extends BaseTest  {
//	public static void main(String[] args) throws Throwable {
    	 
	public void Logging() throws Throwable {	
//	 BaseTest bt = new BaseTest();
//	 bt.openBrowser(); 	  
	  
	 Thread.sleep(1000);
	 SignInPage sp = new SignInPage();
	 FileLib flib = new FileLib();	 
	 sp.login(flib.readPropData(PROP_PATH, "usn"),flib.readPropData(PROP_PATH, "pwd"));
	 
	 Thread.sleep(2000);
	  Homepage hp = new Homepage();
	  hp.choose();	  
	  
	}
 }

