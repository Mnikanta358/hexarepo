package com.hexacrm.products;

import org.testng.annotations.Test;

import com.hexacrm.pages.ProductsTabPage;
import com.hexacrm.pages.signInpage;

import generic.lib.BaseTest;
import generic.lib.FileLib;


public class CreateProductsTest  extends BaseTest  {

	
	@Test
	public void productsTest() throws Throwable {
		signInpage sp = new signInpage();
		FileLib flib = new FileLib();
	
		sp.Login(flib.readPropertyData(PROP_PATH,"un"),
				flib.readPropertyData(PROP_PATH,"pw"));
		Thread.sleep(2000);
		
		ProductsTabPage ps = new ProductsTabPage();
		ps.getProductsTab();
		ProductsTabPage pp = new ProductsTabPage();
		pp.getNewProductTab();
		Thread.sleep(4000);
		//1ProductsTabPage pn = new ProductsTabPage();
		pp.clickProductsTab(flib.readPropertyData(PROP_PATH,"pn"),
				flib.readPropertyData(PROP_PATH,"pn1"),
				flib.readPropertyData(PROP_PATH,"pn2"));
			Thread.sleep(3000);
			
	}
	}
		
		
	



