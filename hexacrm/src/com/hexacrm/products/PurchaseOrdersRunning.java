package com.hexacrm.products;

import org.testng.annotations.Test;

import com.hexacrm.pages.CreatePurchaseOrderPage;
import com.hexacrm.pages.NewPurchaseOrderPage;
import com.hexacrm.pages.PurchaseOrdersPage;
import com.hexacrm.pages.signInpage;

import generic.lib.BaseTest;
import generic.lib.FileLib;


public class PurchaseOrdersRunning extends BaseTest {
	@Test
	public void purchase() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		Thread.sleep(2000);
		PurchaseOrdersPage po = new PurchaseOrdersPage();
		po.choose();
		po.getPurchaseOrdersTab();
		Thread.sleep(2000);
		NewPurchaseOrderPage npo = new NewPurchaseOrderPage();
		npo.order();
		Thread.sleep(2000);
		CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage();
		cpo.OrderDetails(flib.readPropertyData(PROP_PATH, "sb"));
		Thread.sleep(2000);
}
}