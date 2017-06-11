
public class TestaPorta {

	public static void main(String[] args) {
		Porta porta = new Porta();
		
		porta.abre();
		porta.cor = "Marrom";
		porta.dimensaoX = 50;
		porta.dimensaoY = 80;
		porta.dimensaoZ = 2;
		
		if(porta.estaAberta()){
			System.out.println("A porta esta aberta");
		}else{
			System.out.println("Erro! A porta deveria estar aberta");
		}
		
		System.out.println("A cor da porta é "+porta.cor);
		
		porta.cor = "verde";
		
		System.out.println("A cor da porta é "+porta.cor);
		
		porta.fecha();
		if(porta.estaAberta()){
			System.out.println("Erro! A porta deveria estar fechada");
		} else{
			System.out.println("A porta esta fechada!");
		}

	}

}
