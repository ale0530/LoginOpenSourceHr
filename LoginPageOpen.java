package com.choucair.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME = Target.the("username field")
            .located(By.name("Admin"));
    public static final Target PASSWORD = Target.the("password field")
            .located(By.name("admin123"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//button[@type='submit']"));
}
