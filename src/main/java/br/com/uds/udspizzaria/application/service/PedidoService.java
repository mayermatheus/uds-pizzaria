package br.com.uds.udspizzaria.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.uds.udspizzaria.domain.model.pedido.Pedido;
import br.com.uds.udspizzaria.domain.service.PedidoServiceInterface;
import br.com.uds.udspizzaria.infrastructure.persistence.hibernate.repository.PedidoRepositoryInterface;

@Service
public class PedidoService extends BaseService<Pedido> implements PedidoServiceInterface {

	@Autowired
	private PedidoRepositoryInterface pedidoRepository;
	
	@Override
	protected JpaRepository<Pedido, Long> getRepository() {
		return this.pedidoRepository;
	}
}
