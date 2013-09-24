import java.awt.*;

public class FontName {
	public static void main(String[] args) {
		String [] FontList;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList = ge.getAvailableFontFamilyNames();
		int nr_i=0;
		for (int i=0; i<FontList.length; i++){
			System.out.println(i + " " + FontList[i]);
			nr_i =i;
		}
		System.out.print("\nFont numbers: " + nr_i);
		
	}//end main
	
}//end class FontName
