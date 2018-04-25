package com.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://chercher.tech/java/practice-dropdowns-selenium-webdriver");
		
		Select sel = new Select(driver.findElement(By.id("animals")));
		List<WebElement> options = sel.getOptions();
		for(WebElement e : options) {
			if(e.getText().equalsIgnoreCase("Avatar")) {
			sel.selectByVisibleText("Avatar");
			}
		}


	}

}
