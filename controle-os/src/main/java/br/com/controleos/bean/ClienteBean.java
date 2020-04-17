package br.com.controleos.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;
import org.omnifaces.util.Messages.Message;

import br.com.controleos.dao.ClienteDAO;
import br.com.controleos.domain.Cliente;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1664755820917650224L;
	private Cliente clienteCadastro;
	private List<Cliente> listaClientes;

	public void carregarPesquisa() {
		try {
			ClienteDAO clienteDAO = new ClienteDAO();
			listaClientes = clienteDAO.listar();
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Erro ao tentar listar clientes: ", ex.getMessage());
		}
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

}
