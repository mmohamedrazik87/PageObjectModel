package com.leaftabs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ViewLeadPage extends ProjectSpecificMethod {

	public void verifyLeadId() {
		WebElement leadId = driver.findElement(By.id("viewLead_companyName_sp"));
		String text = leadId.getText();
		System.out.println(text);

	}

}
