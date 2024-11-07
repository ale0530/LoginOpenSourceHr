package com.choucair.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {
    public static final Target ADD_BUTTON = Target.the("add button in recruitment")
            .located(By.xpath("//button[contains(text(), '+ Add')]"));
    public static final Target FIRST_NAME = Target.the("first name field")
            .located(By.name("Oscar"));
    public static final Target LAST_NAME = Target.the("last name field")
            .located(By.name("Roa"));
    public static final Target EMAIL = Target.the("email field")
            .located(By.name("oscarandres@gmail.com"));
    public static final Target CONTACT_NUMBER = Target.the("contact number title field")
            .located(By.name("453465464347"));
	public static final Target VACANCY_TITLE = Target.the("vacancy title field")
            .located(By.name("Payroll Adminitrator"));		
    public static final Target HIRE_BUTTON = Target.the("hire button")
            .located(By.xpath("//button[contains(text(), 'Hired')]"));
}