package br.com.controleos.dao;

import org.junit.Test;

import br.com.controleos.domain.Cliente;
import br.com.controleos.domain.Endereco;

public class ClienteTest2 {
	
	@Test
	public void salvar() {
		Cliente cliente = new Cliente();
		cliente.setTipoCliente("Pessoa Física");
		cliente.setNome("Luciano Brito");
		cliente.setCpf("123.456.789.-00");
		cliente.setEmail("lucianobrsts@yahoo.com.br");
		cliente.setTelefone("98888-5544");

		Endereco endereco = new Endereco();
		endereco.setCep("60440-000");
		endereco.setLogradouro("Rua A");
		endereco.setBairro("Bairro A");
		endereco.setNumero("1212");
		endereco.setCidade("Fortaleza");
		endereco.setUf("Ceará");

		cliente.setEndereco(endereco);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

	}

}
