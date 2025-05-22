import java.util.Scanner;

public class Ex1Rep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0, valor = 1 , cont = 1;

        while (cont <= 5) {
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
            if (cont == 1 || valor > maior){
                maior = valor;
            }
            cont = cont + 1;
        }
        System.out.println("O maior valor é "+maior);
    }
}