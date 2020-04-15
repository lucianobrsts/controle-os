package br.com.controleos.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.controleos.domain.Endereco;

public class EnderecoDAOTest {

	@Ignore
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

	@SuppressWarnings("unused")
	@Ignore
	@Test
	public void listar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		List<Endereco> resultado = enderecoDAO.listar();

//		for (Endereco endereco : resultado) {
//			System.out.println(endereco.getLogradouro());
//		}
	}

	@Ignore
	@Test
	public void buscar() {
		Long codigo = 1L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);

		System.out.println(endereco.getLogradouro());
	}

	@Ignore
	@Test
	public void excluir() {
		Long codigo = 3L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		enderecoDAO.excluir(endereco);
	}

	@Ignore
	@Test
	public void editar() {
		Long codigo = 1L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		endereco.setComplemento("Casa 2");

		enderecoDAO.editar(endereco);
	}
}
