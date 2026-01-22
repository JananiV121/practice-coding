package day1.program2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automate{
	
	public static void main(String[]args)
	
	{
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")) .sendKeys("standard_user");
         
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	             
	    driver.findElement(By.id("login-button")).click();
	    
	    driver.findElement(By.linkText("Sauce Labs Backpack")).click();
	    
        System.out.println("First Product Name: Sauce Labs Backpack ");
        
        WebElement firstProductPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
              
        String priceText = firstProductPrice.getText();
        
        System.out.println("First Product Price: " + priceText);
        
        driver.findElement(By.id("Add-to-cart")).click();
        
        driver.findElement(By.className("shopping_cart_link")).click();
        
        String cartPrice =  driver.findElement(By.className("inventory_item_price")).getText();
             

        if (priceText.equals(cartPrice))
        {
            System.out.println("Price verification passed in Cart");
        } 
        else
        {
            System.out.println("Price verification failed in Cart");
            
        }
        
        driver.quit();
        
        
	}
}




		

		