package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

public class LeadsPage extends ProjectSpecificMethod{

	public CreateLeadPage clickCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage() ;
	
		
		

	}

	



}
