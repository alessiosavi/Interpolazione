/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interpolazione;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author utente
 */
public class Finestra extends JFrame {
    JPanel fondo = new JPanel();
    JPanel grafico = new JPanel();
    JPanel strumenti = new JPanel();
    JPanel info = new JPanel();
    JTabbedPane contenitore= new JTabbedPane();
    JLabel nPunti = new JLabel("N. Punti");
    JTextField insPunti = new JTextField("0000");
    JLabel nPunti1 = new JLabel("N. Punti");
    JTextField insPunti1 = new JTextField("0000");
    JPanel c1 = new JPanel();
    JPanel c2 = new JPanel();
    
    
    
    public Finestra(){
        
        setSize(400,400);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grafico.setBackground(Color.red);
        strumenti.setBackground(Color.yellow);
        
        fondo.setLayout(new BorderLayout());
        fondo.add(info,BorderLayout.SOUTH);
        fondo.add(strumenti,BorderLayout.WEST);
        fondo.add(grafico,BorderLayout.CENTER);
        
        
        c1.add(nPunti);
        c1.add(insPunti);
        
        c2.add(nPunti1);
        c2.add(insPunti1);
        
        
        strumenti.setLayout(new BoxLayout(strumenti, BoxLayout.Y_AXIS));
        strumenti.add(c1);
        strumenti.add(c2);
        
        contenitore.addTab("Strumenti", strumenti);
        
        
        
        
        
        
        add(fondo);
        setVisible(true);
    }
    
}
