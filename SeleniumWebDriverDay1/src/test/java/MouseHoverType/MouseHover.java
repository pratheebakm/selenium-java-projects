package MouseHoverType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
	WebElement fashion =	driver.findElement(By.xpath("//div[@aria-label='Fashion']//div//span[@class='vpQU2r']"));
	WebElement menswear = driver.findElement(By.xpath("//a[@class='Y8tmCc sjBVz_']"));
	WebElement tshirt= driver.findElement(By.xpath("//div[@class='CYk0R7']//a[2]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(fashion).moveToElement(menswear).moveToElement(tshirt).click().build().perform();
	
	}

}
