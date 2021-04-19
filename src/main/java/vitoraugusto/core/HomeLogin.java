package vitoraugusto.core;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class HomeLogin {
	
	@Test
	public void testeLogin() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "/Volumes/Secundario/Driver/geckodriver");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().setSize(new Dimension(1200, 1200));
	  driver.get("https://advantageonlineshopping.com");
	  
	  //Teste Home
	  
	  Thread.sleep(600);
	  driver.findElement(By.id("menuUser")).click();
	  Thread.sleep(2600);
	  
	  //Teste Login
	  
	  driver.findElement(By.name("username")).sendKeys("vitorqa");
	  Assert.assertEquals("vitorqa", driver.findElement(By.name("username")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("password")).sendKeys("Teste123_");
	  Assert.assertEquals("Teste123_", driver.findElement(By.name("password")).getAttribute("value"));
	  Thread.sleep(600);
	  
	//Enviar
	  
	  driver.findElement(By.id("sign_in_btnundefined")).click();
	  Thread.sleep(600);
	  
 	 }	
 }