package com.tiagopereira.autoescola.entity;

import com.tiagopereira.autoescola.enums.StatusPerfilEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Funcionario {

    @Id
    private String id;
    private String nomeFuncionario;
    private String cpf;
    private String senha;
    private String endereco;
    private String telefone;
    private String escolaridade;
    private StatusPerfilEnum statusPerfil;

    public Funcionario() {
    }

    public Funcionario(String id, String nomeFuncionario, String cpf, String senha, String endereco, String telefone, String escolaridade, StatusPerfilEnum statusPerfil) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.cpf = cpf;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.escolaridade = escolaridade;
        this.statusPerfil = statusPerfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public StatusPerfilEnum getStatusPerfil() {
        return statusPerfil;
    }

    public void setStatusPerfil(StatusPerfilEnum statusPerfil) {
        this.statusPerfil = statusPerfil;
    }
}
