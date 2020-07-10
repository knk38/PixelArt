package items;

//represents a pixel object
public class Pixel {
	public boolean isColored = false;
	public int locationX;
	public int locationY;
	
	public Pixel(int x, int y){
		locationX = x;
		locationY = y;
	}
	public Pixel(int x, int y, boolean Colored){
		locationX = x;
		locationY = y;
		isColored = Colored;
	}
}
