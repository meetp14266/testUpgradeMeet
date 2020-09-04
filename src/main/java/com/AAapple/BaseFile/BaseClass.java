package com.AAapple.BaseFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

	WebDriver driver;

	public void openBrowser() throws IOException {

		FileInputStream fs = new FileInputStream("./src/main/java/config.properties");
		Properties prop = new Properties(); // To read properties file we use inbuild class Properties
		prop.load(fs); // load is a method

		String browser = prop.getProperty("browser");

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		PageFactory.initElements(driver, this);
	}

	public void Maximize() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}
	
	public void openUpgrade() throws IOException, InterruptedException {

		FileInputStream fs = new FileInputStream("./src/main/java/config.properties");
		Properties prop = new Properties();  // To read properties file we use inbuild class Properties
		prop.load(fs); // load is a method 

		
		//String browser = prop.getProperty("browser");
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(3000);

	}
	
	public void openUrl2() throws IOException, InterruptedException {

		FileInputStream fs = new FileInputStream("./src/main/java/config.properties");
		Properties prop = new Properties();  // To read properties file we use inbuild class Properties
		prop.load(fs); // load is a method 

		
		//String browser = prop.getProperty("browser");
		driver.get(prop.getProperty("url2"));
		
		Thread.sleep(3000);

	}

}
