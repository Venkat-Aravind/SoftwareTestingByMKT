package day43_28aug2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		driver.manage().window().maximize();
//		WebElement e1 = driver.findElement(By.linkText("Gmail"));
//		e1.click();
//		driver.get("https://amazon.in");
//		driver.manage().window().maximize();
//		WebElement e2 = driver.findElement(By.linkText("Best Sellers"));
//		e2.click();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e3 = driver.findElement(By.partialLinkText("CONTINUE"));
		e3.click();
		driver.quit();
		
	}

}
