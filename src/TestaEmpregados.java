
public class TestaEmpregados {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario func = new Funcionario();
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		empresa.empregados = new Funcionario[2];
		
		func.nome="Bruno";
		func.salario = 20000;
		func1.nome= "Rodrigo";
		func1.salario =15000;
		func2.nome= "Soares";
		
		
		empresa.adiciona(func);
		empresa.adiciona(func1);
		empresa.adiciona(func2);

		
	}

}
