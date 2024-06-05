package Aulaf1;
import java.util.Scanner;

public class f3 {

	public static void main(String[] args) {
		double n1, n2, soma;
		int senhaMestre, senhaTentativa;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Cadastre senha (Apenas Números)");
		senhaMestre = ler.nextInt();
		
		System.out.println("Digite um número");
		n1 = ler.nextDouble();
		System.out.println("Digite outro número");
		n2 = ler.nextDouble();
		soma = n1 + n2;
		
		System.out.println("Digite a sua senha para desbloquear a soma");
		senhaTentativa = ler.nextInt();
		
	if (senhaTentativa == senhaMestre) {
		System.out.println("A soma é: " + soma);
		
		if (senhaTentativa != senhaMestre) {
		System.out.println("Erro! Senha errada!");
		
		ler.close();
		
		

	}

}
}
}