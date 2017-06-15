public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular;
	
	public Conta(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular(){
		return titular;
	}
	
	public double getSaldo(){
		return this.saldo + this.limite;
	}
	public void saca(double quantidade){
		if (quantidade > this.saldo + this.limite){
			System.out.println("N�o posso sacar fora do limite");
		}else {
			this.saldo -= quantidade; 
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

