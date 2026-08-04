 package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class ValidacaoIdade {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua idade: " );
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida!");
            return;
        }
        else if (idade<13){
            System.out.println("Categoria: Criança");
        } else if (idade <=17){
            System.out.println("Categoria: Adolescente");
        } else if (idade <60){
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Idoso");
        }
     }
    }































      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Valor original: " + valorProduto);
        double desconto= 0;
        double valorFinal;

        if (valorProduto < 0) {
            System.out.println("Valor inválido!");
            return;
        }
        if (valorProduto <= 100){
            System.out.println("Desconto de 0% aplicado.");

        } else if (valorProduto<=200) {
             desconto = valorProduto * 0.10;
            System.out.println("Desconto de 10% aplicado.");

        } else {
            desconto = valorProduto* 0.20;
            System.out.println("Desconto de 20% aplicado");
        }

        valorFinal = valorProduto - desconto;
        System.out.println("Valor final: " + valorFinal);

    }
}

 */

