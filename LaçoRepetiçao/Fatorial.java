import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
		int i, n, resultado;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero");
		n = in.nextInt();
		resultado = n;
		i = n-1;
		if(n==1) {
			i = 1;
			resultado = 1;
		}
		while(i!=1) {
			resultado *= i;
			i--;
		}
		System.out.println("O fatorial de "+ n +" �: "+ resultado);
		in.close();
	}

}
