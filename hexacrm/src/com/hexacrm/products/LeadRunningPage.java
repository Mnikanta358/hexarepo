package com.hexacrm.products;

import org.testng.annotations.Test;

import com.hexacrm.pages.CreateLeadPage;
import com.hexacrm.pages.LeadNewTaskPage;
import com.hexacrm.pages.LeadsPage;
import com.hexacrm.pages.signInpage;

import generic.lib.BaseTest;
import generic.lib.FileLib;



public class LeadRunningPage extends BaseTest {
	@Test
	public void Lead() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		Thread.sleep(2000);
		LeadsPage lp = new LeadsPage();
		lp.ClickLeadPage();
		Thread.sleep(2000);
		CreateLeadPage clp = new CreateLeadPage();
		clp.Data(flib.readPropertyData(PROP_PATH, "cn"),flib.readPropertyData(PROP_PATH, "lnl"));
		Thread.sleep(2000);
		LeadNewTaskPage lnt =new LeadNewTaskPage();
		lnt.NewTasks(flib.readPropertyData(PROP_PATH, "sub"));	
				
		

}
}