//Santiago Yeomans - A01251000
//Daniel Velázquez - A01636246

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ventanaNumerote extends JFrame implements ActionListener{
	
	private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1;
    private panelNumerote pn; 
    
	public ventanaNumerote() {
		super("Proyecto Parcial");
		//agregar un menu con opciones
		mb=new JMenuBar();
        setJMenuBar(mb);
		menu1=new JMenu("Extras");		
        mb.add(menu1);       
        mi1=new JMenuItem("Créditos");
        menu1.add(mi1);
        mi1.addActionListener(this);
        
        Numerote numerote = new Numerote();
		panelNumerote panel =  new panelNumerote(numerote);
		this.pn = panel;
		this.add(pn);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mi1) {
			JOptionPane.showMessageDialog(null, "Este programa fue creado por: \nSantiago Yeomans y Daniel Vasquez" );
		}	
	}
	
	public static void main(String[] args) {
		ventanaNumerote ventana = new ventanaNumerote();
	}

}
