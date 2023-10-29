
package pagina;

public class Ram {
    Pagina[] paginas;

    public Ram(int tamanho) {
        paginas = new Pagina[tamanho];
    }

    public boolean contemPagina(int instrucao) {
        for (Pagina pagina : paginas) {
            if (pagina != null && pagina.instrucao == instrucao) {
                return true;
            }
        }
        return false;
    }

    public void resetarBitsDeReferencia() {
        for (Pagina pagina : paginas) {
            if (pagina != null) {
                pagina.bitReferencia = 0;
            }
        }
    }
}
