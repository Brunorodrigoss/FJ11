
public class Programa {
	public static void main(String[] args){
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.getTitular().setNome("Duke"); 
		minhaConta.setSaldo(1000);
		
		if (minhaConta.saca(2000)){
			System.out.println("Consegui sacar");
		} else{
			System.out.println("Não consegui sacar");
		}

	}
}
