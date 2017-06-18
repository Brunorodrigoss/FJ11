
public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		if (checkDia(dia) &&
				checkMes(mes) && checkAno(ano)){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else{
			System.out.println("Data inválida");
		}
		
	}

	private boolean checkDia(int dia) {
		if (dia <= 0 || dia >30){
			return false;
		} else{
			return true;
		}
	}
	
	private boolean checkMes(int mes) {
		if (mes <= 0 || mes > 12){
			return false;
		} else{
			return true;
		}
	}

	private boolean checkAno(int ano2) {
		if (ano > 0){
			return true;
		}else{
			return false;
		}
	}


	public void mostra() {
		System.out.println("Data de entrada: "+this.dia+"/"+this.mes+"/"+this.ano);
	}


}
