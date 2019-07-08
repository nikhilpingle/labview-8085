//Demonstrate file dialog box.
import java.awt.*;
import java.io.*;
import java.util.*;
class fsave 
{
		fsave(NEWO c)
		{
			FileDialog fd=new FileDialog(c,"Save",FileDialog.SAVE);
			fd.setVisible(true);
			Object[][] r=new Object[500][3];
			String str1=fd.getFile();
			if(str1!=null)
			{
				StringTokenizer st=new StringTokenizer(str1,".");
				String str2="";
				str2=st.nextToken();
				File f1,f2;
				Object w;
				String str;
				r=c.row;
				f1=new File(fd.getDirectory(),str2+".kbp");
				f2=new File(fd.getDirectory(),str2+".kbpcun");
					try
					{   c.setTitle(str2);
						/*FileOutputStream fos=new FileOutputStream(f1);
						DataOutputStream oos=new DataOutputStream(fos);							*/
						FileOutputStream fos=new FileOutputStream(f1.getPath());
		                ObjectOutputStream oos=new ObjectOutputStream(fos);
	             	    oos.writeObject(r);
						oos.close();				
						fos.flush();
						fos.close();
						FileOutputStream fs=new FileOutputStream(f2.getPath());
		                DataOutputStream dat=new DataOutputStream(fs);
	             	    dat.writeInt(c.i);
						dat.close();				
						fs.flush();
						fs.close();
						System.out.println(c.i);
			
					}
					catch(IOException e)
					{
					}
				}
			}
		
}
	