package items;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

public class Mouse extends Thread implements MouseInputListener{
	/***
	 * Represents the Mouse object and takes in mouse information
	 */
	Board background;
	Point location;
	
	public Mouse(Board board){
		background = board;
	}
	public void run() {
		while(background.isActive()){
			getPosition();
		}
		
	}
	public void getPosition(){
		location.x = MouseInfo.getPointerInfo().getLocation().x-background.getLocationOnScreen().x;
		location.y = MouseInfo.getPointerInfo().getLocation().y-background.getLocationOnScreen().y;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("penis");
		getPosition();
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		getPosition();
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
