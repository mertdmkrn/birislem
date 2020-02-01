package birIslem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class anasayfa extends JFrame implements ActionListener{
     
	private JLabel lblbaslik;
	private JButton btnbasla;
	private JButton btnnasil;
	private JLabel lblkim;
	
	public anasayfa() {
		
		Container cont=getContentPane();
		setTitle("ANASAYFA");
		setSize(500,400);
		setLocationRelativeTo(null);
	    setResizable(false);
        cont.setLayout(null);
		cont.setBackground(Color.ORANGE);
		lblbaslik=new JLabel("BÝR ÝÞLEM OYUNU");
		lblbaslik.setHorizontalAlignment(lblbaslik.CENTER);
		lblbaslik.setSize(500,55);
		lblbaslik.setLocation(0,50);
		lblbaslik.setBackground(Color.WHITE);
		lblbaslik.setOpaque(true);
		lblbaslik.setForeground(Color.orange);
		lblbaslik.setFont(new Font("Arial",Font.BOLD,16));
	    cont.add(lblbaslik);
		btnbasla=new JButton("Basla");
		btnbasla.setSize(150,35);
		btnbasla.setLocation(175,130);
		cont.add(btnbasla);
		btnnasil=new JButton("Nasýl Oynanýr?");
		btnnasil.setSize(150,35);
		btnnasil.setLocation(175,190);
		cont.add(btnnasil);
		lblkim=new JLabel("Copyright by Mert Demirkýran");
		lblkim.setSize(500,55);
		lblkim.setHorizontalAlignment(lblkim.CENTER);
		lblkim.setLocation(0, 225);
		lblkim.setForeground(Color.white);
		lblkim.setFont(new Font("Arial",Font.BOLD,12));
		cont.add(lblkim);
		btnbasla.addActionListener(this);
		btnnasil.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


	public static void main(String[] args) {
		anasayfa nesne = new anasayfa();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnbasla) {
			    setVisible(false);
			    setDefaultCloseOperation(EXIT_ON_CLOSE);
				Container x=new oyun();
				x=getContentPane();
				JFrame y=new JFrame();
				y.add(x);
				y.setVisible(true);
		}
		if(e.getSource()==btnnasil) {
			 setVisible(false);
			  setDefaultCloseOperation(EXIT_ON_CLOSE);
				Container c=new nasil();
				c=getContentPane();
				JFrame f=new JFrame();
				f.add(c);
				f.setVisible(true);
		}
		
		
			
	}}

