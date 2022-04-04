package com.leaftabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage enterUserName() {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		return this;
		
	}

	public LoginPage enterPassword() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLogin() {
		WebElement clickSubmit = driver.findElement(By.className("decorativeSubmit"));
		clickSubmit.click();
		return new WelcomePage();
	}
	

}
