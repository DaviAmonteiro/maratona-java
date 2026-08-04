package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ValidacaoNumeros {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro número:");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numeroDois = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numeroTres = scanner.nextInt();


        if (numeroUm == numeroDois || numeroTres == numeroUm || numeroDois == numeroTres){
            System.out.println("Digite valores diferentes para cada variável!");
            return;
        }
        else if (numeroUm > numeroDois && numeroUm > numeroTres){
            System.out.println(numeroUm + " É o maior número");
        } else if (numeroDois > numeroUm && numeroDois > numeroTres){
            System.out.println(numeroDois+ " É o maior número" );
        } else {
            System.out.println(numeroTres + " É o maior numero");
        }

        if (numeroUm < numeroDois && numeroUm < numeroTres){
            System.out.println(numeroUm + " É o menor número");
        } else if (numeroDois < numeroUm && numeroDois < numeroTres){
            System.out.println(numeroDois + " É o menor número");
        } else {
            System.out.println(numeroTres + " É o menor número");
        }
    }
}
