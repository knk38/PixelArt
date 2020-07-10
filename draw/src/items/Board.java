package items;
import javax.swing.JFrame;
//implements a 2D array of pixel objects
public class Board extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int width; int height;
	Pixel[][] boardArray;
	public Board(int boardwidth, int boardheight){//creates a board object with given width and height
		width = boardwidth;
		height = boardheight;
		setSize(width,height);
		boardArray = new Pixel[width][height];
		buildBoard();
	}
	public Board(){//creates a board with default width and height
		width = 900;
		height = 500;
		setSize(width,height);
		boardArray = new Pixel[width][height];
		buildBoard();
		
	}
	public void buildBoard(){//populates board array
		setBounds(width,height);
		for (int x = 0; x < width; x++){
			for (int y = 0; y <height; y++){
				Pixel p = new Pixel(x,y);
				boardArray[x][y] = p;
			}
		}
	}
	public void setBounds(int width, int height){
		super.setBounds(200,200,width,height);
	}
	
}
