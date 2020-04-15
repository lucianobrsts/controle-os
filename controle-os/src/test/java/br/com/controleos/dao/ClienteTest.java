package br.com.controleos.dao;

import org.junit.Test;

import br.com.controleos.domain.Cliente;
import br.com.controleos.domain.Endereco;

public class ClienteTest {

	@Test
	public void salvar() {
		Cliente cliente = new Cliente();
		cliente.setTipoCliente("Pessoa Física");
		cliente.setNome("Artur Oliveira");
		cliente.setCpf("123.456.789.-00");
		cliente.setEmail("arturr00@gmail.com");
		cliente.setTelefone("98888-5544");

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(2L);
		cliente.setEndereco(endereco);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

	}

}
