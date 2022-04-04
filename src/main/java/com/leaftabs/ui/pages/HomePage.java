package com.leaftabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends  ProjectSpecificMethod {

	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}




}
