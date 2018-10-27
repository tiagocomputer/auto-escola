package com.tiagopereira.autoescola.conversordto;

import com.tiagopereira.autoescola.dto.AlunoDTO;
import com.tiagopereira.autoescola.entity.Aluno;

public class AlunoConversorDTO {

    //conversão de entidades para dto
    public AlunoDTO converteEntidadeParaDTO(Aluno aluno) {
        AlunoDTO dto = new AlunoDTO(aluno.getId(), aluno.getInstrutor(), aluno.getNomeAluno(),
                aluno.getEndereco(), aluno.getCpf(), aluno.getTelefone(), aluno.getDataNascimento(), aluno.getRenach());

        return dto;
    }

    //conversão de dtos para entidades
    public Aluno converteDtoParaEntidade(AlunoDTO alunoDTO, Aluno aluno) {

        if (aluno == null) {
            aluno = new Aluno();
        }

        aluno.setCpf(alunoDTO.getCpf());
        aluno.setDataNascimento(alunoDTO.getDataNascimento());
        aluno.setEndereco(alunoDTO.getEndereco());
        aluno.setInstrutor(alunoDTO.getInstrutor());
        aluno.setNomeAluno(alunoDTO.getNomeAluno());
        aluno.setRenach(alunoDTO.getRenach());
        aluno.setTelefone(alunoDTO.getTelefone());

        return aluno;
    }
}


