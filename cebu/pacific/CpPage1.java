package org.cebu.pacific;

import org.adac.bin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CpPage1 extends BaseClass {

	public CpPage1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='promptHeaderCloseButtonContainer']")
	public WebElement Mbutton;
	
	@FindBy(xpath="//span[text()='SIGN IN']")
	public WebElement sigin;
	
	@FindBy(xpath="//input[@id='cebMemberLogin_Username']")
	public WebElement user;
	
	@FindBy(xpath="//input[@id='cebMemberLogin_Password']")
	public WebElement pass;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-blue btn-icon btn-alt btn-block removeUnloadConfirm']")
	public WebElement logbuttn;
	
	@FindBy(xpath="//a[text()='Book a Flight']")
	public WebElement Bflight;
	
	@FindBy(xpath="//input[@id='fromInput']")
	public WebElement Finput;
	
	@FindBy(xpath="//input[@id='toInput']")
	public WebElement Tinput;
	
	@FindBy(xpath="//input[@id='startDateNew']")
	public WebElement Sdate;
	
	@FindBy(xpath="(//div[text()='14'])[1]")
	public WebElement Sdated;
	
	@FindBy(xpath="(//button[@class='btn btn-blue btn-alt btn-icon count-controls add'])[1]")
	public WebElement Adult;
	
	@FindBy(xpath="(//button[@class='btn btn-blue btn-alt btn-icon count-controls add'])[3]")
	public WebElement infant;
	
	@FindBy(xpath="//button[@id='btnFind']")
	public WebElement Fflights;

	
	public WebElement getSigin() {
		return sigin;
	}

	public WebElement getMbutton() {
		return Mbutton;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbuttn() {
		return logbuttn;
	}

	public WebElement getBflight() {
		return Bflight;
	}

	public WebElement getFinput() {
		return Finput;
	}

	public WebElement getTinput() {
		return Tinput;
	}

	public WebElement getSdate() {
		return Sdate;
	}

	public WebElement getSdated() {
		return Sdated;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getInfant() {
		return infant;
	}

	public WebElement getFflights() {
		return Fflights;
	}
	
	
	
	
	
}
