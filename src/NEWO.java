import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;

public class NEWO extends JFrame implements ActionListener
{
    JScrollPane scrollpane_1;
    JLabel DATA_TRANSFER;
    JButton MOV;JButton LDAX;JButton MVI;JButton STAX;JButton LXI;JButton LHLD;JButton SHLD;JButton XCHG;JLabel label_1;JButton button_1;JButton INR;JButton SUB;
    JButton DAD;JButton ORA;JButton SBI;JButton INX;JButton ANA;JButton ANI;JButton ADI;JButton ADD;JButton ORI;JButton CMA;JButton CMC;JButton OUT;JButton XRA;JButton RAM;
    JButton DCX;JButton DCR;JButton SBB;JButton ACI;JButton ADC;JButton XRI;JButton CMP;JButton SUI;JButton CPI;JButton STC;JButton DAA;JLabel label_2;JButton UNCONDITIONAL;
    JButton NZ;JButton Z;JButton NC;JButton C_C;JButton PO;JButton PE;JButton P;JButton M_C;JLabel label_3;JButton A;JButton B;JButton C;JButton D;JButton E;JButton B3;JButton B4;
    JButton B5;JButton B6;JButton B2;JButton B1;JButton B0;JButton M;JButton L;JButton H;JButton B7;JButton B8;JButton B9; JButton a;JButton b;JButton POP;JButton PUSH;JButton RESET;
    JButton RET;JButton CALL;JButton JUMP; JButton f;JButton e;JButton d;JButton c;JButton XTHL;JButton SPHL;JButton HLT;JButton STA;JButton LDA;JButton NOP;JLabel label_4;JLabel label_5;JButton RLC;
    JButton RRC;JButton RAL;JButton RAR;JTable jt;TableModel myData;

    JMenuBar bar;
	JMenu file, edit, tools, about;
    JMenuItem New,save,open,exit,saveCDE;
    JMenuItem delet,insert,modi,ran,stop;
    JMenuItem help,design;
    Object[][] row=new Object[1024][3];
	NEWO win;
	output opt;
	control con;
	  int pc,ind,end,fl,backmode;
	  String s2,label;
	int index,flag,i;
    String s;
	JPanel panel;


       /*
        * instr =1 for ADD.
        * instr =2 for ADC.
        * instr =3 for SUB.
        * instr =4 for SBB.
        * instr =5 for INR.
        * instr =6 for INX.
        * instr =7 for DCR.
        * instr =8 for DCX.
        * LXI=50.
        */

     int opr = 0;/*containes value which shows how many operands required for instruction*/
     int opri = -1;/*containes value to shwo number of operands for instr. containing
                            * immediate operands
                            * it will be 2 for one hex nuber (2 Digits).
                            * and 1 for reg. e.g for LXI it will be (1+4)=5.

                            */


    public NEWO()
    {
		NEWOLayout customLayout = new NEWOLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);
        getContentPane().setBackground(Color.blue);

		bar=new JMenuBar();
		file=new JMenu("FILE");
		bar.add(file);
		edit=new JMenu("EDIT");
		//bar.add(edit);
        tools=new JMenu("TOOLS");
		bar.add(tools);
        about=new JMenu("ABOUT");
		bar.add(about);

		New=new  JMenuItem("NEW",new ImageIcon(Toolkit.getDefaultToolkit().getImage("usernew.gif")));New.addActionListener(this);
		open=new JMenuItem("OPEN",new ImageIcon(Toolkit.getDefaultToolkit().getImage("open.gif")));open.addActionListener(this);
		save=new JMenuItem("SAVE",new ImageIcon(Toolkit.getDefaultToolkit().getImage("save.gif")));save.addActionListener(this);
		exit=new JMenuItem("CLOSE",new ImageIcon(Toolkit.getDefaultToolkit().getImage("exit.gif")));exit.addActionListener(this);
		delet=new JMenuItem("Delete",new ImageIcon(Toolkit.getDefaultToolkit().getImage("remove.gif")));delet.addActionListener(this);
		insert=new JMenuItem("Insert",new ImageIcon(Toolkit.getDefaultToolkit().getImage("insert.gif")));insert.addActionListener(this);
		ran=new JMenuItem("Run",new ImageIcon(Toolkit.getDefaultToolkit().getImage("step-run.gif")));ran.addActionListener(this);
		stop=new JMenuItem("Stop");stop.addActionListener(this);
		help=new JMenuItem("Help",new ImageIcon(Toolkit.getDefaultToolkit().getImage("help.gif")));help.addActionListener(this);
		design=new JMenuItem("Design",new ImageIcon(Toolkit.getDefaultToolkit().getImage("about.gif")));design.addActionListener(this);
		modi=new JMenuItem("Modify",new ImageIcon(Toolkit.getDefaultToolkit().getImage("update.gif")));modi.addActionListener(this);
		saveCDE=new JMenuItem("Save .cde ");saveCDE.addActionListener(this);

		file.add(New);
		file.addSeparator();
		file.add(save);
		file.add(open);
		file.addSeparator();
		file.add(exit);
		file.addSeparator();
		file.add(saveCDE);

		tools.add(delet);
		tools.add(insert);
		tools.add(modi);
		tools.addSeparator();
		tools.add(ran);
	    bar.setBorderPainted(true);
		//bar.setBackground(Color.yellow);
		setJMenuBar(bar);

		about.add(help);
		about.addSeparator();
		about.add(design);
        myData = new tm();
		jt=new JTable(myData);
		jt.setRowHeight(20);

        scrollpane_1 = new JScrollPane(jt);
        jt.setPreferredScrollableViewportSize(new Dimension(200,300));
        getContentPane().add(scrollpane_1);


        DATA_TRANSFER = new JLabel("DATA TRANSFER");
		DATA_TRANSFER.setForeground(Color.green);
		getContentPane().add(DATA_TRANSFER);

        MOV = new JButton("MOV");MOV.addActionListener(this);
        getContentPane().add(MOV);

        LDAX = new JButton("LDAX");LDAX.addActionListener(this);
        getContentPane().add(LDAX);

        MVI = new JButton("MVI");MVI.addActionListener(this);
        getContentPane().add(MVI);

        STAX = new JButton("STAX");STAX.addActionListener(this);
        getContentPane().add(STAX);

        LXI = new JButton("LXI");LXI.addActionListener(this);
        getContentPane().add(LXI);

        LHLD = new JButton("LHLD");LHLD.addActionListener(this);
        getContentPane().add(LHLD);

        SHLD = new JButton("SHLD");SHLD.addActionListener(this);
        getContentPane().add(SHLD);

        XCHG = new JButton("XCHG");XCHG.addActionListener(this);
        getContentPane().add(XCHG);

        label_1 = new JLabel("ARITHMATIC & OTHER");
    	label_1.setForeground(Color.green);
	    getContentPane().add(label_1);

        button_1 = new JButton("--------");button_1.addActionListener(this);
        getContentPane().add(button_1);

        INR = new JButton("INR");INR.addActionListener(this);
        getContentPane().add(INR);

        SUB = new JButton("SUB");SUB.addActionListener(this);
        getContentPane().add(SUB);

        DAD = new JButton("DAD");DAD.addActionListener(this);
        getContentPane().add(DAD);

        ORA = new JButton("ORA");ORA.addActionListener(this);
        getContentPane().add(ORA);

        SBI = new JButton("SBI");SBI.addActionListener(this);
        getContentPane().add(SBI);

        INX = new JButton("INX");INX.addActionListener(this);
        getContentPane().add(INX);

        ANA = new JButton("ANA");ANA.addActionListener(this);
        getContentPane().add(ANA);

        ANI = new JButton("ANI");ANI.addActionListener(this);
        getContentPane().add(ANI);

        ADI = new JButton("ADI");ADI.addActionListener(this);
        getContentPane().add(ADI);

        ADD = new JButton("ADD");ADD.addActionListener(this);
        getContentPane().add(ADD);

        ORI = new JButton("ORI");ORI.addActionListener(this);
        getContentPane().add(ORI);

        CMA = new JButton("CMA");CMA.addActionListener(this);
        getContentPane().add(CMA);

        CMC = new JButton("CMC");CMC.addActionListener(this);
        getContentPane().add(CMC);

        OUT = new JButton("OUT");OUT.addActionListener(this);
        getContentPane().add(OUT);

        XRA = new JButton("XRA");XRA.addActionListener(this);
        getContentPane().add(XRA);

        RAM = new JButton("RAM");RAM.addActionListener(this);
        getContentPane().add(RAM);

        DCX = new JButton("DCX");DCX.addActionListener(this);
        getContentPane().add(DCX);

        DCR = new JButton("DCR");DCR.addActionListener(this);
        getContentPane().add(DCR);

        SBB = new JButton("SBB");SBB.addActionListener(this);
        getContentPane().add(SBB);

        ACI = new JButton("ACI");ACI.addActionListener(this);
        getContentPane().add(ACI);

        ADC = new JButton("ADC");ADC.addActionListener(this);
        getContentPane().add(ADC);

        XRI = new JButton("XRI");XRI.addActionListener(this);
        getContentPane().add(XRI);

        CMP = new JButton("CMP");CMP.addActionListener(this);
        getContentPane().add(CMP);

        SUI = new JButton("SUI");SUI.addActionListener(this);
        getContentPane().add(SUI);

        CPI = new JButton("CPI");CPI.addActionListener(this);
        getContentPane().add(CPI);

        STC = new JButton("STC");STC.addActionListener(this);
        getContentPane().add(STC);

        DAA = new JButton("DAA");DAA.addActionListener(this);
        getContentPane().add(DAA);

        label_2 = new JLabel("CONDITIONS");
    	label_2.setForeground(Color.green);
        getContentPane().add(label_2);

        UNCONDITIONAL = new JButton("UNCONDITIONAL");UNCONDITIONAL.addActionListener(this);
        getContentPane().add(UNCONDITIONAL);

        NZ = new JButton("NZ");NZ.addActionListener(this);
        getContentPane().add(NZ);

        Z = new JButton("Z");Z.addActionListener(this);
        getContentPane().add(Z);

        NC = new JButton("NC");NC.addActionListener(this);
        getContentPane().add(NC);

        C_C = new JButton("C");C_C.addActionListener(this);
        getContentPane().add(C_C);

        PO = new JButton("PO");PO.addActionListener(this);
        getContentPane().add(PO);

        PE = new JButton("PE");PE.addActionListener(this);
        getContentPane().add(PE);

        P = new JButton("P");P.addActionListener(this);
        getContentPane().add(P);

        M_C = new JButton("M");M_C.addActionListener(this);
        getContentPane().add(M_C);

        label_3 = new JLabel("REGISTERS");
    	label_3.setForeground(Color.green);
        getContentPane().add(label_3);

        A = new JButton("A");A.addActionListener(this);
        getContentPane().add(A);

        B = new JButton("B");B.addActionListener(this);
        getContentPane().add(B);

        C = new JButton("C");C.addActionListener(this);
        getContentPane().add(C);

        D = new JButton("D");D.addActionListener(this);
        getContentPane().add(D);

        E = new JButton("E");E.addActionListener(this);
        getContentPane().add(E);

        B3 = new JButton("3");B3.addActionListener(this);
        getContentPane().add(B3);

        B4 = new JButton("4");B4.addActionListener(this);
        getContentPane().add(B4);

        B5 = new JButton("5");B5.addActionListener(this);
        getContentPane().add(B5);

        B6 = new JButton("6");B6.addActionListener(this);
        getContentPane().add(B6);

        B2 = new JButton("2");B2.addActionListener(this);
        getContentPane().add(B2);

        B1 = new JButton("1");B1.addActionListener(this);
        getContentPane().add(B1);

        B0 = new JButton("0");B0.addActionListener(this);
        getContentPane().add(B0);

        M = new JButton("M");M.addActionListener(this);
        getContentPane().add(M);

        L = new JButton("L");L.addActionListener(this);
        getContentPane().add(L);

        H = new JButton("H");H.addActionListener(this);
        getContentPane().add(H);

        B7 = new JButton("7");B7.addActionListener(this);
        getContentPane().add(B7);

        B8 = new JButton("8");B8.addActionListener(this);
        getContentPane().add(B8);

        B9 = new JButton("9");B9.addActionListener(this);
        getContentPane().add(B9);

        a = new JButton("a");a.addActionListener(this);
        getContentPane().add(a);

        b = new JButton("b");b.addActionListener(this);
        getContentPane().add(b);

        POP = new JButton("POP");POP.addActionListener(this);
        getContentPane().add(POP);

        PUSH = new JButton("PUSH");PUSH.addActionListener(this);
        getContentPane().add(PUSH);

        RESET = new JButton("RESET");RESET.addActionListener(this);
        getContentPane().add(RESET);

        RET = new JButton("RET");RET.addActionListener(this);
        getContentPane().add(RET);

        CALL = new JButton("CALL");CALL.addActionListener(this);
        getContentPane().add(CALL);

        JUMP = new JButton("JUMP");JUMP.addActionListener(this);
        getContentPane().add(JUMP);

        f = new JButton("f");f.addActionListener(this);
        getContentPane().add(f);

        e = new JButton("e");e.addActionListener(this);
        getContentPane().add(e);

        d = new JButton("d");d.addActionListener(this);
        getContentPane().add(d);

        c = new JButton("c");c.addActionListener(this);
        getContentPane().add(c);

        XTHL = new JButton("XTHL");XTHL.addActionListener(this);
        getContentPane().add(XTHL);

        SPHL = new JButton("SPHL");SPHL.addActionListener(this);
        getContentPane().add(SPHL);

        HLT = new JButton("HLT");HLT.addActionListener(this);
        getContentPane().add(HLT);

        STA = new JButton("STA");STA.addActionListener(this);
        getContentPane().add(STA);

        LDA = new JButton("LDA");LDA.addActionListener(this);
        getContentPane().add(LDA);

        NOP = new JButton("NOP");NOP.addActionListener(this);
        getContentPane().add(NOP);

        label_4 = new JLabel("DIGITS");
    	label_4.setForeground(Color.green);
        getContentPane().add(label_4);

        label_5 = new JLabel("BRANCH & OTHER");
    	label_5.setForeground(Color.green);
        getContentPane().add(label_5);

        RLC = new JButton("RLC");RLC.addActionListener(this);
        getContentPane().add(RLC);

        RRC = new JButton("RRC");RRC.addActionListener(this);
        getContentPane().add(RRC);

        RAL = new JButton("RAL");RAL.addActionListener(this);
        getContentPane().add(RAL);

        RAR = new JButton("RAR");RAR.addActionListener(this);
        getContentPane().add(RAR);


        setSize(getPreferredSize());

		 s="";
		 pc=0;
		 end=0;
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
		//exe();

    }
    public static void main(String args[])
    {
        NEWO window = new NEWO();
		window.win=window;
		window.con=new control(window.win);
		window.opt=new output(window.win);
        window.opt.pack();
		window.setTitle("8085 Emulator");
        window.pack();
        window.show();

    }

       public void tab(int d,String s)
    {
	   if(flag!=1)
		{
        myData.setValueAt(s, i , 2);
		s=Integer.toHexString(d).toUpperCase();s2="0";
        for(int x=s.length();x<2;x++)
 			s=s2.concat(s);
		myData.setValueAt(s, i , 1);
		s=Integer.toHexString(pc).toUpperCase();s2="0";
        for(int x=s.length();x<4;x++)
		  s=s2.concat(s);
        myData.setValueAt(s, i , 0);
		i++;
		}
		else
		{
			insert(d,s);
		}
		this.s="";
    }
public void actionPerformed(ActionEvent e)
	{
			index=-1;
			if(e.getSource()==MOV)
			   index=0;
			if(e.getSource()==MVI)
				index=1;
			if(e.getSource()==LXI)
				index=2;
            if(e.getSource()==XCHG)
				index=3;
			if(e.getSource()==LDAX)
				index=4;
			if(e.getSource()==STAX)
				index=5;
if(e.getSource()==LHLD)
				index=6;
if(e.getSource()==SHLD)
				index=7;
if(e.getSource()==ADD)
				index=8;
if(e.getSource()==ADI)
				index=9;
if(e.getSource()==ADC)
				index=10;
if(e.getSource()==ACI)
				index=11;
if(e.getSource()==SUB)
				index=12;
if(e.getSource()==SBB)
				index=13;
if(e.getSource()==SUI)
				index=14;
if(e.getSource()==SBI)
				index=15;
if(e.getSource()==INR)
				index=16;
if(e.getSource()==INX)
				index=17;
if(e.getSource()==DCR)
				index=18;
if(e.getSource()==DCX)
				index=19;
if(e.getSource()==DAD)
				index=20;////
if(e.getSource()==RAM)
		{        RamLoad reo=new RamLoad(this,true,opt);
		reo.show();

		}
if(e.getSource()==OUT)
				index=23;
if(e.getSource()==ANA)
				index=24;
if(e.getSource()==ANI)
				index=25;
if(e.getSource()==XRA)
				index=26;
if(e.getSource()==XRI)
				index=27;
if(e.getSource()==ORA)
				index=28;
if(e.getSource()==ORI)
				index=29;
if(e.getSource()==CMP)
				index=30;
if(e.getSource()==CPI)
				index=31;
if(e.getSource()==CMA)
				index=32;
if(e.getSource()==CMC)
				index=33;
if(e.getSource()==STC)
				index=34;///
if(e.getSource()==DAA)
				index=35;///
if(e.getSource()==RLC)
				index=36;
if(e.getSource()==RRC)
				index=37;
if(e.getSource()==RAL)
				index=38;
if(e.getSource()==RAR)
				index=39;
if(e.getSource()==JUMP)
				index=40;
if(e.getSource()==CALL)
				index=41;
if(e.getSource()==RET)
				index=42;
if(e.getSource()==RESET)
				index=43;
if(e.getSource()==PUSH)
				index=44;
if(e.getSource()==POP)
				index=45;
if(e.getSource()==XTHL)
				index=46;
if(e.getSource()==SPHL)
				index=47;
if(e.getSource()==HLT)
				index=48;
if(e.getSource()==NOP)
				index=49;
if(e.getSource()==STA)
				index=50;
if(e.getSource()==LDA)
				index=51;
/*if(e.getSource()==bt51)
				index=52;
if(e.getSource()==BT52)
				index=51;*/

if(e.getSource()==A)
				index=0;
if(e.getSource()==B)
				index=1;
if(e.getSource()==C)
				index=2;
if(e.getSource()==D)
				index=3;
if(e.getSource()==E)
				index=4;
if(e.getSource()==H)
				index=5;
if(e.getSource()==L)
				index=6;
if(e.getSource()==M)
			index=7;

if(e.getSource()==B0)
				index=0;
if(e.getSource()==B1)
				index=1;
if(e.getSource()==B2)
				index=2;
if(e.getSource()==B3)
				index=3;
if(e.getSource()==B4)
				index=4;
if(e.getSource()==B5)
				index=5;
if(e.getSource()==B6)
				index=6;
if(e.getSource()==B7)
     index=7;
if(e.getSource()==B8)
				index=8;
if(e.getSource()==B9)
				index=9;
if(e.getSource()==a)
				index=10;
if(e.getSource()==b)
				index=11;
if(e.getSource()==c)
				index=12;
if(e.getSource()==d)
				index=13;
if(e.getSource()==e)
				index=14;
if(e.getSource()==f)
     index=15;

if(e.getSource()==UNCONDITIONAL)
				index=0;
if(e.getSource()==NZ)
				index=1;
if(e.getSource()==Z)
				index=2;
if(e.getSource()==NC)
				index=3;
if(e.getSource()==C_C)
				index=4;
if(e.getSource()==PO)
				index=5;
if(e.getSource()==PE)
				index=6;
if(e.getSource()==P)
     index=7;
if(e.getSource()==M_C)
     index=8;

if(e.getSource()==delet)
	deletCal();
if(e.getSource()==ran)
		{read();}
if(e.getSource()==exit)
		{System.exit(0);}
if(e.getSource()==modi)
		{if(jt.getValueAt(jt.getSelectedRow(),2).toString().length()<1)index=999;}
if(e.getSource()==save)
		{
	      for(int x=0;x<i;x++)
			{
			  row[x][0]=myData.getValueAt(x,0);
			  row[x][1]=myData.getValueAt(x,1);
			  row[x][2]=myData.getValueAt(x,2);
			}
		  fsave fi=new fsave(win);
        }
if(e.getSource()==open)
		{
	       openCode cd=new openCode(win);
            row=(Object[][])cd.ret();
			i=cd.co();
			pc=i;
			//System.out.println("#####"+i);
	      for(int x=0;x<i;x++)
			{
			   myData.setValueAt(row[x][0],x , 0) ;
			   myData.setValueAt(row[x][1],x , 1) ;
			   myData.setValueAt(row[x][2],x , 2) ;

			}
		}
if(e.getSource()==design)
		{
	      System.out.println("************");
	      aboutdialog desig=new aboutdialog(this,true) ;
		  design.show();
		}
if(e.getSource()==insert)
		{ind=jt.getSelectedRow();lable("Do You Want To Insert Instruction ");if(jt.getValueAt(ind,2).toString()==""){lable("You Can't Insert Here");flag=0;}}
//System.out.println("index  "+index);
if(index!=-1)
		{
			s=s.concat(e.getActionCommand());
			s2=e.getActionCommand();
			if(s2=="A"|s2=="B"|s2=="C"|s2=="D"|s2=="E"|s2=="H"|s2=="L"|s2=="M")
				s=s.concat(",");
		    if(s2!="0"&s2!="1"&s2!="2"&s2!="3"&s2!="4"&s2!="5"&s2!="6"&s2!="7"&s2!="8"&s2!="9"&s2!="a"&s2!="b"&s2!="c"&s2!="d"&s2!="e"&s2!="f")
		      s=s.concat("   ");
	      fl=1;con.control();
	    }
if(e.getSource()==New)
		{
			for(int xx=0;xx<i;xx++)
			{
				jt.setValueAt("",xx,0);
				jt.setValueAt("",xx,1);
				jt.setValueAt("",xx,2);

			}
			flag=0;
			i=0;
		}
if(e.getSource()==saveCDE)
		{
	      savecde();

		}

		if(e.getSource()==help)
		{
		     help hp=new help();
		     hp.setTitle("Help");
		     hp.pack();
		     hp.show();
		}


	}


public void savecde()
	{
		int addr;
		 for(int x=0;x<i;x++)
		{
		  s2=jt.getValueAt(x,0).toString();
		  addr=Integer.parseInt(s2,16);
		  s2=jt.getValueAt(x,1).toString();
		  opt.mem[addr]=Integer.parseInt(s2,16);
		  System.out.println(addr+"   "+opt.mem[addr]);
		}

	  		FileDialog fd=new FileDialog(this,"Save",FileDialog.SAVE);
			fd.setVisible(true);
			String str1=fd.getFile();
			if(str1!=null)
			{
				StringTokenizer st=new StringTokenizer(str1,".");
				String str2="";
				str2=st.nextToken();
				File f1;
				f1=new File(fd.getDirectory(),str2+".cde");
					try
					{
							FileOutputStream fos=new FileOutputStream(f1);
                            DataOutputStream da=new DataOutputStream(fos);
							for(int q=0;q<i;q++)
							{
								System.out.println(opt.mem[q]);
								da.writeInt(opt.mem[q]);
							}
							fos.flush();
							fos.close();
					}
					catch(Exception e)
					{

					}
				}

	}
public void deletCal()
	{
	  lable("Do You Want To Delete");
      if(flag==1)
		{flag=0;
	  String sr,sr1,sr2;
	  Object o;
	  int rn=jt.getSelectedRow();
//	  System.out.println("*************"+rn+"    "+i);
	  int rn1=rn;rn1++;
	  int s,d,f;
	  if(rn!=-1&(rn1!=i|rn1<i))
		{
		  o=jt.getValueAt(rn,2);
		  sr=o.toString();
		 // System.out.println("**************");
		 // System.out.println(o+"  "+sr+" ");
		  if(o==null)
			  System.out.println("null");
		  if(sr.length()!=0)
			{f=0;sr1="";
			  for(;rn1<i;rn1++)
				{  o=jt.getValueAt(rn1,2);sr1=o.toString();if(sr1.length()!=0){f=1;break;}}
			//	System.out.println(sr1+"  "+rn+"  "+rn1+"  "+f);
				if(f==1)
				{
					for (d=rn,s=rn1;s<i ;s++,d++)
					{
						o=jt.getValueAt(s,1);sr=o.toString();jt.setValueAt(sr,d,1);//System.out.print(sr+"  ");
						o=jt.getValueAt(s,2);sr=o.toString();jt.setValueAt(sr,d,2);//System.out.print(sr+"  ");
						//o=jt.getValueAt(s,3);sr=o.toString();System.out.print(sr+"  ");jt.setValueAt(sr,d,3);
				//	System.out.println();
					}
					for(s=i-(rn1-rn);s<i;s++)
					{jt.setValueAt("",s,0);jt.setValueAt("",s,1);jt.setValueAt("",s,2);}//jt.setValueAt("",s,3);}

					i-=(rn1-rn);
					pc-=(rn1-rn);
				}
			}
		}
		}
	}
public void insert(int d,String s)
	{
	  String sr;
	  Object o;
	  for(int x=i;x>ind;x--)
		{
          o=jt.getValueAt(x-1,1);sr=o.toString();jt.setValueAt(sr,x,1);
          o=jt.getValueAt(x-1,2);sr=o.toString();jt.setValueAt(sr,x,2);
	    }
        jt.setValueAt(Integer.toHexString(d).toUpperCase(), ind , 1);
        jt.setValueAt(s,ind,2);
		s=Integer.toHexString(i).toUpperCase();sr="0";
        for(int x=s.length();x<4;x++)
		  s=sr.concat(s);
        jt.setValueAt(s,i,0);
		i++;ind++;
	}
public void lable(String s)
	{
     ldialog labeldilog=new ldialog(this,true,s);
	 labeldilog.show();
	 label="def";
     flag=0;
	 if(labeldilog.check()==1)
        flag=1;
	 }
public void read()
	{
      int addr;
	  String s=getTitle();
	  s=s.concat("  OutPut  Window");
	  opt.Title(s);
	 for(int x=0;x<i;x++)
		{
		  s2=jt.getValueAt(x,0).toString();
		  addr=Integer.parseInt(s2,16);
		  s2=jt.getValueAt(x,1).toString();
		  opt.mem[addr]=Integer.parseInt(s2,16);
		  System.out.println(addr+"   "+opt.mem[addr]);
		}
		index=9999;
	}
}

class ldialog extends JDialog implements ActionListener
{
	JButton b1,b2;
	JLabel  l;
	//JTextField tf;
	int f;
	ldialog(JFrame f,boolean b,String s)
	{
		super(f,b);
		setLayout(null);
		setTitle("Message");
		l=new JLabel(s);
		l.setBounds(20,20,200,20);
		add(l);
	//	tf=new JTextField();
	//	tf.setBounds(120,20,80,20);
	//	add(tf);
		b1=new JButton("OK");
		b1.setBounds(10,60,70,20);
		add(b1);b1.addActionListener(this);
		b2=new JButton("Cancel");
		b2.setBounds(110,60,100,20);
		add(b2);b2.addActionListener(this);
		setBounds(300,200,240,140);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{f=1;dispose();}
		if(e.getSource()==b2)
		{f=2;dispose();}
	}
	public int check()
	{ return(f);}
	public String label()
	{return("w");}
}

class RamLoad extends JDialog implements ActionListener
{
	JTextField 	t1,t2;
	JLabel l1,l2;
	JButton b1,b2;
	int a,b,c;
	output opt;
	String s;
	RamLoad(JFrame f,boolean b,output opt)
	{
		System.out.println(opt.ram[0]);
        this.opt=opt;
		setLayout(null);
		setBounds(300,200,250,180);
		setBackground(new Color(254,254,0));
		t1=new JTextField("0000");
		t1.setBounds(150,10,50,20);
		add(t1);
		t2=new JTextField();t2.setText(String.valueOf(opt.ram[0]));
		t2.setBounds(150,50,50,20);
		add(t2);
		l1=new JLabel(" Memory Address = ");
		l1.setBounds(10,10,150,20);
		add(l1);
		l2=new JLabel(" Memory Content is =");
		l2.setBounds(10,50,150,20);
		add(l2);
		b2=new JButton("NEXT");b2.addActionListener(this);
		b2.setBounds(10,100,100,20);
		add(b2);
		b1=new JButton("OK");b1.addActionListener(this);
		b1.setBounds(130,100,100,20);
		add(b1);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			a=Integer.parseInt(t1.getText(),16);
			if(a<1024)
			{
				b=Integer.parseInt(t2.getText(),16);
				if(b<256)
				{
					opt.ram[a]=b;
					a++;
					s=Integer.toHexString(a);
					for(c=0;c<4;c++)
						s="0".concat(s);
					t1.setText(s);
				}
			}
		}
		if(e.getSource()==b1)
		{
			dispose();
		}
	}
}
class NEWOLayout implements LayoutManager
{
    public NEWOLayout()
    {
    }
    public void addLayoutComponent(String name, Component comp)
    {
    }
    public void removeLayoutComponent(Component comp)
    {
    }
    public Dimension preferredLayoutSize(Container parent)
    {
        Dimension dim = new Dimension(0, 0);
        Insets insets = parent.getInsets();
        dim.width = 977 + insets.left + insets.right;
        dim.height = 583 + insets.top + insets.bottom;
        return dim;
    }
    public Dimension minimumLayoutSize(Container parent)
    {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }
    public void layoutContainer(Container parent)
    {
        Insets insets = parent.getInsets();
        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+32,328,520);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+24,128,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+56,72,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+88,72,24);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+56,72,24);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+88,72,24);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+56,72,24);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+88,72,24);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+88,72,24);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+56,72,24);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+136,136,24);}
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+264,72,24);}
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+232,72,24);}
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+200,72,24);}
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+264,72,24);}
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+328,72,24);}
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+200,72,24);}
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+232,72,24);}
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+296,72,24);}
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+296,72,24);}
        c = parent.getComponent(20);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+168,72,24);}
        c = parent.getComponent(21);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+168,72,24);}
        c = parent.getComponent(22);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+328,72,24);}
        c = parent.getComponent(23);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+360,72,24);}
        c = parent.getComponent(24);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+360,72,24);}
        c = parent.getComponent(25);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+264,72,24);}
        c = parent.getComponent(26);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+296,72,24);}
        c = parent.getComponent(27);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+264,72,24);}
        c = parent.getComponent(28);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+232,72,24);}
        c = parent.getComponent(29);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+232,72,24);}
        c = parent.getComponent(30);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+200,72,24);}
        c = parent.getComponent(31);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+168,72,24);}
        c = parent.getComponent(32);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+168,72,24);}
        c = parent.getComponent(33);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+296,72,24);}
        c = parent.getComponent(34);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+328,72,24);}
        c = parent.getComponent(35);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+200,72,24);}
        c = parent.getComponent(36);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+328,72,24);}
        c = parent.getComponent(37);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+360,72,24);}
        c = parent.getComponent(38);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+360,72,24);}
        c = parent.getComponent(39);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+432,144,24);}
        c = parent.getComponent(40);
        if (c.isVisible()) {c.setBounds(insets.left+432,insets.top+464,136,24);}
        c = parent.getComponent(41);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+496,72,24);}
        c = parent.getComponent(42);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+496,72,24);}
        c = parent.getComponent(43);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+496,72,24);}
        c = parent.getComponent(44);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+496,72,24);}
        c = parent.getComponent(45);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+528,72,24);}
        c = parent.getComponent(46);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+528,72,24);}
        c = parent.getComponent(47);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+528,72,24);}
        c = parent.getComponent(48);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+528,72,24);}
        c = parent.getComponent(49);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+24,176,24);}
        c = parent.getComponent(50);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+56,56,24);}
        c = parent.getComponent(51);
        if (c.isVisible()) {c.setBounds(insets.left+776,insets.top+56,56,24);}
        c = parent.getComponent(52);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+56,56,24);}
        c = parent.getComponent(53);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+56,56,24);}
        c = parent.getComponent(54);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+88,56,24);}
        c = parent.getComponent(55);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+168,56,24);}
        c = parent.getComponent(56);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+200,56,24);}
        c = parent.getComponent(57);
        if (c.isVisible()) {c.setBounds(insets.left+776,insets.top+200,56,24);}
        c = parent.getComponent(58);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+200,56,24);}
        c = parent.getComponent(59);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+168,56,24);}
        c = parent.getComponent(60);
        if (c.isVisible()) {c.setBounds(insets.left+776,insets.top+168,56,24);}
        c = parent.getComponent(61);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+168,56,24);}
        c = parent.getComponent(62);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+88,56,24);}
        c = parent.getComponent(63);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+88,56,24);}
        c = parent.getComponent(64);
        if (c.isVisible()) {c.setBounds(insets.left+776,insets.top+88,56,24);}
        c = parent.getComponent(65);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+200,56,24);}
        c = parent.getComponent(66);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+232,56,24);}
        c = parent.getComponent(67);
        if (c.isVisible()) {c.setBounds(insets.left+776,insets.top+232,56,24);}
        c = parent.getComponent(68);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+232,56,24);}
        c = parent.getComponent(69);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+232,56,24);}
        c = parent.getComponent(70);
        if (c.isVisible()) {c.setBounds(insets.left+880,insets.top+384,72,24);}
        c = parent.getComponent(71);
        if (c.isVisible()) {c.setBounds(insets.left+800,insets.top+384,72,24);}
        c = parent.getComponent(72);
        if (c.isVisible()) {c.setBounds(insets.left+720,insets.top+384,72,24);}
        c = parent.getComponent(73);
        if (c.isVisible()) {c.setBounds(insets.left+880,insets.top+352,72,24);}
        c = parent.getComponent(74);
        if (c.isVisible()) {c.setBounds(insets.left+800,insets.top+352,72,24);}
        c = parent.getComponent(75);
        if (c.isVisible()) {c.setBounds(insets.left+720,insets.top+352,72,24);}
        c = parent.getComponent(76);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+264,56,24);}
        c = parent.getComponent(77);
        if (c.isVisible()) {c.setBounds(insets.left+840,insets.top+264,56,24);}
        c = parent.getComponent(78);
        if (c.isVisible()) {c.setBounds(insets.left+776,insets.top+264,56,24);}
        c = parent.getComponent(79);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+264,56,24);}
        c = parent.getComponent(80);
        if (c.isVisible()) {c.setBounds(insets.left+720,insets.top+416,72,24);}
        c = parent.getComponent(81);
        if (c.isVisible()) {c.setBounds(insets.left+800,insets.top+416,72,24);}
        c = parent.getComponent(82);
        if (c.isVisible()) {c.setBounds(insets.left+880,insets.top+416,72,24);}
        c = parent.getComponent(83);
        if (c.isVisible()) {c.setBounds(insets.left+800,insets.top+448,72,24);}
        c = parent.getComponent(84);
        if (c.isVisible()) {c.setBounds(insets.left+880,insets.top+448,72,24);}
        c = parent.getComponent(85);
        if (c.isVisible()) {c.setBounds(insets.left+720,insets.top+448,72,24);}
        c = parent.getComponent(86);
        if (c.isVisible()) {c.setBounds(insets.left+712,insets.top+136,184,24);}
        c = parent.getComponent(87);
        if (c.isVisible()) {c.setBounds(insets.left+720,insets.top+320,184,24);}
        c = parent.getComponent(88);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+392,72,24);}
        c = parent.getComponent(89);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+392,72,24);}
        c = parent.getComponent(90);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+392,72,24);}
        c = parent.getComponent(91);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+392,72,24);}
    }


}
 class tm extends AbstractTableModel
{
    String[] columnNames={"Address","Opcode","Mnemonic"};
    Object[][] rowData=new Object[1024][4];
	public String getColumnName(int col)
	{
       return columnNames[col].toString();
    }
    public int getRowCount()
	{
		return rowData.length;
	}
    public int getColumnCount()
	{
		return columnNames.length;
	}
    public Object getValueAt(int row, int col)
	{
        return rowData[row][col];
    }
    public boolean isCellEditable(int row, int col)
    {
		/*if(col==2)
        return true;
        else*/
        return false;
	}
    public void setValueAt(Object value, int row, int col)
	{
        rowData[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
class aboutdialog extends  JDialog implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JButton bt1;
	aboutdialog(Frame fr,boolean bl)
	{
		super(fr,bl);
		setTitle("About 8085 Emulator");

		bt1=new JButton("OK");
		bt1.setBounds(140,120,80,30);
		bt1.addActionListener(this);
		l1=new JLabel("      Created  By:    ");
		l1.setBounds(100,20,100,20);
		l2=new JLabel("  NIKHIL PINGLE ");
		l2.setBounds(60,60,100,20);
		l3=new JLabel("  RAHUL ALGUDE ");
        l3.setBounds(200,60,100,20);

		Container con=getContentPane();
		con.setLayout(null);
		con.add(l1);
		con.add(l2);
		con.add(l3);
		con.add(bt1);
       	this.setBounds(200,150,350,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		dispose();

	}
}