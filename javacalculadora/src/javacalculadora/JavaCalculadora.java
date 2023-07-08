package javacalculadora;
import java.util.Scanner;

public class JavaCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro Numero: ");
		int numeroUm = entrada.nextInt();
		System.out.print("Digite o segundo Numero: ");
		Scanner entradaDois = new Scanner(System.in);
		int numeroDois = entradaDois.nextInt();
		
		int resultadoSoma = numeroUm + numeroDois;
		
		System.out.println("O resultado eh: "+resultadoSoma);
		
		
		
		
	}

}
