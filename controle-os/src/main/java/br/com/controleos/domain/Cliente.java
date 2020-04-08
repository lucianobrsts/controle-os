package br.com.controleos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	private Long codigo;

	@Column(name = "tipo_cliente", nullable = false)
	private String tipoCliente;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;

}
