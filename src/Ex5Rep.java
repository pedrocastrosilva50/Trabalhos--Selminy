import java.util.Scanner;

public class Ex5Rep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1, y = 1;
        int z, qtd, cont;

        System.out.print("Digite a quantidade de números para ser mostrada da sequencia de Fibonacci: ");
        qtd = sc.nextInt();

        if (qtd == 1){
            System.out.print(x);
        }
        else if (qtd == 2){
            System.out.print(x +" "+y);
        }
        else {
            System.out.print(x +" "+y+" ");
            cont = 3;
            while (cont <= qtd){
                z = x+y;
                System.out.print(z+ " ");
                x = y;
                y = z;
                cont = cont + 1;
            }
        }
    }
}