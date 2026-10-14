import java.util.Scanner;
public class maiorValor {
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n1 = 0, n2 = 0, resulto = 0, maior = 0;
		
		for (i=1; i<=10; i++) {
			System.out.println("digite o valor: ");
			n1 = ler.nextInt();
			
			if (resulto<n1){
				resulto = n1;
			}
		
}
		System.out.println(resulto);
}
}