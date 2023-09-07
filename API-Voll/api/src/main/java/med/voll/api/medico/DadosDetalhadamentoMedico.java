package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosDetalhadamentoMedico(
		Long id,
		String nome,
		String email,
		Especialidade especialidade,
		String crm,
		String telefone, 
		Endereco endereco) {
	
	
		public DadosDetalhadamentoMedico(Medico medico){
		this(medico.getId(),medico.getNome(),medico.getEmail(),medico.getEspecialidade(),
				medico.getCrm(),medico.getTelefone(),medico.getEndereco());
	}

}
