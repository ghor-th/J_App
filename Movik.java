import java.awt.*;
import java.applet.*;

public class Movik extends Applet implements Runnable{
	Thread trd;
	boolean flag = true;
	
	public void init(){
		setSize(600,600);
		setBackground(Color.green);
	}//end init
	
	public void start(){
		trd = new Thread(this);
		trd.start();
		
	} //end stard
	
	public void run() {}//empty
	
	public void stop() {
			flag = false;
			trd = null;
	}//edn 
	
	public void paint(Graphics g){
		int mx = 150;//main coordinates X=Y
		int my = 150;
	 	while(mx < 260) {
				try {
						Exception e ;
						mx+=2;
						my++;
						g.setColor(Color.blue);
						g.fillOval(mx,my, 50,  50);
						Thread.sleep(20);
						g.setColor(Color.green);
						g.fillOval(mx-3, my-2, 50, 50);
				}catch (InterruptedException e) { } 
		}//end while
	}//end Graphics	
}//end cls movik
