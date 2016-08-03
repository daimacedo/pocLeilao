package br.com.leilao.teste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.leilao.testes.UsuarioSystemTest;

@RunWith(Suite.class)
@SuiteClasses({UsuarioSystemTest.class})
public class SuiteTestes {

}
