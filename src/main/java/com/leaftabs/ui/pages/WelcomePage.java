package com.leaftabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WelcomePage extends ProjectSpecificMethod {

	public LeadsPage clickCrmsfa() {
		WebElement clickCrmSfa = driver.findElement(By.linkText("CRM/SFA"));
		clickCrmSfa.click();
		return new LeadsPage();

	}

	public void clickLogout() {
		driver.close();

	}



}
