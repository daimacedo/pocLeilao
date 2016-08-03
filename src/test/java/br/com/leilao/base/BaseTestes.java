package br.com.leilao.base;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTestes {

	protected static WebDriver driver;
	
	@BeforeClass
	public static void preparaTeste()
	{
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/usuarios");
	}
	
//	@AfterClass
//	public static void finalizaTeste()
//	{
//		driver.close();
//	}
}
