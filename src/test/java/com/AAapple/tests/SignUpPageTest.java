package com.AAapple.tests;

import org.testng.annotations.Test;

import com.AAapple.pages.SignUpPage;
import com.AAapple.utilities.DataFile;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class SignUpPageTest {

	WebDriver driver;
	SignUpPage lp = new SignUpPage();

	DataFile d = new DataFile();

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {

		lp.openBrowser();

		lp.Maximize();

		Thread.sleep(2000);

		lp.openUpgrade();
	}

	@Test(priority = 1, description = "SignUp_Page_Account_Created")
	public void test1() throws InterruptedException {

		lp.desiredAmount.clear();

		lp.desiredAmount.sendKeys(d.LoanAmount);

		List<WebElement> all = lp.Purpose.findElements(By.tagName("option"));

		Select s = new Select(lp.Purpose);

		s.selectByValue(d.Purpose);

		lp.Submit.click();
		// 2nd page

		lp.Individual.click();
		lp.FirstName.sendKeys(d.Firstname);
		lp.LastName.sendKeys(d.Lastname);

		lp.street.sendKeys(d.address);
		lp.city.sendKeys(d.City);
		lp.state.sendKeys(d.State);

		Thread.sleep(1000);

		lp.zipcode.sendKeys(d.AreaCode);
		lp.birthdate.sendKeys(d.DateOfBirth);

		lp.ButtonContinue.click();

		lp.income.sendKeys(d.Income);
		lp.AdditionalIncome.sendKeys(d.AdditionalIncome);

		lp.FixedRate.click();

		lp.Buttoncontinue2.click();

		lp.username.sendKeys(d.UserName);
		lp.password.sendKeys(d.Password);
		lp.Unknown.click();
		lp.buttonRate.click();

		lp.Result1();
		System.out.println(lp.Result1());
		Thread.sleep(2000);

		lp.nav.click();

		Thread.sleep(2000);

		lp.signout.click();

	}

	@Test(priority = 2, description = "Signin_Page_Account_Login")
	public void test2() throws InterruptedException, IOException {

		lp.openUrl2();
		lp.username.sendKeys(d.UserName);
		lp.password.sendKeys(d.Password);
		lp.signInaccount.click();

		lp.Result2();
		System.out.println(lp.Result2());
		boolean isEqual = lp.Result1().equals(lp.Result2());
		if (isEqual == true) {
			System.out.println("-------------------->Information Matched<-----------------------");
		} else {
			System.out.println("------------------>Information Mismatched <-------------------");
		}

		Thread.sleep(3000);

		lp.nav.click();

		Thread.sleep(3000);
		lp.signout.click();

	}

}
