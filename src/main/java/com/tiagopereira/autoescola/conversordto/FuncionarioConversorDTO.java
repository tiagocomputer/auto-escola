package com.tiagopereira.autoescola.conversordto;

import com.tiagopereira.autoescola.dto.FuncionarioDTO;
import com.tiagopereira.autoescola.entity.Funcionario;

public class FuncionarioConversorDTO {

    //conversão de entidades para dto
    public FuncionarioDTO converteEntidadeParaDTO(Funcionario funcionario) {
        FuncionarioDTO dto = new FuncionarioDTO(funcionario.getId(), funcionario.getNomeFuncionario(), funcionario.getCpf(),
                funcionario.getSenha(), funcionario.getEndereco(), funcionario.getTelefone(),
                funcionario.getEscolaridade(), funcionario.getStatusPerfil());

        return dto;
    }

    //conversão de dtos para entidades
    public Funcionario converteDtoParaEntidade(FuncionarioDTO funcionarioDTO, Funcionario funcionario) {

        if (funcionario == null) {
            funcionario = new Funcionario();
        }

        funcionario.setCpf(funcionarioDTO.getCpf());
        funcionario.setEndereco(funcionarioDTO.getEndereco());
        funcionario.setEscolaridade(funcionarioDTO.getEscolaridade());
        funcionario.setNomeFuncionario(funcionarioDTO.getNomeFuncionario());
        funcionario.setSenha(funcionarioDTO.getSenha());
        funcionario.setStatusPerfil(funcionarioDTO.getStatusPerfil());
        funcionario.setTelefone(funcionarioDTO.getTelefone());

        return funcionario;
    }
}
