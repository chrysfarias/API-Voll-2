package med.voll.api.funcionario;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import med.voll.api.endereco.Endereco;
import med.voll.api.medico.Especialidade;

@Entity(name="Funcionario")
@Table(name="funcionario")
@Getter
@Setter
public class Funcionario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String cargo;


public Funcionario(DadosCadastroFuncionario dados) {
	this.nome = dados.nome();
	this.cpf = dados.cpf();
	this.cargo = dados.cargo();
}
}
