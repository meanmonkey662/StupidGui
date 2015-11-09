package GuiController;

import gui.view.GUIFrame;

/**
 * AppController for the simple GUI project
 * @author kkoc6943
 * @version 0.1 Nov 9, 2015
 * 
 */
public class GuiController
{
	/**
	 * Reference to the GUIFrame object of the view.
	 */
	private GUIFrame baseFrame;
	
	public GuiController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{
		
	}
}
