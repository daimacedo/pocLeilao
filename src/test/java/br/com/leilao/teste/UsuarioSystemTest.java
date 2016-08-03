package br.com.leilao.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.unix.X11.Window;

import junit.framework.AssertionFailedError;

public class UsuarioSystemTest {

	private FirefoxDriver driver;
	private UsuariosPage usuario;
	private NovoUsuarioPage novoUsuario;
	
	@Before
	public void inicializaTeste() {
		driver = new FirefoxDriver();
		this.usuario = new UsuariosPage(driver);
		this.novoUsuario = new NovoUsuarioPage(driver);
		driver.get("http://localhost:8080/usuarios");
		driver.manage().window().maximize();
	}
	
//	@After
//	public void finalizaTeste()
//	{
//		driver.close();
//	}

	@Test
	@Ignore
	public void adicionarUsuario() {	
	usuario.novo().cadastra("Daiane Rosa Macedo", "daiane.macedo@hotmail.com");
	assertTrue(usuario.existeNaListagem("Daiane Rosa Macedo", "daiane.macedo@hotmail.com"));
	}
	
	@Test
	@Ignore
	public void usuarioSemNomeESemEmail() {
		
		usuario.novo().cadastraoUsuarioVazio();
		assertTrue(novoUsuario.validaUsuarioVazio("Nome obrigatorio", "E-mail obrigatorio"));
	}

	@Test
	@Ignore
	public void validaUsuarioSemNome() {
		
		usuario.novo().cadastrarUsuarioSemNome();
		assertTrue(novoUsuario.validaUsuarioSemNome("Nome obrigatorio"));
	}
	
	@Test
	public void validaExlusao()
	{
		usuario.novo().cadastra("Teste", "Teste");
		novoUsuario.excluiUsuario();
		assertTrue(novoUsuario.validaExclusaoUsuario());
		
	}

	
}
