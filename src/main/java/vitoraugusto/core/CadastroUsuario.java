package vitoraugusto.core;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


public class CadastroUsuario {
	
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
	
	  driver.findElement(By.cssSelector(".create-new-account")).click();
	  Thread.sleep(600);
	  
	  //Teste Dados
	  
	  driver.findElement(By.name("usernameRegisterPage")).sendKeys("vitorqa");
	  Assert.assertEquals("vitorqa", driver.findElement(By.name("usernameRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("emailRegisterPage")).sendKeys("vitorqa@gmail.com");
	  Assert.assertEquals("vitorqa@gmail.com", driver.findElement(By.name("emailRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("passwordRegisterPage")).sendKeys("Teste123_");
	  Assert.assertEquals("Teste123_", driver.findElement(By.name("passwordRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Teste123_");
	  Assert.assertEquals("Teste123_", driver.findElement(By.name("confirm_passwordRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Vitor");
	  Assert.assertEquals("Vitor", driver.findElement(By.name("first_nameRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Augusto");
	  Assert.assertEquals("Augusto", driver.findElement(By.name("last_nameRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("123456789");
	  Assert.assertEquals("123456789", driver.findElement(By.name("phone_numberRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
	  Select combo = new Select(element);
	  combo.selectByIndex(29);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.name("cityRegisterPage")).sendKeys("São Paulo");
	  Assert.assertEquals("São Paulo", driver.findElement(By.name("cityRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("addressRegisterPage")).sendKeys("Rua MMDC n49");
	  Assert.assertEquals("Rua MMDC n49", driver.findElement(By.name("addressRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("São Paulo");
	  Assert.assertEquals("São Paulo", driver.findElement(By.name("state_/_province_/_regionRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("08000000");
	  Assert.assertEquals("08000000", driver.findElement(By.name("postal_codeRegisterPage")).getAttribute("value"));
	  Thread.sleep(600);
	  
	  //Aceita Condições

	  driver.findElement(By.name("i_agree")).click();
	  Thread.sleep(600);
	  
	  //Enviar

	  driver.findElement(By.id("register_btnundefined")).click();
	  Thread.sleep(600);
	  
	  
	  	 }	
	  }
	

