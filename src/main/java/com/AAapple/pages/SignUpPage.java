package com.AAapple.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.AAapple.BaseFile.BaseClass;

public class SignUpPage extends BaseClass {

	WebDriver driver;

	@FindBy(xpath = "//input[@data-floating='Floating' and @name=\"desiredAmount\"]")
	public WebElement desiredAmount;

	@FindBy(xpath = "//select[@aria-label='Loan Purpose']")
	public WebElement Purpose;

	@FindBy(tagName = "option")
	public WebElement option;

	@FindBy(xpath = "//button[contains(text(),'Check your rate')]")
	public WebElement Submit;

	@FindBy(xpath = "//div[contains(text(),'Individual')]")
	public WebElement Individual;

	@FindBy(name = "borrowerFirstName")
	public WebElement FirstName;

	@FindBy(name = "borrowerLastName")
	public WebElement LastName;

	@FindBy(name = "borrowerStreet")
	public WebElement street;

	@FindBy(name = "borrowerCity")
	public WebElement city;

	@FindBy(name = "borrowerState")
	public WebElement state;

	@FindBy(xpath = "//input[@name='borrowerZipCode']")
	public WebElement zipcode;

	@FindBy(name = "borrowerDateOfBirth")
	public WebElement birthdate;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	public WebElement ButtonContinue;

	@FindBy(name = "borrowerIncome")
	public WebElement income;

	@FindBy(name = "borrowerAdditionalIncome")
	public WebElement AdditionalIncome;

	@FindBy(xpath = "//li[contains(text(),'Fixed rates')]")
	public WebElement FixedRate;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	public WebElement Buttoncontinue2;

	@FindBy(xpath = "//input[@name='username']")
	public WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;

	@FindBy(xpath = "//div[@class='sc-pZBmh sc-oTbqq fsuEer']")
	public WebElement Unknown;

	@FindBy(xpath = "//button[contains(text(),'Check Your Rate')]")
	public WebElement buttonRate;

	@FindBy(xpath = "//div[@class='section--sm']//div")
	public List<WebElement> resultList;

	@FindBy(xpath = "//header[@class='header header--collapsed']//label[1]")
	public WebElement HiddenClick;

	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	public WebElement signout;

	@FindBy(xpath = "//button[contains(text(),'Sign in to your account')]")
	public WebElement signInaccount;

	@FindBy(xpath = "//div[@class='section--sm']//div")
	public WebElement ResultListAfter;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='layout__wrap']/main[@class='container-fluid layout__main layout-default']/div/header[@class='header header--collapsed']/div[@class='header-nav']/label[1]")
	public WebElement nav;

	@FindBy(xpath = "//header[@class='header header--collapsed']//label[1]")
	public WebElement nav1;

	public List<String> Result1() {

		List<String> actualResult = new ArrayList<String>();

		for (int i = 0; i < resultList.size(); i++) {
			actualResult.add(resultList.get(i).getText());
		}

		//System.out.println(actualResult);
		return actualResult;
	}

	public List<String> Result2() {

		List<String> AfterLoginResult = new ArrayList<String>();

		for (int i = 0; i < resultList.size(); i++) {
			AfterLoginResult.add(resultList.get(i).getText());
		}

		//System.out.println(AfterLoginResult);
		return AfterLoginResult;
	}
	
}
