
public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada = new Data();
	private String rg;
	private int indentificador;
	private static int contador;
	
	public Funcionario() {
		contador += 1;
		this.indentificador = contador;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
		contador += 1;
		this.indentificador = contador;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdentificador(){
		return this.indentificador;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setDataEntrada(Data data){
		this.dataEntrada = data;
	}
	
	public Data getDataEntrada(){
		return this.dataEntrada;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String GetRg(){
		return this.rg;
	}
	
	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	private double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Salário: "+this.salario);
		System.out.println("Ganho anual: "+calculaGanhoAnual());
		System.out.println("Departamento: "+this.departamento);
		dataEntrada.mostra();
	}
}
