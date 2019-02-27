package br.com.uds.udspizzaria.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.uds.udspizzaria.application.service.exception.PedidoNaoEncontradoException;
import br.com.uds.udspizzaria.domain.model.pedido.Pedido;
import br.com.uds.udspizzaria.domain.service.PedidoServiceInterface;
import br.com.uds.udspizzaria.infrastructure.persistence.hibernate.repository.PedidoRepositoryInterface;
import br.com.uds.udspizzaria.presentation.assembler.PedidoAssembler;
import br.com.uds.udspizzaria.presentation.dto.DetalhePedidoDTO;

@Service
public class PedidoService extends BaseService<Pedido> implements PedidoServiceInterface {

	@Autowired
	private PedidoRepositoryInterface pedidoRepository;
	
	@Autowired
	private PedidoAssembler assembler;
	
	@Override
	protected JpaRepository<Pedido, Long> getRepository() {
		return this.pedidoRepository;
	}

	@Override
	public DetalhePedidoDTO detalhar(Long id) {
		Pedido pedido = this.pedidoRepository.getOne(id);
		
		this.verificarPedidoExistente(pedido);
		
		return assembler.getDTO(pedido);
	}
	
	/**
	 * Metodo responsável por verificar se este pedido já foi realizado
	 * 
	 * @param pedido
	 */
	private void verificarPedidoExistente(Pedido pedido) {
		if (pedido == null) {
			throw new PedidoNaoEncontradoException();
		}
	}
}
