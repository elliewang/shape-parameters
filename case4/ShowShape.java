import javax.swing.*;
import java.awt.*;
import java.applet.Applet;

public class ShowShape extends Applet{
    private String MessageString;
    private String ShapeString;
    private String ColorString;
    private String BgcolorString;
    private int X;
    private int Y;
    private String FtstyleString;
    private int FtsizeString;

    public void init(){
        MessageString = getParameter("MESSAGE");
        ShapeString = getParameter("SHAPE");
        ColorString = getParameter("COLOR");
        BgcolorString = getParameter("BGCOLOR");
        X = (new Integer(getParameter("X"))).intValue();
        Y = (new Integer(getParameter("Y"))).intValue();
        FtstyleString = getParameter("FTSTYLE");
        FtsizeString = (new Integer(getParameter("FTSIZE"))).intValue();
    }
    public void paint(Graphics g)
    {
        //background color choices
        if (BgcolorString.equals( "blue" ) )
        {
            this.setBackground(Color.blue);
        }
        else if (BgcolorString.equals( "black" ) )
        {
            this.setBackground(Color.black);
        }
        else if (BgcolorString.equals( "cyan" ) )
        {
            this.setBackground(Color.cyan);
        }
        else if (BgcolorString.equals( "darkGray" ) )
        {
            this.setBackground(Color.darkGray);
        }
        else if (BgcolorString.equals( "gray" ) )
        {
            this.setBackground(Color.gray);
        }
        else if (BgcolorString.equals( "green" ) )
        {
            this.setBackground(Color.green);
        }
        else if (BgcolorString.equals( "lightGray" ) )
        {
            this.setBackground(Color.lightGray);
        }
        else if (BgcolorString.equals( "magenta" ) )
        {
            this.setBackground(Color.magenta);
        }
        else if (BgcolorString.equals( "orange" ) )
        {
            this.setBackground(Color.orange);
        }
        else if (BgcolorString.equals( "pink" ) )
        {
            this.setBackground(Color.pink);
        }
        else if (BgcolorString.equals( "red" ) )
        {
            this.setBackground(Color.red);
        }
        else if (BgcolorString.equals( "white" ) )
        {
            this.setBackground(Color.white);
        }
        else if (BgcolorString.equals( "yellow" ) )
        {
            this.setBackground(Color.yellow);
        }else {
            JOptionPane.showMessageDialog(null, "wrong color, default value - BLACK", "wrong color, default value - BLACK", JOptionPane.ERROR_MESSAGE);
            this.setBackground(Color.black);
        }

        //font and shape color choices
        if (ColorString.equals( "blue" ) )
        {
            g.setColor( Color.blue );
        }
        else if (ColorString.equals( "black" ) )
        {
            g.setColor( Color.black );
        }
        else if (ColorString.equals( "cyan" ) )
        {
            g.setColor( Color.cyan );
        }
        else if (ColorString.equals( "darkGray" ) )
        {
            g.setColor( Color.darkGray );
        }
        else if (ColorString.equals( "gray" ) )
        {
            g.setColor( Color.gray );
        }
        else if (ColorString.equals( "green" ) )
        {
            g.setColor( Color.green );
        }
        else if (ColorString.equals( "lightGray" ) )
        {
            g.setColor( Color.lightGray );
        }
        else if (ColorString.equals( "magenta" ) )
        {
            g.setColor( Color.magenta );
        }
        else if (ColorString.equals( "orange" ) )
        {
            g.setColor( Color.orange );
        }
        else if (ColorString.equals( "pink" ) )
        {
            g.setColor( Color.pink );
        }
        else if (ColorString.equals( "red" ) )
        {
            g.setColor( Color.red );
        }
        else if (ColorString.equals( "white" ) )
        {
            g.setColor( Color.white );
        }
        else if (ColorString.equals( "yellow" ) )
        {
            g.setColor( Color.yellow );
        }else{
            JOptionPane.showMessageDialog(null, "wrong color, default value - RED", "wrong color, default value - RED", JOptionPane.ERROR_MESSAGE);
            g.setColor( Color.red );
        }

        // shape choices
        int a = getSize().width;
        int b = getSize().height;
        int c1 = a/2 - X/2;
        int c2 = b/2 - Y/2;

        String s = MessageString;
        FontMetrics fm = g.getFontMetrics();
        int width = fm.stringWidth(s);
        int height = fm.getHeight();
        int leading = fm.getLeading();
        int ascent = fm.getAscent();
        int descent = fm.getDescent();
        int d1 = a/2 - width/2;
        int d2 = b/2 + descent;

        if (ShapeString.equals( "RECT" ) )
        {
            if (X > a){
                JOptionPane.showMessageDialog(null, "shape doesn't fit, default values: x=200, y=200", "shape doesn't fit, default values: x=200, y=200", JOptionPane.ERROR_MESSAGE);
                g.drawRect( 25, 25, 200, 200 );
                //g.drawString(s,100 - width/2, 100 + descent);
            }
            else if (Y > b){
                JOptionPane.showMessageDialog(null, "shape doesn't fit, default values: x=200, y=200", "shape doesn't fit, default values: x=200, y=200", JOptionPane.ERROR_MESSAGE);
                g.drawRect( 25, 25, 200, 200 );
            }else{
                g.drawRect( c1, c2, X, Y );
            }
        }
        else if (ShapeString.equals( "OVAL" ) )
        {
            if (X > a){
                JOptionPane.showMessageDialog(null, "shape doesn't fit, default values: x=200, y=200", "shape doesn't fit, default values: x=200, y=200", JOptionPane.ERROR_MESSAGE);
                g.drawOval( 25, 25, 200, 200 );
            }
            else if (Y > b){
                JOptionPane.showMessageDialog(null, "shape doesn't fit, default values: x=200, y=200", "shape doesn't fit, default values: x=200, y=200", JOptionPane.ERROR_MESSAGE);
                g.drawOval( 25, 25, 200, 200 );
            }else{
                g.drawOval( c1, c2, X, Y);
            }
        }
        else if (ShapeString.equals( "ROUNDRECT" ) )
        {
            if (X > a){
                JOptionPane.showMessageDialog(null, "shape doesn't fit, default values: x=200, y=200", "shape doesn't fit, default values: x=200, y=200", JOptionPane.ERROR_MESSAGE);
                g.drawRoundRect( 25, 25, 200, 200, 15, 15 );
            }
            else if (Y > b){
                JOptionPane.showMessageDialog(null, "shape doesn't fit, default values: x=200, y=200", "shape doesn't fit, default values: x=200, y=200", JOptionPane.ERROR_MESSAGE);
                g.drawRoundRect( 25, 25, 200, 200, 15, 15 );
            }else{
                g.drawRoundRect( c1, c2, X, Y, 15, 15 );
            }
        }else{
            JOptionPane.showMessageDialog(null, "wrong shape, default value - RECT", "wrong shape, default value - RECT", JOptionPane.ERROR_MESSAGE);
            g.drawRect( c1, c2, X, Y );
        }

        //font style choices
        if (FtstyleString.equals("REGULAR" ))
        {
            g.setFont( new Font("Serif", Font.PLAIN, FtsizeString));
        }
        else if (FtstyleString.equals("BOLD" ))
        {
            g.setFont( new Font("Serif", Font.BOLD, FtsizeString));
        }
        else if (FtstyleString.equals("ITALIC" ))
        {
            g.setFont( new Font("Serif", Font.ITALIC, FtsizeString));
        }
        else if (FtstyleString.equals("BOLD+ITALIC" ))
        {
            g.setFont( new Font("Serif", Font.BOLD + Font.ITALIC, FtsizeString));
        }else{
            JOptionPane.showMessageDialog(null, "wrong style, default value - BOLD", "wrong style, default value - BOLD", JOptionPane.ERROR_MESSAGE);
            g.setFont( new Font("Serif", Font.BOLD, FtsizeString));
        }
        
        if (FtsizeString > Y){
            g.setFont( new Font("Serif", Font.BOLD, Y));
            g.drawString(s,d1,d2);
            JOptionPane.showMessageDialog(null, "message doesn't fit to applet space, text size is adjusted by default", "message doesn't fit to applet space, text size is adjusted by default", JOptionPane.ERROR_MESSAGE);
        }else{
            //draw string
            g.drawString(s,d1,d2);
        }
    }
}