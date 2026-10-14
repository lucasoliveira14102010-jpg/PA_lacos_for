import java.util.Scanner;
public class qualepar {
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n;
		for (i=1; i<=10; i++) {
		System.out.print("insira o "+i+"o. número: ");
		n = ler.nextInt();
		if (n%2 != 0) {
			System.out.println(n+" é Impar");
		} else {
			System.out.println(n+" é Par");
		
		}
		}
}
}
