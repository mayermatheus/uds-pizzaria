package br.com.uds.udspizzaria.domain.model.pedido;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.uds.udspizzaria.domain.model.sabor.Sabor;
import br.com.uds.udspizzaria.domain.model.tamanho.Tamanho;

@Embeddable
public class Pizza implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "tamanho")
	private Tamanho tamanho;
	
	@ManyToOne
	@JoinColumn(name = "sabor")
	private Sabor sabor;

	public Pizza(Tamanho tamanho, Sabor sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}
	
	public Pizza() {}
	
	public Pizza(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
}
