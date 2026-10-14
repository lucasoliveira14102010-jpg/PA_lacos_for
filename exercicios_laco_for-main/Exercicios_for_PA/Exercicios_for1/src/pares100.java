
import java.util.Scanner;

public class pares100 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int i, soma = 0;
	for(i=2; i<=100;i=i+2) {
		soma = i+soma;
		System.out.print(soma+" ");
	}

 }
}