import java.util.Scanner;
public class umateseunumero {
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n;
		System.out.println("insira um número:");
		n = ler.nextInt();
		if (n>=0) {
		for (i=1; i<=n; i++) {
		System.out.print(i+" ");
		}
		}
		else {
		for (i=1; i>=n; i--) {
		System.out.print(i+" ");
		}
		}
}
}
