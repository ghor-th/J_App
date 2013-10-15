import java.awt.*;
import java.applet.*;


public class ParamDemo extends Applet{
	String fontName;
	int fontSize;
	float leading;
	
	public void  init() {
		
		fontName = getParameter("fontname");
		if( fontName == null) {  fontName = "Not found fontname";}
		
		
		String param;
		param = getParameter("fontsize"); 
		try {
			if( param !=" ") { 
				fontSize = Integer.parseInt(param);
			}else { fontSize = -1;}
		} catch (NumberFormatException e) {
			fontSize = 0;
		}
		
		
		
		param = getParameter("leading");
		try {
			if( param !=""){ leading = Float.valueOf(param).floatValue(); }
			else{ leading = -1.0f;}
		} catch (NumberFormatException e) {
			leading = 0.0f;
		}
	}//end init()

	public void paint(Graphics g){
		setBackground(Color.gray);
		g.drawString("fontName = " +fontName, 20, 20);
		g.drawString("fontSize = " +fontSize, 20, 50);
		g.drawString("leading = "  +leading,  20, 70);
		
	}
	
	
	
}//end class
