
public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	int qtdPortas = 0;
	
	public Porta() {
		System.out.println("Adicionando portas");
		qtdPortas += 1;
	}
	void abre(){
		System.out.println("Porta aberta!");
		this.aberta = true;
	}
	
	void fecha(){
		System.out.println("Porta fechada!");
		this.aberta = false;
	}
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	boolean estaAberta(){
		if (aberta){
			return true;
		}else{
			return false;
		}
	}
	
	int quantasPortasEstaoAbertas(){
		return qtdPortas;
	}
	
}
