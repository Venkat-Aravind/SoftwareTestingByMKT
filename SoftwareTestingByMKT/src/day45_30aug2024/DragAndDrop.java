//Launch https://grotechminds.com/drag-and-drop/ and drag and drop postman to empty box
package day45_30aug2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e1= driver.findElement(By.id("drag7"));
		WebElement e2 = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1,e2).perform();
		
		driver.close();
	
	}

}
