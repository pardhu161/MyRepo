package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class Homepage {

	@FindBy(xpath = "//img[@id = 'scrollright']")
	private WebElement scrlBtn;
	@FindBy(xpath = "//a[text()='Sales Orders']")
	private WebElement salesOrdrTab;

	public Homepage() {

		PageFactory.initElements(BaseTest.driver, this);
	}

	public void choose() throws Throwable {

		for (int i = 0; i <= 25; i++) {

			Thread.sleep(200);
			scrlBtn.click();
		}

		salesOrdrTab.click();
	}

}
