//"Assignment 68: Login to Facebook"
package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment068 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("aravind@gmail.com");
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Password");
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
	}
}
