
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada = new Data();
	String rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Salário: "+this.salario);
		System.out.println("Ganho anual: "+calculaGanhoAnual());
		System.out.println("Departamento: "+this.departamento);
		dataEntrada.mostra();
	}
}
