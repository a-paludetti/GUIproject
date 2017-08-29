/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author aline.poliveira3
 */
public class Layout {

    public static void main(String[] args) {
        Runnable newThread = new Runnable() {
            public void run() {
                newGUI();
            }
        };

        SwingUtilities.invokeLater(newThread);
    }

    public static void newGUI() {
        JFrame mainframe = new JFrame();
        Dimension minimumSize = new Dimension(750, 550);
        mainframe.setMinimumSize(minimumSize);
        mainframe.setTitle("~*~ P R O G R A M A ~*~");
        mainframe.pack();

        JPanel newPanel = new JPanel();
        newPanel.setLayout(new BorderLayout()); // layout dos botões
        mainframe.getContentPane().add(newPanel);

        JButton button01 = new JButton("Botão 01");
        JButton button02 = new JButton("Botão 02");
        JButton button03 = new JButton("Botão 03");

        newPanel.add(button01, BorderLayout.LINE_START); //posição dos botões
        newPanel.add(button02, BorderLayout.CENTER);
        newPanel.add(button03, BorderLayout.LINE_END);

        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
    }
}
