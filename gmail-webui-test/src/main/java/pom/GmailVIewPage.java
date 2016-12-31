package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailVIewPage {

	public String getEmailSubjectText(WebDriver driver) {
		WebElement subjectArea = driver.findElement(By.cssSelector("h2[class='hP']"));
		return subjectArea.getText();
	}
	
	public String getEmailBodyText(WebDriver driver) {
		WebElement bodyArea = driver.findElement(By.cssSelector("div[class='nH aHU'] div[dir='ltr']"));
		return bodyArea.getText();
	}
}