package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GUIAppController;
import javax.swing.JButton;

/**
 * 
 * @author kkoc6943
 * @version 0.1 Nov 9, 2015 2015 Basic constructor setup.
 * 
 */

public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button");
		firstTextField = new JTextField("you can type words in here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
