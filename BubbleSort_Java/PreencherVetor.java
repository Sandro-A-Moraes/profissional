import javax.swing.*;
import java.util.Scanner;

public class PreencherVetor {
    private int n;
    private int[] vetor;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public void preencher(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        this.n = scanner.nextInt();
        this.vetor = new int[this.n];

        for(int i = 0; i < this.n; i++){
            System.out.println("Digite um inteiro: ");
            vetor[i] = scanner.nextInt();
        }
    }
}

