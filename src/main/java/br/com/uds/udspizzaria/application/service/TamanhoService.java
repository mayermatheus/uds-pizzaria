package br.com.uds.udspizzaria.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uds.udspizzaria.domain.model.tamanho.Tamanho;
import br.com.uds.udspizzaria.domain.service.TamanhoServiceInterface;
import br.com.uds.udspizzaria.infrastructure.persistence.hibernate.repository.TamanhoRepositoryInterface;
import br.com.uds.udspizzaria.presentation.dto.TamanhoDTO;

@Service
public class TamanhoService extends BaseService<Tamanho> implements TamanhoServiceInterface {

	@Autowired
	protected TamanhoRepositoryInterface tamanhoRepository;

    public List<TamanhoDTO> listarTodosComIdENome() {
        return this.getRepository().findIdAndNomeByAll();
    }
	
    @Override
    protected TamanhoRepositoryInterface getRepository() {
        return this.tamanhoRepository;
    }
}
