class control implements Runnable
{
   	NEWO c;
	int mem[]=new int[10];
	int index,ind,pc,end,a;
	String dis,s2;
    String s;
	control(NEWO c)
	{
		this.c=c;
        new Thread(this,"7447").start();
	}
	public void run()
	{
		
		
		System.out.println(" control run");
		try
		{
			Thread.sleep(100);
		}
		catch (Exception e)
		{
		}
		exe();
		System.out.println("control stop");
	}
  synchronized public void control()
	{
		  try
		{
		  if(c.fl==0){ wait();}
		  else{
			   index=c.index;  notify();}
		}
		catch (InterruptedException i)
		{
		}
		  
	}
public void hexclick()
	{
	disableAll();
               c.B0.setEnabled(true);
               c.B1.setEnabled(true);
               c.B2.setEnabled(true);
               c.B3.setEnabled(true);
               c.B4.setEnabled(true);
               c.B5.setEnabled(true);
               c.B6.setEnabled(true);
			   c.B7.setEnabled(true);
               c.B8.setEnabled(true);
               c.B9.setEnabled(true);
               c.a.setEnabled(true);
               c.b.setEnabled(true);
			   c.f.setEnabled(true);
               c.e.setEnabled(true);
               c.d.setEnabled(true);
               c.c.setEnabled(true);
		c.fl=0;
		control();
		ind=0;ind=index*16;
		c.fl=0;
		control();
        ind=ind+index; 
	}
public void regclick()
	{
	disableAll();
			   c.A.setEnabled(true);
               c.B.setEnabled(true);
               c.C.setEnabled(true);
               c.D.setEnabled(true);
               c.E.setEnabled(true);
               c.H.setEnabled(true);
               c.L.setEnabled(true);
               c.M.setEnabled(true);
		c.fl=0;
		control();
	}
public void regclick1()
	{
	disableAll();
               c.B.setEnabled(true);
               c.D.setEnabled(true);
               c.H.setEnabled(true);
               c.M.setEnabled(true);
		c.fl=0;
		control();
	}
public void regclick2()
	{
	disableAll();
               c.B.setEnabled(true);
               c.D.setEnabled(true);
               c.H.setEnabled(true);
               c.A.setEnabled(true);
		c.fl=0;
		control();
	}
public void sregclick()
	{
	disableAll();
               c.B.setEnabled(true);
               c.D.setEnabled(true);
               //c.H.setEnabled(true);
               //c.M.setEnabled(true);
		c.fl=0;
		control();
	}
public void condition()
	{
	disableAll();
			   c.UNCONDITIONAL.setEnabled(true);
               c.NZ.setEnabled(true);
               c.Z.setEnabled(true);
               c.NC.setEnabled(true);
               c.C_C.setEnabled(true);
               c.PO.setEnabled(true);
               c.PE.setEnabled(true);
               c.P.setEnabled(true);
               c.M_C.setEnabled(true);
		c.fl=0;
		control();
	}

public void backto()
	{
	 disableAll();
			   c.backmode=1;
	           c.MOV.setEnabled(true);
               c.MVI.setEnabled(true);
               c.LXI.setEnabled(true);
               c.XCHG.setEnabled(true);
               c.LDAX.setEnabled(true);
               c.STAX.setEnabled(true);
               c.LHLD.setEnabled(true);
               c.SHLD.setEnabled(true);

               c.ADD.setEnabled(true);
               c.ADC.setEnabled(true);
               c.ADI.setEnabled(true);
               c.ACI.setEnabled(true);
               c.SUB.setEnabled(true);
               c.SBB.setEnabled(true);
               c.SBI.setEnabled(true);
               c.SUI.setEnabled(true);
               c.INR.setEnabled(true);
               c.INX.setEnabled(true);
               c.DCR.setEnabled(true);
               c.DCX.setEnabled(true);
               c.DAD.setEnabled(true);
               c.RAM.setEnabled(true);
               c.OUT.setEnabled(true);

               c.ANA.setEnabled(true);
               c.ANI.setEnabled(true);
               c.XRA.setEnabled(true);
               c.XRI.setEnabled(true);
               c.ORA.setEnabled(true);
               c.ORI.setEnabled(true);
               c.CMP.setEnabled(true);
               c.CPI.setEnabled(true);
               c.CMA.setEnabled(true);
               c.CMC.setEnabled(true);
               c.STC.setEnabled(true);
               c.RLC.setEnabled(true);
               c.RRC.setEnabled(true);
               c.RAL.setEnabled(true);
               c.RAR.setEnabled(true);
			   c.POP.setEnabled(true);/*gb5*/
               c.PUSH.setEnabled(true);
			   c.RESET.setEnabled(true);
			   c.RET.setEnabled(true);
			   c.CALL.setEnabled(true);
			   c.JUMP.setEnabled(true);
			   c.XTHL.setEnabled(true);
               c.SPHL.setEnabled(true);
               c.HLT.setEnabled(true);
               c.STA.setEnabled(true);
               c.LDA.setEnabled(true);
               c.NOP.setEnabled(true);
			   c.DAA.setEnabled(true);
              // .setEnabled(true);
		c.fl=0;
		control();
	}

public void disableAll()
	{
		       c.MOV.setEnabled(false);
               c.MVI.setEnabled(false);
               c.LXI.setEnabled(false);
               c.XCHG.setEnabled(false);
               c.LDAX.setEnabled(false);
               c.STAX.setEnabled(false);
               c.LHLD.setEnabled(false);
               c.SHLD.setEnabled(false);

               c.ADD.setEnabled(false);
               c.ADC.setEnabled(false);
               c.ADI.setEnabled(false);
               c.ACI.setEnabled(false);
               c.SUB.setEnabled(false);
               c.SBB.setEnabled(false);
               c.SBI.setEnabled(false);
               c.SUI.setEnabled(false);
               c.INR.setEnabled(false);
               c.INX.setEnabled(false);
               c.DCR.setEnabled(false);
               c.DCX.setEnabled(false);
               c.DAD.setEnabled(false);
               c.RAM.setEnabled(false);
               c.OUT.setEnabled(false);

               c.ANA.setEnabled(false);
               c.ANI.setEnabled(false);
               c.XRA.setEnabled(false);
               c.XRI.setEnabled(false);
               c.ORA.setEnabled(false);
               c.ORI.setEnabled(false);
               c.CMP.setEnabled(false);
               c.CPI.setEnabled(false);
               c.CMA.setEnabled(false);
               c.CMC.setEnabled(false);
               c.STC.setEnabled(false);
               c.RLC.setEnabled(false);
               c.RRC.setEnabled(false);
               c.RAL.setEnabled(false);
               c.RAR.setEnabled(false);
			   c.POP.setEnabled(false);/*gb5*/
               c.PUSH.setEnabled(false);
			   c.RESET.setEnabled(false);
			   c.RET.setEnabled(false);
			   c.CALL.setEnabled(false);
			   c.JUMP.setEnabled(false);
			   c.XTHL.setEnabled(false);
               c.SPHL.setEnabled(false);
               c.HLT.setEnabled(false);
               c.STA.setEnabled(false);
               c.LDA.setEnabled(false);
               c.NOP.setEnabled(false);
              // .setEnabled(false);

               c.button_1.setEnabled(false);
               c.DAA.setEnabled(false);

               c.B0.setEnabled(false);
               c.B1.setEnabled(false);
               c.B2.setEnabled(false);
               c.B3.setEnabled(false);
               c.B4.setEnabled(false);
               c.B5.setEnabled(false);
               c.B6.setEnabled(false);
			   c.B7.setEnabled(false);
               c.B8.setEnabled(false);
               c.B9.setEnabled(false);
               c.a.setEnabled(false);
               c.b.setEnabled(false);
			   c.f.setEnabled(false);
               c.e.setEnabled(false);
               c.d.setEnabled(false);
               c.c.setEnabled(false);


			   c.UNCONDITIONAL.setEnabled(false);
               c.NZ.setEnabled(false);
               c.Z.setEnabled(false);
               c.NC.setEnabled(false);
               c.C_C.setEnabled(false);
               c.PO.setEnabled(false);
               c.PE.setEnabled(false);
               c.P.setEnabled(false);
               c.M_C.setEnabled(false);

			   c.A.setEnabled(false);
               c.B.setEnabled(false);
               c.C.setEnabled(false);
               c.D.setEnabled(false);
               c.E.setEnabled(false);
               c.H.setEnabled(false);
               c.L.setEnabled(false);
               c.M.setEnabled(false);

	}
public void modify()
	{
        int len;	   
	  s2=Integer.toHexString(ind).toUpperCase();
		  for(int x=s2.length();x<2;x++)
			  s2="0".concat(s2);
	      c.jt.setValueAt(s2,c.jt.getSelectedRow(),1);
		 dis=c.jt.getValueAt(c.jt.getSelectedRow()-1,2).toString();
		  if(dis.length()>0)
			{
		     c.index=-1;
		     char cd[]=dis.toCharArray();
			 len=dis.length();
         	 cd[len-1]=s2.charAt(1);		  
         	 cd[len-2]=s2.charAt(0);
			 s="";
			 for(int cx=0;cx<len;cx++)
				 s=s.concat(String.valueOf(cd[cx]));
			 System.out.println(s);
			 c.jt.setValueAt(s,c.jt.getSelectedRow()-1,2);
			 c.s="";
			}
		   if(c.index!=-1)
			{
            dis=c.jt.getValueAt(c.jt.getSelectedRow()-2,2).toString();
				if(dis.length()>0)
				{
   					c.index=-1;
				     char cd[]=dis.toCharArray();
					 len=dis.length();
		         	 cd[len-3]=s2.charAt(1);		  
	         		cd[len-4]=s2.charAt(0);
					 s="";
					 for(int cx=0;cx<len;cx++)
						 s=s.concat(String.valueOf(cd[cx]));
					 System.out.println(s);
           			 c.jt.setValueAt(s,c.jt.getSelectedRow()-2,2);
           			 c.s="";
				}
			}
			
	}
public void exe()
	{
	//backto();
	while(end!=111)
		{
		if(index==-1)
			{
			}

			else
			{
				pc=0;
backto();
	  switch(index)
 {
    
 case 0:
	   regclick();
	   switch(index)
	   {

	    case 0:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=127;
		     break;
		case 1:
		     mem[pc]=120;
		     break;
		case 2:
		     mem[pc]=121;
		     break;
		case 3:
		     mem[pc]=122;
		     break;
		case 4:
		     mem[pc]=123;
		     break;
		case 5:
		     mem[pc]=124;
		     break;
		case 6:
		     mem[pc]=125;
		     break;
		case 7:
		     mem[pc]=126;
		     break;
		 }
	       break;
	   case 1:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=71;
		     break;
		case 1:
		     mem[pc]=64;
		     break;
		case 2:
		     mem[pc]=65;
		     break;
		case 3:
		     mem[pc]=66;
		     break;
		case 4:
		     mem[pc]=67;
		     break;
		case 5:
		     mem[pc]=68;
		     break;
		case 6:
		     mem[pc]=69;
		     break;
		case 7:
		     mem[pc]=70;
		     break;
		 }
		break;
	   case 2:
	       index=0;
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=79;
		     break;
		case 1:
		     mem[pc]=72;
		     break;
		case 2:
		     mem[pc]=73;
		     break;
		case 3:
		     mem[pc]=74;
		     break;
		case 4:
		     mem[pc]=75;
		     break;
		case 5:
		     mem[pc]=76;
		     break;
		case 6:
		     mem[pc]=77;
		     break;
		case 7:
		     mem[pc]=78;
		     break;
		 }
	     break;
	   case 3:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=87;
		     break;
		case 1:
		     mem[pc]=80;
		     break;
		case 2:
		     mem[pc]=81;
		     break;
		case 3:
		     mem[pc]=82;
		     break;
		case 4:
		     mem[pc]=83;
		     break;
		case 5:
		     mem[pc]=84;
		     break;
		case 6:
		     mem[pc]=85;
		     break;
		case 7:
		     mem[pc]=86;
		     break;
		 }
	     break;
	   case 4:
	       index=0;
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=95;
		     break;
		case 1:
		     mem[pc]=88;
		     break;
		case 2:
		     mem[pc]=89;
		     break;
		case 3:
		     mem[pc]=90;
		     break;
		case 4:
		     mem[pc]=91;
		     break;
		case 5:
		     mem[pc]=92;
		     break;
		case 6:
		     mem[pc]=93;
		     break;
		case 7:
		     mem[pc]=94;
		     break;
		 }
	     break;
	   case 5:
	       index=0;
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=103;
		     break;
		case 1:
		     mem[pc]=96;
		     break;
		case 2:
		     mem[pc]=97;
		     break;
		case 3:
		     mem[pc]=98;
		     break;
		case 4:
		     mem[pc]=99;
		     break;
		case 5:
		     mem[pc]=100;
		     break;
		case 6:
		     mem[pc]=101;
		     break;
		case 7:
		     mem[pc]=102;
		     break;
		 }
	     break;
	   case 6:
	       index=0;
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=111;
		     break;
		case 1:
		     mem[pc]=104;
		     break;
		case 2:
		     mem[pc]=105;
		     break;
		case 3:
		     mem[pc]=106;
		     break;
		case 4:
		     mem[pc]=107;
		     break;
		case 5:
		     mem[pc]=108;
		     break;
		case 6:
		     mem[pc]=109;
		     break;
		case 7:
		     mem[pc]=110;
		     break;
		 }
	     break;
	   case 7:
	       index=0;
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=119;
		     break;
		case 1:
		     mem[pc]=112;
		     break;
		case 2:
		     mem[pc]=113;
		     break;
		case 3:
		     mem[pc]=114;
		     break;
		case 4:
		     mem[pc]=115;
		     break;
		case 5:
		     mem[pc]=116;
		     break;
		case 6:
		     mem[pc]=117;
		     break;
		case 7:
		     mem[pc]=118;
		     break;
		 }
	     break;
	    }
	    pc++;
	    break;
 case 1:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=62;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		case 1:
		     mem[pc]=6;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		case 2:
		     mem[pc]=14;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		case 3:
		     mem[pc]=22;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		case 4:
		     mem[pc]=30;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		case 5:
		     mem[pc]=38;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		case 6:
		     mem[pc]=46;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		 case 7:
		     mem[pc]=54;
		     pc++;
		     hexclick();
		     mem[pc]=ind;
		     break;
		 }
	     pc++;
	     break;
 case 2:
	       regclick1();
	       switch(index)
	       {
		case 1:
		     mem[pc]=1;
		     pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		     break;
		case 3:
		     mem[pc]=17;
		     pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		     break;
		case 5:
		     mem[pc]=33;
		     pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		     break;
		case 7:
		     mem[pc]=49;
		     pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		     break;
		 default :
			 s2="error";
		      pc--;
		      break;
		 }
	       pc++;
	       break;
  case 3:
	   mem[pc]=235;
	   pc++;
	   break;
 case 4:
	     sregclick();
	     switch(index)
	     {
	      case 1:
	       mem[pc]=10;
	       break;
	      case 3:
	       mem[pc]=26;
	       break;
	      }
	      pc++;
	      break;
    case 5:
	     sregclick();
	     switch(index)
	     {
	      case 1:
	       mem[pc]=2;
	       break;
	      case 3:
	       mem[pc]=18;
	       break;
	      }
	      pc++;
	      break;
    case 6:
	      mem[pc]=42;
	      pc++;
	      hexclick();
	      mem[pc+1]=ind;
	      pc++;
	      hexclick();
	      mem[pc-1]=ind;
	      pc++;
	      break;
   case 7:
	      mem[pc]=34;
	      pc++;
	      hexclick();
	      mem[pc+1]=ind;
	      pc++;
	      hexclick();
	      mem[pc-1]=ind;
	      pc++;
	      break;

  case 8:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=135;
		     break;
		case 1:
		     mem[pc]=128;
		     break;
		case 2:
		     mem[pc]=129;
		     break;
		case 3:
		     mem[pc]=130;
		     break;
		case 4:
		     mem[pc]=131;
		     break;
		case 5:
		     mem[pc]=132;
		     break;
		case 6:
		     mem[pc]=133;
		     break;
		case 7:
		     mem[pc]=134;
		     break;
		}
		pc++;
		break;
      case 9:
	   mem[pc]=198;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;

      case 10:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=143;
		     break;
		case 1:
		     mem[pc]=136;
		     break;
		case 2:
		     mem[pc]=137;
		     break;
		case 3:
		     mem[pc]=138;
		     break;
		case 4:
		     mem[pc]=139;
		     break;
		case 5:
		     mem[pc]=140;
		     break;
		case 6:
		     mem[pc]=141;
		     break;
		case 7:
		     mem[pc]=142;
		     break;
		}
		pc++;
		break;
      case 11:
	   mem[pc]=206;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;

   case 12:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=151;
		     break;
		case 1:
		     mem[pc]=144;
		     break;
		case 2:
		     mem[pc]=145;
		     break;
		case 3:
		     mem[pc]=146;
		     break;
		case 4:
		     mem[pc]=147;
		     break;
		case 5:
		     mem[pc]=148;
		     break;
		case 6:
		     mem[pc]=149;
		     break;
		case 7:
		     mem[pc]=150;
		     break;
		}
		pc++;
		break;
   case 13:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=159;
		     break;
		case 1:
		     mem[pc]=152;
		     break;
		case 2:
		     mem[pc]=153;
		     break;
		case 3:
		     mem[pc]=154;
		     break;
		case 4:
		     mem[pc]=155;
		     break;
		case 5:
		     mem[pc]=156;
		     break;
		case 6:
		     mem[pc]=157;
		     break;
		case 7:
		     mem[pc]=158;
		     break;
		}
		pc++;
		break;
      case 14:
	   mem[pc]=214;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;
      case 15:
	   mem[pc]=222;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;



   case 16:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=60;
		     break;
		case 1:
		     mem[pc]=4;
		     break;
		case 2:
		     mem[pc]=12;
		     break;
		case 3:
		     mem[pc]=20;
		     break;
		case 4:
		     mem[pc]=28;
		     break;
		case 5:
		     mem[pc]=36;
		     break;
		case 6:
		     mem[pc]=44;
		     break;
		case 7:
		     mem[pc]=52;
		     break;
		}
		pc++;
		break;
    case 17:
	       regclick1();
	       switch(index)
	       {
		case 1:
		     mem[pc]=3;
		     break;
		case 3:
		     mem[pc]=19;
		     break;
		case 5:
		     mem[pc]=35;
		     break;
		case 7:
		     mem[pc]=51;
		     break;
       default :
			 s2="error";
		      pc--;
		      break;
		 }
	       pc++;
	       break;
 case 18:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=61;
		     break;
		case 1:
		     mem[pc]=5;
		     break;
		case 2:
		     mem[pc]=13;
		     break;
		case 3:
		     mem[pc]=21;
		     break;
		case 4:
		     mem[pc]=29;
		     break;
		case 5:
		     mem[pc]=37;
		     break;
		case 6:
		     mem[pc]=45;
		     break;
		case 7:
		     mem[pc]=53;
		     break;
		}
		pc++;
		break;
    case 19:
	       regclick1();
	       switch(index)
	       {
		case 1:
		     mem[pc]=8;
		     break;
		case 3:
		     mem[pc]=27;
		     break;
		case 5:
		     mem[pc]=43;
		     break;
		case 7:
		     mem[pc]=59;
		     break;
		 default :
			 s2="error";
		      pc--;
		      break;
		 }
	       pc++;
	       break;
	case 20:
	       regclick1();
	       switch(index)
	       {
		case 1:
		     mem[pc]=9;
		     break;
		case 3:
		     mem[pc]=25;
		     break;
		case 5:
		     mem[pc]=41;
		     break;
		case 7:
		     mem[pc]=57;
		     break;
       default :
			 s2="error";
		      pc--;
		      break;
  
		 }
	       pc++;
	       break;
	case 22:
		break;
	case 23:
	      mem[pc]=211;
	      pc++;
	      hexclick();
	      mem[pc]=ind;
	      pc++;
	      break;

	case 24:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=167;
		     break;
		case 1:
		     mem[pc]=160;
		     break;
		case 2:
		     mem[pc]=161;
		     break;
		case 3:
		     mem[pc]=162;
		     break;
		case 4:
		     mem[pc]=163;
		     break;
		case 5:
		     mem[pc]=164;
		     break;
		case 6:
		     mem[pc]=165;
		     break;
		case 7:
		     mem[pc]=166;
		     break;
		}
		pc++;
		break;
	 case 25:
	   mem[pc]=230;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;
	 case 26:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=175;
		     break;
		case 1:
		     mem[pc]=168;
		     break;
		case 2:
		     mem[pc]=169;
		     break;
		case 3:
		     mem[pc]=170;
		     break;
		case 4:
		     mem[pc]=171;
		     break;
		case 5:
		     mem[pc]=172;
		     break;
		case 6:
		     mem[pc]=173;
		     break;
		case 7:
		     mem[pc]=174;
		     break;
		}
		pc++;
		break;
	case 27:
	   mem[pc]=238;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;
	case 28:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=183;
		     break;
		case 1:
		     mem[pc]=176;
		     break;
		case 2:
		     mem[pc]=177;
		     break;
		case 3:
		     mem[pc]=178;
		     break;
		case 4:
		     mem[pc]=179;
		     break;
		case 5:
		     mem[pc]=180;
		     break;
		case 6:
		     mem[pc]=181;
		     break;
		case 7:
		     mem[pc]=182;
		     break;
		}
		pc++;
		break;


      case 29:
	   mem[pc]=246;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;

      case 30:
	       regclick();
	       switch(index)
	       {
		case 0:
		     mem[pc]=191;
		     break;
		case 1:
		     mem[pc]=184;
		     break;
		case 2:
		     mem[pc]=185;
		     break;
		case 3:
		     mem[pc]=186;
		     break;
		case 4:
		     mem[pc]=187;
		     break;
		case 5:
		     mem[pc]=188;
		     break;
		case 6:
		     mem[pc]=189;
		     break;
		case 7:
		     mem[pc]=190;
		     break;
		}
		pc++;
		break;
      case 31:
	   mem[pc]=254;
	   pc++;
	   hexclick();
	   mem[pc]=ind;
	   pc++;
	   break;
      case 32:
	   mem[pc]=47;
	   pc++;
	   break;
      case 33:
	   mem[pc]=55;
	   pc++;
	   break;
      case 34:
	   mem[pc]=63;
	   pc++;
	   break;
      case 35:
	   mem[pc]=39;
	   pc++;
	   break;


      case 36:
	     mem[pc]=7;
	     pc++;
	     break;
      case 37:
	     mem[pc]=15;
	     pc++;
	     break;
      case 38:
	     mem[pc]=23;
	     pc++;
	     break;
      case 39:
	     mem[pc]=31;
	     pc++;
	     break;
case 40:
	     condition();
	     switch(index)
	     {
	      case 0:
	       mem[pc]=195;
	        pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		     break;
	      case 1:
	       mem[pc]=194;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 2:
	       mem[pc]=202;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 3:
	       mem[pc]=210;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 4:
	       mem[pc]=218;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 5:
	       mem[pc]=226;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 6:
	       mem[pc]=234;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 7:
	       mem[pc]=242;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 8:
	       mem[pc]=250;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      }
	      pc++;
	      break;
case 41:
	     condition();
	     switch(index)
	     {
	      case 0:
	       mem[pc]=205;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 1:
	       mem[pc]=196;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 2:
	       mem[pc]=204;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 3:
	       mem[pc]=212;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 4:
	       mem[pc]=220;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 5:
	       mem[pc]=228;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 6:
	       mem[pc]=236;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 7:
	       mem[pc]=244;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;
	      case 8:
	       mem[pc]=252;
	         pc++;
		     hexclick();
		     mem[pc+1]=ind;
		     pc++;
		     hexclick();
		     mem[pc-1]=ind;
		   break;

	      }
	      pc++;
	      break;
    case 42:
	     condition();
	     switch(index)
	     {
	      case 0:
	       mem[pc]=201;
	       break;
	      case 1:
	       mem[pc]=192;
	       break;
	      case 2:
	       mem[pc]=200;
	       break;
	      case 3:
	       mem[pc]=208;
	       break;
	      case 4:
	       mem[pc]=216;
	       break;
	      case 5:
	       mem[pc]=224;
	       break;
	      case 6:
	       mem[pc]=232;
	       break;
	      case 7:
	       mem[pc]=240;
	       break;
	      case 8:
	       mem[pc]=248;
	       break;
	      }
	      pc++;
	      break;
       case 44:
	   regclick2();
	   switch(index)
	   {
	    case 1:
	     mem[pc]=197;
	     break;
	    case 3:
	     mem[pc]=213;
	     break;
	    case 5:
	     mem[pc]=229;
	     break;
	    case 0:
	     mem[pc]=245;
	     break;
	   }
	   pc++;
	   break;
       case 45:
	   regclick2();
	   switch(index)
	   {
	    case 1:
	     mem[pc]=193;
	     break;
	    case 3:
	     mem[pc]=209;
	     break;
	    case 5:
	     mem[pc]=225;
	     break;
	    case 0:
	     mem[pc]=241;
	     break;
	   }
	   pc++;
	   break;
       case 47:
	   mem[pc]=249;
	   pc++;
	   break;
       case 48:
	   mem[pc]=118;
	   end=111;
	   pc++;
	   break;

      case 49:
	   mem[pc]=0;
	   pc++;
	   break;

	  case 46:
	   mem[pc]=227;
	   pc++;
	   break;

      case 50:
	      mem[pc]=50;
	      pc++;hexclick();
		  mem[pc+1]=ind;
          pc++;hexclick();
		  mem[pc-1]=ind;
	      pc++;
	      break;

      case 51:
	      mem[pc]=58;
	      pc++;hexclick();
		  mem[pc+1]=ind;
          pc++;hexclick();
		  mem[pc-1]=ind;
	      pc++;
		  break;
     case 999:
		  hexclick();
	      modify();
	      break;
      case 9999:
		  c.opt.show();
	      c.opt.runn();
		  break;
  }
         for(end=0;end<pc;end++)
				{
				  if(end==0)
	               c.tab(mem[end],c.s);
				  else
					c.tab(mem[end],"");
				  c.pc++;
				}
}
}

	}
}