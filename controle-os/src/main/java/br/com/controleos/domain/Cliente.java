package br.com.controleos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "cliente")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends AbstractEntitiy {

	private static final long serialVersionUID = -67417923925910731L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo", nullable = false)
	private Long codigo;

	@Column(name = "tipo_cliente", nullable = false)
	private String tipoCliente;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "data_cadastro", nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "cnpj")
	private String cnpj;

	@Embedded
	protected Endereco endereco;

	@Embedded
	protected Contato contato;

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
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
