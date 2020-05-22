package br.com.controleos.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.controleos.domain.Endereco;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class EnderecoBean {

	private Endereco enderecoCadastro;

	public Endereco getEnderecoCadastro() {
		return enderecoCadastro;
	}

	public void setEnderecoCadastro(Endereco enderecoCadastro) {
		this.enderecoCadastro = enderecoCadastro;
	}

}
