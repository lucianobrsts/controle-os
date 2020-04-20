package br.com.controleos.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.controleos.dao.ClienteDAO;
import br.com.controleos.domain.Cliente;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1664755820917650224L;
	private Cliente clienteCadastro;
	private List<Cliente> listaClientes;
	private String acao;
	private Long codigo;

	public void carregarPesquisa() {
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			listaClientes = clienteDAO.listar();
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Erro ao tentar listar clientes: ", ex.getMessage());
		}
	}

	public void salvar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		try {
			clienteDAO.salvar(clienteCadastro);
			clienteCadastro = new Cliente();
			Messages.addGlobalInfo("Produto salvo com sucesso...");
		} catch (RuntimeException e) {
			Messages.addGlobalError("Erro ao tentar incluir um cliente: " + e.getMessage());
		}

	}

	@PostConstruct
	public void prepararNovo() {
		clienteCadastro = new Cliente();
	}

	public void carregarCadastro() {

	}

	public Cliente getClienteCadastro() {
		return clienteCadastro;
	}

	public void setClienteCadastro(Cliente clienteCadastro) {
		this.clienteCadastro = clienteCadastro;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
