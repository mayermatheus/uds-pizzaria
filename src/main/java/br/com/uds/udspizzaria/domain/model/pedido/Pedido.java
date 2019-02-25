package br.com.uds.udspizzaria.domain.model.pedido;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private Pizza pizza;
	
	@Column(name = "valor_total")
	private BigDecimal valorTotal;
	
	@Column(name = "tempo_total_preparo")
	private Integer tempoTotalPreparo;
	
	public Pedido(Pizza pizza) {
		this.pizza = pizza;
		this.calcularTempoTotal();
		this.tempoTotalPreparo = this.calcularTempoTotal();
		this.valorTotal = this.calcularValorTotal();
	}
	
	public Pedido() {}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getTempoTotalPreparo() {
		return tempoTotalPreparo;
	}

	public void setTempoTotalPreparo(Integer tempoTotalPreparo) {
		this.tempoTotalPreparo = tempoTotalPreparo;
	}
	
	public Integer calcularTempoTotal() {
		return this.pizza.getTamanho().getTempoPreparo() + this.pizza.getSabor().getTempoAdicional();
	}

	public BigDecimal calcularValorTotal() {
		return this.pizza.getTamanho().getValor();
	}
}
