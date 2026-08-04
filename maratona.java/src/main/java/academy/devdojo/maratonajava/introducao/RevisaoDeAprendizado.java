package academy.devdojo.maratonajava.introducao;

public class RevisaoDeAprendizado {
    public static void main(String[] args) {
     double valorProduto = 179.99;
     boolean ehClienteVip = false;

     if (ehClienteVip == false) {
         valorProduto *= 0.95;
         System.out.println(valorProduto);
         System.out.println("Cupom de 5% Aplicado!");
     } else {
         valorProduto*= 0.85;
         System.out.println(valorProduto);
         System.out.println("Cupom de 15% Aplicado!");
     }
    }
}

