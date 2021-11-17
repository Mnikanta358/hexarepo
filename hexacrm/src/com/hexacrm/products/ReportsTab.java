
package com.hexacrm.products;
//raghav



import org.testng.annotations.Test;

import com.hexacrm.pages.NewReportSchedulePage;
import com.hexacrm.pages.ReportSchedulerPage;
import com.hexacrm.pages.ReportsPage;
import com.hexacrm.pages.signInpage;

import generic.lib.BaseTest;
import generic.lib.FileLib;



public class ReportsTab extends BaseTest {
	// public class VerifyHomePageTest extends BaseTest {
	// private static Object PROP_PATH;

	@Test
	
	public void reportspage() throws Throwable {
		FileLib flib = new FileLib();
		signInpage sp = new signInpage();
		sp.Login(flib.readPropertyData(PROP_PATH, "un"), flib.readPropertyData(PROP_PATH, "pw"));
		Thread.sleep(2000);
		ReportsPage rp = new ReportsPage();
		rp.clickReportsTab();
		Thread.sleep(3000);
		ReportSchedulerPage rsp = new ReportSchedulerPage();
		rsp.clickReportSchedulerTab();
		Thread.sleep(6000);
		Thread.sleep(2000);
		NewReportSchedulePage np = new NewReportSchedulePage();
		np.ClickScheduleTab(flib.readPropertyData(PROP_PATH, "sn"), flib.readPropertyData(PROP_PATH, "fm"),
				flib.readPropertyData(PROP_PATH, "dt"), flib.readPropertyData(PROP_PATH, "tt"));

		Thread.sleep(1000);

	}
}
