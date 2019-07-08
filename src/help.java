import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class help extends JFrame implements ActionListener
{
    JPanel panel_1;
    JButton button_1;
    JButton button_2;
    JButton button_3;
    Image i[]=new Image[19];
    int d=0;

    public help()
    {
        helpLayout customLayout = new helpLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);
        getContentPane().setBackground(Color.YELLOW);

        panel_1 = new JPanel();
        getContentPane().add(panel_1);

        button_1 = new JButton("NEXT",new ImageIcon(Toolkit.getDefaultToolkit().getImage("run.gif")));
        getContentPane().add(button_1);
        button_1.addActionListener(this);

        button_2 = new JButton("EXIT",new ImageIcon(Toolkit.getDefaultToolkit().getImage("exit.gif")));
        getContentPane().add(button_2);
        button_2.addActionListener(this);

        button_3 = new JButton("BACK",new ImageIcon(Toolkit.getDefaultToolkit().getImage("bb.gif")));
        getContentPane().add(button_3);
        button_3.addActionListener(this);


        for(int cnt=1;cnt<19;cnt++)
                i[cnt]=Toolkit.getDefaultToolkit().getImage("pict"+(cnt+1)+".gif");

        setSize(getPreferredSize());

        addWindowListener(new WindowAdapter()
         {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[])
     {
        help window = new help();

        window.setTitle("help");
        window.pack();
        window.show();
    }

    public void actionPerformed(ActionEvent e)
    {
            if(e.getSource()==button_1)
            {
                System.out.println("in action listener ");
                repaint();
                d++;

               // button_1.setEnabled(false);
            }
             if(d>17)
                button_1.setEnabled(false);
             else if(d<0)
                button_3.setEnabled(false);
             else
                  button_1.setEnabled(true);
                  button_3.setEnabled(true);
            if(e.getSource()==button_2)
            {
                this.dispose();
            }

            if(e.getSource()==button_3)
            {
                repaint();
                d--;

            }
    }

    public void update(Graphics g)
    {
           //panel_1.paint(g);
           g.drawImage(i[d],25,49,890,535,this);

    }
    /*public void paint(Graphics g)
    {



    }*/
}

class helpLayout implements LayoutManager
{

    public helpLayout()
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
        dim.width = 962 + insets.left + insets.right;
        dim.height = 628 + insets.top + insets.bottom;

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
        if (c.isVisible()) {c.setBounds(insets.left+24,insets.top+16,888,536);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+856,insets.top+584,90,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+760,insets.top+584,90,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+664,insets.top+584,90,24);}
    }
}