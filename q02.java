import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    double pi = 3.14159;


    System.out.println("Insira o raio: ");

 
    Scanner entrada = new Scanner(System.in);


    double r = entrada.nextDouble();


   double calc = pi * (r * r );

   System.out.println("o valor do área é igual a: " + calc );

    entrada.close();
}
}
