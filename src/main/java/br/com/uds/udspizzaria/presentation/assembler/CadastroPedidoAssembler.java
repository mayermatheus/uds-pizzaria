package br.com.uds.udspizzaria.presentation.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.uds.udspizzaria.application.service.SaborService;
import br.com.uds.udspizzaria.application.service.TamanhoService;
import br.com.uds.udspizzaria.domain.model.adicional.Adicional;
import br.com.uds.udspizzaria.domain.model.pedido.Pedido;
import br.com.uds.udspizzaria.domain.model.pedido.Pizza;
import br.com.uds.udspizzaria.domain.model.sabor.Sabor;
import br.com.uds.udspizzaria.domain.model.tamanho.Tamanho;
import br.com.uds.udspizzaria.domain.service.AdicionalServiceInterface;
import br.com.uds.udspizzaria.presentation.dto.PedidoDTO;

@Component
public class CadastroPedidoAssembler {
	@Autowired
	private TamanhoService tamanhoService;
	
	@Autowired
	private SaborService saborService;
	
	@Autowired
	private AdicionalServiceInterface adicionalService;

	public Pedido getEntity(PedidoDTO pedido) {
		Tamanho tamanho = this.tamanhoService.buscar(pedido.getPizza().getSabor().getId());
		Sabor sabor = this.saborService.buscar(pedido.getPizza().getSabor().getId());

		List<Adicional> adicionais = pedido.getPizza().getAdicionais()
		.stream()
		.filter(listElement -> listElement != null)
		.map(adicional -> adicional = this.adicionalService.buscar(adicional.getId()))
		.collect(ArrayList<Adicional>::new, ArrayList::add, ArrayList::addAll);

		return new Pedido(new Pizza(tamanho, sabor, adicionais));
	}
}
