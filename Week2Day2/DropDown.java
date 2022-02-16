package WeekDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement DropDown1 = driver.findElement(By.id("dropdown1"));
		Select index = new Select(DropDown1);
		index.selectByIndex(4);
		WebElement DropDown2 = driver.findElement(By.name("dropdown2"));
		Select value = new Select(DropDown2);
		value.selectByValue("1");
		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select text = new Select(dropdown3);
		text.selectByVisibleText("Appium");
		
		

		
	}

}
