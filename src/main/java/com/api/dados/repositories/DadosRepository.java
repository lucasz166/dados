package com.api.dados.repositories;

import com.api.dados.models.DadosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DadosRepository extends JpaRepository <DadosModel, UUID> {

}
