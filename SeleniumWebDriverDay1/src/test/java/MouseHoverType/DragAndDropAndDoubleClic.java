package MouseHoverType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAndDoubleClic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath(" //button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("welcome");
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		Thread.sleep(5000);
		
		if(box2.getText().equals(box1.getText())) {
			System.out.println("Text copied");
		}else {
			System.out.println("Text not copied");
		}
		
		System.out.println("Drag and Drop");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(drag, drop).perform();
		
		



	}

}
