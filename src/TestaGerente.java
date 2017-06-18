
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Bruno Rodrigo");
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
	}

}
