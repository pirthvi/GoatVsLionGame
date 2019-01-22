import javax.swing.*;

import java.awt.event.*;
class GoatVsLion
{		int v=0,a=0,g=0,ch=0,c=0,j=7,k=0;
		Icon gi;
		int kill;
		JFrame f = new JFrame();
		ImageIcon one = new ImageIcon("hh.jpg");
		ImageIcon two = new ImageIcon("hh.jpg");
		ImageIcon three = new ImageIcon("hh.jpg");
		ImageIcon four = new ImageIcon("hh.jpg");
		ImageIcon five = new ImageIcon("hh.jpg");
		ImageIcon sex = new ImageIcon("hh.jpg");
		ImageIcon seven = new ImageIcon("hh.jpg");
		ImageIcon i = new ImageIcon("hh.jpg");
		ImageIcon i3 = new ImageIcon("l1.jpg");
		ImageIcon i4 = new ImageIcon("l2.jpg");
		ImageIcon i5 = new ImageIcon("l3.jpg");
		ImageIcon i6 = new ImageIcon("g1.jpg");
		ImageIcon i7 = new ImageIcon("g2.jpg");
		ImageIcon i8 = new ImageIcon("bg.png");
		ImageIcon i9 = new ImageIcon("llg.png");
		ImageIcon i10 = new ImageIcon("gk.png");
		ImageIcon i11 = new ImageIcon("button_v-s.png");
		ImageIcon i12 = new ImageIcon("sander-wehkamp-675234-unsplash.jpg");
		ImageIcon p = new ImageIcon("button.png");
		ImageIcon p1 = new ImageIcon("button1.png");
		ImageIcon p2 = new ImageIcon("button2.png");
		ImageIcon p3 = new ImageIcon("button3.png");
		ImageIcon p4 = new ImageIcon("button4.png");
		ImageIcon p5 = new ImageIcon("button5.png");
		ImageIcon p6 = new ImageIcon("button6.png");
		ImageIcon p7 = new ImageIcon("button7.png");
		
		JLabel l = new JLabel(i);
		JLabel l1 = new JLabel(i3);
		JLabel l2 = new JLabel(i4);
		JLabel l3 = new JLabel(i5);
		JLabel l4 = new JLabel(i6);
		JLabel l5 = new JLabel(i7);
		JLabel l6 = new JLabel(i11);
		JLabel gleft = new JLabel(i8);  //l7 = goatLeft   l8 = goatKilled l9= total goat
	
		JLabel Lleft = new JLabel(i9);
		JLabel gkilled = new JLabel(i10);
		JLabel gtotal= new JLabel(p7);
		JLabel lionleft = new JLabel(p2);
		JLabel goatkilled = new JLabel(p);
		
		//JLabel t1= new JLabel(p1);
	/*	JLabel t2= new JLabel(p1);
		JLabel t3= new JLabel(p1);
		JLabel t4= new JLabel(p1);
		JLabel t5= new JLabel(p1);
		JLabel t6= new JLabel(p1);
		JLabel t7= new JLabel(p1);
		JLabel t8= new JLabel(p1);*/
		
		
		ImageIcon i1 = new ImageIcon("objL.png");
		ImageIcon i2 = new ImageIcon("objGG.png");
		ImageIcon emp = new ImageIcon("emp.jpg");
		
		
		JLabel b1 = new JLabel(emp);
        JLabel b2 = new JLabel(emp);
		JLabel b3 = new JLabel(emp);
		JLabel b4 = new JLabel(emp);
		JLabel b5 = new JLabel(emp);
		JLabel b6 = new JLabel(emp);
		JLabel b7 = new JLabel(emp);
		JLabel b8 = new JLabel(emp);
		JLabel b9 = new JLabel(emp);
		JLabel b10 = new JLabel(emp);
		
				
        void mm(){
		f.setSize(700,700);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setTitle("Goat V/s Lion");
		f.setIconImage(i12.getImage());
		l.setBounds(0,20,700,700);
		//Font f = new Font("Arial",Font.PLAIN,40);
		l1.setBounds(0,0,i3.getIconWidth(),i3.getIconHeight());
		l2.setBounds(150,1,i4.getIconWidth(),i4.getIconHeight());
		//l3.setBounds(300,0,i5.getIconWidth(),i5.getIconHeight());
		l4.setBounds(535,0,i6.getIconWidth(),i6.getIconHeight());
		l5.setBounds(400,0,i7.getIconWidth(),i7.getIconHeight());
		l6.setBounds(325,30,50,50);
		//l6.setFont(f);
		b1.setBounds(345,125,i2.getIconWidth(),i2.getIconHeight());
		b2.setBounds(345,290,i2.getIconWidth(),i2.getIconHeight());
		b3.setBounds(445,295,i2.getIconWidth(),i2.getIconHeight());
		b4.setBounds(250,290,i2.getIconWidth(),i2.getIconHeight());
		b5.setBounds(165,440,i2.getIconWidth(),i2.getIconHeight());
		b6.setBounds(340,440,i2.getIconWidth(),i2.getIconHeight());
		b7.setBounds(525,440,i2.getIconWidth(),i2.getIconHeight());
		b8.setBounds(90,575,i2.getIconWidth(),i2.getIconHeight());
		b9.setBounds(340,575,i2.getIconWidth(),i2.getIconHeight());
		b10.setBounds(595,575,i2.getIconWidth(),i2.getIconHeight());
		gleft.setBounds(1,100,110,50);
		Lleft.setBounds(1,150,110,50);
		gkilled.setBounds(1,200,110,50);
		gtotal.setBounds(140,100,50,50);
		lionleft.setBounds(140,150,50,50);
		goatkilled.setBounds(140,200,50,50);
		f.add(l1);
		f.add(l2);
		//f.add(l3);
		f.add(l5);
		f.add(l4);
		f.add(l6);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		l.add(b6);
		l.add(b7);
		l.add(b8);
		l.add(b9);
		l.add(b10);
		l.add(gleft);
		l.add(gtotal);
		l.add(lionleft);
		l.add(Lleft);
		l.add(gkilled);
		l.add(goatkilled);
		f.add(l);
	 	
	
	b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
				
            }
        });
		b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
				
            }
        });
b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
				
            }
        });
		b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
				
            }
        });
		b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
				
            }
        });
		b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
				
            }
        });
		b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
				
            }
        });
		b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
				
            }
        });
		b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
				
            }
        });
		b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b10MouseClicked(evt);
				
            }
        });
		
  }  

  void b1MouseClicked(java.awt.event.MouseEvent evt) {   
 
switch(v){
							case 0:
							
									if((c<2)&&(b1.getIcon()==emp)){
									b1.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b1.getIcon()==i1){
									a=1;
									v=0;			
									}
									else if((a==2)&&(b1.getIcon()==emp)){
									b1.setIcon(i1);
									b2.setIcon(emp);
									v=1;
									a=0;
									
									}
									else if((a==3)&&(b1.getIcon()==emp)){
									b1.setIcon(i1);
									b3.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==4)&&(b1.getIcon()==emp)){
									b1.setIcon(i1);
									b4.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==6)&&(b1.getIcon()==emp)&&(b2.getIcon()==i2)){
									b1.setIcon(i1);
									b2.setIcon(emp);
									b6.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									else if((a==5)&&(b1.getIcon()==emp)&&(b4.getIcon()==i2)){
									b1.setIcon(i1);
									b4.setIcon(emp);
									b5.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									else if((a==7)&&(b1.getIcon()==emp)&&(b3.getIcon()==i2)){
									b1.setIcon(i1);
									b3.setIcon(emp);
									b7.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									
									
									break;
	
							case 1:
									if((g<7)&&(b1.getIcon()==emp)){
										b1.setIcon(i2);
										g++;
										j=7-g;
										//gtotal.setText(""+j);
									check(j);
										v=0;
										
										break;}
									else if((b1.getIcon()==i2)){
									a=1;
									v=1;
								    }
									else if((a==2)&&(b1.getIcon()==emp)){
									b1.setIcon(i2);
									b2.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==3)&&(b1.getIcon()==emp)){
									b1.setIcon(i2);
									b3.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==4)&&(b1.getIcon()==emp)){
									b1.setIcon(i2);
									b4.setIcon(emp);
									v=0;
									a=0;
									}
									
									break;
									} 
									}
	void b2MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b2.getIcon()==emp)){
									b2.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b2.getIcon()==i1){
									a=2;
									v=0;			
									}
									else if((a==1)&&(b2.getIcon()==emp)){
									b2.setIcon(i1);
									b1.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==3)&&(b2.getIcon()==emp)){
									b2.setIcon(i1);
									b3.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==4)&&(b2.getIcon()==emp)){
									b2.setIcon(i1);
									b4.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==6)&&(b2.getIcon()==emp)){
									b2.setIcon(i1);
									b6.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==9)&&(b2.getIcon()==emp)&&(b6.getIcon()==i2)){
									b2.setIcon(i1);
									b6.setIcon(emp);
									b9.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									
									}
									
									break;
	
							case 1:
									if((g<7)&&(b2.getIcon()==emp)){
										b2.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b2.getIcon()==i2)){
										a=2;
										v=1;		
									}
									else if((a==1)&&(b2.getIcon()==emp)){
									b2.setIcon(i2);
									b1.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==3)&&(b2.getIcon()==emp)){
									b2.setIcon(i2);
									b3.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==4)&&(b2.getIcon()==emp)){
									b2.setIcon(i2);
									b4.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==6)&&(b2.getIcon()==emp)){
									b2.setIcon(i2);
									b6.setIcon(emp);
									v=0;
									a=0;
									}
									
									break;
									}
	
	
	}
	void b3MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b3.getIcon()==emp)){
									b3.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b3.getIcon()==i1){
									a=3;
									v=0;			
									}
									else if((a==1)&&(b3.getIcon()==emp)){
									b3.setIcon(i1);
									b1.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==2)&&(b3.getIcon()==emp)){
									b3.setIcon(i1);
									b2.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==7)&&(b3.getIcon()==emp)){
									b3.setIcon(i1);
									b7.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==4)&&(b3.getIcon()==emp)&&(b2.getIcon()==i2)){
									b4.setIcon(emp);
									b2.setIcon(emp);
									b3.setIcon(i1);
									a=0;
									v=1;
									kill++;
									gkk(kill);
									}
									else if((a==10)&&(b3.getIcon()==emp)&&(b7.getIcon()==i2)){
									b3.setIcon(i1);
									b7.setIcon(emp);
									b10.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									
									break;
	
							case 1:
									if((g<7)&&(b3.getIcon()==emp)){
										b3.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b3.getIcon()==i2)){
										a=3;
										v=1;		
										}
									else if((a==1)&&(b3.getIcon()==emp)){
									b3.setIcon(i2);
									b1.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==2)&&(b3.getIcon()==emp)){
									b3.setIcon(i2);
									b2.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==7)&&(b3.getIcon()==emp)){
									b3.setIcon(i2);
									b7.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}
	
	}
	void b4MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b4.getIcon()==emp)){
									b4.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b4.getIcon()==i1){
									a=4;
									v=0;			
									}
									else if((a==1)&&(b4.getIcon()==emp)){
									b4.setIcon(i1);
									b1.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==2)&&(b4.getIcon()==emp)){
									b4.setIcon(i1);
									b2.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==5)&&(b4.getIcon()==emp)){
									b4.setIcon(i1);
									b5.setIcon(emp);
									v=1;a=0;
									}
									
									else if((a==3)&&(b4.getIcon()==emp)&&(b2.getIcon()==i2)){
									b4.setIcon(i1);
									b2.setIcon(emp);
									b3.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									else if((a==8)&&(b4.getIcon()==emp)&&(b5.getIcon()==i2)){
									b4.setIcon(i1);
									b5.setIcon(emp);
									b8.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									
									
									break;
	
							case 1:
									if((g<7)&&(b4.getIcon()==emp)){
										b4.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b4.getIcon()==i2)){
											a=4;
											v=1;		
									}
									else if((a==1)&&(b4.getIcon()==emp)){
									b4.setIcon(i2);
									b1.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==2)&&(b4.getIcon()==emp)){
									b4.setIcon(i2);
									b2.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==5)&&(b4.getIcon()==emp)){
									b4.setIcon(i2);
									b5.setIcon(emp);
									v=0;
									a=0;
									}
									
									else if((a==5)&&(b4.getIcon()==emp)){
									b4.setIcon(i2);
									b5.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}
	}
	void b5MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b5.getIcon()==emp)){
									b5.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b5.getIcon()==i1){
									a=5;
									v=0;			
									}
									else if((a==4)&&(b5.getIcon()==emp)){
									b5.setIcon(i1);
									b4.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==6)&&(b5.getIcon()==emp)){
									b5.setIcon(i1);
									b6.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==8)&&(b5.getIcon()==emp)){
									b5.setIcon(i1);
									b8.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==1)&&(b5.getIcon()==emp)&&(b4.getIcon()==i2)){
									b4.setIcon(emp);
									b1.setIcon(emp);
									b5.setIcon(i1);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									else if((a==7)&&(b5.getIcon()==emp)&&(b6.getIcon()==i2)){
									b5.setIcon(i1);
									b6.setIcon(emp);
									b7.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									break;
	
							case 1:
									if((g<7)&&(b5.getIcon()==emp)){
										b5.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b5.getIcon()==i2)){
										a=5;
										v=1;		
										}
										else if((a==4)&&(b5.getIcon()==emp)){
									b5.setIcon(i2);
									b4.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==6)&&(b5.getIcon()==emp)){
									b5.setIcon(i2);
									b6.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==8)&&(b5.getIcon()==emp)){
									b5.setIcon(i2);
									b8.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}
	
	}
	void b6MouseClicked(java.awt.event.MouseEvent evt) { 
	
	switch(v){
							case 0:
									if((c<2)&&(b6.getIcon()==emp)){
									b6.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b6.getIcon()==i1){
									a=6;
									v=0;			
									}
									else if((a==2)&&(b6.getIcon()==emp)){
									b6.setIcon(i1);
									b2.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==5)&&(b6.getIcon()==emp)){
									b6.setIcon(i1);
									b5.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==7)&&(b6.getIcon()==emp)){
									b6.setIcon(i1);
									b7.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==9)&&(b6.getIcon()==emp)){
									b6.setIcon(i1);
									b9.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==1)&&(b6.getIcon()==emp)&&(b2.getIcon()==i2)){
									b2.setIcon(emp);
									b1.setIcon(emp);
									b6.setIcon(i1);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									
									}
									
									break;
	
							case 1:
									if((g<7)&&(b6.getIcon()==emp)){
										b6.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b6.getIcon()==i2)){
										a=6;
										v=1;		
									}
									else if((a==2)&&(b6.getIcon()==emp)){
									b6.setIcon(i2);
									b2.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==5)&&(b6.getIcon()==emp)){
									b6.setIcon(i2);
									b5.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==7)&&(b6.getIcon()==emp)){
									b6.setIcon(i2);
									b7.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==9)&&(b6.getIcon()==emp)){
									b6.setIcon(i2);
									b9.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}
	}
	void b7MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b7.getIcon()==emp)){
									b7.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b7.getIcon()==i1){
									a=7;
									v=0;			
									}
									else if((a==3)&&(b7.getIcon()==emp)){
									b7.setIcon(i1);
									b3.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==10)&&(b7.getIcon()==emp)){
									b7.setIcon(i1);
									b10.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==6)&&(b7.getIcon()==emp)){
									b7.setIcon(i1);
									b6.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==1)&&(b7.getIcon()==emp)&&(b3.getIcon()==i2)){
									b3.setIcon(emp);
									b1.setIcon(emp);
									b7.setIcon(i1);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									else if((a==5)&&(b7.getIcon()==emp)&&(b6.getIcon()==i2)){
									b7.setIcon(i1);
									b6.setIcon(emp);
									b5.setIcon(emp);
									a=0;
									v=0;
									kill++;}
									
							
									
									
									
									break;
	
							case 1:
									if((g<7)&&(b7.getIcon()==emp)){
										b7.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b7.getIcon()==i2)){
										a=7;
										v=1;	}
									else if((a==3)&&(b7.getIcon()==emp)){
									b7.setIcon(i2);
									b3.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==10)&&(b7.getIcon()==emp)){
									b7.setIcon(i2);
									b10.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==6)&&(b7.getIcon()==emp)){
									b7.setIcon(i2);
									b6.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}
	
	}
	void b8MouseClicked(java.awt.event.MouseEvent evt) { 
	
	switch(v){
							case 0:
									if((c<2)&&(b8.getIcon()==emp)){
									b8.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b8.getIcon()==i1){
									a=8;
									v=0;			
									}
									else if((a==5)&&(b8.getIcon()==emp)){
									b8.setIcon(i1);
									b5.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==9)&&(b8.getIcon()==emp)){
									b8.setIcon(i1);
									b9.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==4)&&(b8.getIcon()==emp)&&(b5.getIcon()==i2)){
									b4.setIcon(emp);
									b5.setIcon(emp);
									b8.setIcon(i1);
									a=0;
									v=1;
									kill++;
									gkk(kill);
									}
									else if((a==10)&&(b8.getIcon()==emp)&&(b9.getIcon()==i2)){
									b8.setIcon(i1);
									b10.setIcon(emp);
									b9.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									
									break;
	
							case 1:
									if((g<7)&&(b8.getIcon()==emp)){
										b8.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b8.getIcon()==i2)){
										a=8;
										v=1;		
									}
									else if((a==5)&&(b8.getIcon()==emp)){
									b8.setIcon(i2);
									b5.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==9)&&(b8.getIcon()==emp)){
									b8.setIcon(i2);
									b9.setIcon(emp);
									v=0;
									a=0;
									}
									
									break;
									}
	
	
	}
	void b9MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b9.getIcon()==emp)){
									b9.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b9.getIcon()==i1){
									a=9;
									v=0;			
									}
									else if((a==8)&&(b9.getIcon()==emp)){
									b9.setIcon(i1);
									b8.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==10)&&(b9.getIcon()==emp)){
									b9.setIcon(i1);
									b10.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==6)&&(b9.getIcon()==emp)){
									b9.setIcon(i1);
									b6.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==2)&&(b9.getIcon()==emp)&&(b6.getIcon()==i2)){
									b2.setIcon(emp);
									b6.setIcon(emp);
									b9.setIcon(i1);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									break;
	
							case 1:
									if((g<7)&&(b9.getIcon()==emp)){
										b9.setIcon(i2);
										g++;
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b9.getIcon()==i2)){
									a=9;	
									v=1;		
									}
									else if((a==8)&&(b9.getIcon()==emp)){
									b9.setIcon(i2);
									b8.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==10)&&(b9.getIcon()==emp)){
									b9.setIcon(i2);
									b10.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==6)&&(b9.getIcon()==emp)){
									b9.setIcon(i2);
									b6.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}
	
	}
	void b10MouseClicked(java.awt.event.MouseEvent evt) { 
	switch(v){
							case 0:
									if((c<2)&&(b10.getIcon()==emp)){
									b10.setIcon(i1);
									c++;
									v=1;
									if(c==1){
									lionleft.setIcon(p1);
									}
									else if(c==2){
									lionleft.setIcon(p);
									}
									return;
									}
									else if(b10.getIcon()==i1){
									a=10;
									v=0;			
									}
									else if((a==9)&&(b10.getIcon()==emp)){
									b10.setIcon(i1);
									b9.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==7)&&(b10.getIcon()==emp)){
									b10.setIcon(i1);
									b7.setIcon(emp);
									v=1;
									a=0;
									}
									else if((a==3)&&(b10.getIcon()==emp)&&(b6.getIcon()==i2)){
									b7.setIcon(emp);
									b3.setIcon(emp);
									b10.setIcon(i1);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									
									else if((a==8)&&(b10.getIcon()==emp)&&(b9.getIcon()==i2)){
									b10.setIcon(i1);
									b9.setIcon(emp);
									b8.setIcon(emp);
									v=1;
									a=0;
									kill++;
									gkk(kill);
									}
									break;
	
							case 1:
									if((g<7)&&(b10.getIcon()==emp)){
										b10.setIcon(i2);
										g++;
										
										j=7-g;
										check(j);
										//gtotal.setText(""+j);
										v=0;
										
										break;}
									else if((b10.getIcon()==i2)){
										a=10;
										v=1;		
									}
										else if(b10.getIcon()==i1){
									a=10;
									v=0;			
									}
									else if((a==9)&&(b10.getIcon()==emp)){
									b10.setIcon(i2);
									b9.setIcon(emp);
									v=0;
									a=0;
									}
									else if((a==7)&&(b10.getIcon()==emp)){
									b10.setIcon(i2);
									b7.setIcon(emp);
									v=0;
									a=0;
									}
									break;
									}}
void check(int m){
switch(m){
	//case 0:
		//		gtotal.setIcon(p);
				
	case 1:
				gtotal.setIcon(p1);
	break;
	case 2:
	gtotal.setIcon(p2);
	break;
	case 3:
	gtotal.setIcon(p3);
	break;
	case 4:
	gtotal.setIcon(p4);
	break;
	case 5:
	gtotal.setIcon(p5);
	break;
	case 6:
	gtotal.setIcon(p6);
	break;
	default:
	gtotal.setIcon(p);
	break;
	

	}}
void gkk(int kill){
	switch(kill){
	case 1:
				goatkilled.setIcon(p1);
	break;
	case 2:
	goatkilled.setIcon(p2);
	break;
	case 3:
	goatkilled.setIcon(p3);
	break;
	case 4:
	goatkilled.setIcon(p4);
	break;
	case 5:
	goatkilled.setIcon(p5);
	break;
	case 6:
	goatkilled.setIcon(p6);
	break;

}
}
	
	
	
        
    
 
 public static void main(String [] args){
 new GoatVsLion().mm();
 
 }
}
