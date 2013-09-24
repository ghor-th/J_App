import java.applet.*;
import java.awt.*;
public class Grafika extends Applet{
	String  ms1="Line", 	ms2="Rect", 
			ms3="Oval", 	ms4=" Circle", 
			ms5="Arc",  	ms6="Roundrect", 
			ms7="Polyline";
	Font font; 
	String x_length = "Window Width: ";
	
	
	int rect_x[]= {180, 200, 220, 240 };
	int rect_y[]= {170, 160, 180, 145};
	int rect_pts = 4;
	
	public void init(){
		setSize(800, 500);
		setBackground(Color.BLUE);
		setForeground(Color.WHITE);
		font = new Font("Rod", Font.BOLD, 16);
		
	
	}
	public void start(){} //empty
	public void  stop(){} //empty	
	
	public void paint(Graphics g){
		
		int wind_x = getWidth();
		int wind_y =getHeight();
	
//mashtabiruemye
		g.setFont(font);
		// line ==ex
		g.drawLine(wind_x/10, wind_y/10, wind_x/3, wind_y/4);
		g.drawString(ms1,wind_x/8,wind_y/9);
		//Rect
		g.drawRect(145, 35, 90, 50);
		g.drawString(ms2,145,110);
		//Rect
		g.drawOval(260, 35, 80, 50);
		g.drawString(ms3, 265, 110);
		//Circle
		g.drawOval(370, 35, 50, 50);
		g.drawString(ms4, 350, 110);
		//arc
		g.drawArc(415, 55, 160, 160, 45, 80);
		//g.drawArc(x, y, width, height, startAngle, arcAngle);
		g.drawString(ms5, 450, 110);
		//roundrect
		g.drawRoundRect(35, 135, 70, 50, 30, 30);
		//g.drawLine(35, 200, 500, 200);//======================================
		g.drawString(ms6, 35, 215 );
		//polyline
		g.drawPolyline(rect_x, rect_y, rect_pts);
		g.drawString(ms7, 175, 215);
		
		
		g.drawLine(wind_x/2, 0, wind_x/2, wind_y);
		g.drawString("Window width/heigth : " + wind_x + "/"+ wind_y , 15, 15);
		
/*========= bez mashtaba
		g.setFont(font);
		// line
		g.drawLine(35, 90, 90, 90);
		g.drawString(ms1,35,110);
		//Rect
		g.drawRect(145, 35, 90, 50);
		g.drawString(ms2,145,110);
		//Rect
		g.drawOval(260, 35, 80, 50);
		g.drawString(ms3, 265, 110);
		//Circle
		g.drawOval(370, 35, 50, 50);
		g.drawString(ms4, 350, 110);
		//arc
		g.drawArc(415, 55, 160, 160, 45, 80);
		//g.drawArc(x, y, width, height, startAngle, arcAngle);
		g.drawString(ms5, 450, 110);
		//roundrect
		g.drawRoundRect(35, 135, 70, 50, 30, 30);
		//g.drawLine(35, 200, 500, 200);//======================================
		g.drawString(ms6, 35, 215 );
		//polyline
		g.drawPolyline(rect_x, rect_y, rect_pts);
		g.drawString(ms7, 175, 215);
=======================*/
	}
	
}//end class Grafika
