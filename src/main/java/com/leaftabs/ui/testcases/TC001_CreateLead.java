package com.leaftabs.ui.testcases;

import org.testng.annotations.Test;

import com.leaftabs.ui.pages.LoginPage;
import com.leaftabs.ui.pages.ProjectSpecificMethod;

public class TC001_CreateLead extends ProjectSpecificMethod {
	
	@Test
	public void runTC001() {

		new LoginPage().enterUserName().enterPassword().clickLogin().clickCrmsfa().clickCreateLead().enterCompanyName()
				.enterFirstName().enterLastName().clickCreateLeadButton();

	}

}
