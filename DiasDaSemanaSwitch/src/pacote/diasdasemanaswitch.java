package pacote;
import java.util.Scanner;
public class diasdasemanaswitch {

	public static void main(String[] args) {
		
		
		//ma solu��o utilizando switch/case para, a partir de um valor inteiro informado no intervalo de 1 a 7
        // seja apresentado o dia da semana por extenso. Valores informados fora desse intervalo imprimir "dia inv�lido"
		
		
		Scanner sc = new Scanner(System.in); // C�DIGO PARA PEGAR DADOS DO CONSOLE.
	
		int valor1;
		
					
		System.out.print(("escolha um num�ro inteiro de 1 a 7 para que seja apresentado o dia da semana referente a esse n�mero.") // PEDINDO AO USU�RIO PARA ESCOLHER UMA DAS 04 OPERA��ES  
				
		        + "\n(1) Domingo"
				+ "\n(2) Segunda-feira"
				+ "\n(3) Ter�a-feira"
				+ "\n(4) Quarta-feira"
		        + "\n(5) Quinta-feira"
			    + "\n(6) Sexta-feira"
			    + "\n(7) S�bado");
			 
 

         valor1 = sc.nextInt(); // SALVANDO VALOR EM OPERA��O


         switch(valor1) {      // COLOCANDO O C�DIGO SWITCH PARA ORGANIZAR AS OPERA��ES
    case 1:
	System.out.println("O dia da semana escolhido � Domingo!!! ");
	break;


    case 2:
	System.out.println("O dia da semana escolhido � Segunda-feira!!!");
	break;

	
    case 3:
	System.out.println("O dia da semana escolhido � ter�a-feira!!! ");
	break;


   case 4:
	System.out.println("O dia da semana escolhido � Quarta-feira!!! ");
	break;
    
   
    case 5:
	System.out.println("O dia da semana escolhido � Quinta-feira!!! ");
	break;


    case 6:
	System.out.println("O dia da semana escolhido � Sexta-feira!!!");
	break;

    case 7:
	System.out.println("O dia da semana escolhido � S�bado!!! ");
	break;

	
	default:
    System.out.println("dia inv�lido");
   
    
    }
   
         
    sc.close();
	
	
	
		
	
	
	
	}

}
