package com.gainjava.knowledge;
import java .awt.event.ActionEvent;
import java .awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class OnlineTest extends JFrame implements ActionListener{
	
	//here i will create JLabel,JRadioButton JButton on JFrame
JLabel label;
 JRadioButton radioButton[]=new JRadioButton[5];
JButton btnNext,btnBookmark;
ButtonGroup bg;
int count =0, current=0, x=1,y=1,now=0;
int m[]=new int[10];
OnlineTest(String message) {
super();
label=new JLabel();
add(label);
bg=new ButtonGroup();
for(int i=0;i<5;i++) {
	radioButton[i] =new JRadioButton();
	add(radioButton[i]);
	bg.add(radioButton[i]);
}
btnNext=new JButton("Next");
btnBookmark=new JButton("Bookmark");
btnNext.addActionListener(this);
btnBookmark.addActionListener(this);
add(btnNext);
add(btnBookmark);
set();
label.setBounds(30,40,450,20);
radioButton[0].setBounds(50,80,100,20);
radioButton[1].setBounds(50,110,100,20);
radioButton[0].setBounds(50,140,100,20);
radioButton[0].setBounds(50,170,100,20);

btnNext.setBounds(100,240,100,30);
btnBookmark.setBounds(270,240,100,30);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
setLocation(250,100);
setVisible(true);
setSize(600,350);
}
void set() {
	radioButton[4].setSelected(true);
	if(current==0) {
		label.setText("QUE1:NAME OF PRIME MINISTER?");
		radioButton[0].setText("modi");
		radioButton[1].setText("najrul");
		radioButton[2].setText("ambani");
		radioButton[3].setText("tata");
	}
	if(current==1) {
		label.setText("que2:NAME OF CHIF MINISTER");
		radioButton[0].setText("mamata");
		radioButton[1].setText("madan");
		radioButton[2].setText("firhadh");
		radioButton[3].setText("avisek");
	}
	if(current==2) {
		label.setText("QUE3:NAME OF FIRST PRIME MINISTER?");
		radioButton[0].setText("MODI");
		radioButton[1].setText("NEHERU");
		radioButton[2].setText("ADBANI");
		radioButton[3].setText("BAJPEI");
	}
	if(current==3) {
		label.setText("QUE4:NAME OF EDUCATION MINISTER?");
		radioButton[0].setText("BRATTO");
		radioButton[1].setText("MITRA");
		radioButton[2].setText("AMBANI");
		radioButton[3].setText("tata");
	}
	if(current==4) {
		label.setText("QUE5:PRESENT SABHA" );
		radioButton[0].setText("14LOK SABHA");
		radioButton[1].setText("15LOKSABHA");
		radioButton[2].setText("16LOKSABHA");
		radioButton[3].setText("17LOK");
	}	
	if(current==5) {
		label.setText("QUE6:NAME OF PRIME MINISTER?");
		radioButton[0].setText("modi");
		radioButton[1].setText("najrul");
		radioButton[2].setText("ambani");
		radioButton[3].setText("tata");
	}
	if(current==6) {
		label.setText("QUE7:AGE LIMIT");
		radioButton[0].setText("18");
		radioButton[1].setText("25");
		radioButton[2].setText("28");
		radioButton[3].setText("30");
	}
	if(current==7) {
		label.setText("QUE8:NAME OF QWE?");
		radioButton[0].setText("DF");
		radioButton[1].setText("BH");
		radioButton[2].setText("XC");
		radioButton[3].setText("AS");
	}
	if(current==8) {
		label.setText("QUE9:NAME OF QWDJ");
		radioButton[0].setText("KL");
		radioButton[1].setText("VX");
		radioButton[2].setText("DT");
		radioButton[3].setText("AU");
	}
	if(current==9) {
		label.setText("QUE10:NAME OF CVBN?");
		radioButton[0].setText("DI");
		radioButton[0].setText("nO");
		radioButton[0].setText("AX");
		radioButton[0].setText("NM");
	}
label.setBounds(30,40,450,20);
for(int i=0,j=0;i<=90;i+=30,j++)
	radioButton[j].setBounds(50,80+i,200,20);
}
boolean check() {
	if (current==0)
		return(radioButton[1].isSelected());
	if (current==1)
		return(radioButton[0].isSelected());
	if (current==2)
		return(radioButton[2].isSelected());
	if (current==3)
		return(radioButton[3].isSelected());
	if (current==4)
		return(radioButton[0].isSelected());
	if (current==5)
		return(radioButton[1].isSelected());
	if (current==6)
		return(radioButton[1].isSelected());
	if (current==7)
		return(radioButton[2].isSelected());
	if (current==8)
		return(radioButton[1].isSelected());
    if (current==9)
	return(radioButton[3].isSelected());
    return false;
}
@Override
	public void actionPerformed(ActionEvent e){
	if(e.getSource()==btnNext){
		if(check())
		count=count+1;
		current++;
		set();
		if(current==9){
		btnNext.setEnabled(false);
		btnBookmark.setText("Result");
		}
		}
		if(e.getActionCommand().equals("Bookmark")){
		JButton bk=new JButton("Bookmark"+x);
		bk.setBounds(480,20+30*x,100,30);
		add(bk);
		bk.addActionListener(this);
		m[x]=current;
		x++;
		current++;
		set();
		if(current==9)
		btnBookmark.setText("Result");
		setVisible(false);
		setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++){
		if(e.getActionCommand().equals("Bookmark"+y)){
		if(check())
		count=count+1;
		now=current;
		current=m[y];
		set();
		((JButton) e.getSource()).setEnabled(false);
		current=now;
		}
		}
		if(e.getActionCommand().equals("Result")){
		if(check())
		count=count+1;
		current++;
		JOptionPane.showMessageDialog(this,"correct answers="+count);
		System.exit(0);
		}
		}
	
public static void main(String[] args ) {
	new OnlineTest("Online Test App");
}
}
