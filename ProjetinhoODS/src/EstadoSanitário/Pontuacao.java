package EstadoSanitário;

import java.util.Scanner;

public class Pontuacao {
	
	Scanner leia = new Scanner(System.in);
	
	int ponto1;
	
	
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
	
	
			
	


