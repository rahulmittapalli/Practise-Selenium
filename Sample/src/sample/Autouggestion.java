package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Autouggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("mob");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).click();	
		Thread.sleep(2000);
//		String s=driver.findElement(By.id("lst-ib")).getText();
//		System.out.println(s);
//		//Thread.sleep(3000);
//		if(s.equals("mobile tracker"))
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(3000);
		driver.close();
			
	}

}
