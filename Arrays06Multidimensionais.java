public class Arrays06Multidimensionais {
    static void main() {
        int [][] arrayInt = new int[3][];


        arrayInt[0] = new int[2]; // O indice 0 faz referencia a um array de 2 posicoes
        arrayInt[1] = new int[6]; // O indice 1 faz referencia a um array de 6 posicoes
        arrayInt[2] = new int[7]; // O indice 2 faz referencia a um array de 7 posicoes


         for (int[]arrBase : arrayInt){
             for (int num: arrBase){
                 System.out.println(num + ": posicoes"); // Aqui vai imprimir 15x o numero 0, pq 2+6+7 (posicoes) = 15 posicoes
             }
             System.out.println(arrayInt + ": Endereço");
         }
    }
}
