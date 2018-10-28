package com.tiagopereira.autoescola.service;

import com.tiagopereira.autoescola.conversordto.AlunoConversorDTO;
import com.tiagopereira.autoescola.dto.AlunoDTO;
import com.tiagopereira.autoescola.entity.Aluno;
import com.tiagopereira.autoescola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    //Injeção de dependencias por contrutor
    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoDTO> listar(){
        AlunoConversorDTO conversorDTO = new AlunoConversorDTO();
        List<Aluno> alunos = alunoRepository.findAll();

        List<AlunoDTO> lstDTO = new ArrayList<>();

        for(Aluno aluno : alunos){
            AlunoDTO dto = conversorDTO.converteEntidadeParaDTO(aluno);
            lstDTO.add(dto);
        }

        return lstDTO;
    }

    public AlunoDTO salvar(AlunoDTO alunoDTO){

        Aluno aluno = null;
        if(alunoDTO.getCpf() !=null && !alunoDTO.getCpf().equals((""))){
            aluno = this.alunoRepository.findByCpf(alunoDTO.getCpf());
        }

        AlunoConversorDTO conversorDTO = new AlunoConversorDTO();
        aluno = conversorDTO.converteDtoParaEntidade(alunoDTO, aluno);

        Aluno alunoSalvo = alunoRepository.save(aluno);

        return  conversorDTO.converteEntidadeParaDTO(alunoSalvo);
    }

    public AlunoDTO findByCpf(String cpf){
        AlunoConversorDTO conversorDTO = new AlunoConversorDTO();
        Aluno aluno = this.alunoRepository.findByCpf(cpf);
        AlunoDTO alunoDTO = conversorDTO.converteEntidadeParaDTO(aluno);

        return alunoDTO;
    }

}
