package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SampleFormspage {
	
	// Sample Form Page Objects
	public static By sendTo = By.name("email_to[]");
	public static By subject = By.id("subject");
	public static By email = By.id("email");
	public static By textboxField = By.id("q1");
	
	// Page Factory
	@FindBy(id="q2")
	public WebElement textboxMultiline;
	
	@FindAll({@FindBy(id="q4"), @FindBy(name="q4")})
	public WebElement radiobutton;

	@FindBy(how=How.ID,using="q5")
	public WebElement chkSingleAnswer;

	@FindBy(xpath = "//input[@value='Fourth Check Box']")
	private WebElement chkMultiAnswer;

	public void clickMultiAnswer() {
		chkMultiAnswer.click();
	}
	
	@FindBys({@FindBy(name="q11_first"), @FindBy(xpath="//input[@placeholder=\"First Name\"]")})
	public WebElement firstname;
	
	@FindBy(name="q11_last")
	@CacheLookup
	public WebElement lastname;
	
	public SampleFormspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
