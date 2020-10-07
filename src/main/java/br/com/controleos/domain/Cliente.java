package br.com.controleos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "cliente")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends AbstractEntity {

	private static final long serialVersionUID = -7244420257032750452L;

	@NotEmpty(message = "O preenchimento do campo nome é obrigatório.")
	@Size(min = 5, max = 50, message = "Tamanho inválido para o campo nome (5 - 50)")
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;

	@Size(max = 18)
	@Column(name = "cnpj", unique = true, length = 18)
	private String cnpj;

	@Size(max = 14)
	@Column(name = "cpf", unique = true, length = 14)
	private String cpf;

	@Column(name = "data_nascimento")
	@Temporal(value = TemporalType.DATE)
	private Date dataNascimento;

	@Column(name = "observacao", length = 255)
	private String observacao;

	@Embedded
	protected Endereco endereco;

	@Embedded
	protected Contato contato;

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao.toUpperCase();
	}

	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();
		}
		return endereco;
	}

	public Contato getContato() {
		if (contato == null) {
			contato = new Contato();
		}
		return contato;
	}

}
