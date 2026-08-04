package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2); // retorna: 30
        System.out.println("Valor: " + num2 + num1); // retorna: Valor : 2010
        System.out.println(num2 + num1 + " foi o valor final."); //retorna: 30 foi o valor final.

        int numberOne = 10;
        int numberTwo = 25;
        double result = numberOne / (double) numberTwo;
        System.out.println(result);

        int idade = 32;
        float salario = 3600f;
        boolean isDentroDaLeiMaiorIdade = idade >= 30 || salario >= 3600;
        System.out.println(isDentroDaLeiMaiorIdade);

        double vl_Total_Conta_Corrente = 200;
        double vl_Total_Conta_Poupanca = 10000;
        float vl_Playstation = 5000f;

         boolean isPlayStationCompravel = vl_Total_Conta_Corrente > 5000 || vl_Total_Conta_Poupanca > vl_Playstation;
        System.out.println("PlayStation 5 é compravel: " + isPlayStationCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        System.out.println(bonus);
    }
}
