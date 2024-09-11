package application;

import java.util.Locale;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	
	
	System.out.println("Insira o codigo da peça: ");
	
	
	Scanner entrada = new Scanner(System.in);
	
	
	int numeroPecas = entrada.nextInt();
	
	System.out.println("Quantidade de peças: ");
	
	int quantidadedePecas = entrada.nextInt();
	
    System.out.println("insira o valor das peça 1");
	
    double peca1 = entrada.nextDouble();
    
   
    
	System.out.println("Insira o codigo da peça 2: ");
	
	
	int numeroPecas2 = entrada.nextInt();
	
	
	System.out.println("Quantidade de peças: ");
	
	
	int quantidadedePecas2 = entrada.nextInt();
	
	
    System.out.println("insira o valor das peça 2 ");
    
	
    double peca2 = entrada.nextDouble();
    
    
  double calc1 = quantidadedePecas * peca1;
  double calc2 = quantidadedePecas2 * peca2;
  
  double calc3 = calc1 + calc2 ;
  
    System.out.printf("o valor a pagar: R$%.2f" ,calc3);
	entrada.close();
}
}
