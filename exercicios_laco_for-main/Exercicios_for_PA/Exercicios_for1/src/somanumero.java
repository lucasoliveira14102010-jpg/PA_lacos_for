import java.util.Scanner;
public class somanumero {
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0, soma;
		for (i=1; i<=10; i++) {
		System.out.print("insira o "+i+"o. número: ");
		n = ler.nextInt();
		if(i==1) {
			n1 = n;
		}
		else if(i==2) {
			n2 = n;
		}
		else if(i==3) {
			n3 = n;
		}
		else if(i==4) {
			n4 = n;
		}
		else if(i==5) {
			n5 = n;
		}
		else if(i==6) {
			n6 = n;
		}
		else if(i==7) {
			n7 = n;
		}
		else if(i==8) {
			n8 = n;
		}
		else if(i==9) {
			n9 = n;
		}
		else if(i==10) {
			n10 = n;
		}
		soma = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
		System.out.println(soma);
		
}
}
}