package pack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

@SuppressWarnings("serial")
public class KBC extends JFrame {
        private JPanel jPanel1 = new JPanel();
	private JLabel jLabel2 = new JLabel();
        private JLabel jLabel1 = new JLabel();
	  private JLabel jLabel3 = new JLabel();
	  private JLabel jLabel6 = new JLabel();
	  private JLabel jLabel7 = new JLabel();
	  @SuppressWarnings("unused")
	private ButtonGroup jButtonGroup1 = new ButtonGroup();
	  private JRadioButton jRadioButton1 = new JRadioButton();
	  private JRadioButton jRadioButton2 = new JRadioButton();
	  private JRadioButton jRadioButton3 = new JRadioButton();
	  private JRadioButton jRadioButton4 = new JRadioButton();
	  private JButton jButton2 = new JButton();
	  private JButton jButton1 = new JButton();
          private JButton exit = new JButton();
	  
	  private JTextArea jTextArea1 = new JTextArea("");
	  private JTextArea jTextArea2 = new JTextArea("");
	  private JTextField jTextField1 = new JTextField();
	  private JTextField jTextField2 = new JTextField();
	  private JTextField jTextField3 = new JTextField();
	  private JTextField jTextField4 = new JTextField();
	  private JTextField jTextField5 = new JTextField();
	  private JTextField jTextField6 = new JTextField();
	  private JTextField jTextField7 = new JTextField();
	  private JTextField jTextField8 = new JTextField();
	  private JTextField jTextField9 = new JTextField();
	  private JTextField jTextField10 = new JTextField();
	
	  private int timescounter=0;
	  private int questioncounter=0;
	  Random zerototwo=new Random();
	  
	  public KBC() {
		    JFrame cp = new JFrame();
                    
		    

		    cp.setBounds(0, 0, 1350,768);
		    cp.setBackground(new Color(34,43,69));
                 
                    jPanel1.setBounds(0,0,1350,768);
                    jPanel1.setBackground(new Color(34,43,69));
                    
                    
		    
		    jLabel2.setBounds(8, 8, 791, 57);
		    jLabel2.setText("Welcome to Kaun Banega Crorepati");
		    jLabel2.setFont(new Font("Monotype Corsiva", Font.BOLD + Font.ITALIC, 39));
		    jLabel2.setForeground(Color.YELLOW);
		    
		    cp.add(jLabel2);
		    jRadioButton1.setBounds(24, 272, 617, 57);
		    jRadioButton1.setText("Trivendra Singh Rawat");
		    jRadioButton1.setFont(new Font("Calibri", Font.BOLD, 17));
		    cp.add(jRadioButton1);
		    jRadioButton2.setBounds(656, 272, 425, 57);
		    jRadioButton2.setText("Yogi Adityanath");//Correct
		    jRadioButton2.setFont(new Font("Calibri", Font.BOLD, 17));
		    cp.add(jRadioButton2);
		    jRadioButton3.setBounds(24, 344, 617, 65);
		    jRadioButton3.setText("Virbhadra Singh");
		    jRadioButton3.setFont(new Font("MS Sans Serif", Font.BOLD, 17));
		    cp.add(jRadioButton3);
		    jRadioButton4.setBounds(656, 344, 425, 65);
		    jRadioButton4.setText("N Biren Singh");
		    jRadioButton4.setFont(new Font("MS Sans Serif", Font.BOLD, 17));
		    cp.add(jRadioButton4);
		    ButtonGroup g = new ButtonGroup();
		    g.add(jRadioButton1);
		    g.add(jRadioButton2);
		    g.add(jRadioButton3);
		    g.add(jRadioButton4);
		    jLabel3.setBounds(24, 72, 100, 20);
		    jLabel3.setText("Lifeline:");
		    jLabel3.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
		    jLabel3.setForeground(Color.YELLOW);
		    cp.add(jLabel3);
		    jButton2.setBounds(96, 72, 259, 25);
		    jButton2.setText("50/50 (three times usable)");
                    exit.setBounds(500, 600, 259, 25);
		    exit.setText("Exit");
                    exit.setVisible(false);
                    
                    exit.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		    	  Menu m = new Menu();
                            Menu.main(null);
                            cp.dispose();
                            
                          
		      }
		    });
                    cp.add(exit);
		    jButton2.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		    	  jButton2_ActionPerformed(evt);
		      }
		    });
		    jButton2.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
		    cp.add(jButton2);
		    jLabel6.setBounds(320, 464, 608, 37);
		    jLabel6.setText("Congratulations! You are a Crorepati!");
		    jLabel6.setFont(new Font("MS Sans Serif", Font.BOLD, 27));
		    jLabel6.setForeground(Color.CYAN);
		    jLabel6.setVisible(false);
		    cp.add(jLabel6);
		    jLabel7.setBounds(328, 464, 661, 37);
		    jLabel7.setText("Wrong Answer. Try Again In A New Game !");
		    jLabel7.setFont(new Font("MS Sans Serif", Font.BOLD, 27));
		    jLabel7.setForeground(Color.CYAN);
		    jLabel7.setVisible(false);
		    cp.add(jLabel7);
		    jTextArea1.setBounds(16, 128, 1049, 135);
		    jTextArea1.setText("Q1 Who am I? Ajay is my original first name. I was first elected to the lok sabha at the young age of 26.\n I became the CM of a state in 2017.");//Q1
		    jTextArea1.setEditable(false);
                    jTextArea1.setBackground(new Color(34,43,69));
		    //jTextArea1.setBackground(Color.BLUE);
		    jTextArea1.setFont(new Font("MS Sans Serif", Font.BOLD, 21));
		    jTextArea1.setForeground(Color.YELLOW);
		    cp.add(jTextArea1);
		    
		    //Money Tree
		    jTextField1.setBounds(1096, 550, 200, 50);
		    jTextField1.setText("                     5,000");
		    jTextField1.setEditable(false);
		    jTextField1.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField1.setForeground(Color.YELLOW);
		    jTextField1.setBackground(new Color(0xFF0080));
		    cp.add(jTextField1);
		    jTextField2.setBounds(1096, 500, 200, 50);
		    jTextField2.setText("                   10,000");
		    jTextField2.setEditable(false);
		    jTextField2.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField2.setForeground(Color.YELLOW);
		    jTextField2.setBackground(new Color(0x8000FF));
		    cp.add(jTextField2);
		    jTextField3.setBounds(1096, 450, 200, 50);
		    jTextField3.setText("                   20,000");
		    jTextField3.setEditable(false);
		    jTextField3.setBackground(new Color(0x8000FF));
		    jTextField3.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField3.setForeground(Color.YELLOW);
		    cp.add(jTextField3);
		    jTextField4.setBounds(1096, 400, 200, 50);
		    jTextField4.setText("                   80,000");
		    jTextField4.setEditable(false);
		    jTextField4.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField4.setForeground(Color.YELLOW);
		    jTextField4.setBackground(new Color(0x8000FF));
		    cp.add(jTextField4);
		    jTextField5.setBounds(1096, 350, 200, 50);
		    jTextField5.setText("                 1,60,000");
		    jTextField5.setEditable(false);
		    jTextField5.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField5.setForeground(Color.YELLOW);
		    jTextField5.setBackground(new Color(0x8000FF));
		    cp.add(jTextField5);
		    jTextField6.setBounds(1096, 300, 200, 50);
		    jTextField6.setText("                  3,20,000");
		    jTextField6.setEditable(false);
		    jTextField6.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField6.setForeground(Color.YELLOW);
		    jTextField6.setBackground(new Color(0x8000FF));
		    cp.add(jTextField6);
		    jTextField7.setBounds(1096, 250, 200, 50);
		    jTextField7.setText("                 12,50,000");
		    jTextField7.setEditable(false);
		    jTextField7.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField7.setForeground(Color.YELLOW);
		    jTextField7.setBackground(new Color(0x8000FF));
		    cp.add(jTextField7);
		    jTextField8.setBounds(1096, 200, 200, 50);
		    jTextField8.setText("                 25,00,000");
		    jTextField8.setEditable(false);
		    jTextField8.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField8.setForeground(Color.YELLOW);
		    jTextField8.setBackground(new Color(0x8000FF));
		    cp.add(jTextField8);
		    jTextField9.setBounds(1096, 150, 200, 50);
		    jTextField9.setText("                 50,00,000");
		    jTextField9.setEditable(false);
		    jTextField9.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField9.setForeground(Color.YELLOW);
		    jTextField9.setBackground(new Color(0x8000FF));
		    cp.add(jTextField9);
		    jTextField10.setBounds(1096, 100, 200, 50);
		    jTextField10.setText("               1,00,00,000");
		    jTextField10.setEditable(false);
		    jTextField10.setFont(new Font("MS Sans Serif", Font.BOLD, 13));
		    jTextField10.setForeground(Color.YELLOW);
		    jTextField10.setBackground(new Color(0x8000FF));
		    cp.add(jTextField10);
		    jButton1.setBounds(496, 424, 291, 25);
		    jButton1.setText("Lock");
		    jButton1.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		        jButton1_ActionPerformed(evt);
		      }
		    });
		    jButton1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 17));
		    cp.add(jButton1);
                    
		    jRadioButton1.setBackground(new Color(34,43,69));
		    //jRadioButton1.setBackground(Color.BLUE);
		    jRadioButton2.setBackground(new Color(34,43,69));
                    //jRadioButton2.setBackground(Color.BLUE);
                    jRadioButton3.setBackground(new Color(34,43,69));
		    //jRadioButton3.setBackground(Color.BLUE);
                    jRadioButton4.setBackground(new Color(34,43,69));
		    //jRadioButton4.setBackground(Color.BLUE);
		    jRadioButton1.setForeground(Color.YELLOW);
		    jRadioButton2.setForeground(Color.YELLOW);
		    jRadioButton3.setForeground(Color.YELLOW);
		    jRadioButton4.setForeground(Color.YELLOW);
                    
                    cp.add(jPanel1);
                    cp.setLayout(null);
                    cp.setVisible(true);
                    
                    
                    
               WindowListener frameClose=new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we){
			
                            Menu.main(null);
                            setVisible(false);
                            
		}
               
	};
    
        cp.addWindowListener(frameClose);
         
	  }
	  public String getSelectedRadioButton(ButtonGroup bg) {
		    for (java.util.Enumeration<AbstractButton> e = bg.getElements(); e.hasMoreElements();) {
		      AbstractButton b = e.nextElement();
		      if (b.isSelected()) return b.getText();
		    }
		    return null;
		  }
	  
	  public void jButton2_ActionPerformed(ActionEvent evt) {
		  timescounter++;

		    if (timescounter==1)  { jButton2.setText("50/50 (two times usable)");}
		    if (timescounter==2)  { jButton2.setText("50/50 (one time usable)");}
		    if (timescounter==3)  { jButton2.setVisible(false); }
		    if (questioncounter==0) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton3.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton3.setVisible(false); jRadioButton4.setVisible(false);}    }
		    if (questioncounter==1) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton2.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton3.setVisible(false);}if(num==2) {jRadioButton2.setVisible(false); jRadioButton3.setVisible(false);}    }
		    if (questioncounter==2) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton2.setVisible(false); jRadioButton3.setVisible(false);}if(num==1) {jRadioButton2.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton3.setVisible(false); jRadioButton4.setVisible(false);}    }
		    if (questioncounter==3) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton2.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton2.setVisible(false); jRadioButton4.setVisible(false);}    }
		    if (questioncounter==4) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton2.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton2.setVisible(false); jRadioButton4.setVisible(false);}    }
		    if (questioncounter==5) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton2.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton3.setVisible(false);}if(num==2) {jRadioButton2.setVisible(false); jRadioButton3.setVisible(false);}    }
		    if (questioncounter==6) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton2.setVisible(false); jRadioButton3.setVisible(false);}if(num==1) {jRadioButton2.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton3.setVisible(false); jRadioButton4.setVisible(false);}    }
		    if (questioncounter==7) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton2.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton3.setVisible(false);}if(num==2) {jRadioButton2.setVisible(false); jRadioButton3.setVisible(false);}    }
		    if (questioncounter==8) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton2.setVisible(false); jRadioButton3.setVisible(false);}if(num==1) {jRadioButton2.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton3.setVisible(false); jRadioButton4.setVisible(false);}    }
		    if (questioncounter==9) {jButton2.setVisible(false); int num = zerototwo.nextInt(3); if(num==0) {jRadioButton1.setVisible(false); jRadioButton3.setVisible(false);}if(num==1) {jRadioButton1.setVisible(false); jRadioButton4.setVisible(false);}if(num==2) {jRadioButton3.setVisible(false); jRadioButton4.setVisible(false);}    }

		    
		  }
	  public void jButton1_ActionPerformed(ActionEvent evt)
	  {
		  questioncounter++;
		    
		  if (questioncounter==1)
		  {
		        if (jRadioButton2.isSelected()==true)
		        {


		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField1.setBackground(new Color(0x8000FF));
		          jTextField2.setBackground(new Color(0xFF0080));
		          
		          //Q2
		          jTextArea1.setText("Q2 Which of these countries withdrew from Paris Climate Accord in June 2017 ?");
		          jRadioButton1.setText("India");
		          jRadioButton2.setText("China");
		          jRadioButton3.setText("North Korea");
		          jRadioButton4.setText("USA");//Correct
		         }
		        else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }


		  
		  if (questioncounter==2)
		  {
		        if (jRadioButton4.isSelected()==true)
		        {
		        	if (timescounter<3){
		        		jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField2.setBackground(new Color(0x8000FF));
		          jTextField3.setBackground(new Color(0xFF0080));
		          
		          //Q3
		          jTextArea1.setText("Q3 Arrange these words so that they form the title of Salman Khan Film.\nA.Ratan\nB.Prem\nC.Payo\nD.Dhan");
		          jRadioButton1.setText("BADC");//Correct
		          jRadioButton2.setText("ABCD");
		          jRadioButton3.setText("CBDA");
		          jRadioButton4.setText("BDCA");
		         }
		        else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }

		  if (questioncounter==3)
		  {
		        if (jRadioButton1.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField3.setBackground(new Color(0x8000FF));
		          jTextField4.setBackground(new Color(0xFF0080));
		          
		          //Q4
		          jTextArea1.setText("Q4 Complete this mystery question, '___ ne Baahubali ko kyun maara?', \nin connection with the film 'Baahubali: The Beginning'.");
		          jRadioButton1.setText("Kalakeya");
		          jRadioButton2.setText("Bijjaladeva");
		          jRadioButton3.setText("Katappa");//Correct
		          jRadioButton4.setText("Bhallaladeva");
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  if (questioncounter==4)
		  {
		        if (jRadioButton3.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField4.setBackground(new Color(0x8000FF));
		          jTextField5.setBackground(new Color(0xFF0080));
		          
		          //Q5
		          jTextArea1.setText("Q5 According to the Ramayana, which son of Vishwakarma built the bridge to Lanka?");
		          jRadioButton1.setText("Ajaikapat");
		          jRadioButton2.setText("Nahusha");
		          jRadioButton3.setText("Nala");//Correct
		          jRadioButton4.setText("Dvividha");
		         }
		  }
		  if (questioncounter==5)
		  {
		        if (jRadioButton3.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField5.setBackground(new Color(0x8000FF));
		          jTextField6.setBackground(new Color(0xFF0080));
		          
		          //Q6
		          jTextArea1.setText("Q6 Which of these is a metal which, in its pure form, is silvery white in appearance?");
		          jRadioButton1.setText("Bauxite");
		          jRadioButton2.setText("Copper");
		          jRadioButton3.setText("Graphite");
		          jRadioButton4.setText("Tin");//Correct
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  if (questioncounter==6)
		  {
		        if (jRadioButton4.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField6.setBackground(new Color(0x8000FF));
		          jTextField7.setBackground(new Color(0xFF0080));
		          
		          //Q7
		          jTextArea1.setText("Q7 Which tennis player holds the record of most number of men's \nsingles Wimbledon titles?");
		          jRadioButton1.setText("Roger Federer");//Correct
		          jRadioButton2.setText("Pete Sampras");
		          jRadioButton3.setText("Rafael Nadal");
		          jRadioButton4.setText("Novak Djokovic");
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  if (questioncounter==7)
		  {
		        if (jRadioButton1.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField7.setBackground(new Color(0x8000FF));
		          jTextField8.setBackground(new Color(0xFF0080));
		          
		          //Q8
		          jTextArea1.setText("Q8 Which of the following hormones is also called the 'love hormone'?");
		          jRadioButton1.setText("Testosterone");
		          jRadioButton2.setText("Progesterone");
		          jRadioButton3.setText("Insulin");
		          jRadioButton4.setText("Oxytocin");//Correct
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  if (questioncounter==8)
		  {
		        if (jRadioButton4.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField8.setBackground(new Color(0x8000FF));
		          jTextField9.setBackground(new Color(0xFF0080));
		          
		          //Q9
		          jTextArea1.setText("Q9 Which 21-year-old became the first gold medalist for Singapore \nby beating Michael Phelps in the 2016 Rio Oympics 100 m butterfly \nswimming event?");
		          jRadioButton1.setText("Joseph Schooling");//Correct
		          jRadioButton2.setText("Chad Le Clos");
		          jRadioButton3.setText("Laszlo Cseh");
		          jRadioButton4.setText("Kosuke Hangino");
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  if (questioncounter==9)
		  {
		        if (jRadioButton1.isSelected()==true)
		        {
		        	if (timescounter<3){
				          jButton2.setVisible(true);}
		          jRadioButton1.setVisible(true);
		          jRadioButton2.setVisible(true);
		          jRadioButton3.setVisible(true);
		          jRadioButton4.setVisible(true);
		          jTextField9.setBackground(new Color(0x8000FF));
		          jTextField10.setBackground(new Color(0xFF0080));
		          
		          //Q10
		          jTextArea1.setText("Q10 Which of these is a man made object in the universe that is farthest \nfrom the Earth?");
		          jRadioButton1.setText("Cassini");
		          jRadioButton2.setText("Voyager 1");//Correct
		          jRadioButton3.setText("Pioneer 10");
		          jRadioButton4.setText("New Horizons");
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  if (questioncounter==10)
		  {
		        if (jRadioButton2.isSelected()==true)
		        {
		           jLabel6.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }

		         else

		         {
		           jLabel7.setVisible(true);
		           jTextArea2.setVisible(true);
		           jButton1.setVisible(false);
		           jButton2.setVisible(false);
                           exit.setVisible(true);
		         }
		  }
		  }
          
          
          

          public static void main(String [] args)
          {
              new KBC();
          }
              

}
