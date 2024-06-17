package Biblioteca;

public class Revista extends MaterialBibliografico {
    private int numEdicao;

    public Revista(String titulo, String autor, int numEdicao) throws DadosIncompletosException {
        super(titulo, autor);
        this.numEdicao = numEdicao;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
    
    // Getters para o atributo numEdicao
}