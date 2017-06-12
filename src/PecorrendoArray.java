
public class PecorrendoArray {

	public static void main(String[] args) {
		int [] idades = new int[10];
		
		for(int i = 0; i < 10; i ++){
			idades[i] = i * 10;
		}

		for (int i = 0; i < 10; i++){
			System.out.println(idades[i]);
		}
	}
	
	void imprimeArray(int [] array){
		for(int i = 0; i < array.length;i++){
			System.out.println(array[i]);
		}
	}

}
