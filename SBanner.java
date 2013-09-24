import java.applet.*;
import java.awt.*;

import javax.swing.text.MaskFormatter;
public class SBanner extends Applet  implements Runnable{

	String msg   ="<<<- 1_<<<- 2_<<<- 3_<<<-";
	String msg_2 ="->>>_3 ->>>_2 ->>>_1 ->>>";
	Thread t=null;
	boolean stopflag;

	public void init() {
		setSize(800, 500);
		
		setBackground(Color.BLUE);
		setForeground(Color.white);
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
		g.drawString(msg, 190, 40);
		g.drawString(msg_2, 30,40);
	}

}
