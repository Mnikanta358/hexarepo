package com.hexacrm.products;

import org.testng.annotations.Test;

import com.hexacrm.pages.CloneContactPage;
import com.hexacrm.pages.ContactsPage;
import com.hexacrm.pages.CreateContatPage;
import com.hexacrm.pages.signInpage;

import generic.lib.BaseTest;
import generic.lib.FileLib;

public class ContactRunningPage extends BaseTest {
	@Test
	public void ContactPage() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
                     //WebDriverCommonLib wd = new WebDriverCommonLib();	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		
         ContactsPage cp=new ContactsPage();
         cp.ClickContactsTab();
         CreateContatPage ccp = new CreateContatPage();
         Thread.sleep(2000);
         ccp.ContactDetails(flib.readPropertyData(PROP_PATH, "ln"),
        		            flib.readPropertyData(PROP_PATH, "lan"));
        		           
         Thread.sleep(1000);
         
         CloneContactPage cc = new CloneContactPage();
         Thread.sleep(2000);
        
     
         
         
	}
	}