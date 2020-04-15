package br.com.controleos.dao;

import org.junit.Test;

import br.com.controleos.domain.Endereco;

public class EnderecoTest {
	
	@Test
	public void salvar() {
		Endereco endereco = new Endereco();
		endereco.setCep("60.444-000");
		endereco.setLogradouro("Rua B");
		endereco.setBairro("Bairro B");
		endereco.setNumero("1212");
		endereco.setCidade("Quixeramobim");
		endereco.setUf("Ceará");
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		enderecoDAO.salvar(endereco);
	}

}
