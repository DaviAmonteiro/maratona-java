package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;


public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "davi";
        int idade = 14;

        if (nome.equals(nome)){
            System.out.println("O seu nome é " + nome);
        } else {
            System.out.println("O seu nome não é " + nome);
        }
       if (idade >= 18){
           System.out.println("Voce é adulto, acesso liberado!");
       } else if (idade >=13){
           System.out.println("Voce é adolescente, peça permissão para seus pais para acessar nosso App!");
       } else {
           System.out.println("Acesso negado, voce ainda é uma criança!");
       }
    }
}

