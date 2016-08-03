package testeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/home/daiane/Área// de// Trabalho/Daiane/Estudar// Automação/Programas/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.bing.com.br");
	WebElement campoBuscaGoogle =  driver.findElement(By.name("q"));
	campoBuscaGoogle.sendKeys("Caelum");
	campoBuscaGoogle.submit();
}

}
