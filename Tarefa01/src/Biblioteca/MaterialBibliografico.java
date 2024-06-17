package Biblioteca;

public abstract class MaterialBibliografico {
    protected String titulo;
    protected String autor;

    public MaterialBibliografico(String titulo, String autor) throws DadosIncompletosException {
        if (titulo.isEmpty() || autor.isEmpty()) {
            throw new DadosIncompletosException("Dados incompletos ao criar material bibliográfico.");
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String getTipo();
    
    // Getters para os atributos (titulo, autor)
}