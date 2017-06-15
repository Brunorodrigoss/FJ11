
public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
		
	public void mudaCPF(String cpf){
		if(this.idade <= 60){
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}

	private void validaCPF(String cpf) {
		// S�rie de regras aqui, falha caso n�o seja v�lido
		
	}
}
