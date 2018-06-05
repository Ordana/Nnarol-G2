package view;


import java.util.Observer;

import contract.IController;

import contract.IView;

/**
 * The Class View
 *
 * @author Dounia Benmerar
 */
public class View implements IView
{
	
	/**
	 * attribute of the GameFrame class from the composition
	 */
	private GameFrame frame;
	
	
	/**
	 * constructor of the view class
	 */
	public View()
	{
		this.frame = new GameFrame();
	}


	/**
	 * update method from IView interface
	 */
	public void repaint()
	{

	}
	
	
	/**
	 * method to open the frame
	 */
	public void openFrame()
	{
		this.frame.setVisible(true);
	}

	
	/**
	 * method to close the current frame
	 */
	public void closeFrame()
	{
		this.frame.setVisible(false);
	}
	
	
	/**
	 * method to get the observer from the pattern
	 */
	public Observer getObserver() 
	{
		return this.frame.getGamePanel();
	}

	
	/**
	 * set the controller associated to the view
	 * @param controller
	 * The controller associated
     */
	public void setController(IController controller) 
	{
		this.frame.setController(controller);
	}
}
