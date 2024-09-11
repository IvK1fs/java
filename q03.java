import java.util.Scanner;

public class Main {

public static void main(String[] args) {




    System.out.println("Insira o valor de A: ");

 
    Scanner entrada = new Scanner(System.in);

    int A = entrada.nextInt();


    System.out.println("Insira o valor de B: ");

    int B = entrada.nextInt();


 System.out.println("Insira o valor de C: ");

    int C = entrada.nextInt();


 System.out.println("Insira o valor de D: ");

    int D = entrada.nextInt();

    double calc = (A * B - C * D);

    System.out.println("o valor da diferença é = " + calc);

    entrada.close();
}
}
