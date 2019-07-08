import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class output extends JFrame implements ActionListener
	{
    JLabel label_1;
    JLabel label_2;
    JLabel label_3;
    JLabel label_4;
    JLabel label_5;
    JLabel label_6;
    JLabel label_7;
    JLabel label_8;
    JTextField ta;
    JTextField tf;
    JTextField tb;
    JTextField tc;
    JTextField td;
    JTextField te;
    JTextField th;
    JTextField tl;
    JLabel label_9;
    JLabel label_10;
    JLabel label_11;
    JLabel label_12;
    JTextField ta1;
    JTextField tf1;
    JTextField tb1;
    JTextField tc1;
    JTextField td1;
    JTextField te1;
    JTextField th1;
    JTextField tl1;
    JLabel label_14;
    JLabel label_15;
    JTextField tpc;
    JTextField tpc1;
    JTextField tsp;
    JList list_1;
    JScrollPane sp_list_1;
    JLabel label_16;
    JTextField tcwr;
    JLabel label_17;
    JTextField tpa;
    JLabel label_18;
    JLabel label_19;
    JTextField tpb;
    JTextField tpC;
    JLabel label_20;
    JTextField tcy;
    JLabel label_21;
    JTextField tz;
    JLabel label_22;
    JTextField ts;
    JLabel label_23;
    JTextField tp;
    JLabel label_24;
    JLabel label_25;
    JLabel label_26;
    JButton b1;
    JTextField tadd;
    JButton b2;

int a,b,c,d,e,h,l,w,z,sp,pc,flag,lo,hi,data,A,B,C,D,L,index,fag=0,ind,de;
int re,ml1,ml2,S,Z,P,CY,opcode=0,ad,st,sou=-1,des=-1,cy,p,c1,z1;
int q,CWR,portA,portB,portCu,portCl,cl1,cl2,cl3,cl4,brea;
   int ram[]=new int[1024];
   int delet[]=new int[5];
   int ret[]=new int[25];
   int  temp,end=0;
           DefaultListModel listModel_list_1;
/////////////////////////////////////////////////////////////////////////////////////
int fl;
int[] mem = new int[1024];
NEWO obj;
    public output(NEWO ob)
		{
		this.obj=ob;
		fl=0;
        outputLayout customLayout = new outputLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);

        label_1 = new JLabel("REG     A :");
        getContentPane().add(label_1);

        label_2 = new JLabel("label_2");
        getContentPane().add(label_2);

        label_3 = new JLabel("REG     B :");
        getContentPane().add(label_3);

        label_4 = new JLabel("REG     C :");
        getContentPane().add(label_4);

        label_5 = new JLabel("REG     D :");
        getContentPane().add(label_5);

        label_6 = new JLabel("REG     E :");
        getContentPane().add(label_6);

        label_7 = new JLabel("REG     H :");
        getContentPane().add(label_7);

        label_8 = new JLabel("REG     L :");
        getContentPane().add(label_8);

        ta = new JTextField("");
        getContentPane().add(ta);

        tf = new JTextField("");
        getContentPane().add(tf);

        tb = new JTextField("");
        getContentPane().add(tb);

        tc = new JTextField("");
        getContentPane().add(tc);

        td = new JTextField("");
        getContentPane().add(td);

        te = new JTextField("");
        getContentPane().add(te);

        th = new JTextField("");
        getContentPane().add(th);

        tl = new JTextField("");
        getContentPane().add(tl);

        label_9 = new JLabel("Register");
        getContentPane().add(label_9);

        label_10 = new JLabel("  Hex            Binary");
        getContentPane().add(label_10);

        label_11 = new JLabel("Register");
        getContentPane().add(label_11);

        label_12 = new JLabel("  Hex           Binary");
        getContentPane().add(label_12);

        ta1 = new JTextField("");
        getContentPane().add(ta1);

        tf1 = new JTextField("");
        getContentPane().add(tf1);

        tb1 = new JTextField("");
        getContentPane().add(tb1);

        tc1 = new JTextField("");
        getContentPane().add(tc1);

        td1 = new JTextField("");
        getContentPane().add(td1);

        te1 = new JTextField("");
        getContentPane().add(te1);

        th1 = new JTextField("");
        getContentPane().add(th1);

        tl1 = new JTextField("");
        getContentPane().add(tl1);

        label_14 = new JLabel("PC  :-");
        getContentPane().add(label_14);

        label_15 = new JLabel("SP :-");
        getContentPane().add(label_15);

        tpc = new JTextField("");
        getContentPane().add(tpc);

        tpc1 = new JTextField("");
        getContentPane().add(tpc1);

        tsp = new JTextField("");
        getContentPane().add(tsp);

        listModel_list_1 = new DefaultListModel();
       // listModel_list_1.addElement("item2");
        list_1 = new JList(listModel_list_1);
        sp_list_1 = new JScrollPane(list_1);
        getContentPane().add(sp_list_1);

        label_16 = new JLabel("     CWR");
        getContentPane().add(label_16);

        tcwr = new JTextField("");
        getContentPane().add(tcwr);

        label_17 = new JLabel("    Port A");
        getContentPane().add(label_17);

        tpa = new JTextField("");
        getContentPane().add(tpa);

        label_18 = new JLabel("    Port B");
        getContentPane().add(label_18);

        label_19 = new JLabel("    Port C");
        getContentPane().add(label_19);

        tpb = new JTextField("");
        getContentPane().add(tpb);

        tpC = new JTextField("");
        getContentPane().add(tpC);

        label_20 = new JLabel("CY");
        getContentPane().add(label_20);

        tcy = new JTextField("");
        getContentPane().add(tcy);

        label_21 = new JLabel("Z");
        getContentPane().add(label_21);

        tz = new JTextField("");
        getContentPane().add(tz);

        label_22 = new JLabel("S");
        getContentPane().add(label_22);

        ts = new JTextField("");
        getContentPane().add(ts);

        label_23 = new JLabel("P");
        getContentPane().add(label_23);

        tp = new JTextField("");
        getContentPane().add(tp);

        label_24 = new JLabel("FLAGS ");
        getContentPane().add(label_24);

        label_25 = new JLabel("   8255  PPI");
        getContentPane().add(label_25);

        label_26 = new JLabel("RAM Address ");
        getContentPane().add(label_26);

        b1 = new JButton("NEXT");b1.addActionListener(this);
        getContentPane().add(b1);
        tadd = new JTextField("");
        getContentPane().add(tadd);

        b2 = new JButton("GO");b2.addActionListener(this);
        getContentPane().add(b2);
      setBounds(400,50,400,400);
	  setResizable(false);
	  setSize(getPreferredSize());
	  getContentPane().setBackground(new Color(230,195,254)); 
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               // System.exit(0);
			   obj.index=-1;
			   obj.s="";
			   dispose();
			   fl=9999;control();System.out.println("out");
            }
        });
    }

   /* public static void main(String args[]) {
        output window = new output();

        window.setTitle("output");
        window.pack();
        window.show();
    }*/
public void actionPerformed(ActionEvent e)
		{
	      if(e.getSource()==b1)
			{
			  fl=1;
			  control();
			}
          if(e.getSource()==b2)
			{
			  if(Integer.parseInt(tadd.getText(),16)<1014)
				  fillRam(Integer.parseInt(tadd.getText(),16));
			}
		}


synchronized public void control()
	{
		  try
		{
		  if(fl==0){System.out.println("stop"); wait();}
		  else{
			    notify();}
		}
		catch (InterruptedException i)
		{
			System.out.println(i);
		}
		  
	}
public void runn()
		{ 
	pc=-1;
	end=a=b=c=d=e=h=l=0;
	fl=0;
	      for(;fl!=9999;)
			{
pc++;
obj.jt.changeSelection(pc,0,false,false);
opcode=mem[pc];
System.out.println(pc+"  "+mem[pc]);
fl=0;
if(opcode==0)
brea++;
if(brea>300)
{
opcode=118;
pc=-1;
}
if(opcode!=118)
{
switch(opcode)
{
   case 235:
     w=h;
     z=l;
     h=d;
     l=e;
     d=w;
     e=z;
     break;
   case 60:
     a++;
     a=sta(a);
   break;
   case 4:
     b++;
     b=sta(b);
   break;
   case 12:
     c++;
     c=sta(c);
   break;
   case 28:
     e++;
     e=sta(e);
   break;
   case 36:
     h++;
     h=sta(h);
   break;
   case 44:
     l++;
     l=sta(l);
   break;
   case 20:
     d++;
     d=sta(d);
   break;
   case 52:
     add(h,l);
     ram[temp]++;
     ram[temp]=sta(ram[temp]);
   break;

  case   5:
    b--;
    b=sta(b);
  break;
  case   13:
    c--;
    c=sta(c);
  break;
  case   21:
    d--;
    d=sta(d);
  break;
  case   29:
    e--;
    e=sta(e);
  break;
  case   37:
    h--;
    h=sta(h);
  break;
  case   45:
    l--;
    l=sta(l);
  break;
  case   61:
    a--;
    a=sta(a);
  break;
  case   53:
    add(h,l);
    ram[temp]--;
    ram[temp]=sta(ram[temp]);
  break;

case 39:
	callDAA();
	break;


  case  35:
    l++;
    if(l>255)
    {
    h++;
    l=l-256;
    }
  break;
  case  3:
   c++;
   if(c>255)
   {
    b++;
    c=c-256;
    }
  break;
  case  19:
   e++;
   if(e>255)
   {
    d++;
    e=e-256;
   }
   break;
  case  51:
    sp++;
    break;


  case  43:
   l--;
   if(l<0)
   {
    h--;
    l=l+256;
   }
  break;
  case  8:
   c--;
   if(c<0)
   {
    b--;
    c=c+256;
   }
  break;
  case  27:
   e--;
   if(e<0)
   {
    d--;
    e=e+256;
   }
  break;
  case  59:
   sp--;
   break;

  case  47:
   a=sta(a);
   logic(a);
  break;

  case 55:
     if(CY==1)
      CY=0;
     else
      CY=1;
  break;

  case 63:
      CY=1;
   break;

  case 7:
   logic(a);
   break;

  case 15:
   logic(a);
   break;

  case 23:
   logic(a);
   break;

  case 31:
   logic(a);
   break;

  case 10:
   add(b,c);
   a=ram[temp];
   break;

  case 26:
   add(d,e);
   a=ram[temp];
   break;

  case 2:
   add(b,c);
   ram[temp]=a;
   break;

   case 18:
    add(d,e);
    ram[temp]=a;
    break;

  case 42:
   pc++;
   w=mem[pc];
   pc++;
   z=mem[pc];
   add(z,w);
   l=ram[temp];
   h=ram[temp+1];
   break;

  case  34:
      pc++;
     w=mem[pc];
     pc++;
     z=mem[pc];
     add(z,w);
     ram[temp]=l;
     ram[temp+1]=h;
   break;

  case 58:
      add(mem[pc+2],mem[pc+1]);
      a=ram[temp];pc+=2;
  break;

  case  50:
      add(mem[pc+2],mem[pc+1]);
      ram[temp]=a;pc+=2;
  break;


  case  62:
    pc++;
    a=mem[pc];
    break;
  case  6:
    pc++;
    b=mem[pc];
    break;
  case  14:
    pc++;
    c=mem[pc];
    break;
  case  22:
    pc++;
    d=mem[pc];
    break;
  case  30:
    pc++;
    e=mem[pc];
    break;
  case  38:
    pc++;
    h=mem[pc];
    break;
  case  46:
    pc++;
    l=mem[pc];
    break;
  case  54:
    pc++;
    add(h,l);
    ram[temp]=mem[pc];
    break;


  case  1:
   pc++;
   c=mem[pc];
   pc++;
   b=mem[pc];
   break;
  case  17:
   pc++;
   e=mem[pc];
   pc++;
   d=mem[pc];
   break;
  case  33:
   pc++;
   l=mem[pc];
   pc++;
   h=mem[pc];
   break;
  case  49:
   pc++;
   add(mem[pc+1],mem[pc]);pc++;
   sp=temp;
   break;


  case 64:
   b=b;
   break;
  case 65:
   b=c;
   break;
 case 66:
   b=d;
   break;
 case 67:
   b=e;
   break;
 case 68:
   b=h;
   break;
 case 69:
   b=l;
   break;
 case 70:
   add(h,l);
   b=ram[temp];
   break;
 case 71:
   b=a;
   break;
 case 72:
   c=b;
   break;
 case 73:
   c=c;
   break;
 case 74:
   c=d;
   break;
 case 75:
   c=e;
   break;
 case 76:
   c=h;
   break;
 case 77:
   c=l;
   break;
 case 78:
   add(h,l);
   c=ram[temp];
   break;
 case 79:
   c=a;
   break;
 case 80:
   d=b;
   break;
 case 81:
   d=c;
   break;
 case 82:
   d=d;
   break;
 case 83:
   d=e;
   break;
 case 84:
   d=h;
   break;
 case 85:
   d=l;
   break;
 case 86:
   add(h,l);
   d=ram[temp];
   break;
 case 87:
   d=a;
   break;
 case 88:
   e=b;
   break;
 case 89:
   e=c;
   break;
 case 90:
   e=d;
   break;
 case 91:
   e=e;
   break;
 case 92:
   e=h;
   break;
 case 93:
   e=l;
   break;
 case 94:
   add(h,l);
   e=ram[temp];
   break;
 case 95:
   e=a;
   break;
 case 96:
   h=b;
   break;
 case 97:
   h=c;
   break;
 case 98:
   h=d;
   break;
 case 99:
   h=e;
   break;
 case 100:
   h=h;
   break;
 case 101:
   h=l;
   break;
 case 102:
   add(h,l);
   h=ram[temp];
   break;
 case 103:
   h=a;
   break;
 case 104:
   l=b;
   break;
 case 105:
   l=c;
   break;
 case 106:
   l=d;
   break;
 case 107:
   l=e;
   break;
 case 108:
   l=h;
   break;
 case 109:
   l=l;
   break;
 case 110:
   add(h,l);
   l=ram[temp];
   break;
 case 111:
   l=a;
   break;
 case 112:
   add(h,l);
   ram[temp]=b;
   break;
 case 113:
   add(h,l);
   ram[temp]=c;
   break;
 case 114:
   add(h,l);
   ram[temp]=d;
   break;
  case 115:
   add(h,l);
   ram[temp]=e;
   break;
 case 116:
   add(h,l);
   ram[temp]=h;
   break;
 case 117:
   add(h,l);
   ram[temp]=l;
   break;
 case 119:
   add(h,l);
   ram[temp]=a;
   break;
 case 120:
   a=b;
   break;
 case 121:
   a=c;
   break;
 case 122:
   a=d;
   break;
 case 123:
   a=e;
   break;
 case 124:
   a=h;
   break;
 case 125:
   a=l;
   break;
 case 126:
   add(h,l);
   a=ram[temp];
   break;
 case 127:
   a=b;
   break;

 case 128:
  a=a+b;
  a=sta(a);
  break;
 case 129:
  a=a+c;
  a=sta(a);
  break;
 case 130:
  a=a+d;
  a=sta(a);
  break;
 case 131:
  a=a=a+e;
  sta(a);
  break;
 case 132:
  a=a+h;
  a=sta(a);
  break;
 case 133:
  a=a+l;
  a=sta(a);
  break;
 case 134:
  add(h,l);
  a=a+ram[temp];
  a=sta(a);
  break;
 case 135:
  a=a+a;
  a=sta(a);
  break;

 case 136:
  a=a+b+CY;
  a=sta(a);
  break;
 case 137:
  a=a+c+CY;
  a=sta(a);
  break;
 case 138:
  a=a+d+CY;
  a=sta(a);
  break;
 case 139:
  a=a+e+CY;
  a=sta(a);
  break;
 case 140:
  a=a+h+CY;
  a=sta(a);
  break;
 case 141:
  a=a+l+CY;
  a=sta(a);
  break;
 case 142:
  add(h,l);
  a=a+ram[temp]+CY;
  a=sta(a);
  break;
 case 143:
  a=a+a+CY;
  a=sta(a);
  break;

 case 144:
  a=a-b;
  a=sta(a);
  break;
 case 145:
  a=a-c;
  a=sta(a);
  break;
 case 146:
  a=a-d;
  a=sta(a);
  break;
 case 147:
  a=a-e;
  a=sta(a);
  break;
 case 148:
  a=a-h;
  a=sta(a);
  break;
 case 149:
  a=a-l;
  a=sta(a);
  break;
 case 150:
  add(h,l);
  a=a-ram[temp];
  a=sta(a);
  break;
 case 151:
  a=a-a;
  a=sta(a);
  break;

 case 152:
  a=a-b-CY;
  a=sta(a);
  break;
 case 153:
  a=a-c-CY;
  a=sta(a);
  break;
 case 154:
  a=a-d-CY;
  a=sta(a);
  break;
 case 155:
  a=a-e-CY;
  a=sta(a);
  break;
 case 156:
  a=a-h-CY;
  sta(a);
  break;
 case 157:
  a=a-l-CY;
  a=sta(a);
  break;
 case 158:
  add(h,l);
  a=a-ram[temp]-CY;
  a=sta(a);
  break;
 case 159:
  a=a-a-CY;
  a=sta(a);
  break;


 case 160:
  logic(b);
   b=sta(b);
  break;
 case 161:
  logic(c);
   c=sta(c);
  break;
 case 162:
  logic(d);
   d=sta(d);
  break;
 case 163:
  logic(e);
   e=sta(e);
  break;
 case 164:
  logic(h);
   h=sta(h);
  break;
 case 165:
  logic(l);
   l=sta(l);
  break;
 case 166:
  add(h,l);
  logic(ram[temp]);
   ram[temp]=sta(ram[temp]);
  break;
 case 167:
  logic(a);
   a=sta(a);
  break;

 case 168:
  logic(b);
   b=sta(b);
  break;
 case 169:
  logic(c);
   c=sta(c);
  break;
 case 170:
  logic(d);
   d=sta(d);
  break;
 case 171:
  logic(e);
   e=sta(e);
  break;
 case 172:
  logic(h);
   h=sta(h);
  break;
 case 173:
  logic(l);
   l=sta(l);
  break;
 case 174:
  add(h,l);
  logic(ram[temp]);
   ram[temp]=sta(ram[temp]);
  break;
 case 175:
  logic(a);
   a=sta(a);
  break;

 case 176:
  logic(b);
   b=sta(b);
  break;
 case 177:
  logic(c);
   c=sta(c);
  break;
 case 178:
  logic(d);
   d=sta(d);
  break;
 case 179:
  logic(e);
   e=sta(e);
  break;
 case 180:
  logic(h);
   h=sta(h);
  break;
 case 181:
  logic(l);
   l=sta(l);
  break;
 case 182:
  add(h,l);
  logic(ram[temp]);
   ram[temp]=sta(ram[temp]);
  break;
 case 183:
  logic(a);
   a=sta(a);
  break;
 case 184:
  w=a;
  a=a-b;
  a=sta(a);
  a=w;
  break;
 case 185:
  w=a;
  a=a-c;
  a=sta(a);
  a=w;
  break;
 case 186:
  w=a;
  a=a-d;
  a=sta(a);
  a=w;
  break;
 case 187:
  w=a;
  a=a-e;
  a=sta(a);
  a=w;
  break;
 case 188:
  w=a;
  a=a-h;
  a=sta(a);
  a=w;
  break;
 case 189:
  w=a;
  a=a-l;
  a=sta(a);
  a=w;
  break;
 case 190:
  add(h,l);
  w=a;
  a=a-ram[temp];
  a=sta(a);
  a=w;
  break;
 case 191:
  w=a;
  a=a-a;
  a=sta(a);
  w=a;
  break;

case 195:
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  break;
case 194:
  if(Z!=1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 202:
  if(Z==1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
 }
  else
  pc=pc+2;
  break;
case 210:
  if(CY!=1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;

case 211:
   pc++;
   if(mem[pc]==131)
    CWR=a;
   if(mem[pc]==128)
    {
     if(CWR==128||CWR==129||CWR==130||CWR==131||CWR==136||CWR==137||CWR==138||CWR==139)
      portA=a;
    }
   if(mem[pc]==129)
    {
     if(CWR==128||CWR==129||CWR==136||CWR==137||CWR==144||CWR==145||CWR==152||CWR==153)
      portB=a;
    }
   if(mem[pc]==130)
    {
     if(CWR==128||CWR==129||CWR==130||CWR==131||CWR==144||CWR==145||CWR==146||CWR==147)
      portCu=a;
    }
   if(mem[pc]==130)
    {
     if(CWR==128||CWR==130||CWR==136||CWR==138||CWR==144||CWR==146||CWR==152||CWR==154)
      portCl=a;
    }
   break;
case 218:
  if(CY==1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
   }
  else
  pc=pc+2;
  break;
case 226:
  if(P!=1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 234:
  if(P==1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 242:
  if(S!=1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 250:
  if(S==1)
  {
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;

case 233:
  add(h,l);
  pc=temp-1;
  break;

 case 205:
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  break;
 case 196:
  if(Z!=1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
 case 204:
  if(Z==1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 212:
  if(CY!=1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 220:
  if(CY==1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 228:
  if(P!=1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 236:
  if(P==1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 244:
  if(S!=1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;
case 252:
  if(S==1)
  {
  sp--;if(sp==-1){sp=1023;}
  dad(pc+2);
  ram[sp]=z;sp--;if(sp==-1){sp=1023;}
  ram[sp]=w;
  add(mem[pc+2],mem[pc+1]);
  pc=temp-1;
  }
  else
  pc=pc+2;
  break;


case 201:
  pop();
  break;
case 192:
  if(Z!=1)
   pop();
  break;
case 200:
  if(Z==1)
    pop();
  break;
case 208:
  if(CY!=1)
    pop();
  break;
case 216:
  if(CY==1)
    pop();
  break;
case 224:
  if(P!=1)
    pop();
  break;
case 232:
  if(P==1)
    pop();
  break;
case 240:
  if(S!=1)
    pop();
  break;
case 248:
  if(S==1)
    pop();
  break;

case 197:
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=b;
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=c;
 break;
case 213:
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=d;
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=e;
 break;
case 229:
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=h;
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=l;
 break;
case 245:
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=a;
 sp--;if(sp==-1){sp=1023;}
 ram[sp]=flag;
 break;

case 193:
 c=ram[sp];
 sp++;if(sp==1024){sp=0;}
 b=ram[sp];
 sp++;if(sp==1024){sp=0;}
 break;
case 209:
 e=ram[sp];
 sp++;if(sp==1024){sp=0;}
 d=ram[sp];
 sp++;if(sp==1024){sp=0;}
 break;
case 225:
 l=ram[sp];
 sp++;if(sp==1024){sp=0;}
 h=ram[sp];
 sp++;if(sp==1024){sp=0;}
 break;
case 241:
 flag=ram[sp];
 sp++;if(sp==1024){sp=0;}
 a=ram[sp];
 sp++;if(sp==1024){sp=0;}
 break;

case 198:
   pc++;
   a=a+mem[pc];
   a=sta(a);
   break;
case 206:
   pc++;
   a=a+mem[pc]+CY;
   a=sta(a);
   break;
case 214:
   pc++;
   a=a-mem[pc];
   a=sta(a);
   break;
case 222:
   pc++;
   a=a-mem[pc]-CY;
   a=sta(a);
   break;


case 230:
   pc++;
   logic(mem[pc]);
   mem[pc]=sta(mem[pc]);
   break;
case 238:
   pc++;
   logic(mem[pc]);
   mem[pc]=sta(mem[pc]);
   break;
case 246:
   pc++;
   logic(mem[pc]);
   mem[pc]=sta(mem[pc]);
   break;
case 254:
   pc++;
   w=a;
   a=a-mem[pc];
   a=sta(a);
   a=w;
   break;
case 249:
	add(h,l);
    sp=temp;
	break;

case 9:
	add(h,l);
    w=temp;
	add(b,c);
	dad(w+temp);
	h=z;l=w;
	break;
case 25:
	add(h,l);
    w=temp;
	add(d,e);
	dad(w+temp);
	h=z;l=w;
	break;
case 41:
	add(h,l);
    w=temp;
	add(h,l);
	dad(w+temp);
	h=z;l=w;
	break;
case 57:
	add(h,l);
    w=temp;
	dad(w+sp);
	h=z;l=w;
	break;

case 227:
    w=l;
    l=ram[sp];
	ram[sp]=w;
	w=h;
	h=ram[sp+1];
	ram[sp+1]=w;
    break;
}
}
else
break;

display();
////////////////////////////////////////////////////////////////////////////////////////////
		   control();
			if(fl==9999)
			{
				dispose();
			}
			}
		}
////////////////////////////////////////////////////////////////////////////////////////
public void callDAA()
		{
	      String  s;
		  int x,y,z,w;
	      s=Integer.toHexString(a).toUpperCase();
          if(s.charAt(1)=='A'|s.charAt(1)=='B'|s.charAt(1)=='C'|s.charAt(1)=='D'|s.charAt(1)=='E'|s.charAt(1)=='F') 
			{
			  a=a+6;
			}
	      s=Integer.toHexString(a).toUpperCase();
          if(s.charAt(0)=='A'|s.charAt(0)=='B'|s.charAt(0)=='C'|s.charAt(0)=='D'|s.charAt(0)=='E'|s.charAt(0)=='F') 
			{
			  a=a+96;
			}
			a=sta(a);
		}
public void display()
		{
	       ta.setText(adjust(a));	       ta1.setText(adjust1(a));
	       tb.setText(adjust(b));	       tb1.setText(adjust1(b));
	       tc.setText(adjust(c));	       tc1.setText(adjust1(c));
	       td.setText(adjust(d));	       td1.setText(adjust1(d));
	       te.setText(adjust(e));	       te1.setText(adjust1(e));
	       th.setText(adjust(h));	       th1.setText(adjust1(h));
	       tl.setText(adjust(l));	       tl1.setText(adjust1(l));
	       //ta.setText(String.valueOf(a));
	       tpc.setText(adjust(pc));	       tpc1.setText(adjust1(pc));
	       tsp.setText(adjust(sp));	     //  tsp1.setText(adjust1(sp));
	       tcwr.setText(adjust(CWR));	   //tcwr1.setText(adjust1(CWR));
	       tpa.setText(adjust(portA));	   //tpa1.setText(adjust1(portA));
	       tpb.setText(adjust(portB));	   //tpb1.setText(adjust1(portB));
	       tpC.setText(adjust(portCu));	   //tpcC1.setText(adjust1(portC));
		   tcy.setText(String.valueOf(CY));
		   ts.setText(String.valueOf(S));
		   tz.setText(String.valueOf(Z));
		   tp.setText(String.valueOf(P));
		   fillRam(end);
		}
 public String adjust(int a)
		{
	       String s=Integer.toHexString(a).toUpperCase();
	       for(int x=s.length();x<2;x++)
			{ s="0".concat(s);}
		   return(s);
		}
 public String adjust1(int a)
		{
	       String s=Integer.toBinaryString(a);
	       for(int x=s.length();x<8;x++)
			{ s="0".concat(s);}
		   return(s);
		}
 public String adjust2(int a)
		{
	       String s=Integer.toHexString(a);
	       for(int x=s.length();x<4;x++)
			{ s="0".concat(s);}
		   return(s);
		}
public void fillRam(int ad)
		{listModel_list_1.clear();
	      String s; 
          if(ad<1014)
			{
			  for(int x=0;x<10;x++)
				{
				  s=adjust2(ad);
				  s=s.concat("   :=     ");
				  s=s.concat(adjust(ram[ad]));
                  listModel_list_1.addElement(s);s="";
		  	// System.out.println("  *****  "+ad+"   "+ram[ad]);
				ad++;
				}
				ad=end;
			}
		}
 int sta(int A)
{
 int e,b,c,x;
 int bin1[]=new int[8];
 int bin2[]=new int[8];
  e=A;
  if(A<0)
   A=A+256;
  if(A>255)
   A=A-255;
   for(x=0;x<8;x++)
 {
  if(A>0)
  bin1[x]=A%2;
  if(A!=0)
   A=A/2;
  else
  bin1[x]=0;
 }
 if(e==0)
   Z=1;
 else if(e!=0)
 Z=0;
 bin2[6]=Z;
 if(e<0)
 {
  e=e+256;
  S=1;
  CY=1;
 }
else
 S=0;
 bin2[7]=S;
 if(e>255)
 {
  e=e-256;
  CY=1;
 }
else if(S!=1)
  CY=0;
 bin2[0]=CY;
 b=0;
 for(x=0;x<8;x++)
 {
  if(bin1[x]==1)
   b++;
 }
  if(b%2==0)
  P=bin2[2]=1;
  else
  P=bin2[2]=0;
c=0;
if(bin2[0]==1)
 c=c+1;
if(bin2[1]==1)
 c=c+2;
if(bin2[2]==1)
 c=c+4;
if(bin2[3]==1)
 c=c+8;
if(bin2[4]==1)
 c=c+16;
if(bin2[5]==1)
 c=c+32;
if(bin2[6]==1)
 c=c+64;
if(bin2[7]==1)
 c=c+128;
 flag=c;
 return(e);
}


void add(int h,int l)
{
 int a,b,x;
 int bin1[]=new int[8];
 int bin2[]=new int[8];
 int c;
 a=l;
 b=h;
    for(x=0;x<8;x++)
 {
  if(a>0)
  bin1[x]=a%2;
  if(a!=0)
   a=a/2;
  else
  bin1[x]=0;
 }
    for(x=0;x<8;x++)
 {
  if(b>0)
  bin2[x]=b%2;
  if(b!=0)
   b=b/2;
  else
  bin2[x]=0;
 }

c=0;
if(bin1[0]==1)
 c=c+1;
if(bin1[1]==1)
 c=c+2;
if(bin1[2]==1)
 c=c+4;
if(bin1[3]==1)
 c=c+8;
if(bin1[4]==1)
 c=c+16;
if(bin1[5]==1)
 c=c+32;
if(bin1[6]==1)
 c=c+64;
if(bin1[7]==1)
 c=c+128;
if(bin2[0]==1)
 c=c+256;
if(bin2[1]==1)
 c=c+512;
if(bin2[2]==1)
 c=c+1024;
if(bin2[3]==1)
 c=c+2048;
if(bin2[4]==1)
 c=c+4096;
if(bin2[5]==1)
 c=c+8192;
if(bin2[6]==1)
 c=c+16384;
if(bin2[7]==1)
 c=c+32768;
 temp=c;
}


void logic(int b)
{
  int x,q;
  int bin1[]=new int [8];
  int bin2[]=new int[8];
    for(x=0;x<8;x++)
 {
  if(a>0)
  bin1[x]=a%2;
  if(a!=0)
   a=a/2;
  else
  bin1[x]=0;
 }
   for(x=0;x<8;x++)
 {
  if(b>0)
  bin2[x]=b%2;
  if(b!=0)
   b=b/2;
  else
  bin2[x]=0;
}
  if(mem[pc]==7)
  {
   CY=bin1[7];
   for(x=7;x>0;x--)
    bin1[x]=bin1[x-1];
   bin1[0]=CY;
   }
  if(mem[pc]==15)
  {
   CY=bin1[0];
    for(x=0;x<7;x++)
    bin1[x]=bin1[x+1];
   bin1[7]=CY;
   }
  if(mem[pc]==23)
  {
   for(x=7;x>0;x--)
    bin1[x]=bin1[x-1];
   bin1[0]=CY;
   CY=bin1[7];
   }
   if(mem[pc]==31)
  {
    w=CY;
    CY=bin1[0];
    for(x=0;x<7;x++)
    bin1[x]=bin1[x+1];
    bin1[7]=w;
  }

  if(160<=mem[pc]&&mem[pc]<=167||mem[pc-1]==230)
  {
   for(x=0;x<8;x++)
   {
   bin1[x]=bin1[x]&bin2[x];
  }
  }
  if(168<=mem[pc]&&mem[pc]<=175||mem[pc-1]==238)
  {
   for(x=0;x<8;x++)
   bin1[x]=bin1[x]^bin2[x];
  }
  if(176<=mem[pc]&&mem[pc]<=183||mem[pc-1]==246)
  {
   for(x=0;x<8;x++)
   bin1[x]=bin1[x]|bin2[x];
  }
  if(mem[pc]==47)
   for(x=0;x<8;x++)
   {
    if(bin1[x]==1)
      bin1[x]=0;
     else
      bin1[x]=1;
    }
 q=0;
if(bin1[0]==1)
 q=q+1;
if(bin1[1]==1)
 q=q+2;
if(bin1[2]==1)
 q=q+4;
if(bin1[3]==1)
 q=q+8;
if(bin1[4]==1)
 q=q+16;
if(bin1[5]==1)
 q=q+32;
if(bin1[6]==1)
 q=q+64;
if(bin1[7]==1)
 q=q+128;
a=q;
}

void pop()
{
  z=ram[sp];sp++;if(sp==1024){sp=0;}
  w=ram[sp];sp++;if(sp==1024){sp=0;}
  add(w,z);
  pc=temp;
}


void dad(int op)
{
int bin1[]=new int [16];z=op;
  for(int x=0;x<16;x++)
 {
  if(z>0)
  bin1[x]=z%2;
  if(z!=0)
   z=z/2;
  else
  bin1[x]=0;
 }
 w=0;
if(bin1[0]==1)
 w=w+1;
if(bin1[1]==1)
 w=w+2;
if(bin1[2]==1)
 w=w+4;
if(bin1[3]==1)
 w=w+8;
if(bin1[4]==1)
 w=w+16;
if(bin1[5]==1)
 w=w+32;
if(bin1[6]==1)
 w=w+64;
if(bin1[7]==1)
 w=w+128;
z=0;
if(bin1[8]==1)
 z=z+1;
if(bin1[9]==1)
 z=z+2;
if(bin1[10]==1)
 z=z+4;
if(bin1[11]==1)
 z=z+8;
if(bin1[12]==1)
 z=z+16;
if(bin1[13]==1)
 z=z+32;
if(bin1[14]==1)
 z=z+64;
if(bin1[15]==1)
 z=z+128;
}

////////////////////////////////////////////////////////////////////////////////////////
public void Title(String s)
		{
	      setTitle(s);
		}
}

class outputLayout implements LayoutManager {

    public outputLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 476 + insets.left + insets.right;
        dim.height = 450 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+48,72,24);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+48,72,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+80,72,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+80,72,24);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+112,72,24);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+112,72,24);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+144,72,24);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+144,72,24);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+48,48,24);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+328,insets.top+48,48,24);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+80,48,24);}
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+328,insets.top+80,48,24);}
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+112,48,24);}
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+328,insets.top+112,48,24);}
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+144,48,24);}
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+328,insets.top+144,48,24);}
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+16,72,24);}
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+16,144,24);}
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+16,72,24);}
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+328,insets.top+16,144,24);}
        c = parent.getComponent(20);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+48,72,24);}
        c = parent.getComponent(21);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+48,72,24);}
        c = parent.getComponent(22);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+80,72,24);}
        c = parent.getComponent(23);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+80,72,24);}
        c = parent.getComponent(24);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+112,72,24);}
        c = parent.getComponent(25);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+112,72,24);}
        c = parent.getComponent(26);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+144,72,24);}
        c = parent.getComponent(27);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+144,72,24);}
        c = parent.getComponent(28);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+192,72,24);}
        c = parent.getComponent(29);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+192,72,24);}
        c = parent.getComponent(30);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+192,56,24);}
        c = parent.getComponent(31);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+192,72,24);}
        c = parent.getComponent(32);
        if (c.isVisible()) {c.setBounds(insets.left+328,insets.top+192,72,24);}
        c = parent.getComponent(33);
        if (c.isVisible()) {c.setBounds(insets.left+296,insets.top+248,168,200);}
        c = parent.getComponent(34);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+328,72,24);}
        c = parent.getComponent(35);
        if (c.isVisible()) {c.setBounds(insets.left+80,insets.top+328,72,24);}
        c = parent.getComponent(36);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+352,72,24);}
        c = parent.getComponent(37);
        if (c.isVisible()) {c.setBounds(insets.left+80,insets.top+352,72,24);}
        c = parent.getComponent(38);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+376,72,24);}
        c = parent.getComponent(39);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+400,72,24);}
        c = parent.getComponent(40);
        if (c.isVisible()) {c.setBounds(insets.left+80,insets.top+376,72,24);}
        c = parent.getComponent(41);
        if (c.isVisible()) {c.setBounds(insets.left+80,insets.top+400,72,24);}
        c = parent.getComponent(42);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+256,24,24);}
        c = parent.getComponent(43);
        if (c.isVisible()) {c.setBounds(insets.left+32,insets.top+256,24,24);}
        c = parent.getComponent(44);
        if (c.isVisible()) {c.setBounds(insets.left+64,insets.top+256,24,24);}
        c = parent.getComponent(45);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+256,24,24);}
        c = parent.getComponent(46);
        if (c.isVisible()) {c.setBounds(insets.left+120,insets.top+256,24,24);}
        c = parent.getComponent(47);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+256,24,24);}
        c = parent.getComponent(48);
        if (c.isVisible()) {c.setBounds(insets.left+176,insets.top+256,24,24);}
        c = parent.getComponent(49);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+256,24,24);}
        c = parent.getComponent(50);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+232,104,24);}
        c = parent.getComponent(51);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+296,144,24);}
        c = parent.getComponent(52);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+224,104,24);}
        c = parent.getComponent(53);
        if (c.isVisible()) {c.setBounds(insets.left+176,insets.top+304,104,120);}
        c = parent.getComponent(54);
        if (c.isVisible()) {c.setBounds(insets.left+352,insets.top+224,40,24);}
        c = parent.getComponent(55);
        if (c.isVisible()) {c.setBounds(insets.left+392,insets.top+224,72,24);}
    }
}
