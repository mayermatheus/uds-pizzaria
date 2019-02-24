package br.com.uds.udspizzaria.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uds.udspizzaria.domain.model.sabor.Sabor;
import br.com.uds.udspizzaria.domain.service.SaborServiceInterface;
import br.com.uds.udspizzaria.infrastructure.persistence.hibernate.repository.SaborRepositoryInterface;
import br.com.uds.udspizzaria.presentation.dto.SaborDTO;

@Service
public class SaborService extends BaseService<Sabor> implements SaborServiceInterface {

	@Autowired
	private SaborRepositoryInterface saborRepository;
	
    public List<SaborDTO> listarTodosComIdENome() {
        return this.getRepository().findIdAndNomeByAll();
    }
	
	@Override
	protected SaborRepositoryInterface getRepository() {
		return this.saborRepository;
	}

}
