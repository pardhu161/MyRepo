package com.crm.purchOrder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseOrdersPage {
	
	//Purchase Order Information
	@FindBy(xpath = "//a[text() = 'Purchase Orders']") private WebElement podtab;
	@FindBy(xpath = "//input[@value = 'New Purchase Order']") private WebElement npodBtn;
	@FindBy(xpath = "//input[@name='property(Subject)']") private WebElement subjectTb;
	@FindBy(xpath = "//input[@name= 'property(Requisition No)']") private WebElement rqsTb;
	@FindBy(xpath= "//input[@name= 'property(Contact Name)']") private WebElement  cntTb;
	@FindBy(xpath = "//input[@name= 'property(Due Date)']") private WebElement delvDate;
	@FindBy(xpath = "//input[@name= 'property(Excise Duty)']") private WebElement edTb;
	@FindBy(xpath = "//select[@name= 'property(Status)']") private WebElement stsDrpDwn;
	@FindBy(xpath = "//input[@name= 'property(PO Number)']") private WebElement poNumTb;
	@FindBy(xpath = "//input[@name= 'property(Vendor Name)']") private WebElement vNameTb;
	@FindBy(xpath = "//input[@name= 'property(Tracking Number)']") private WebElement tNumTb;
	@FindBy(xpath = "//input[@name= 'property(PO Date)']") private WebElement poDate;
	@FindBy(xpath = "//select[@name= 'property(Carrier)']")private WebElement carrierTb;
	@FindBy(xpath = "//input[@name= 'property(Sales Commission)']") private WebElement sCmsnClctr;
	
	//Address Information
	@FindBy(xpath = "//input[@name= 'property(Billing Street)']")private WebElement billStrtTb;
	@FindBy(xpath = "//input[@name= 'property(Billing City)']") private WebElement billcityTb;
	@FindBy(xpath = "//input[@name= 'property(Billing State)']") private WebElement billStateTb;
	@FindBy(xpath="//input[@name= 'property(Billing Code)']") private WebElement billCodeTb;
	@FindBy(xpath="//input[@name= 'property(Billing Country)']") private WebElement billCntryTb;
	@FindBy(xpath = "//input[@name= 'property(Shipping Street)']") private WebElement billShpngStrtTb;
	@FindBy(xpath = "//input[@name= 'property(Shipping City)']") private WebElement billShpngCityTb;
	@FindBy(xpath = "//input[@name= 'property(Shipping State)']")private WebElement billShpngStTb;
	@FindBy(xpath = "//input[@name= 'property(Shipping Code)']")private WebElement billShpngCodeTb;
	@FindBy(xpath = "//input[@name= 'property(Shipping Country)']") private WebElement billShpngCntryTb;
	
	//Product Details
	@FindBy(xpath = "//input[@id='txtProduct1']") private WebElement prdctNameTb;
	@FindBy(xpath="//input[@id='hdnProductCode1']") private WebElement prdctCodeTb;
	@FindBy(xpath="//input[@id='hdnQtyStock1']") private WebElement qtyStckTb;
	@FindBy(xpath="//input[@id='txtQty1']") private WebElement qtyTb;
	@FindBy(xpath="//input[@id='hdnUnitPrice1']") private WebElement upTb;
	@FindBy(xpath = "//input[@id='txtListPrice1']")private WebElement listPrcTb;
	
	//Terms and conditions
	@FindBy(xpath = "//textarea[@name='property(Terms and Conditions)']")private WebElement tAndCTb;
	@FindBy(xpath = "//textarea[@name='property(Description)']")private WebElement dsrptnTb;
	
	//Save Button
	@FindBy(xpath = "(//input[@value='Save'])[2]")private WebElement saveBtn;
	
	//Save and New Button
	@FindBy(xpath ="(//input[@value='Save & New'])[2]")private WebElement saveAndNewBtn;
	
	//Cancel Button
	@FindBy(xpath = "(//input[@onclick='cancelfun()'])[2]")private WebElement cancelBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
