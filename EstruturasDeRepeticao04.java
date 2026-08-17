public class EstruturasDeRepeticao04 {
    static void main() {
        //parcelas de 1000;
        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }
}