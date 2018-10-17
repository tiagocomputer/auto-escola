package com.tiagopereira.autoescola.repository;

import com.tiagopereira.autoescola.entity.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
    Funcionario findByCpf(String cpf);
}
