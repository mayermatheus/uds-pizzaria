package br.com.uds.udspizzaria.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uds.udspizzaria.domain.model.pedido.Pedido;
import br.com.uds.udspizzaria.domain.service.PedidoServiceInterface;
import br.com.uds.udspizzaria.presentation.assembler.CadastroPedidoAssembler;
import br.com.uds.udspizzaria.presentation.dto.PedidoDTO;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	@Autowired
	private CadastroPedidoAssembler assembler;

	@Autowired
	private PedidoServiceInterface pedidoService;

	@PostMapping
	public Pedido salvar(@RequestBody PedidoDTO pedido) {
		return this.pedidoService.salvar(assembler.getEntity(pedido));
	}
}
