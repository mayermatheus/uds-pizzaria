package br.com.uds.udspizzaria.domain.model.pedido;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import br.com.uds.udspizzaria.domain.model.adicional.Adicional;
import br.com.uds.udspizzaria.domain.model.sabor.Sabor;
import br.com.uds.udspizzaria.domain.model.tamanho.Tamanho;

@Embeddable
public class Pizza implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "tamanho")
	@NotNull
	private Tamanho tamanho;
	
	@ManyToOne
	@JoinColumn(name = "sabor")
	@NotNull
	private Sabor sabor;
	
	@ManyToMany(cascade = CascadeType.REFRESH)
	@JoinTable(name = "pedido_adicional",
			joinColumns = { @JoinColumn(name = "pedido") },
			inverseJoinColumns = {@JoinColumn(name = "adicional") })
	@NotNull
	private List<Adicional> adicionais = new ArrayList<Adicional>();

	public Pizza(Tamanho tamanho, Sabor sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}
	
	public Pizza() {}
	
	public Pizza(List<Adicional> adicionais) {
		this.adicionais = adicionais;
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

	public List<Adicional> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(List<Adicional> adicionais) {
		this.adicionais = adicionais;
	}
	
	public void adicionarAdicionais(Adicional adicional) {
		this.adicionais.add(adicional);
	}
}
