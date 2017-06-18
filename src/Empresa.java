
public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public Funcionario getEmpregados(int posicao){
		return this.empregados[posicao];
	}
	
	public void setEmpregados(int posicao, empregados){
		this.empregados[posicao]
	}

	void adiciona(Funcionario funcionario) {
		
		if (contem(funcionario)){
			System.out.println("O usuário "+funcionario.getNome()+" já exite!");
			
		}else{
			for (int i = 0; i < this.empregados.length; i++){
				if(empregados[i] == null  ){
					this.empregados[i] = funcionario;
					System.out.println("Usuário "+empregados[i].getNome()+" adicionado!");
					return;
				}
			}

			// Recolocação caso a lista esteja cheia
			Funcionario [] temp = new Funcionario[this.empregados.length * 2];
			
			for(int i = 0; i < this.empregados.length; i++){
				temp[i] = this.empregados[i];
			}
			this.empregados = temp;
			this.adiciona(funcionario);
				
		}

	}
	
	void mostraEmpregados(){
		for(int i = 0; i < this.empregados.length; i++){
			if(empregados[i] == null){
				continue;
			}else{
				System.out.println("Informações de funcionário:");
				System.out.println("*================================*");
				System.out.println("Nome: "+empregados[i].getNome());
				System.out.println("Salario: "+empregados[i].getSalario());
				System.out.println("*================================*");
			}
		}
	}

	
	boolean contem(Funcionario funcionario){
		for(int i = 0; i < empregados.length; i++){
			if (empregados[i] == null){
				continue;
			}else{
				if (funcionario.getNome() == empregados[i].getNome()){
					return true;
				} 
			}
		}
		return false;
	}
}
