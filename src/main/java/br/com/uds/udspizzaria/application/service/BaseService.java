package br.com.uds.udspizzaria.application.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.uds.udspizzaria.application.service.exception.InformacaoNaoEncontradaException;
import br.com.uds.udspizzaria.domain.service.BaseServiceInterface;

@Service
public abstract class BaseService<T> implements BaseServiceInterface<T> {
    @Override
    public T buscar(Long id) {
        T entidade = this.getRepository().getOne(id);

        if (entidade == null) {
            throw new InformacaoNaoEncontradaException();
        }

        return entidade;
    }

    @Override
    public List<T> listarTodos() {
        return this.getRepository().findAll();
    }

    @Override
    public T salvar(T entidade) {
        return this.getRepository().save(entidade);
    }

    @Override
    public T atualizar(Long id, T entidade) {
        T entidadeSalva = this.buscar(id);
        BeanUtils.copyProperties(entidade, entidadeSalva);

        return salvar(entidadeSalva);
    }

    @Override
    public void remover(Long id) {
        this.getRepository().deleteById(id);
    }

    protected abstract JpaRepository<T, Long> getRepository();
}
