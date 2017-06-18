
public class TestaContas {

	public static void main(String[] args) {
		System.out.println(Conta.getTotalDeContas());
		Conta conta = new Conta();
		System.out.println("Conta 1 antes da 2= "+conta.getTotalDeContas());
		Conta conta2 = new Conta();
		
		System.out.println("Conta 1 depois da 2= "+conta.getTotalDeContas());
		System.out.println("Conta 2 = "+conta2.getTotalDeContas());

	}

}
