package com.tiagopereira.autoescola.service;

import com.tiagopereira.autoescola.entity.Aluno;
import com.tiagopereira.autoescola.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    //Injeção de dependencias por contrutor
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }


}
