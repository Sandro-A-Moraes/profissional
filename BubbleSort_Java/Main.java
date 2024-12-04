import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        PreencherVetor preencherVetor = new PreencherVetor();
        preencherVetor.preencher();
        int n = preencherVetor.getN();
        int[] vetor = preencherVetor.getVetor();

        MostrarVetor mostrarVetor = new MostrarVetor();
        mostrarVetor.mostrar(vetor, n);

        BubbleSort bubbleSort = new BubbleSort(vetor, n);
        mostrarVetor.mostrar(vetor, n);

        }
    }
