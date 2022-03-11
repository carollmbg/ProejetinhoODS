package EstadoSanitário;

public class Pontos extends Perguntas{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ponto1;
		int ponto2;
		int ponto3;
		int ponto4;
		int ponto5;
		int ponto6;
		int ponto7;
		int ponto8;
		
		
			
		
		if(n_moradores>0 && n_moradores<3)
		{
			ponto1 = 1;
		}

		else if(n_moradores>3 && n_moradores<8)	
		{
			ponto1 = 2;
		}
		else if(n_moradores>8)	
		{
			ponto1 = 3;
		}
		else
		{
			System.out.println("\nInsira um número válido");
		}

	}

}
