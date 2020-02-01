package birIslem;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class oyun extends JFrame implements ActionListener{
	

	private String a[]= {"  +","  -","  x","   :"};	
	private Random r=new Random();
	private int i=r.nextInt(20);
	private int b[]= {
			1,9,2,4,3,10,725,
			7,3,5,1,8,100,625,
			2,5,8,5,6,75,710,
			7,4,2,5,6,75,370,
			3,8,4,7,7,100,973,
			2,3,2,3,8,100,133,
			2,7,2,5,8,25,519,
			2,4,1,9,6,100,999,
			3,4,5,9,1,75,507,
			9,6,9,7,5,50,383,
			3,8,3,8,5,50,144,
			1,3,4,4,5,10,443,
			6,7,3,2,6,10,792,
			7,1,9,3,3,25,682,
			8,7,1,3,2,50,665,
			6,2,5,8,4,50,965,
			2,7,8,9,1,50,775,
			9,4,3,9,4,50,283,
			2,9,8,9,3,100,864,
			5,8,3,1,9,100,858,
			7,1,3,9,9,10,769,
			5,1,7,2,7,75,772
};

	private String Cevap[]={
		"10 * 9 = 90\n90 * 4 = 360 \n360 + 1 = 361\n361 * 2 = 722 \n722 + 3 = 725",
		"100 - 8 = 92\n92 - 3 = 89\n89 + 1 = 90\n90 * 7 = 630\n630 - 5 = 625",
		"75 - 8 = 67\n67 - 2 = 65\n65 + 6 = 71\n5 + 5 = 10\n 71 * 10 = 710",
		"75 + 7 = 82\n82 - 6 = 76\n76 - 2 = 74\n74 * 5 = 370",
		"100 + 8 = 108\n108 + 3 = 111\n7 * 8 = 28\n111 + 28 = 139\n139 * 7 = 973",
		"100 - 8 = 92\n92 * 3 = 276\n276 : 2 = 138\n138 - 3 = 135\n135 - 2 = 133",
		"25 + 7 = 32\n32 * 2 = 64\n64 * 8 = 512\n512 + 5 = 517\n517 + 2 = 519",
		"100 - 9 = 91\n6 + 4 = 10\n10 + 1 = 11\n91 * 11 = 1001\n1001 - 2 = 999",
		"75 * 9 = 675\n675 + 1 = 676\n676 * 3 = 2028\n2028 : 4 = 507",
		"9 * 7 = 63\n63 * 6 = 378\n378 + 5 = 383",
		"5 - 3 = 2\n50 - 2 = 48\n48 * 3 = 144",
		"10 + 1 = 11\n4 + 4 = 8\n5 * 8 = 40\n11 * 40 = 440\n440 + 3 = 443",
		"10 + 7 = 17\n17 + 2 = 19\n19 + 3 = 22\n22 * 6 = 132\n132 * 6 =792",
		"25 * 9 = 225\n225 * 3 = 675\n675 + 7 = 682",
		"50 - 3 = 47\n47 * 7 = 329\n329 * 2 = 658\n658 + 8 = 666\n666 - 1 = 665",
		"50 + 6 = 56\n56 + 4 = 60\n60 * 2 = 120\n120 * 8 = 960\n960 + 5 = 965",
		"50 * 8 = 400\n400 - 9 = 391\n391 * 2 = 782\n782 - 7 = 775",
		"50 - 9 = 41\n4 + 3 = 7\n41 * 7 = 287\n287 - 4 = 283",
		"100 + 9 = 109\n109 * 8 = 872\n872 - 9 = 863\n863 - 2 = 861\n861 + 3 = 864",
		"100 * 9 = 900\n900 + 3 = 903\n8 + 1 = 9\n9 * 5 = 45\n903 - 45 = 858",
		"9 * 9 = 81\n81 - 7 = 74\n74 + 3 = 77\n77 * 10 = 770\n770 - 1 = 769",
		"7 * 5 = 35\n75 + 35 = 110\n110 * 7 = 770\n770 + 2 = 772"
};
	private ArrayList<String> sayilar=new ArrayList<String>();
	private int k=7,kalan;
	private JTextField alan1;
	private JComboBox islem;
	private JLabel lbltarget;
	private JLabel lbltarget2;
	private JTextField alan2;
	private ImageIcon btnokres;
	private ImageIcon btngerires;
	private ImageIcon btnonaylares;	
	private ImageIcon btnyenileres;
	private JButton btnok;
	private JButton btngeri;
	private JButton btnsayi1;
	private JButton btnsayi2;
	private JButton btnsayi3;
	private JButton btnsayi4;
	private JButton btnsayi5;
	private JButton btnsayi6;
	private JButton btnyenile;
	private JButton btnonayla;
	private JTextArea alan;
	private JLabel lblkalan;
	private JLabel lblsüre;
	private String output="";
	private int seconds=500;

	
	public oyun() {
	              
		Container cont=getContentPane();
		setTitle("Oyun");
		setSize(500,450);
		setLocationRelativeTo(null);
	    setResizable(false);
	    cont.setLayout(null);
		cont.setBackground(Color.ORANGE);
		lbltarget=new JLabel("HEDEF  :  "+Integer.toString(b[i*k+6]));
		lbltarget.setHorizontalAlignment(lbltarget.CENTER);
		lbltarget.setSize(500,50); 
		lbltarget.setLocation(0,30);
		lbltarget.setBackground(Color.WHITE);
		lbltarget.setOpaque(true);
		lbltarget.setForeground(Color.orange);
		lbltarget.setFont(new Font("Arial",Font.TYPE1_FONT,14));
	    cont.add(lbltarget);
	    lblsüre=new JLabel();
		lblsüre.setSize(500,30); 
		lblsüre.setLocation(0,0);
		lblsüre.setOpaque(true);
	    cont.add(lblsüre);
		alan1=new JTextField();
		alan1.setSize(50, 30);
		alan1.setLocation(103,110);
		alan1.setFont(new Font("Arial",Font.CENTER_BASELINE,13));
		alan1.setHorizontalAlignment(alan1.CENTER);
		alan1.setEnabled(false);
		cont.add(alan1);
		islem=new JComboBox(a);
		islem.setSelectedItem(a[0]);
		islem.setSize(50,30);
		islem.setFont(new Font("Arial",Font.CENTER_BASELINE,14));
		islem.setLocation(163,110);
		cont.add(islem);
		alan2=new JTextField();
		alan2.setSize(50, 30);
		alan2.setFont(new Font("Arial",Font.CENTER_BASELINE,13));
		alan2.setLocation(223,110);
		alan2.setHorizontalAlignment(alan2.CENTER);
		alan2.setEnabled(false);
		cont.add(alan2);
		btnokres=new ImageIcon("C:\\Users\\gencs\\eclipse-workspace\\birIslem\\src\\birIslem\\calculator.png");
		btnok=new JButton();
		btnok.setSize(50,30);
		btnok.setIcon(btnokres);
		btnok.setLocation(283,110);
		cont.add(btnok);
		btngerires=new ImageIcon("C:\\Users\\gencs\\eclipse-workspace\\birIslem\\src\\birIslem\\undo.png");
		btngeri=new JButton();
		btngeri.setSize(50,30);
		btngeri.setIcon(btngerires);
		btngeri.setLocation(343,110);
		cont.add(btngeri);
		btnsayi1=new JButton(Integer.toString(b[i*k+0]));
		btnsayi1.setSize(70,30);
		btnsayi1.setLocation(10,170);
		cont.add(btnsayi1);
		btnsayi2=new JButton(Integer.toString(b[i*k+1]));
		btnsayi2.setSize(70,30);
		btnsayi2.setLocation(90,170);
		cont.add(btnsayi2);
		btnsayi3=new JButton(Integer.toString(b[i*k+2]));
		btnsayi3.setSize(70,30);
		btnsayi3.setLocation(170,170);
		cont.add(btnsayi3);
		btnsayi4=new JButton(Integer.toString(b[i*k+3]));
		btnsayi4.setSize(70,30);
		btnsayi4.setLocation(250,170);
		cont.add(btnsayi4);
		btnsayi5=new JButton(Integer.toString(b[i*k+4]));
		btnsayi5.setSize(70,30);
		btnsayi5.setLocation(330,170);
		cont.add(btnsayi5);
		btnsayi6=new JButton(Integer.toString(b[i*k+5]));
		btnsayi6.setSize(70,30);
		btnsayi6.setLocation(410,170);
		cont.add(btnsayi6);
		btnyenileres=new ImageIcon("C:\\Users\\gencs\\eclipse-workspace\\birIslem\\src\\birIslem\\refresh.png");
		btnyenile=new JButton();
		btnyenile.setSize(70,30);
		btnyenile.setLocation(170,230);
		btnyenile.setIcon(btnyenileres);
		cont.add(btnyenile);
		btnonaylares=new ImageIcon("C:\\Users\\gencs\\eclipse-workspace\\birIslem\\src\\birIslem\\next.png");
		btnonayla=new JButton();
		btnonayla.setSize(70,30);
		btnonayla.setLocation(250,230);
		btnonayla.setIcon(btnonaylares);
		cont.add(btnonayla);
		alan=new JTextArea("\n"+output);
		alan.setSize(500,100);
		alan.setLocation(0,290);
		alan.setBackground(Color.ORANGE);
		alan.setForeground(Color.white);
		alan.setFont(new Font("Arial",Font.BOLD,14));
		alan.setEnabled(false);
		cont.add(alan);
		lblkalan=new JLabel();
		lblkalan.setSize(80,10);
		lblkalan.setLocation(0,30);
		lblkalan.setFont(new Font("Arial",Font.TYPE1_FONT,12));
		lblkalan.setOpaque(true);
		lblkalan.setForeground(Color.orange);
		lblkalan.setBackground(Color.white);
	    cont.add(lblkalan);
	 

        Timer tmer = new Timer();
        TimerTask task = new TimerTask() {

   

            @Override
            public void run() {
            	if(seconds>0) {
              		seconds--;
            		lblsüre.setSize(seconds*1, 30);
            		int i=seconds/2;
            		lblsüre.setBackground(new Color(130,i,i/10));
            		}
            		
            	
            	if(seconds==0) {
            		seconds=-1;
            	    JFrame bilgi=new JFrame("SONUC");
                    bilgi.setSize(285, 139);
                    bilgi.setResizable(false);
        			bilgi.setLocationRelativeTo(null);
        			bilgi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        			bilgi.setVisible(true);
        			JPanel bilgi1=new JPanel();
        			bilgi1.setFont(new Font("Arial",Font.BOLD,13));
        			bilgi1.setBackground(Color.red);
        			bilgi1.setForeground(Color.white);
        			bilgi1.setLayout(null);
        			bilgi1.setSize(285, 139);
        	        JLabel sonuc=new JLabel("Süre Bitti");
        	        sonuc.setFont(new Font("Arial",Font.BOLD,13));
        	        sonuc.setSize(285,30);
        	        sonuc.setHorizontalAlignment(sonuc.CENTER);
        	        sonuc.setLocation(0,10);
        	        sonuc.setForeground(Color.white);
        	        JLabel sonuc1=new JLabel("Kaybettiniz");
        	        sonuc1.setHorizontalAlignment(sonuc1.CENTER);
        	        sonuc1.setFont(new Font("Arial",Font.BOLD,13));
        	        sonuc1.setSize(285,30);
        	        sonuc1.setLocation(0,40);
        	        sonuc1.setForeground(Color.white);
        	    	JButton btncik=new JButton();
        	    	btncik.setSize(110,30);
        	    	btncik.setLocation(20,80);
        	    	btncik.setIcon(btngerires);
        	    	bilgi1.add(btncik);
        	    	JButton btntekrar=new JButton();
        	    	btntekrar.setSize(110,30);
        	    	btntekrar.setLocation(150,80);
        	    	btntekrar.setIcon(btnonaylares);
        	    	bilgi1.add(btntekrar);
        			bilgi1.add(sonuc);
        			bilgi1.add(sonuc1);
        			bilgi.add(bilgi1);
        			bilgi.setVisible(true);
        			btncik.addActionListener(new ActionListener() {

        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					bilgi.setVisible(false);
        					setVisible(false);
        					Container geri=new anasayfa();
        					geri=getContentPane();
        					JFrame y=new JFrame();
        					y.add(geri);
        					y.setVisible(true);
        					
        				}});
        	    	btntekrar.addActionListener(new ActionListener() {

        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					i=r.nextInt(20);
        					bilgi.setVisible(false);
        					setVisible(false);
        					btnsayi1.setEnabled(true);	
        					btnsayi2.setEnabled(true);	
        					btnsayi3.setEnabled(true);	
        					btnsayi4.setEnabled(true);	
        					btnsayi5.setEnabled(true);	
        					btnsayi6.setEnabled(true);	
        					btnsayi1.setText(Integer.toString(b[k*i+0]));
        					btnsayi2.setText(Integer.toString(b[k*i+1]));
        					btnsayi3.setText(Integer.toString(b[k*i+2]));
        					btnsayi4.setText(Integer.toString(b[k*i+3]));
        					btnsayi5.setText(Integer.toString(b[k*i+4]));
        					btnsayi6.setText(Integer.toString(b[k*i+5]));
        					lbltarget.setText("HEDEF  :  "+Integer.toString(b[i*k+6]));
        					lbltarget.setHorizontalAlignment(lbltarget.CENTER);
        					alan1.setText("");
        					alan1.setHorizontalAlignment(alan1.CENTER);
        					alan2.setText("");
        					alan2.setHorizontalAlignment(alan2.CENTER);
        					alan.setText("");
        					alan1.setEnabled(false);
        					alan2.setEnabled(false);
        					alan.setEnabled(false);
        					lblkalan.setText("");
        					sayilar.clear();
        					seconds=500;
        					output ="";
        					setVisible(true);
        					setEnabled(true);
        					
        					
        				}});

            	}
            }
        };
        tmer.schedule(task, 0, 100);
		btnsayi1.addActionListener(this);
		btnsayi2.addActionListener(this);
		btnsayi3.addActionListener(this);
		btnsayi4.addActionListener(this);
		btnsayi5.addActionListener(this);
		btnsayi6.addActionListener(this);
		btnok.addActionListener(this);
		btngeri.addActionListener(this);
		btnyenile.addActionListener(this);
		btnonayla.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args){
		oyun birislem=new oyun();
        

	}

	@Override
	public void actionPerformed(ActionEvent e) {
			String b1=btnsayi1.getText();
			String b2=btnsayi2.getText();
			String b3=btnsayi3.getText();
			String b4=btnsayi4.getText();
			String b5=btnsayi5.getText();
			String b6=btnsayi6.getText();
			if(e.getSource()== btnsayi1) {
				
				if(alan1.getText().equals("")) {
					alan1.setEnabled(true);
					alan1.setText(b1);
					btnsayi1.setText("");
					btnsayi1.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText().equals("")) {
					alan2.setEnabled(true);
					alan2.setText(b1);
					btnsayi1.setText("");
					btnsayi1.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText()!="") {
					alan.setEnabled(true);
					alan.setText("!!!ALANLAR DOLU!!!");
					alan.setForeground(Color.RED);
					
				}
			}
			if(e.getSource()== btnsayi2) {
						
						if(alan1.getText().equals("")) {
							alan1.setEnabled(true);
							alan1.setText(b2);
							btnsayi2.setText("");
							btnsayi2.setEnabled(false);
						}
						else if(alan1.getText()!="" && alan2.getText().equals("")) {
							alan2.setEnabled(true);
							alan2.setText(b2);
							btnsayi2.setText("");
							btnsayi2.setEnabled(false);
						}
						else if(alan1.getText()!="" && alan2.getText()!="") {
							alan.setEnabled(true);
							alan.setText("!!!ALANLAR DOLU!!!");
							alan.setForeground(Color.RED);
						}
					}
			if(e.getSource()== btnsayi3) {
				
				if(alan1.getText().equals("")) {
					alan1.setEnabled(true);
					alan1.setText(b3);
					btnsayi3.setText("");
					btnsayi3.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText().equals("")) {
					alan2.setEnabled(true);
					alan2.setText(b3);
					btnsayi3.setText("");
					btnsayi3.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText()!="") {
					alan.setEnabled(true);
					alan.setText("!!!ALANLAR DOLU!!!");
					alan.setForeground(Color.RED);
				}
			}
			if(e.getSource()== btnsayi4) {
				
				if(alan1.getText().equals("")) {
					alan1.setEnabled(true);
					alan1.setText(b4);
					btnsayi4.setText("");
					btnsayi4.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText().equals("")) {
					alan2.setEnabled(true);
					alan2.setText(b4);
					btnsayi4.setText("");
					btnsayi4.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText()!="") {
					alan.setEnabled(true);
					alan.setText("!!!ALANLAR DOLU!!!");
					alan.setForeground(Color.RED);
				}
			}
			if(e.getSource()== btnsayi5) {
				
				if(alan1.getText().equals("")) {
					alan1.setEnabled(true);
					alan1.setText(b5);
					btnsayi5.setText("");
					btnsayi5.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText().equals("")) {
					alan2.setEnabled(true);
					alan2.setText(b5);
					btnsayi5.setText("");
					btnsayi5.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText()!="") {
					alan.setEnabled(true);
					alan.setText("!!!ALANLAR DOLU!!!");
					alan.setForeground(Color.RED);
				}
			}
			if(e.getSource()== btnsayi6) {
				
				if(alan1.getText().equals("")) {
					alan1.setEnabled(true);
					alan1.setText(b6);
					btnsayi6.setText("");
					btnsayi6.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText().equals("")) {
					alan2.setEnabled(true);
					alan2.setText(b6);
					btnsayi6.setText(null);
					btnsayi6.setEnabled(false);
				}
				else if(alan1.getText()!="" && alan2.getText()!="") {
					alan.setEnabled(true);
					alan.setText("!!!ALANLAR DOLU!!!");
					alan.setForeground(Color.RED);
				}
			} 
			      
		if(e.getSource()==btnok) {	
			       
			      
					if(alan1.getText().equals("") || alan2.getText().equals("")) {
						alan.setEnabled(true);
						alan.setText("!!!ALAN BOÞ!!!");
						alan.setForeground(Color.RED);
			}
					else {
						
					    	int x=Integer.parseInt(alan1.getText());
					    	int y=Integer.parseInt(alan2.getText());
							    	if(islem.getSelectedItem().equals(a[0])) {
											int	topla;
											topla=x+y;
											sayilar.add(Integer.toString(topla));
											alan1.setText("");
											alan1.setEnabled(false);
											alan2.setText("");
											alan2.setEnabled(false);
											alan.setEnabled(true);
											if(btnsayi1.getText().equals("")){
												btnsayi1.setEnabled(true);
												btnsayi1.setText(Integer.toString(topla));
											}
											else {	
												if(btnsayi2.getText().equals("")){
												btnsayi2.setEnabled(true);
												btnsayi2.setText(Integer.toString(topla));
												}
												else {
													if(btnsayi3.getText().equals("")){
														btnsayi3.setEnabled(true);
														btnsayi3.setText(Integer.toString(topla));
													}
													else {
														if(btnsayi4.getText().equals("")){
															btnsayi4.setEnabled(true);
															btnsayi4.setText(Integer.toString(topla));
														}
														else {
															  if(btnsayi5.getText().equals("")){
																	btnsayi5.setEnabled(true);
																	btnsayi5.setText(Integer.toString(topla));
															  }
															  else {
															  if(btnsayi6.getText().equals("")){
																	btnsayi6.setEnabled(true);
																	btnsayi6.setText(Integer.toString(topla));
																	
														      }
															  }
														}
													}
												}
											}
										    output +=x+" + "+y+" = "+Integer.toString(topla)+"\n";
										
										    alan.setForeground(Color.white);
											alan.setText(output);
								
								  }
							    	if(islem.getSelectedItem().equals(a[1])) {
										int	fark;
										if(x>=y) {
											    fark=x-y;
											    sayilar.add(Integer.toString(fark));
												alan1.setText("");
												alan1.setEnabled(false);
												alan2.setText("");
												alan2.setEnabled(false);
												alan.setEnabled(true);
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(Integer.toString(fark));
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(Integer.toString(fark));
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(Integer.toString(fark));
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(Integer.toString(fark));
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(Integer.toString(fark));
																  }
																  else {
																  if(btnsayi6.getText().equals("")){
																		btnsayi6.setEnabled(true);
																		btnsayi6.setText(Integer.toString(fark));
																		
															      }
																  }
															}
														}
													}
												}
											    output +=x+" - "+y+" = "+Integer.toString(fark)+"\n";
											    alan.setForeground(Color.white);
												alan.setText(output);
										}
										else   {
											if(alan1.getText()!="") {
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(alan1.getText());
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(alan1.getText());
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(alan1.getText());
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(alan1.getText());
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(alan1.getText());
																  }
																  else {
																	  if(btnsayi6.getText().equals("")){
																			btnsayi6.setEnabled(true);
																			btnsayi6.setText(alan1.getText());
																			
																      }
																  }
															}
														}
													}
												}
											}
											if(alan2.getText()!="") {
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(alan2.getText());
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(alan2.getText());
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(alan2.getText());
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(alan2.getText());
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(alan2.getText());
																  }
																  else {
																	  if(btnsayi6.getText().equals("")){
																			btnsayi6.setEnabled(true);
																			btnsayi6.setText(alan2.getText());
																			
																      }
																  }
															}
														}
													}
												}
											}
												alan1.setText("");
												alan1.setEnabled(false);
												alan2.setText("");
												alan2.setEnabled(false);
												alan.setEnabled(true);
												alan.setText("!!!Çýkmaz!!!");
												alan.setForeground(Color.red);
										}
								
										}
							    	if(islem.getSelectedItem().equals(a[2])) {
										int	carp;
										if(x!=0 && y!=0) {
											    carp=x*y;
											    sayilar.add(Integer.toString(carp));
												alan1.setText("");
												alan1.setEnabled(false);
												alan2.setText("");
												alan2.setEnabled(false);
												alan.setEnabled(true);
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(Integer.toString(carp));
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(Integer.toString(carp));
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(Integer.toString(carp));
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(Integer.toString(carp));
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(Integer.toString(carp));
																  }
																  else {
																  if(btnsayi6.getText().equals("")){
																		btnsayi6.setEnabled(true);
																		btnsayi6.setText(Integer.toString(carp));
																		
															      }
																  }
															}
														}
													}
												}
											    output +=x+" * "+y+" = "+Integer.toString(carp)+"\n";
											    alan.setForeground(Color.white);
												alan.setText(output);
										}
										else   {
											if(alan1.getText()!="") {
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(alan1.getText());
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(alan1.getText());
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(alan1.getText());
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(alan1.getText());
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(alan1.getText());
																  }
																  else {
																	  if(btnsayi6.getText().equals("")){
																			btnsayi6.setEnabled(true);
																			btnsayi6.setText(alan1.getText());
																			
																      }
																  }
															}
														}
													}
												}
											}
											if(alan2.getText()!="") {
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(alan2.getText());
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(alan2.getText());
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(alan2.getText());
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(alan2.getText());
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(alan2.getText());
																  }
																  else {
																	  if(btnsayi6.getText().equals("")){
																			btnsayi6.setEnabled(true);
																			btnsayi6.setText(alan2.getText());
																			
																      }
																  }
															}
														}
													}
												}
											}
												alan1.setText("");
												alan1.setEnabled(false);
												alan2.setText("");
												alan2.setEnabled(false);
												alan.setEnabled(true);
												alan.setText("!!!Çarpýlmaz!!!");
												alan.setForeground(Color.RED);
										}
										
										}
							    	if(islem.getSelectedItem().equals(a[3])) {
										int	bol;
										if(x>=y && x%y==0) {
											    bol=x/y;
											    sayilar.add(Integer.toString(bol));
												alan1.setText("");
												alan1.setEnabled(false);
												alan2.setText("");
												alan2.setEnabled(false);
												alan.setEnabled(true);
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(Integer.toString(bol));
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(Integer.toString(bol));
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(Integer.toString(bol));
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(Integer.toString(bol));
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(Integer.toString(bol));
																  }
																  else {
																  if(btnsayi6.getText().equals("")){
																		btnsayi6.setEnabled(true);
																		btnsayi6.setText(Integer.toString(bol));
																		
															      }
																  }
															}
														}
													}
												}
											    output +=x+" : "+y+" = "+Integer.toString(bol)+"\n";
											    alan.setForeground(Color.white);
												alan.setText(output);
										}
										else   {
											if(alan1.getText()!="") {
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(alan1.getText());
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(alan1.getText());
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(alan1.getText());
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(alan1.getText());
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(alan1.getText());
																  }
																  else {
																	  if(btnsayi6.getText().equals("")){
																			btnsayi6.setEnabled(true);
																			btnsayi6.setText(alan1.getText());
																			
																      }
																  }
															}
														}
													}
												}
											}
											if(alan2.getText()!="") {
												if(btnsayi1.getText().equals("")){
													btnsayi1.setEnabled(true);
													btnsayi1.setText(alan2.getText());
												}
												else {	
													if(btnsayi2.getText().equals("")){
													btnsayi2.setEnabled(true);
													btnsayi2.setText(alan2.getText());
													}
													else {
														if(btnsayi3.getText().equals("")){
															btnsayi3.setEnabled(true);
															btnsayi3.setText(alan2.getText());
														}
														else {
															if(btnsayi4.getText().equals("")){
																btnsayi4.setEnabled(true);
																btnsayi4.setText(alan2.getText());
															}
															else {
																  if(btnsayi5.getText().equals("")){
																		btnsayi5.setEnabled(true);
																		btnsayi5.setText(alan2.getText());
																  }
																  else {
																	  if(btnsayi6.getText().equals("")){
																			btnsayi6.setEnabled(true);
																			btnsayi6.setText(alan2.getText());
																			
																      }
																  }
															}
														}
													}
												}
											}
												alan1.setText("");
												alan1.setEnabled(false);
												alan2.setText("");
												alan2.setEnabled(false);
												alan.setEnabled(true);
												alan.setText("!!!Bolunmez!!!");
												alan.setForeground(Color.RED);
										}
										
										}
							    	for(String d:sayilar) {
										 kalan=b[k*i+6]-Integer.parseInt(d);
										lblkalan.setText("Kalan : "+Integer.toString(kalan));
									}
							
							  }
				
					
					}
		if(e.getSource()==btngeri) {
			if(alan1.getText()!="" && alan2.getText().equals("")) {
				if(btnsayi1.getText().equals("")){
					btnsayi1.setEnabled(true);
					btnsayi1.setText(alan1.getText());
				}
				else {	
					if(btnsayi2.getText().equals("")){
					btnsayi2.setEnabled(true);
					btnsayi2.setText(alan1.getText());
					}
					else {
						if(btnsayi3.getText().equals("")){
							btnsayi3.setEnabled(true);
							btnsayi3.setText(alan1.getText());
						}
						else {
							if(btnsayi4.getText().equals("")){
								btnsayi4.setEnabled(true);
								btnsayi4.setText(alan1.getText());
							}
							else {
								  if(btnsayi5.getText().equals("")){
										btnsayi5.setEnabled(true);
										btnsayi5.setText(alan1.getText());
								  }
								  else {
									  if(btnsayi6.getText().equals("")){
											btnsayi6.setEnabled(true);
											btnsayi6.setText(alan1.getText());
											
								      }
								  }
							}
						}
					}
				}
				alan1.setText("");
				alan1.setEnabled(false);
			}
			
			else if(alan1.getText()!="" && alan2.getText()!="") {
				if(btnsayi1.getText().equals("")){
					btnsayi1.setEnabled(true);
					btnsayi1.setText(alan1.getText());
				}
				else {	
					if(btnsayi2.getText().equals("")){
					btnsayi2.setEnabled(true);
					btnsayi2.setText(alan1.getText());
					}
					else {
						if(btnsayi3.getText().equals("")){
							btnsayi3.setEnabled(true);
							btnsayi3.setText(alan1.getText());
						}
						else {
							if(btnsayi4.getText().equals("")){
								btnsayi4.setEnabled(true);
								btnsayi4.setText(alan1.getText());
							}
							else {
								  if(btnsayi5.getText().equals("")){
										btnsayi5.setEnabled(true);
										btnsayi5.setText(alan1.getText());
								  }
								  else {
									  if(btnsayi6.getText().equals("")){
											btnsayi6.setEnabled(true);
											btnsayi6.setText(alan1.getText());
											
								      }
								  }
							}
						}
					}
				}
				if(btnsayi1.getText().equals("")){
					btnsayi1.setEnabled(true);
					btnsayi1.setText(alan2.getText());
				}
				else {	
					if(btnsayi2.getText().equals("")){
					btnsayi2.setEnabled(true);
					btnsayi2.setText(alan2.getText());
					}
					else {
						if(btnsayi3.getText().equals("")){
							btnsayi3.setEnabled(true);
							btnsayi3.setText(alan2.getText());
						}
						else {
							if(btnsayi4.getText().equals("")){
								btnsayi4.setEnabled(true);
								btnsayi4.setText(alan2.getText());
							}
							else {
								  if(btnsayi5.getText().equals("")){
										btnsayi5.setEnabled(true);
										btnsayi5.setText(alan2.getText());
								  }
								  else {
									  if(btnsayi6.getText().equals("")){
											btnsayi6.setEnabled(true);
											btnsayi6.setText(alan2.getText());
											
								      }
								  }
							}
						}
					}
				}
				alan1.setText("");
				alan1.setEnabled(false);
				alan2.setText("");
				alan2.setEnabled(false);
			}
			else {
				alan.setEnabled(true);
				alan.setText("!!!ALAN BOÞ!!!");
				alan.setForeground(Color.RED);
		}
		}
		if(e.getSource()==btnyenile) {
			
				btnsayi1.setEnabled(true);	
				btnsayi2.setEnabled(true);	
				btnsayi3.setEnabled(true);	
				btnsayi4.setEnabled(true);	
				btnsayi5.setEnabled(true);	
				btnsayi6.setEnabled(true);	
				btnsayi1.setText(Integer.toString(b[k*i+0]));
				btnsayi2.setText(Integer.toString(b[k*i+1]));
				btnsayi3.setText(Integer.toString(b[k*i+2]));
				btnsayi4.setText(Integer.toString(b[k*i+3]));
				btnsayi5.setText(Integer.toString(b[k*i+4]));
				btnsayi6.setText(Integer.toString(b[k*i+5]));
				lbltarget.setText("HEDEF  :  "+Integer.toString(b[i*k+6]));
				lbltarget.setHorizontalAlignment(lbltarget.CENTER);
				alan1.setText("");
				alan1.setHorizontalAlignment(alan1.CENTER);
				alan2.setText("");
				alan2.setHorizontalAlignment(alan2.CENTER);
				alan.setText("");
				alan1.setEnabled(false);
				alan2.setEnabled(false);
				alan.setEnabled(false);
				lblkalan.setText("");
				sayilar.clear();
				output ="";
	
		}
		if(e.getSource()==btnonayla) {
			if(sayilar.size()==0) {
				
			}
			else {
			setEnabled(false);
			seconds=-1;
			Dimension z=lblsüre.getSize();
			int s=z.width;
			s=50-(s/10);
	        JFrame bilgi=new JFrame("SONUC");
            bilgi.setSize(285, 228);
            bilgi.setResizable(false);
			bilgi.setLocationRelativeTo(null);
			bilgi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			bilgi.setVisible(true);
			JPanel bilgi1=new JPanel();
			bilgi1.setFont(new Font("Arial",Font.ITALIC,13));
			bilgi1.setBackground(Color.GREEN);
			bilgi1.setForeground(Color.white);
			bilgi1.setLayout(null);
			bilgi1.setSize(285, 208);
			JTextArea islemler=new JTextArea();
			islemler.setSize(150, 90);
			islemler.setFont(new Font("Arial",Font.BOLD,11));
			islemler.setText("YOU"+"\n"+output);
			islemler.setBackground(Color.green);
			islemler.setForeground(Color.white);
			islemler.setAlignmentX(50);;
			JTextArea islemler2=new JTextArea();
			islemler2.setSize(150, 90);
			islemler2.setLocation(150,0);
			islemler2.setFont(new Font("Arial",Font.BOLD,11));
			islemler2.setText("CPU\n"+Cevap[i]);
            islemler2.setForeground(Color.white);
	        JLabel sonuc=new JLabel("");
	        sonuc.setSize(300,30);
	        sonuc.setLocation(0,90);
	        sonuc.setForeground(Color.white);
	        JLabel süre=new JLabel("");
	        süre.setSize(300,30);
	        süre.setLocation(0,110);
	        süre.setForeground(Color.white);
	    	JButton btncik=new JButton();
	    	btncik.setSize(110,30);
	    	btncik.setLocation(20,150);
	    	btncik.setIcon(btngerires);
	    	bilgi1.add(btncik);
	    	JButton btntekrar=new JButton();
	    	btntekrar.setSize(110,30);
	    	btntekrar.setLocation(150,150);
	    	btntekrar.setIcon(btnonaylares);
	    	bilgi1.add(btntekrar);
            bilgi1.add(islemler2);
	        bilgi1.add(islemler);
			bilgi1.add(sonuc);
			bilgi1.add(süre);
			bilgi.add(bilgi1);
		    
			for(String x : sayilar) {
				if(Integer.parseInt(x)==b[k*i+6]){
					islemler.setBackground(Color.green);
					islemler2.setBackground(Color.green);
					bilgi1.setBackground(Color.green);
					sonuc.setText("Kazandýnýz");
					süre.setText("Geçen Süre : "+s+" saniye");
				}
				else {
					islemler.setBackground(Color.red);
					islemler2.setBackground(Color.red);
					bilgi1.setBackground(Color.RED);
					sonuc.setText("Kaybettiniz");
					süre.setText("Geçen Süre : "+s+" saniye");
				}
				
			}
			btncik.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					bilgi.setVisible(false);
					setVisible(false);
					Container geri=new anasayfa();
					geri=getContentPane();
					JFrame y=new JFrame();
					y.add(geri);
					y.setVisible(true);
					
				}});
	    	btntekrar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					i=r.nextInt(20);
					bilgi.setVisible(false);
					setVisible(false);
					btnsayi1.setEnabled(true);	
					btnsayi2.setEnabled(true);	
					btnsayi3.setEnabled(true);	
					btnsayi4.setEnabled(true);	
					btnsayi5.setEnabled(true);	
					btnsayi6.setEnabled(true);	
					btnsayi1.setText(Integer.toString(b[k*i+0]));
					btnsayi2.setText(Integer.toString(b[k*i+1]));
					btnsayi3.setText(Integer.toString(b[k*i+2]));
					btnsayi4.setText(Integer.toString(b[k*i+3]));
					btnsayi5.setText(Integer.toString(b[k*i+4]));
					btnsayi6.setText(Integer.toString(b[k*i+5]));
					lbltarget.setText(" HEDEF  :  "+Integer.toString(b[i*k+6]));
					lbltarget.setHorizontalAlignment(lbltarget.CENTER);
					alan1.setText("");
					alan2.setText("");
					alan.setText("");
					alan1.setHorizontalAlignment(alan1.CENTER);
					alan1.setEnabled(false);
					alan2.setHorizontalAlignment(alan2.CENTER);
					alan2.setEnabled(false);
					alan.setEnabled(false);
					lblkalan.setText("");
					sayilar.clear();
					seconds=500;
					output ="";
					setVisible(true);
					setEnabled(true);
					
					
				}});

		}
		}

				}
		
	}


	

	
	


