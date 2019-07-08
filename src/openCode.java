//Demonstrate file dialog box.
import java.awt.*;
import java.io.*;
import java.util.*;
class openCode 
{		int count;
		Object r=new Object[500][3];
		openCode(NEWO c)
		{     
			    
			    int i;

				FileDialog fd=new FileDialog(c,"Open",FileDialog.LOAD);
				fd.setBounds(150,150,300,300);
				fd.setVisible(true);
				String str1=fd.getFile();
				if(str1!=null)
				{
					StringTokenizer st=new StringTokenizer(str1,".");
					String str2="";
					while (st.hasMoreTokens())
					{
						str2=st.nextToken();
					}

					if(str2.equals("kbp"))
					{
						File f1=new File(fd.getDirectory(),str1);
						str2=str1.concat("cun");
						File f2=new File(fd.getDirectory(),str2);
						System.out.println(str2);
						if(f1.exists()&f2.exists())
						{
							c.setTitle(str1);	
							try
							{  
								int j;j=0;
								//FileInputStream fis=new FileInputStream(f1);
								FileInputStream fis=new FileInputStream(f1.getPath());
                                ObjectInputStream  ois= new  ObjectInputStream(fis);
		                        r=(Object[][])ois.readObject();
                                ois.close(); 
								System.out.println(r);
								FileInputStream fs=new FileInputStream(f2.getPath());
							    DataInputStream din=new DataInputStream(fs);
								count=din.readInt();
								System.out.println(count);
								din.close();
							}
							catch(Exception ioe)
							{
								System.out.println(ioe);
							}

						}
					}
				}
		}
		Object ret()
	{
			 return(r);
	}
	int co()
	{
		return(count);
	}
	}
						
					
				
			
			
	
