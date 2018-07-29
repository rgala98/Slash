package pack;

import java.awt.*;
import java.awt.event.*;

public class calcu extends Frame
{

public boolean setClear=true;
double number, memValue;
char op;
int x=0,y=0;

String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };
String operatorButtonText[] = {"/", "10^X", "*", "%", "-", "1/X", "+", "=" };
String memoryButtonText[] = {"MC", "MR", "MS", "M+" };
String specialButtonText[] = {"BackSpace", "C", "AC" };
String sciButtonText[] = {"X^2","X^3","X^Y","e^X","^(1/2)","^(1/3)","^(1/Y)","!","log","sin","cos","tan","ln","e","PI","="};

DigitButton digitButton[]=new DigitButton[digitButtonText.length];
OperatorButton operatorButton[]=new OperatorButton[operatorButtonText.length];
MemoryButton memoryButton[]=new MemoryButton[memoryButtonText.length];
SpecialButton specialButton[]=new SpecialButton[specialButtonText.length];
SciButton sciButton[]=new SciButton[sciButtonText.length]; 
Button back;

Label Display=new Label("0",Label.RIGHT);
Label memLabel=new Label("",Label.RIGHT);

final int FRAME_WIDTH=720,FRAME_HEIGHT=450;
final int HEIGHT=55, WIDTH=55, H_SPACE=10,V_SPACE=15;
final int TOPX=30, TOPY=40;
///////////////////////////
public calcu(String frameText)//constructor
{
super(frameText);
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    setSize(screenWidth / 2, screenHeight / 2);
    setLocation(screenWidth / 4, screenHeight / 4);


int tempX=TOPX, y=TOPY;
setBackground(new Color(34,43,69));
Display.setBounds(tempX,y,670,HEIGHT);
Display.setBackground(new Color(34,43,69));
Display.setForeground(new Color(250,250,250));
add(Display);
back = new Button("HOME");
back.setBounds(tempX+100,y+70,100,55);
back.setForeground(Color.BLACK);
back.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){
            Menu m = new Menu();
            Menu.main(null);
            setVisible(false);
        }
});

add(back);

Font myFont = new Font("LCD",Font.BOLD,30);
Display.setFont(myFont);

memLabel.setBounds(TOPX,  TOPY+HEIGHT+ V_SPACE,WIDTH, HEIGHT);
memLabel.setForeground(Color.RED);
memLabel.setFont(myFont);
add(memLabel);

// set Co-ordinates for Memory Buttons
tempX=TOPX;	
y=TOPY+2*(HEIGHT+V_SPACE);
for(int i=0; i<memoryButton.length; i++)
{
memoryButton[i]=new MemoryButton(tempX,y,WIDTH,HEIGHT,memoryButtonText[i], this);
memoryButton[i].setForeground(Color.RED);
memoryButton[i].setBackground(Color.WHITE);
y+=HEIGHT+V_SPACE;
}

tempX=TOPX+80;	
y=TOPY+2*(HEIGHT+V_SPACE);
int x = tempX;
for(int i=0; i<sciButton.length; i++)
{
sciButton[i]=new SciButton(tempX,y,WIDTH,HEIGHT,sciButtonText[i], this);
sciButton[i].setForeground(Color.BLUE);
tempX+=WIDTH+H_SPACE;
if((i+1)%4==0)
{y+=HEIGHT+V_SPACE; tempX =x;}
}

//set Co-ordinates for Special Buttons
tempX=300+1*(WIDTH+H_SPACE); y=TOPY+1*(HEIGHT+V_SPACE);
for(int i=0;i<specialButton.length;i++)
{
specialButton[i]=new SpecialButton(tempX,y,WIDTH*2,HEIGHT,specialButtonText[i], this);
specialButton[i].setForeground(Color.RED);
tempX=tempX+2*WIDTH+H_SPACE;
}

//set Co-ordinates for Digit Buttons
int digitX=320+WIDTH+H_SPACE;
int digitY=TOPY+2*(HEIGHT+V_SPACE);
tempX=digitX;  y=digitY;
for(int i=0;i<digitButton.length;i++)
{
digitButton[i]=new DigitButton(tempX,y,WIDTH,HEIGHT,digitButtonText[i], this);
digitButton[i].setForeground(Color.GRAY);

tempX+=WIDTH+H_SPACE;
if((i+1)%3==0){tempX=digitX; y+=HEIGHT+V_SPACE;}
}

//set Co-ordinates for Operator Buttons
int opsX=digitX+2*(WIDTH+H_SPACE)+H_SPACE;
int opsY=digitY;
tempX=opsX;  y=opsY;
for(int i=0;i<operatorButton.length;i++)
{
tempX+=WIDTH+H_SPACE;
operatorButton[i]=new OperatorButton(tempX,y,WIDTH,HEIGHT,operatorButtonText[i], this);
operatorButton[i].setForeground(Color.MAGENTA);
if((i+1)%2==0){tempX=opsX; y+=HEIGHT+V_SPACE;}
}

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent ev)
{System.exit(0);}
});

setLayout(null);
setSize(FRAME_WIDTH,FRAME_HEIGHT);
setVisible(true);
}
//////////////////////////////////
static String getFormattedText(double temp)
{
String resText=""+temp;
if(resText.lastIndexOf(".0")>0)
	resText=resText.substring(0,resText.length()-2);
return resText;
}
////////////////////////////////////////
public static void main(String []args)
{
new calcu("Calculator+");
}
}



class DigitButton extends Button implements ActionListener
{
calcu cl;

//////////////////////////////////////////
DigitButton(int x,int y, int width,int height,String cap, calcu clc)
{
super(cap);
setBounds(x,y,width,height);
this.cl=clc;
this.cl.add(this);
addActionListener(this);
}
////////////////////////////////////////////////
static boolean isInString(String s, char ch)
{
for(int i=0; i<s.length();i++) if(s.charAt(i)==ch) return true;
return false;
}
/////////////////////////////////////////////////
public void actionPerformed(ActionEvent ev)
{
String tempText=((DigitButton)ev.getSource()).getLabel();

if(tempText.equals("."))
{
 if(cl.setClear) 
	{cl.Display.setText("0.");cl.setClear=false;}
 else if(!isInString(cl.Display.getText(),'.'))
	cl.Display.setText(cl.Display.getText()+".");
 return;
}

if(tempText.equals("+/-"))
{
	double temp=Double.parseDouble(cl.Display.getText());
	temp = -temp;
	cl.Display.setText(calcu.getFormattedText(temp));
	
}

int index=0;
try{
        index=Integer.parseInt(tempText);
    }catch(NumberFormatException e){return;}

if (index==0 && cl.Display.getText().equals("0")) return;

if(cl.setClear)
        	{cl.Display.setText(""+index);cl.setClear=false;}
else
	cl.Display.setText(cl.Display.getText()+index);
}//actionPerformed
}//class defination

/********************************************/

class OperatorButton extends Button implements ActionListener
{
calcu cl;

OperatorButton(int x,int y, int width,int height,String cap, calcu clc)
{
super(cap);
setBounds(x,y,width,height);
this.cl=clc;
this.cl.add(this);
addActionListener(this);
}
///////////////////////
public void actionPerformed(ActionEvent ev)
{
String opText=((OperatorButton)ev.getSource()).getLabel();

cl.setClear=true;
double temp=Double.parseDouble(cl.Display.getText());

if(opText.equals("1/X"))
	{
	try
		{double tempd= 1/temp;
		cl.Display.setText(calcu.getFormattedText(tempd));}
 	catch(ArithmeticException excp)
                		{cl.Display.setText("Divide by 0.");}
	return;
	}
if(opText.equals("10^X"))
	{
	try
		{double tempd=Math.pow(10,temp);
		cl.Display.setText(calcu.getFormattedText(tempd));}
        	catch(ArithmeticException excp)
	                {cl.Display.setText("Divide by 0.");}
	return;
	}
if(!opText.equals("="))
	{
	cl.number=temp;
	cl.op=opText.charAt(0);
	return;
	}
// process = button pressed
switch(cl.op)
{
case '+':
	temp+=cl.number;break;
case '-':
	temp=cl.number-temp;break;
case '*':
	temp*=cl.number;break;
case '%':
	try{temp=cl.number%temp;}
	catch(ArithmeticException excp)
		{cl.Display.setText("Divide by 0."); return;}
	break;
case '/':
	try{temp=cl.number/temp;}
        catch(ArithmeticException excp)
                {cl.Display.setText("Divide by 0."); return;}
	break;
}//switch

cl.Display.setText(calcu.getFormattedText(temp));
//cl.number=temp;
}//actionPerformed
}//class

class SciButton extends Button implements ActionListener
{
	calcu cl;

	SciButton(int x,int y, int width,int height,String cap, calcu clc)
	{
	super(cap);
	setBounds(x,y,width,height);
	this.cl=clc;
	this.cl.add(this);
	addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev)
	{
	String sciText=((SciButton)ev.getSource()).getLabel();

	cl.setClear=true;
	double temp=Double.parseDouble(cl.Display.getText());
	double tempd=0D;
	
	if(sciText.equals("X^2"))
	{
	try {
		tempd = Math.pow(temp,2);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("X^3"))
	{
	try {
		tempd = Math.pow(temp,3);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("e^X"))
	{
	try {
		tempd = Math.exp(temp);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("sin"))
	{
	try {
		tempd = Math.toRadians(temp);
		tempd = Math.sin(tempd);
		tempd = Math.nextUp(tempd);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("cos"))
	{
	try {
		tempd = Math.toRadians(temp);
		tempd = Math.cos(tempd);
		tempd = Math.nextUp(tempd);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("tan"))
	{
	try {
		tempd = Math.toRadians(temp);
		tempd = Math.tan(tempd);
		tempd = Math.nextUp(tempd);
		if(temp == 90)tempd = 1/0.0;
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("^(1/2)"))
	{
	try {
		tempd = Math.pow(temp,0.5);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("^(1/3)"))
	{
	try {
		tempd = Math.pow(temp,(1/3.0));
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("ln"))
	{
	try {
		tempd = Math.log(temp);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	
	if(sciText.equals("log"))
	{
	try {
		tempd = Math.log10(temp);
		cl.Display.setText(calcu.getFormattedText(tempd));}
	catch(ArithmeticException excp)
    {cl.Display.setText("Divide by 0.");}
	return;
	}
	if(sciText.equals("!"))
	{
		int fact=1;
		for(int i = (int)temp;i>=2;i--) {fact=fact*i;}
		cl.Display.setText(calcu.getFormattedText(fact));
	}

	
	
	if(sciText.equals("PI"))
	{
	tempd = Math.PI;
	cl.Display.setText(calcu.getFormattedText(tempd));
	}
	
	if(sciText.equals("e"))
	{
	tempd = Math.exp(1);
	cl.Display.setText(calcu.getFormattedText(tempd));
	}
	
	
	if(!sciText.equals("="))
	{
	cl.number=temp;
	cl.op=sciText.charAt(0);
	return;
	}
	
	switch(cl.op) {
	case 'X':  tempd = Math.pow(cl.number,temp);break;
	case '^': tempd = Math.pow(cl.number, (1.0/temp));break;
	}
	cl.Display.setText(calcu.getFormattedText(tempd));
	
	}

}

/****************************************/

class MemoryButton extends Button implements ActionListener
{
calcu cl;

/////////////////////////////////
MemoryButton(int x,int y, int width,int height,String cap, calcu clc)
{
super(cap);
setBounds(x,y,width,height);
this.cl=clc;
this.cl.add(this);
addActionListener(this);
}
////////////////////////////////////////////////
public void actionPerformed(ActionEvent ev)
{
char memop=((MemoryButton)ev.getSource()).getLabel().charAt(1);

cl.setClear=true;
double temp=Double.parseDouble(cl.Display.getText());

switch(memop)
{
case 'C': 
	cl.memLabel.setText(" ");cl.memValue=0.0;break;
case 'R': 
	cl.Display.setText(calcu.getFormattedText(cl.memValue));break;
case 'S':
	cl.memValue=0.0;
case '+': 
	cl.memValue+=Double.parseDouble(cl.Display.getText());
	if(cl.Display.getText().equals("0") || cl.Display.getText().equals("0.0")  )
		cl.memLabel.setText(" ");
	else 
		cl.memLabel.setText("M");	
	break;
}//switch
}//actionPerformed
}//class

/*****************************************/

class SpecialButton extends Button implements ActionListener
{
calcu cl;

SpecialButton(int x,int y, int width,int height,String cap, calcu clc)
{
super(cap);
setBounds(x,y,width,height);
this.cl=clc;
this.cl.add(this);
addActionListener(this);
}
//////////////////////
static String backSpace(String s)
{
String Res="";
for(int i=0; i<s.length()-1; i++) Res+=s.charAt(i);
return Res;
}

//////////////////////////////////////////////////////////
public void actionPerformed(ActionEvent ev)
{
String opText=((SpecialButton)ev.getSource()).getLabel();
//check for backspace button
if(opText.equals("BackSpace"))
{
String tempText=backSpace(cl.Display.getText());
if(tempText.equals("")) 
	cl.Display.setText("0");
else 
	cl.Display.setText(tempText);
return;
}
//check for "C" button i.e. Reset
if(opText.equals("AC")) 
{
cl.number=0.0; cl.op=' '; cl.memValue=0.0;
cl.memLabel.setText(" ");
}

//it must be C button pressed
cl.Display.setText("0");cl.setClear=true;
}//actionPerformed
}
