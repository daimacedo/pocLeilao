package br.com.leilao.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import br.com.leilao.base.BaseTestes;

public class NovoUsuarioPage extends BaseTestes{
	
	
	public void cadastra(String nome, String email)
	{
	
	WebElement txtNomeUsuario = driver.findElement(By.name("usuario.nome"));
	txtNomeUsuario.sendKeys(nome);
	WebElement txtEmailUsuario = driver.findElement(By.name("usuario.email"));
	txtEmailUsuario.sendKeys(email);	
	txtNomeUsuario.submit();
	}
	
	
	public void cadastraoUsuarioVazio()
	{
		WebElement btnSalvar = driver.findElement(By.id("btnSalvar"));
		btnSalvar.click();
		
	}
	
	public boolean validaUsuarioVazio(String mensagemNome, String mensagemEmail)
	{
	
		return ((driver.getPageSource().contains(mensagemNome) 
				&& driver.getPageSource().contains(mensagemEmail)));
	}
	
	public void cadastrarUsuarioSemNome()
	{
		WebElement emailUsuario = driver.findElement(By.name("usuario.email"));
		emailUsuario.sendKeys("teste");
		WebElement botaoSalvar = driver.findElement(By.id("btnSalvar"));
		botaoSalvar.click();
	}
	
	public boolean validaUsuarioSemNome(String mensagemUsuarioVazio)
	{
		return driver.getPageSource().contains(mensagemUsuarioVazio);
	}
	
	public void excluiUsuario()
	{
		driver.findElement(By.tagName("button")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public boolean validaExclusaoUsuario(){
	
		try {
		  driver.findElement(By.tagName("button"));
		  return false;
		} catch (NoSuchElementException e) {
		   return true;
		}
		
		
	}
	
	
	

}
