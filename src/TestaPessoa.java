
public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome= "Bruno";
		pessoa.idade = 25;
		
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		
		System.out.println("A idade do "+pessoa.nome+" é: "+pessoa.idade);

	}

}
