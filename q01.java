import java.util.Scanner;

public class Main {
public static void main(String[] args) {


    System.out.println("Insira o primeiro número: ");

    Scanner entrada = new Scanner(System.in);

    int n1 = entrada.nextInt();



    System.out.println("Insira o segundo número: ");



    int n2 = entrada.nextInt();

    int calc = n1 + n2;
    System.out.println("A soma dos números é igual a "+ calc);

    entrada.close();
}
}
