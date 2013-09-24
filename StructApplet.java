import java.applet.Applet;
import java.awt.*;

public class StructApplet extends Applet {
	String msg;
	@Override
	public void init() {
		msg = "=init()\n";
		System.out.println(msg);
	}
	@Override
	public void start() {
		msg = "=start()\n";
		System.out.println(msg);
	}
	@Override
	public void stop() {
		msg = "=stop()\n";
		System.out.println(msg);
	}
	@Override
	public void destroy() {
		msg = "=destroy()\n";
		System.out.println(msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	
	}
	@Override
	public void paint(Graphics arg0) {
		arg0.drawString(msg, 50, 50);
		msg = "=paint()\n";
	}
}//end cls
