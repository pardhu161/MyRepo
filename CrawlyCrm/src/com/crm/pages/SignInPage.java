package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class SignInPage {
	

	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
    @FindBy(xpath ="//input[@title='Sign In']") private WebElement signinBtn;
 	
    public SignInPage() {
    	
    	PageFactory.initElements(BaseTest.driver, this);
    }

	public WebElement getUntb() {
		return untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}
    
    public void login(String usn,String pwd ) {
    	
    	untb.sendKeys(usn);
    	pwtb.sendKeys(pwd);
    	signinBtn.click();
    }
    
    
  //table//tr[@class='tableHeadBg']/following-sibling::tr//td[1] xpath for handling webtable
	
}
