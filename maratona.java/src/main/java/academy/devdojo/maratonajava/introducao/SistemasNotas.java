package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class SistemasNotas {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua nota: ");
        double nota= scanner.nextDouble();
        if (nota < 0 || nota > 10){
            System.out.println("Nota inválida!");
        } else if (nota < 5){
            System.out.println("Aluno reprovado!");
        } else if (nota < 7){
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno aprovado!");
        }
    }
}
