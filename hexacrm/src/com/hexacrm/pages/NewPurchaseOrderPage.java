package com.hexacrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.lib.BaseTest;

public class NewPurchaseOrderPage {
	@FindBy(xpath="//input[@value='New Purchase Order']") private WebElement NewPurchaseOrderbtn;

	public NewPurchaseOrderPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}


	public WebElement getNewPurchaseOrderbtn() {
		return NewPurchaseOrderbtn;
	}

public void order()
{
	NewPurchaseOrderbtn.click();	
}
}
