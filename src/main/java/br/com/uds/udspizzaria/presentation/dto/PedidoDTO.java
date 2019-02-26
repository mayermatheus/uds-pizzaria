package br.com.uds.udspizzaria.presentation.dto;

import br.com.uds.udspizzaria.domain.model.pedido.Pizza;

final public class PedidoDTO {
	private Pizza pizza;

	public PedidoDTO(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public PedidoDTO() {

	}

	public Pizza getPizza() {
		return pizza;
	}
}
