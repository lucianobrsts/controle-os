package br.com.controleos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import br.com.controleos.domain.EnderecoCorreios;
import br.com.controleos.util.ServicoEnderecoCorreios;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class EnderecoCorreiosBean implements Serializable {

	private static final long serialVersionUID = -1702815350706740834L;

	private List<EnderecoCorreios> listagem = new ArrayList<EnderecoCorreios>();

	private EnderecoCorreios enderecoCorreios;
	private String cep;

	private ServicoEnderecoCorreios servico = new ServicoEnderecoCorreios();

	public EnderecoCorreios carregarEnderecoCorreios() {
		enderecoCorreios = new EnderecoCorreios();
		Client c = Client.create();
		WebResource wr = c.resource("http://viacep.com.br/ws/" + this.getCep() + "/json/");
		System.out.println("Chamou a URI...");
		this.enderecoCorreios = servico.buscarEnderecoPor(wr.get(String.class));
		String JSON = wr.get(String.class);
		System.out.println(JSON);
		return this.getEnderecoCorreios();
	}

	public List<EnderecoCorreios> getListagem() {
		return listagem;
	}

	public void setListagem(List<EnderecoCorreios> listagem) {
		this.listagem = listagem;
	}

	public EnderecoCorreios getEnderecoCorreios() {
		return enderecoCorreios;
	}

	public void setEnderecoCorreios(EnderecoCorreios enderecoCorreios) {
		this.enderecoCorreios = enderecoCorreios;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public ServicoEnderecoCorreios getServico() {
		return servico;
	}

	public void setServico(ServicoEnderecoCorreios servico) {
		this.servico = servico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}