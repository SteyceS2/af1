package Aulaf1;
import java.util.Scanner;

public class f42 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int a[] = new int[2];
        int b[] = new int[2];
        int c[] = new int[4];

       
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor:");
            a[i] = ler.nextInt();
        }

    
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor:");
            b[i] = ler.nextInt();
        }

                for (int i = 0; i < 2; i++) {
            c[i] = a[i];
            c[i + 2] = b[i];
        }

     
        System.out.println("O array c é:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Valor " + (i + 1) + ": " + c[i]);
        }

        ler.close(); 
    }


	}


