import java.util.Scanner;

public class soma100 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int i, soma = 0;
	for(i=1; i<=100;i++) {
		soma = i+soma;
		System.out.print(soma+" ");
	}

 }
}