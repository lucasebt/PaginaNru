
package pagina;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SimuladorSubstituicaoPagina {
    public static void main(String[] args) {
        int TAMANHO_RAM = 10;
        Ram ram = new Ram(TAMANHO_RAM);
        Queue<Pagina> candidatosNRU = new LinkedList<>();
        Random random = new Random();

        // Preencher a RAM com páginas aleatórias da matriz SWAP
        for (int i = 0; i < TAMANHO_RAM; i++) {
            int indicePaginaAleatoria = random.nextInt(100);
            int tempoEnvelhecimentoAleatorio = random.nextInt(9900) + 100; // Entre 100 e 9999
            Pagina pagina = new Pagina(indicePaginaAleatoria, i + 1, random.nextInt(50) + 1, tempoEnvelhecimentoAleatorio);
            ram.paginas[i] = pagina;
            candidatosNRU.add(pagina);
        }

        // Imprimir MATRIZ RAM e MATRIZ SWAP no início
        System.out.println("MATRIZ RAM no início:");
        imprimirMatrizRAM(ram);
        System.out.println("MATRIZ SWAP no início:");
        imprimirMatrizSwap();

        int instrucoes = 0;
        while (instrucoes < 1000) {
            // Resto do código de simulação

            instrucoes++;
        }

        // Imprimir MATRIZ RAM e MATRIZ SWAP no final
        System.out.println("MATRIZ RAM no final:");
        imprimirMatrizRAM(ram);
        System.out.println("MATRIZ SWAP no final:");
        imprimirMatrizSwap();
    }

    // Função para imprimir MATRIZ RAM
    public static void imprimirMatrizRAM(Ram ram) {
        for (Pagina pagina : ram.paginas) {
            if (pagina != null) {
                System.out.println("N: " + pagina.numeroPagina + " I: " + pagina.instrucao + " D: " + pagina.dado + " R: " + pagina.bitReferencia + " M: " + pagina.bitModificado + " T: " + pagina.tempoEnvelhecimento);
            }
        }
    }

    // Função para imprimir MATRIZ SWAP (apenas as 10 primeiras páginas)
    public static void imprimirMatrizSwap() {
        for (int i = 0; i < 10; i++) {
            System.out.println("N: " + i + " I: " + (i + 1) + " D: " + (i + 1) + " R: 0 M: 0 T: " + (i + 100));
        }
    }
}
