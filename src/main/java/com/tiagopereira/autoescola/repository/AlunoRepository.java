package com.tiagopereira.autoescola.repository;

import com.tiagopereira.autoescola.entity.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

public interface AlunoRepository extends MongoRepository<Aluno, String> {
    List<Aluno> listar =  new ArrayList<>();

    Aluno findByCpf(String cpf);
}
