
public class TestaConstrutor {

	public static void main(String[] args) {
		Cliente titular = new Cliente();
		titular.setNome("Bruno");
		
		Conta minhaConta = new Conta(10,titular);
		
		System.out.println(minhaConta.getTitular().getNome());

	}

}
