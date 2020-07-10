package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import items.Board;
import items.Mouse;
import items.Pixel;

public class Window {

	private Board frame;
	private Mouse pencil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new Board();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencil = new Mouse(frame);
		pencil.run();
	}

}
