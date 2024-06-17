package Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class TelaMaterial extends JFrame {
    protected JTextField campoTitulo;
    protected JTextField campoAutor;
    protected JButton botaoIncluir;
    protected JTextArea areaListagem;

    public TelaMaterial(String tituloTela) {
        // Configurar a interface da tela, incluindo campos, botões e eventos
    }

    public abstract void incluirMaterial() throws DadosIncompletosException;
    public abstract void atualizarListagem();
}