import java.applet.*;
import java.awt.*;
public class DemoCursor extends Applet{
	// Массив типов курсоров
int[] type=	{
			Cursor.CROSSHAIR_CURSOR, Cursor.HAND_CURSOR,
			Cursor.MOVE_CURSOR, Cursor.TEXT_CURSOR,
			Cursor.WAIT_CURSOR, Cursor.E_RESIZE_CURSOR,
			Cursor.N_RESIZE_CURSOR, Cursor.NE_RESIZE_CURSOR,
			Cursor.NW_RESIZE_CURSOR, Cursor.S_RESIZE_CURSOR,
			Cursor.SE_RESIZE_CURSOR, Cursor.SW_RESIZE_CURSOR,
			Cursor.W_RESIZE_CURSOR
			};
	
	Cursor[] curs=new Cursor[type.length];		// сurs – ссылка на массив курсоров
	Button[] but=new Button[type.length];		// but – ссылка на массив кнопок
	


public void init(){
		setSize(600, 600);
		setBackground(Color.yellow);
		for(int i=0;i<type.length; i++){
			curs[i]=new Cursor(type[i]);	// создание курсора
			but[i]=new Button("b"+(i+1));	// создание кнопки с надписью
			but[i].setCursor(curs[i]);		// установка курсора для кнопки
			add(but[i]);				// добавление кнопки в окно апплета
		}
	}
}
