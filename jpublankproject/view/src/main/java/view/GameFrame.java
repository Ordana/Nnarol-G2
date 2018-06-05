package view;


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IController;
import contract.Order;


/**
 * The Class ViewFrame
 *
 * @author Dounia Benmerar
 * build the frame and listen user's actions
 */
class GameFrame extends JFrame implements KeyListener 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1845841957308428976L;


	/**
	 * attribute to create the frame's size
	 */
	private int width = 656;
	
	
	/**
	 * attribute to create the frame's size
	 */
	private int height = 464;
	
	
	/**
	 * attribute to link with the controller
	 */
	private IController controller;

	
	/**
	 * attribute to link with the controller
	 */
	private GamePanel panel;
	
	
	/**
	 * constructor of this class
	 * initiate the game panel
	 */
	GameFrame()
	{
		this.setTitle("Lorann");
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new GamePanel();
		this.panel.setBackground(Color.BLACK);
		this.setContentPane(this.panel);
		this.setResizable(false);
		
		this.addKeyListener(this);
	}
	
	/**
	 * update method from the View class
	 */
	public void repaint()
	{
		this.panel.repaint();
	}
	
	
	/**
	 * getter from the GamePanel class
	 * 
	 */
	public GamePanel getGamePanel()
	{
		return this.panel;
	}
	
	
	/**
	 * getter of the width attribute
	 * @return
	 * Get width
	 */
	public int getWidth()
	{
		return width;
	}
	
	
	/**
	 * geter of the width attribute
	 */
	public int getHeight()
	{
		return height;
	}
	
	
	/**
	 * getter from the Controller class
	 * @return The controller of the frame
	 */
	public IController getController() 
	{
		return controller;
	}
	
	
	/**
	 * setter from the controller class
	 * @param controller
	 * set the controller
	 */
	public void setController(IController controller)
	{
		this.controller = controller;
	}

	
	/**
	 * method used to capture the user's actions and send them to the controller
	 */
	public void keyPressed(KeyEvent e) 
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_Z: 
			case KeyEvent.VK_W:
			case KeyEvent.VK_UP:
			this.controller.orderPerform(Order.CHARACTER_UP);
			break;
			
			
			case KeyEvent.VK_S:
			case KeyEvent.VK_DOWN:
			this.controller.orderPerform(Order.CHARACTER_DOWN);
			break;
			
			
			case KeyEvent.VK_Q:
			case KeyEvent.VK_LEFT:
			this.controller.orderPerform(Order.CHARACTER_LEFT);
			break;
			
			
			case KeyEvent.VK_D:
			case KeyEvent.VK_RIGHT:
			this.controller.orderPerform(Order.CHARACTER_RIGHT);
			break;
			
			case KeyEvent.VK_SPACE:
			this.controller.orderPerform(Order.CHARACTER_SPELL);
			break;

			case KeyEvent.VK_R:
				this.controller.orderPerform(Order.RETRY);
				break;
				
		}
	}
	
	
	/**
	 * method used to capture the user's actions
	 */
	public void keyReleased(KeyEvent e) 
	{
		
	}
	
	
	/**
	 * method used to capture the user's actions
	 */
	public void keyTyped(KeyEvent e) 
	{
	
	}

	
}
