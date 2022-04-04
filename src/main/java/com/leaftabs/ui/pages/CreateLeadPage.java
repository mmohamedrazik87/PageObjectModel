package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

public class CreateLeadPage extends ProjectSpecificMethod {

	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("CTS");
		return this;
	}

	public CreateLeadPage enterFirstName() {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("MohamedRazik");
		return this;
	}

	public CreateLeadPage enterLastName() {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("MonnaMOhamed");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return new ViewLeadPage();
	}

}
