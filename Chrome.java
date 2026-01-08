package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/");
		driver.findElement(By.name("search")).sendKeys("iphone");
        driver.findElement(By.id("product-search")).click();
		
        driver.close();

}
}
