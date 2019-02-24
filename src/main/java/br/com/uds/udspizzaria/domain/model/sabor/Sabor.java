package br.com.uds.udspizzaria.domain.model.sabor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sabor")
public class Sabor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "tempo_adicional")
	private Integer tempoAdicional;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTempoAdicional() {
		return tempoAdicional;
	}

	public void setTempoAdicional(Integer tempoAdicional) {
		this.tempoAdicional = tempoAdicional;
	}

	public Long getId() {
		return id;
	}
}
