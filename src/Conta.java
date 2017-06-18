public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(){
		Conta.totalDeContas ++;
	}
	public Conta(Cliente titular) {
		this.titular = titular;
	}
	
	public Conta(int numero, Cliente titular){
		this(titular);
		this.numero = numero;
	}
	
	public static int getTotalDeContas(){
		return Conta.totalDeContas;
	}
	
	public void setTitula(Cliente titular){
		this.titular = titular;
	}
	public Cliente getTitular(){
		return titular;
	}
	

	
	public double getSaldo(){
		return this.saldo + this.limite;
	}
	public boolean saca(double quantidade){
		if (quantidade > this.saldo + this.limite){
			System.out.println("Não posso sacar fora do limite");
			return false;
		}else {
			this.saldo -= quantidade;
			return true;
		}
	}
	
	public void deposita(double quantidade){
		if (quantidade > 0){
			this.saldo += quantidade;
		}
	}
	
//	boolean transferePara(Conta destino, double valor){
//		boolean retirou = this.saca(valor);
//		if (retirou == false){
//			return false;
//		} else{
//			destino.deposita(valor);
//			return true;
//		}
//		
//	}
}

