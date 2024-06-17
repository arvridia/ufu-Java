package Biblioteca;

public class Livro extends MaterialBibliografico {
    private int numPaginas;

    public Livro(String titulo, String autor, int numPaginas) throws DadosIncompletosException {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public String getTipo() {
        return "Livro";
    }
    
    // Getters para o atributo numPaginas
}

