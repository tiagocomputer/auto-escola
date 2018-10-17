package com.tiagopereira.autoescola.service;

import com.tiagopereira.autoescola.entity.Funcionario;
import com.tiagopereira.autoescola.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    //Injeção de dependencias por contrutor
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listar(){
        return funcionarioRepository.findAll();
    }

//    public Funcionario salvar()

}
