import java.util.Scanner;

public class Ex4Rep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fatorial = 1, cont = 1;
        int resposta;

        System.out.println("Digite um numero para virar fatorial :");
        resposta = sc.nextInt();

        while (cont <= resposta){
            fatorial = fatorial*cont;
            cont = cont+1;
        }
        System.out.println("O resultado fatorial é "+fatorial );
    }
}