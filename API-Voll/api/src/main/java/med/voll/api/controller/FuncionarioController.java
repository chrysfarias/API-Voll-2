package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.funcionario.DadosCadastroFuncionario;
import med.voll.api.funcionario.Funcionario;
import med.voll.api.funcionario.FuncionarioRepository;

@RestController("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository repository;

	@PutMapping
	public void cadastrarFuncionario(@RequestBody DadosCadastroFuncionario dadosFuncionario) {
		
		repository.save(new Funcionario(dadosFuncionario));
		
		
		
	}

}
