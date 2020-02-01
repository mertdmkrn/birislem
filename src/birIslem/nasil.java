package birIslem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class nasil extends JFrame{
	private String a[]= {"  +","  -","  x","   :"};	
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
	private JLabel lblkalan;
	private JLabel lblalan;
	private JLabel lblsayi1;
	private JLabel lblsayi2;
	private JLabel lblsec;
	private JLabel lblhesapla;
	private JLabel lblbosalt;
	private JLabel lblyenile;
	private JLabel lblonay;
    private int seconds=35;

public nasil() {
	Container cont=getContentPane();
	setTitle("Nasýl Oynanýr?");
	setSize(500,450);
	setLocationRelativeTo(null);
    setResizable(false);
    cont.setLayout(null);
	cont.setBackground(Color.ORANGE);
	lbltarget=new JLabel("HEDEF  :  772");
	lbltarget.setHorizontalAlignment(lbltarget.CENTER);
	lbltarget.setSize(500,50); 
	lbltarget.setLocation(0,30);
	lbltarget.setBackground(Color.WHITE);
	lbltarget.setOpaque(true);
	lbltarget.setForeground(Color.orange);
	lbltarget.setFont(new Font("Arial",Font.TYPE1_FONT,14));
	cont.add(lbltarget);
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
	lblsec=new JLabel();
	lblsec.setFont(new Font("Arial",Font.TYPE1_FONT,10));
	lblsec.setForeground(Color.WHITE);
	lblsec.setSize(70,20);
	lblsec.setLocation(163,90);
    cont.add(lblsec);
	lblsayi1=new JLabel();
	lblsayi1.setFont(new Font("Arial",Font.TYPE1_FONT,10));
	lblsayi1.setForeground(Color.WHITE);
	lblsayi1.setSize(70,20);
	lblsayi1.setLocation(113,90);
    cont.add(lblsayi1);
    lblsayi2=new JLabel();
	lblsayi2.setFont(new Font("Arial",Font.TYPE1_FONT,10));
	lblsayi2.setForeground(Color.WHITE);
	lblsayi2.setSize(70,20);
	lblsayi2.setLocation(233,90);
    cont.add(lblsayi2);
    lblhesapla=new JLabel();
	lblhesapla.setFont(new Font("Arial",Font.TYPE1_FONT,10));
	lblhesapla.setForeground(Color.WHITE);
	lblhesapla.setSize(70,20);
	lblhesapla.setLocation(288,90);
    cont.add(lblhesapla);
    lblbosalt=new JLabel();
	lblbosalt.setFont(new Font("Arial",Font.TYPE1_FONT,10));
	lblbosalt.setForeground(Color.WHITE);
	lblbosalt.setSize(70,20);
	lblbosalt.setLocation(340,90);
    cont.add(lblbosalt);
    lblyenile=new JLabel();
  	lblyenile.setFont(new Font("Arial",Font.TYPE1_FONT,11));
  	lblyenile.setForeground(Color.WHITE);
  	lblyenile.setSize(70,20);
  	lblyenile.setLocation(190,210);
    cont.add(lblyenile);
    lblonay=new JLabel();
   	lblonay.setFont(new Font("Arial",Font.TYPE1_FONT,11));
   	lblonay.setForeground(Color.WHITE);
   	lblonay.setSize(70,20);
   	lblonay.setLocation(267,210);
     cont.add(lblonay);
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
	btnsayi1=new JButton("5");
	btnsayi1.setSize(70,30);
	btnsayi1.setLocation(10,170);
	cont.add(btnsayi1);
	btnsayi2=new JButton("8");
	btnsayi2.setSize(70,30);
	btnsayi2.setLocation(90,170);
	cont.add(btnsayi2);
	btnsayi3=new JButton("7");
	btnsayi3.setSize(70,30);
	btnsayi3.setLocation(170,170);
	cont.add(btnsayi3);
	btnsayi4=new JButton("2");
	btnsayi4.setSize(70,30);
	btnsayi4.setLocation(250,170);
	cont.add(btnsayi4);
	btnsayi5=new JButton("7");
	btnsayi5.setSize(70,30);
	btnsayi5.setLocation(330,170);
	cont.add(btnsayi5);
	btnsayi6=new JButton("75");
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
	lblkalan=new JLabel();
	lblkalan.setSize(80,10);
	lblkalan.setLocation(0,30);
	lblkalan.setFont(new Font("Arial",Font.TYPE1_FONT,12));
	lblkalan.setOpaque(true);
	lblkalan.setForeground(Color.orange);
	lblkalan.setBackground(Color.white);
    cont.add(lblkalan);
    lblalan=new JLabel();
    lblalan.setSize(500,50);
	lblalan.setLocation(0,290);
	lblalan.setForeground(Color.white);
	lblalan.setFont(new Font("Arial",Font.BOLD,14));
	lblalan.setHorizontalAlignment(lblalan.CENTER);
    cont.add(lblalan);

	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
    Timer tmer = new Timer();
    TimerTask task = new TimerTask() {



        @Override
        public void run() {
        	if(seconds>0) {
          		seconds--;
          
          		  if(seconds==33)
          			 lblalan.setText("Amacýmýz");
          		  if(seconds==32)
              		  lblalan.setText("Amacýmýz buttonlardaki");
          		  if(seconds==31)
            		  lblalan.setText("Amacýmýz buttonlardaki sayýlarla");
          		  if(seconds==30)
          			  lblalan.setText("Amacýmýz buttonlardaki sayýlarla hedefe");
          		  if(seconds==29)
          			  lblalan.setText("Amacýmýz buttonlardaki sayýlarla hedefe ulaþmak.");
          		  if(seconds==28) 
          			  lblalan.setText("1.sayýyý seç");
          		  if(seconds==27)
            		  btnsayi1.doClick();
          		  if(seconds==26) {
          			  btnsayi1.setEnabled(false);
          			  btnsayi1.setText("");
          			  alan1.setEnabled(true);
          			  alan1.setText("5");
          			  lblsayi1.setText("1.Sayý");
          			  
          		  }
          		  if(seconds==25) {
          			lblalan.setText("Ýþlemi Seç");
          			lblsayi1.setText("");
          			
          		  }
          		  if(seconds==24) {
	          		lblsec.setText("Ýþlemi Seç");
	      			islem.setSelectedIndex(3);
      			 }
          		  if(seconds==22) 
          			  lblalan.setText("2.sayýyý seç");
          		  if(seconds==21)
          			  btnsayi2.doClick();
    		  
          		  if(seconds==20) {
          			 
            			alan2.setText("8");
            			alan2.setEnabled(true);
            			btnsayi2.setEnabled(false);
            			btnsayi2.setText("");
            			lblsec.setText("");
            			lblsayi2.setText("2.sayý");
            	
            		  }
          		  if(seconds==19) {
          			  lblalan.setText("Eðer sayilarý yanlýþ seçtiysen");
          			  lblsayi2.setText("");
          		  }
          		  if(seconds==18) 
          			  lblbosalt.setText("Alan Bosalt");
          		  if(seconds==17)
          			  btngeri.doClick();
          		  
          		  if(seconds==16) {
          			 lblbosalt.setText("");
          			 lblalan.setText("");
          			 alan1.setText("");
          			 alan2.setText("");
          			 alan1.setEnabled(false);
          			 alan2.setEnabled(false);
          			 btnsayi1.setText("5");
          			 btnsayi2.setText("8");
          			 btnsayi1.setEnabled(true);
          			 btnsayi2.setEnabled(true);
          		  }
          		  if(seconds==15) {
          			 alan1.setText("5");
          			 alan2.setText("8");
          			 alan1.setEnabled(true);
          			 alan2.setEnabled(true);
          			 btnsayi1.setText("");
          			 btnsayi2.setText("");
          			 btnsayi1.setEnabled(false);
          			 btnsayi2.setEnabled(false);
          			 lblalan.setText("Eðer her þey yolunda ise");
          		  }
          		  if(seconds==14) 
          			  lblhesapla.setText("Hesapla");
          		  if(seconds==13)
          			  btnok.doClick();
          		  
          		  if(seconds==12) {
          			
          			 lblalan.setText("5 * 8 = 40");
          			 alan1.setText("");
          			 alan2.setText("");
          			 alan1.setEnabled(false);
          			 alan2.setEnabled(false);
          			 btnsayi1.setText("40");
                     btnsayi1.setEnabled(true);
          		  }
          		  if(seconds==11) {
          			 lblhesapla.setText("");
          			 lblalan.setText("Eðer en baþa dönmek istiyorsan");
          		  }
          		  if(seconds==10) 
          			 lblyenile.setText("Yenile");
          		  if(seconds==9)
         			  btnyenile.doClick();
          		  
          		  if(seconds==8) {
          			 lblbosalt.setText("");
          			 lblalan.setText("");
          			 lblyenile.setText("");
          			 alan1.setText("");
          			 alan2.setText("");
          			 alan1.setEnabled(false);
          			 alan2.setEnabled(false);
          			 btnsayi1.setText("5");
          			 btnsayi2.setText("8");
          			 btnsayi1.setEnabled(true);
          			 btnsayi2.setEnabled(true);
          		  }
          		  if(seconds==7) {
          			 lblalan.setText("Eðer herþeyi tamamladýn ve hedefe ulaþtýysan");
          		  }
          		  if(seconds==6) 
          		 	 lblonay.setText("Onayla");
          		  if(seconds==5)
         			  btnonayla.doClick();
          		  if(seconds==3) {
          			lblonay.setText("");
          			lblalan.setText("Tabi bunlarý yapman icin 50 saniyen var");
          		  }
          		  if(seconds==2)
          			lblalan.setText("Baþarýlar");
        		}
        	if(seconds==0) {
        		seconds=-1;
        		setVisible(false);
 			    setDefaultCloseOperation(EXIT_ON_CLOSE);
 				Container c=new anasayfa();
 				c=getContentPane();
 				JFrame f=new JFrame();
 				f.add(c);
 				f.setVisible(true);
        	}
    	}
    
    };
    tmer.schedule(task, 0, 1000);
}
	public static void main(String[] args){
		nasil birislem=new nasil();
    

	}
}
