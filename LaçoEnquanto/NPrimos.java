import java.util.Scanner;

public class NPrimos {
    public static void main(String[] args) {
        int i = 2, ocorrencias = 1, n, n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o n�mero que deseja ver se � primo ou n�o:");
        n = in.nextInt();
        n1 = n;
        while(i<=n) {
            n1 = n%i;
            if(n1==0){
                ocorrencias++;
            }
            i++;
        }
        if(ocorrencias==2){
            System.out.println("O n�mero � primo");
        }else{
            System.out.println("O n�mero n�o � primo");
        }
        in.close();
    }
}