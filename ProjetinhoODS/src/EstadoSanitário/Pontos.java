package EstadoSanit?rio;

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
		
		
			
		
		if(resposta1>0 && resposta1<3)
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
			System.out.println("\nInsira um n?mero v?lido");
		}

		//*******************************************************//
		
		if(resposta2 == "Sim" || "sim" ||"s")
		{
			ponto2 = 1;
		}
		else if(resposta2 == "N?o" || "n?o" || "n")
		{
			ponto2 = 0;
		}
		else
		{
			ponto2 = 0;
		}
		//***********************************************************//
			
		if(resposta3 == "a" || "A" )
		{
			ponto3 = 2;
		}
		else if(resposta3 == "b" || "B" )
		{
			ponto3 = 1;
		}
		else if(resposta3 == "c" || "C" )
		{
			ponto3 = 0;
		}	
		else if(resposta3 == "d" || "D" )
		{
			ponto3 = 3;
		}
		else if(resposta3 == "e" || "E" )
		{
			ponto3 = 3;
		}
		else
		{
			ponto3 = 0;
		}
		
		
		//****************************************************************//
		if(resposta4 == "Sim" || "sim" ||"s")
		{
			ponto4 = 2;
		}
		else if(resposta4 == "N?o" || "n?o" || "n")
		{
			ponto4 = 0;
		}
		else
		{
			ponto4 = 0;
		}
		
		//************************************************************************************//
		
		if(resposta5 == "Sim" || "sim" ||"s")
		{
			ponto5 = 3;
		}
		else if(resposta5 == "N?o" || "n?o" || "n")
		{
			ponto5 = 0;
		}
		else
		{
			ponto5 = 0;
		}
		
		
		//*****************************************************************************************//
		if(resposta6 == "Sim" || "sim" ||"s")
		{
			ponto6 = 1;
		}
		else if(resposta6 == "N?o" || "n?o" || "n")
		{
			ponto6 = 0;
		}
		else
		{
			ponto6 = 0;
		}
		
		
		//**********************************************************************************************//
		if(resposta7 == "a" || "A" )
		{
			ponto7 = 0;
		}
		else if(resposta7 == "b" || "B" )
		{
			ponto7 = 2;
		}
		else if(resposta7 == "c" || "C" )
		{
			ponto7 = 3;
		}	
		else if(resposta7 == "d" || "D" )
		{
			ponto7 = 2;
		}
		else
		{
			ponto7 = 0;
		}
		
		
		//********************************************************************************************//
		
		if(resposta8 == "Sim" || "sim" ||"s")
		{
			ponto8 = 0;
		}
		else if(resposta8 == "N?o" || "n?o" || "n")
		{
			ponto8 = 1;
		}
		else
		{
			ponto8 = 0;
		}
		
		
		
	}
