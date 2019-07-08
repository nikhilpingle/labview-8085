class  run
{
	NEWO c;
	run(NEWO o)
	{
		this.c=o;
	}
	public void read()
	{String sr;
	 int addr,data;
		for(int y=0;y<c.i;y++)
		{
			sr=c.jt.getValueAt(y,0).toString();
			addr=convert(sr);
			sr=c.jt.getValueAt(y,1).toString();
			data=convert(sr);
		}

	}
	public int  convert(String s)
	{
		char ch;
		int len=s.length();
        int d=0; 
		for(int x=len;x>=1;x--)
		{
             ch=s.charAt(x);
			 if()
		}
	}
}
