public class BubbleSort {
    public BubbleSort(int[] vetor, int n){
        for(int passos = 0; passos < n; passos++){
            for (int i = 0; i < n - passos - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temporario = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = temporario;
                }
            }
        }
    }
}
