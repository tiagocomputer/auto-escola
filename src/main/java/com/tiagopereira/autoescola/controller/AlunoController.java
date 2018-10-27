package com.tiagopereira.autoescola.controller;

import com.tiagopereira.autoescola.entity.Aluno;
import com.tiagopereira.autoescola.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

//    @GetMapping
//    public Aluno buscar(){
//       return alunoService
//    }
}
