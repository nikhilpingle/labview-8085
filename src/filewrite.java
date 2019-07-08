import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.File;
import java.io.*;
import java.beans.*;
import java.util.*;


class  filewrite
{JFileChooser chooser;
     filewrite(NEWO ob)
     {
       chooser = new JFileChooser();
      chooser.setDialogType(JFileChooser.OPEN_DIALOG);
      chooser.showDialog(ob, null);
      chooser.setVisible(true);
	  sa(ob.row);
     }
	 public void sa(Object obj)
	{
		 try
		 {
		 System.out.println("obj" +obj);
		 String str1=chooser.getSelectedFile().getPath();
			if(str1!=null)
			{
				StringTokenizer st=new StringTokenizer(str1,".");
				String str2="";
				str2=st.nextToken();
				File f1;
				Object w;
				String str;
				//f1=new File(chooser.getDirectory(),str2+".kbp");
		        //win.setTitle(str2); 
		        FileOutputStream fos=new FileOutputStream(f1);
		        ObjectOutputStream oos=new ObjectOutputStream(fos);
		        oos.writeObject(obj);
		        oos.flush();
		        oos.close();
		    }
		 }
		 catch (Exception e)
		 {
		 }

		
		
	}
	public static void main(String[] args)
	{
           //filewrite tt=new filewrite();
			System.out.println("Hello World!");
	}
}