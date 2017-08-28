/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp03;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author aline.poliveira3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable thread = new Runnable() { //nova thread 
            public void run() {
                criarGUI();
            }
        };

        SwingUtilities.invokeLater(thread); //rodar GUI em paralelo com o Main

    }

    public static void criarGUI() {
        JFrame frame = new JFrame(); //tela
        Dimension d = new Dimension(750, 550); //tamanho minino da tela
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar programa ao sair
        frame.setTitle("~programa~");
        frame.pack();

        JPanel painel = new JPanel(); //criando painel
        frame.getContentPane().add(painel); //adicionando o painel ao GUI

        JRadioButton botao01 = new JRadioButton("Opção 01"); //botao
        JRadioButton botao02 = new JRadioButton("Opção 02"); //botao

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(botao01); //adicionando os botoes ao agrupamento de botoes
        buttonGroup.add(botao02);

        painel.add(botao01); //adicionando os botoes ao GUI
        painel.add(botao02);

        ActionListener listener = new ActionListener() { //JOptonPane falando qual ação esta acontecendo
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção 01: " + botao01.isSelected() + //boolean qual botão esta selecionado
                        "\nOpção 02: "+botao02.isSelected());
            }
        };

        botao01.addActionListener(listener);
        botao02.addActionListener(listener);

        frame.setVisible(true);
    }

}
