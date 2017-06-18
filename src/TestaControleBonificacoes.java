
public class TestaControleBonificacoes {
	public static void main(String[] args) {
		ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		Gerente funcinario1 = new Gerente();
		
		funcinario1.setSalario(5000.0);
		cdb.registra(funcinario1);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(1000.0);
		cdb.registra(funcionario);
		
		System.out.println(cdb.getTotalDeBonificacoes());
		
	}
}
