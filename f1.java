package Aulaf1;
import java.util.Scanner;


public class f1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int fat = 1, num;
		
		System.out.print("Informe o fatorial: ");
		num = ler.nextInt();
		
		if(num < 0) {
			System.out.print("Não existe fatorial de número negativo!");
		}
		if(num > 0) {
			for (int i = 1 ; i <= num; i++) {
			fat *= i;
		}
		System.out.println("O fatorial de "+ num + " é :" + fat);
	}
	ler.close();
	}
}


