import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CaixaEletronicoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 3300.50;
        boolean executando = true;
        System.out.println("---------------------------------");
        System.out.println(" BEM VINDO AO CAIXA ELETRONICO! ");
        System.out.println("---------------------------------");

        int senha = 1234;
        int tentativas = 3;
        boolean acessoPermitido = false;

        double[] extratoBanco = new double[5];
        int contadorTransacoes = 0;


        for (int i = 0; i < tentativas; i++) {
            System.out.println("Digite sua senha: ");
            int digitesenha = scanner.nextInt();


            if (digitesenha != senha) {
                System.out.println("Senha inválida!");
            } else if (digitesenha == senha) {
                acessoPermitido = true;
                break;
            }
        }

        if (acessoPermitido) {
            while (executando) {
                System.out.println("\nMenu de opções:");
                System.out.println("1- Consultar saldo:");
                System.out.println("2- Depositar valor");
                System.out.println("3- Sacar valor:");
                System.out.println("4- Consultar extrato bancário:");
                System.out.println("5- Sair");
                System.out.print("Escolha uma opção: 1-4: ");


                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Seu saldo atual é " + saldo);
                        break;

                    case 2:
                        System.out.println("Digite o valor para depósito: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        if (valorDeposito <= 0) {
                            System.out.println("Digite um valor válido!");
                        } else {
                            saldo += valorDeposito;

                            if (contadorTransacoes < extratoBanco.length) {
                                extratoBanco[contadorTransacoes] = +valorDeposito;
                                contadorTransacoes++;
                            }
                        }
                        System.out.println("Valor depositado com sucesso! \n Saldo atual: " + saldo);
                        break;

                    case 3:
                        System.out.println("Digite um valor para sacar: ");
                        double valorSaque = scanner.nextDouble();
                        if (valorSaque <= 0) {
                            System.out.println("Digite um valor válido para saque!");
                        } else if (valorSaque > saldo) {
                            System.out.println("Valor indisponível para saque!");
                        } else {
                            saldo -= valorSaque;

                            if (contadorTransacoes < extratoBanco.length) {
                                extratoBanco[contadorTransacoes] = -valorSaque;
                                contadorTransacoes++;
                            }
                            System.out.println("Saque realizado com sucesso! \n saldo atual: " + saldo);
                        }
                        break;

                    case 4:
                        for (int i = 0; i < extratoBanco.length; i++) {
                            System.out.println((i + 1) + " a movimentação: R$ " + extratoBanco[i]);

                        }
                        break;

                    case 5:
                        System.out.println("Obrigado por usar nosso serviço :)");
                        executando = false;
                        break;

                    default:
                        System.out.println("Opcao inválida, selecione uma opção de 1 a 4");
                }
            }
        }
        scanner.close();
    }
}