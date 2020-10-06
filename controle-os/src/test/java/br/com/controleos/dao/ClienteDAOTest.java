package br.com.controleos.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.controleos.domain.Cliente;
import br.com.controleos.domain.Contato;
import br.com.controleos.domain.Endereco;

public class ClienteDAOTest {

	@Test
	public void salvar() {
		Cliente cliente = new Cliente();
		cliente.setTipoCliente("Pessoa Física");
		cliente.setNome("Artur Oliveira");
		cliente.setDataCadastro(new Date());
		cliente.setCpf("123.456.789.-00");

		Endereco endereco = new Endereco(;)
		endereco.setLogradouro("Máriao de Andrade");
		endereco.setNumero(123);
		endereco.setBairro("Bela Vista");
		cliente.setEndereco(endereco);

		Contato contato = new Contato();
		contato.setEmail("lucianobrsts@yahoo.com.br");
		contato.setCelular("(85) 98888-0281");
		cliente.setContato(contato);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

	}

	@SuppressWarnings("unused")
	@Ignore
	@Test
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();

//		for (Cliente cliente : resultado) {
//			System.out.println(cliente.getNome());
//		}
	}

	@SuppressWarnings("unused")
	@Ignore
	@Test
	public void buscar() {
		Long codigo = 3L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

//		System.out.println(cliente.getNome());
	}

	@Ignore
	@Test
	public void excluir() {
		Long codigo = 4L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		clienteDAO.excluir(cliente);
	}

	@Ignore
	@Test
	public void editar() {
		Long codigo = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		cliente.setTipoCliente("Pessoa Jurídica");
		cliente.setCnpj("73.048.895/0001-08");
		cliente.setCpf(null);

		clienteDAO.editar(cliente);
	}

}
