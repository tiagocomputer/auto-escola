package com.tiagopereira.autoescola.controller;

import com.tiagopereira.autoescola.dto.AlunoDTO;
import com.tiagopereira.autoescola.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.tiagopereira.autoescola.responses.Response;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping(path = "/{cpf}")
    public AlunoDTO buscar(@PathVariable("cpf") String cpf) {
        return alunoService.findByCpf(cpf);
    }

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> listarAlunos() {
        List<AlunoDTO> alunoDTO = alunoService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(alunoDTO);
    }

    @PostMapping(path = "/novoAluno")
    public ResponseEntity<Response<AlunoDTO>> salvarAluno(@Valid @RequestBody AlunoDTO alunoDTO,
                                                          BindingResult result) {
        Response<AlunoDTO> response = new Response<AlunoDTO>() {
        };
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(response);
        }

        AlunoDTO alunoDTOSalva = this.alunoService.salvar(alunoDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(alunoDTO.getCpf()).toUri();
        response.setData(alunoDTOSalva);
        return ResponseEntity.created(location).body(response);
    }

    @PutMapping(path = "/alterarAluno")
    public ResponseEntity<Response<AlunoDTO>> alterarAluno(@RequestBody AlunoDTO alunoDTO, BindingResult result) {
        Response<AlunoDTO> response = new Response<>();
        try {
            validateUpdateAluno(alunoDTO, result);
            if (result.hasErrors()) {
                result.getAllErrors().forEach(objectError -> response.getErrors().add(objectError.getDefaultMessage()));
                return ResponseEntity.badRequest().body(response);
            }

            alunoDTO.setCpf(alunoDTO.getCpf());

            AlunoDTO alunoAtualizado = this.alunoService.salvar(alunoDTO);

            response.setData(alunoAtualizado);
        } catch (Exception e) {
            response.getErrors().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }

    private void validateUpdateAluno(AlunoDTO alunoDTO, BindingResult result) {
        if (alunoDTO.getId() == null) {
            result.addError(new ObjectError("Aluno", "Id do aluno não informado"));
        }
        if (alunoDTO.getCpf() == null) {
            result.addError(new ObjectError("Aluno", "CPF do aluno não informado"));
        }
    }

}
