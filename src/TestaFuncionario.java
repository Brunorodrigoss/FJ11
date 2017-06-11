
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Danilo";
		f1.salario = 100;
		
		f1.dataEntrada.dia = 6;
		f1.dataEntrada.mes = 6;
		f1.dataEntrada.ano = 2017;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		
		if (f1 == f2) {
			System.out.println("Iguais");
		} else{
			System.out.println("Diferentes");
		}

		
		f1.mostra();
	}

}
