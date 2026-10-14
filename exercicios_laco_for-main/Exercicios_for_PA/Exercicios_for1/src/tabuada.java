

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int n, multi, i;
	System.out.println("digite um número inteiro");
	n = ler.nextInt();
	for(i=0; i<=10;i++) {
		
		multi = n*i;
		
		System.out.println(n+" x "+i+" = "+multi);
	
	}
 }
}