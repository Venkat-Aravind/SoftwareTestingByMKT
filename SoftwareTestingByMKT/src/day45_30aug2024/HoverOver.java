////launch amazon.in and hoverover and click on sign-in
package day45_30aug2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		WebElement e1= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
	}

}
