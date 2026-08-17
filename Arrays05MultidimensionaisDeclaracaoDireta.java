public class Arrays05MultidimensionaisDeclaracaoDireta {
    static void main() {
        int [][] matriz = {
                {1,6,7},  // Linha 0
                {8,19,3}, // Linha 1
                {2,4,5}    // Linha 2
        };
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
