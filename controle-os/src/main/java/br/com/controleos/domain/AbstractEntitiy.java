package br.com.controleos.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class AbstractEntitiy implements Serializable {

	private static final long serialVersionUID = 4033328989751810762L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long codigo;

}
