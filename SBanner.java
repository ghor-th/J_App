import java.applet.*;
import  java.awt.*;
import java.lang.reflect.Constructor;

public class SBanner extends Applet implements Runnable {
	String msg   =" _Banner 1";
	String msg_2 =" _Banner 2";
	Thread t=null;
	boolean stopflag;
	Font f1;
	//Font f2;
	 
	//Font f1 = new FontName();
	public void init() {
		setBackground(Color.blue);
		setForeground(Color.white);
		f1 = new Font("Serif", Font.BOLD, 16);
	}

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
		//g.drawString(msg, 80, 40);
		//g.drawString(msg_2, 80,80);
		//g.setFont(f1);
		//g.drawString(msg, 30, 100);
		//g.drawOval(30, 40, 30, 55);
		//g.draw3DRect(120, 120, 60, 50, false);
		g.drawArc(80, 80, 50, 50, 20, 90);
	}

		
}//end class SBanner
