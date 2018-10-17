package com.tiagopereira.autoescola.dto;

import com.tiagopereira.autoescola.entity.Funcionario;

import java.util.Date;

public class AlunoDTO {

    private String id;
    private Funcionario instrutor;
    private String nomeAluno;
    private String endereco;
    private String cpf;
    private String telefone;
    private Date dataNascimento;
    private String renach;

    public AlunoDTO() {
    }

    public AlunoDTO(String id, Funcionario instrutor, String nomeAluno, String endereco, String cpf, String telefone, Date dataNascimento, String renach) {
        this.id = id;
        this.instrutor = instrutor;
        this.nomeAluno = nomeAluno;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.renach = renach;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Funcionario getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Funcionario instrutor) {
        this.instrutor = instrutor;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRenach() {
        return renach;
    }

    public void setRenach(String renach) {
        this.renach = renach;
    }
}
