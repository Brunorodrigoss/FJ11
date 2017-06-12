
public class TestaContaEstouro1 {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = -200;
		minhaConta.limite= 1000.0;
		minhaConta.saca(50000);

	}

}
