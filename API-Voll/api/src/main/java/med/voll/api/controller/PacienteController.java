package med.voll.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.DadosListagemPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
	
	@Autowired
	private PacienteRepository repository;
	
	@PostMapping
	public void cadastrarPacientes(@RequestBody @Valid DadosCadastroPaciente dados ) {
	
	repository.save(new Paciente(dados));
		
	}
	
	
	@GetMapping
	public Page<DadosListagemPaciente> listarPacientes(){
		
		Sort ordenacao = Sort.by("nome");
		Pageable paginacao = PageRequest.of(0,1);
		
		return repository.findAll(paginacao).map(DadosListagemPaciente::new);
			
	}

}
