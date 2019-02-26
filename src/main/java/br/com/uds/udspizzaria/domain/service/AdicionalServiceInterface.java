package br.com.uds.udspizzaria.domain.service;

import java.util.List;

import br.com.uds.udspizzaria.domain.model.adicional.Adicional;

public interface AdicionalServiceInterface extends BaseServiceInterface<Adicional> {
	public List<Adicional> buscarByIds(Iterable<Long> ids);
}
