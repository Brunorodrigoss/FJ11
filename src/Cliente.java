
public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	public void mudaCPF(String cpf){
		if(this.idade <= 60){
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}

	private void validaCPF(String cpf) {
		// Série de regras aqui, falha caso não seja válido
		
	}
}
