package com.hexacrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.lib.BaseTest;

public class Homepage {
	
@FindBy(xpath="//a[text()='Home']") private WebElement HomeTab;
public Homepage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getHomeTab() {
	return HomeTab;
}
public void ClickHomeTab()
{
	HomeTab.click();
	}


}
