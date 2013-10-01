import java.applet.*;
import java.awt.*;


public class Flowerd extends Applet {

	public void init(){
		setSize(600,600);
		setBackground(Color.white);
		//setForeground(Color.blue);
	}//end init
	public void start(){} //empty
	public void stop(){} //empty
	
	public void paint(Graphics g){
		int mx = 150;//main coordinates X=Y
		g.setColor(Color.white);
		//g.drawRect(mx, mx, mx*2, mx*2);
		g.setColor(Color.blue);
		g.fillOval(mx, mx, mx*2, mx*2);
		g.drawOval(mx, mx, mx*2, mx*2);
		//up
		g.setColor(Color.yellow);
		g.fillOval(mx+mx/2, mx, mx, mx);
		g.drawOval(mx+mx/2, mx, mx, mx);
		//left
		g.fillOval(mx, mx+mx/2, mx, mx);
		g.drawOval(mx, mx+mx/2, mx, mx);
		//right
		g.fillOval(mx*2, mx+mx/2, mx, mx);
		g.drawOval(mx*2, mx+mx/2, mx, mx);
		//down
		g.fillOval(mx+mx/2, mx*2, mx, mx);
		g.drawOval(mx+mx/2, mx*2, mx, mx);
		//square
		g.setColor(Color.red);
		g.fillRect(mx+mx/2, mx+mx/2, mx, mx );
		g.drawRect(mx+mx/2, mx+mx/2, mx, mx );
		//line leftUp
		g.setColor(Color.black);
		g.drawLine(mx+mx/2, mx+mx/2, mx+(mx*3/2), mx+(mx*3/2));
		//line rightUp
		g.drawLine(mx+mx/2, mx*2+mx/2,mx*2+mx,mx*2);
		
	
	
	}
}//end cls
