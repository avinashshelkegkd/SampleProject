package framework;

import org.openqa.selenium.WebDriver;

public class TC1 {
	public static void main(String[] args) {
		BrowserSetup set=new BrowserSetup();
		WebDriver driver = set.browserInit();
		
		PomClass pom=new PomClass(driver);
		pom.enterFirstName();
		pom.enterLastName();
		pom.enterEmail();
		pom.enterPassword();
		pom.enterDay();
	}

}
