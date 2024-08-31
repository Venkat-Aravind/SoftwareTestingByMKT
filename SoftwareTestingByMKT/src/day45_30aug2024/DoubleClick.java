////launch google and perform double-click on gmail
package day45_30aug2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement e1= driver.findElement(By.xpath("//div[@class='gb_W gb_X']"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();

	}

}
