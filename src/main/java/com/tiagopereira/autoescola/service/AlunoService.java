package com.tiagopereira.autoescola.service;

import com.tiagopereira.autoescola.dto.AlunoDTO;
import com.tiagopereira.autoescola.entity.Aluno;
import com.tiagopereira.autoescola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    //Injeção de dependencias por contrutor
    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }

//    public AlunoDTO findByCpf(String cpf){
//        AlunoConversorDTO conversorDTO = new  AlunoConversoresDTO();
//        Aluno aluno = this.alunoRepository.findByCpf(cpf);
//        AlunoDTO alunoDTO = conversoresDTO.converteEntityParaDTO(aluno);
//        return aluno;
//    }

}
