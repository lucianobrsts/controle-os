package br.com.controleos.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Endereco {

	@Column(length = 50)
	private String logradouro;

	@Column(length = 6)
	private Integer numero;

	@Column(length = 50)
	private String complemento;

	@Column(length = 50)
	private String bairro;

	@Column(length = 10)
	private String cep;

	public void setLogradouro(String logadouro) {
		this.logradouro = logadouro.toUpperCase();
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento.toUpperCase();
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}

}
