package com.api.dados.services;

import com.api.dados.models.DadosModel;
import com.api.dados.repositories.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DadosService {

    final DadosRepository dadosRepository;

    public DadosService(DadosRepository dadosRepository) {
        this.dadosRepository = dadosRepository;
    }

    @Transactional
    public DadosModel save(DadosModel dadosModel) {
        return dadosRepository.save(dadosModel);
    }
}
