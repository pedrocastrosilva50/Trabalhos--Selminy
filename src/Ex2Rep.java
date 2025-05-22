import java.util.Scanner;

public class Ex2Rep {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int cont = 0, valor, resultado;
        int resposta = 1;

        while (resposta == 1) {
            System.out.print("Digite um valor para ser feita a sua tabuada: ");
            valor = sc.nextInt();
            cont = 0;
            while (cont <= 10) {
                resultado = valor * cont;
                System.out.println(valor + "x" + cont + "=" + resultado);
                cont = cont + 1;
            }
            System.out.println("Deseja uma nova tabuada ? (1 = SIM / 0 = NÃO)");
            resposta = sc.nextInt();
        }
    }
}