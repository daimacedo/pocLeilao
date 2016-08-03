package br.com.leilao.base;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTestes {

	protected static WebDriver driver;
	@AfterClass
	public static void preparaTeste()
	{
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void finalizaTeste()
	{
		driver.close();
	}
}
