package br.com.controleos.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.controleos.domain.Endereco;

@SuppressWarnings("deprecation")
@ManagedBean
@ViewScoped
public class EnderecoBean implements Serializable {

	private static final long serialVersionUID = -7141987211490176652L;
	private Endereco enderecoCadastro;

	public Endereco getEnderecoCadastro() {
		return enderecoCadastro;
	}

	public void setEnderecoCadastro(Endereco enderecoCadastro) {
		this.enderecoCadastro = enderecoCadastro;
	}

}
