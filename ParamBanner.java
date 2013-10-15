import java.applet.*;
import java.awt.*;


public class ParamBanner extends Applet  implements Runnable{

	String msg;// ="text eclipse 1";
	String msg_2;// ="text eclipse 2" ;
	Thread t=null;
	boolean stopflag;

	public void init() {
		setSize(700, 500);
		setBackground(Color.BLUE);
		setForeground(Color.white);
		

		msg = getParameter("html_msg");
		if( msg == null) {  msg = "Not found msg_1";}
		
		msg_2 = getParameter("html_msg_2");
		if( msg_2 == null) {  msg = "Not found msg_2";}
/*		
		String param;
		param = getParameter("msg_2"); 
		try {
			if( param !=" ") { 
				msg_2 = Integer.parseInt(param);
			}else { msg_2 = -1;}
		} catch (NumberFormatException e) {
			msg_2 = 0;
		}
*/
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
			
				
				int last_ch = msg_2.length()-1;	// perem ukaz na konets massiwa
				ch_2 = msg_2.charAt(last_ch);	//pos ukazatelea
				
				msg_2 = msg_2.substring(0, last_ch );
				msg_2 =ch_2 + msg_2;
				
				
				if(stopflag) break;
			} catch (InterruptedException e) {}
		}
	}

	public void  stop() {
		stopflag = true;
		t=null;
	}
	public void paint(Graphics g) {
		g.drawString(msg,  20, 40);
		g.drawString(msg_2,20, 60);
	}

}
