public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular;
	
	public void saca(double quantidade){
		if (quantidade > this.saldo + this.limite){
			System.out.println("Não posso sacar fora do limite");
		}else {
			this.saldo -= quantidade; 
		}
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	boolean transferePara(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false){
			return false;
		} else{
			destino.deposita(valor);
			return true;
		}
		
	}
}

