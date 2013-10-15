import java.applet.*;
import java.awt.*;
public class CheckBannerFont extends Applet implements Runnable {

	String msg, font_msg;
	//String msg_2, font_msg_2;
	Thread t=null;
	boolean stopflag;
	
	
	
	public String checkValues(String mess_html) {
		String []FontList;
		String fontResult=null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList = ge.getAvailableFontFamilyNames();
		for(int i =0; i<FontList.length; i++){
			if( !(mess_html.equals(FontList[i])) ) {  
				//System.out.println("ERR");
				fontResult = "ERR";
			}
		}
		return fontResult;
	}

	public void init() {
		setSize(700, 500);
		setBackground(Color.BLUE);
		setForeground(Color.white);
		
		msg = getParameter("html_msg");
		font_msg = getParameter("font_msg");
		if( msg == null) {  msg = "Not found msg_1";}
		if( font_msg == null) {  font_msg = "Not found font_msg";}
/*		
		msg_2 = getParameter("html_msg_2");
		if( msg_2 == null) {  msg = "Not found msg_2";}
*/		
		String []FontList;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList = ge.getAvailableFontFamilyNames();
		checkValues(font_msg);
		
		
	}//end init()

   public void start() {
		t = new Thread(this);
		stopflag = false;
		t.start();
	}

	public void run() {
		char ch, ch_2, chr;
		while(true) {
			try {
				repaint();
				Thread.sleep(270);
				
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length() );
				msg +=ch;
			
/*				
				int last_ch = msg_2.length()-1;	// perem ukaz na konets massiwa
				ch_2 = msg_2.charAt(last_ch);	//pos ukazatelea
				
				msg_2 = msg_2.substring(0, last_ch );
				msg_2 =ch_2 + msg_2;
*/				
				
				if(stopflag) break;
			} catch (InterruptedException e) {}
		}
	}

	public void  stop() {
		stopflag = true;
		t=null;
	}
	public void paint(Graphics g) {
		g.drawString(msg,  20, 50);
		//g.drawString(msg_2,20, 100);
	}

}
