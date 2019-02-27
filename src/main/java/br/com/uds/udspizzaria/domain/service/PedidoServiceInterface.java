package br.com.uds.udspizzaria.domain.service;

import br.com.uds.udspizzaria.domain.model.pedido.Pedido;
import br.com.uds.udspizzaria.presentation.dto.DetalhePedidoDTO;
import br.com.uds.udspizzaria.presentation.dto.PedidoDTO;

public interface PedidoServiceInterface extends BaseServiceInterface<Pedido> {
	public DetalhePedidoDTO detalhar(Long id);
	public Pedido atualizar(Long id, PedidoDTO pedidoDTO);
}
