package br.com.uds.udspizzaria.presentation.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.uds.udspizzaria.application.service.SaborService;
import br.com.uds.udspizzaria.application.service.TamanhoService;
import br.com.uds.udspizzaria.domain.model.pedido.Pedido;
import br.com.uds.udspizzaria.domain.model.pedido.Pizza;
import br.com.uds.udspizzaria.domain.model.sabor.Sabor;
import br.com.uds.udspizzaria.domain.model.tamanho.Tamanho;
import br.com.uds.udspizzaria.presentation.dto.PedidoDTO;

@Component
public class CadastroPedidoAssembler {
	@Autowired
	private TamanhoService tamanhoService;
	
	@Autowired
	private SaborService saborService;
	
	public Pedido getEntity(PedidoDTO pedido) {
		Tamanho tamanho = this.tamanhoService.buscar(pedido.getPizza().getSabor().getId());
		Sabor sabor = this.saborService.buscar(pedido.getPizza().getSabor().getId());
//		Pizza p = new Pizza(tamanho, sabor);
//		Pedido ped = new Pedido(p);
////		System.out.println(p.getSabor().getNome());
		
		return new Pedido(new Pizza(tamanho, sabor));
	}
}
