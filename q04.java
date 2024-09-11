package application;

import java.util.Locale;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	
	
	System.out.println("Insira seu número: ");
	
	
	Scanner entrada = new Scanner(System.in);
	
	
	int numeroFunc = entrada.nextInt();
	
	System.out.println("insira a quantidade de horas: ");
	
	int horasTrabalhadas = entrada.nextInt();
	
    System.out.println("insira o quanto você recebe por hora");
	
    double precoHora = entrada.nextDouble();
    
    double salario = horasTrabalhadas * precoHora;
    
    
    System.out.printf("número do funcionário: %d %nSalário: U$%.2f", numeroFunc, salario);
	entrada.close();
}
}
