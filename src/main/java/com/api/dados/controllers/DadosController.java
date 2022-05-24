package com.api.dados.controllers;

import com.api.dados.dtos.DadosDto;
import com.api.dados.models.DadosModel;
import com.api.dados.services.DadosService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/dados-test")
public class DadosController {

    final DadosService dadosService;

    public DadosController(DadosService dadosService) {
        this.dadosService = dadosService;
    }

    @PostMapping
    public ResponseEntity<Object> saveDadosDto (@RequestBody @Valid DadosDto dadosDto) {
        var dadosModel = new DadosModel();
        BeanUtils.copyProperties(dadosDto, dadosModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(dadosService.save(dadosModel));
    }
}

