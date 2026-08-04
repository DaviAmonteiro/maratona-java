package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        //VALIDACAO DE DADOS:

        boolean DadosValidos = true;
        if (nome.isEmpty()){
            System.out.println("Nome invalido");
            DadosValidos= false;
        }

        if (idade<0){
            System.out.println("Idade invalida!");
            DadosValidos = false;
        }

        if (altura<=0){
            System.out.println("Altura invalida!");
            DadosValidos = false;
        }

        if (DadosValidos){
            System.out.println("DADOS CADASTRADOS COM SUCESSO:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
        }
        scanner.close();
    }

}
