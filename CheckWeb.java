import java.applet.*;
import java.awt.*;


public class CheckWeb extends Applet  implements Runnable{
	String msg, font_msg;
	String []FontList;
	
	public void checkValues(String str) {
		//System.out.println(str);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList = ge.getAvailableFontFamilyNames();
		
		boolean flag = false;
		for(int i =0; i<FontList.length; i++){
			if( str.equals(FontList[i])) {
				flag = true;
				break ;
			}	
		}
		if( !flag) { System.out.println("==" +str);}
	}//end checkValues

	public void init() {
		setSize(700, 500);
		setBackground(Color.BLUE);
		setForeground(Color.white);
		
		msg = getParameter("html_msg");
		if( msg == null) {  msg = "Not found msg_1";}
		
		font_msg= getParameter("font_msg");
		if( font_msg == null) {  font_msg= "Not found font_msg";}
		checkValues(font_msg);
	}//end init()

	public void start() {
	}

	public void run() {
	}

	public void  stop() {
	}
	public void paint(Graphics g) {
		g.drawString(msg, 60, 40);
	}

}
