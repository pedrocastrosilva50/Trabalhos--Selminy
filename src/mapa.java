import java.util.Scanner;

public class mapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passos, direcao, opcao;
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int bateria = 100;
            int consumo = 5;
            boolean jogoAtivo = true;

            System.out.println("Bateria inicial: " + bateria + "%");
            System.out.println("Consumo por ação: " + consumo + "%\n");

            while (jogoAtivo && bateria > 0) {
                System.out.println("1. Frente");
                System.out.println("2. Atras");
                System.out.println("3. Esquerda");
                System.out.println("4. Direita");
                System.out.println("Digite uma ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 1) {
                    System.out.println("A marcação acompanhou!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 3) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        break;
                    }
                }
                if (bateria <= 0) break;

                System.out.println("Digite uma próxima ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 3) {
                    System.out.println("A marcação acompanhou!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 3) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        break;
                    }
                }
                if (bateria <= 0) break;

                System.out.println("Digite uma próxima ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 2) {
                    System.out.println("A marcação acompanhou!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 2) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        break;
                    }
                }
                if (bateria <= 0) break;

                System.out.println("Digite uma próxima ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 3) {
                    System.out.println("A marcação acompanhou!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 3) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        break;
                    }
                }
                if (bateria <= 0) break;

                System.out.println("Digite uma próxima ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 1) {
                    System.out.println("A marcação acompanhou!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 7) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        break;
                    }
                }
                if (bateria <= 0) break;

                System.out.println("Digite uma próxima ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 4) {
                    System.out.println("A marcação acompanhou!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 3) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        break;
                    }
                }
                if (bateria <= 0) break;

                System.out.println("Digite uma próxima ação");
                direcao = sc.nextInt();
                bateria -= consumo;
                System.out.println("Bateria restante: " + bateria + "%\n");

                if (direcao < 1 || direcao > 4) {
                    System.out.println("Não há esta opção");
                    continue;
                }

                if (direcao != 1) {
                    System.out.println("Uuuuuh, quase alcança a bola!");
                    continue;
                }

                while (true) {
                    System.out.println("Digite a quantidade de passos");
                    passos = sc.nextInt();
                    bateria -= consumo;
                    System.out.println("Bateria restante: " + bateria + "%\n");

                    if (passos != 2) {
                        System.out.println("Se lesionou");
                        if (bateria <= 0) break;
                    } else {
                        System.out.println("Alcançou a bola e meteu na gaveta!");
                        jogoAtivo = false;
                        break;
                    }
                }
            }
            if (bateria <= 0) {
                System.out.println("Bateria acabou");
            }

            do {
                System.out.println("Se desejar jogar novamente digite 1 se não digite 0 ");
                opcao = sc.nextInt();

                if (opcao == 0) {
                    jogarNovamente = false;
                    System.out.println("Jogo encerrado");
                } else if (opcao != 1) {
                    System.out.println("Opção inválida!");
                }
            } while (opcao != 1 && opcao != 0);

            if (opcao == 1) {

            } else {
                sc.close();
            }
        }
    }
}