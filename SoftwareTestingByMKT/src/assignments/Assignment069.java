//"Assignment 69: Automate this page https://grotechminds.com/registration/"
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment069 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("aravind@gmail.com");
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Password");
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
	}
}
