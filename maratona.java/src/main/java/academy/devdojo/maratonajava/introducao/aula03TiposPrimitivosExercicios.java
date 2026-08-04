package academy.devdojo.maratonajava.introducao;

/* prática
crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        boolean userConfirm = false;
        String name = "Carlos";
        int age = 19;
        String address = "AV Pedro justo, 242";
        double wage = 2575.55;
        String wageDate = "07/04/2026";

        if (userConfirm== false){
            System.out.println("Usuário não encontrado.");
        } else if (age<=17) {
            System.out.println("Somente dados de maiores de idade são mostrados no sistema público.");
        } else {
            System.out.println("Acesso confirmado");
            System.out.println("Eu, "+ name +", morando no endereço "+ address +", confirmo que recebi o salário de "+ wage +" na data de "+ wageDate+ ".");
        }


       /* if (userConfirm && password.equals(inputPassword) && age >=18) {
            System.out.println("Acesso confirmado");
            System.out.println("Eu, " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de " + wage + ", na data " + wageDate + ".");
        } else if (age<=17){
            System.out.println("Somente dados de maiores de idade são cadastrados.");
        } else {
            System.out.println("Usuário não encontrado");
        }

        */
    }
}
