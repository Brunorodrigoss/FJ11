
public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;


	void adiciona(Funcionario funcionario) {
		
		if (contem(funcionario)){
			System.out.println("O usuário "+funcionario.nome+" já exite!");
			
		}else{
			for (int i = 0; i < this.empregados.length; i++){
				if(empregados[i] == null  ){
					this.empregados[i] = funcionario;
					System.out.println("Usuário "+empregados[i].nome+" adicionado!");
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
				System.out.println("Nome: "+empregados[i].nome);
				System.out.println("Salario: "+empregados[i].salario);
				System.out.println("*================================*");
			}
		}
	}

	
	boolean contem(Funcionario funcionario){
		for(int i = 0; i < empregados.length; i++){
			if (empregados[i] == null){
				continue;
			}else{
				if (funcionario.nome == empregados[i].nome){
					return true;
				} 
			}
		}
		return false;
	}
}
