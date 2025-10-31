
package br.com.engenheirodesoftwarenoespaco.projetoswingfaculdade;

import javax.swing.*;
import java.awt.*;

// Nome de classe mais simples
public class TelaBasica extends JFrame {

    public TelaBasica() {
        // 1. Configurar Janela
        setTitle("Formulário Simples"); // Define o título
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sai ao fechar

        // 2. Configurar o layout
        setLayout(new FlowLayout()); // FlowLayout padrao

        // --- 1. JComboBox ---
        String[] itens = {"Opção 1", "Opção 2", "Opção 3", "Opção 4"};
        JComboBox lista = new JComboBox(itens); // Não usa Genéricos (<String>)
        add(lista);

        // --- 2. JCheckBox ---
        JCheckBox caixa = new JCheckBox("Ativar Feature");
        add(caixa);

        // --- 3. JTextField ---
        JTextField campo = new JTextField(15); // Campo de texto com 15 colunas
        add(campo);

        // --- 4. Dois Botões ---
        JButton botao1 = new JButton("Salvar Dados");
        add(botao1);

        JButton botao2 = new JButton("Sair do Sistema");
        add(botao2);

        // Configurações de tamanho (usando setSize como pedido)
        setSize(400, 200); // Define o tamanho da janela
        setLocationRelativeTo(null); // Centraliza
        setVisible(true); // Exibe a tela
    }

    // O método main de um novato geralmente chama o construtor diretamente
    public static void main(String[] args) {
        new TelaBasica();
    }
}